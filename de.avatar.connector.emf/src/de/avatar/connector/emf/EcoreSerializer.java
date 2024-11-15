/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.connector.emf;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;
import org.osgi.service.component.ComponentServiceObjects;

import com.paremus.dosgi.net.serialize.Serializer;

import de.avatar.connector.model.rsa.RequestParameter;
import de.avatar.connector.model.rsa.RsaFactory;
import de.avatar.connector.model.rsa.RsaObject;
import de.avatar.connector.model.rsa.RsaObjectType;
import de.avatar.connector.model.rsa.RsaPackage;
import de.avatar.connector.model.rsa.RsaRequest;
import de.avatar.connector.model.rsa.RsaResponse;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;

/**
 * 
 * @author mark
 * @since 19.10.2024
 */
public class EcoreSerializer implements Serializer {

	private final ComponentServiceObjects<ResourceSet> soResourceSet;
	private final ResourceSet resourceSet;

	/**
	 * Creates a new instance.
	 */
	public EcoreSerializer(ComponentServiceObjects<ResourceSet> soResourceSet, Bundle classSpace) {
		this.soResourceSet = soResourceSet;
		this.resourceSet = soResourceSet.getService();
	}

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.Serializer#serializeArgs(io.netty.buffer.ByteBuf, java.lang.Object[])
	 */
	@Override
	public void serializeArgs(ByteBuf buffer, Object[] args) throws IOException {
		RsaRequest rsaRequest = RsaFactory.eINSTANCE.createRsaRequest();
		String id = UUID.randomUUID().toString();
		rsaRequest.setId(id);
		if (nonNull(args) && args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				RequestParameter p = createRsaObject(args[i], RsaPackage.Literals.REQUEST_PARAMETER);
				p.setIndex(i);
				rsaRequest.getParameter().add(p);
			}
		}
//		Resource r = resourceSet.createResource(URI.createURI(id + ".rsa"));
		Resource r = new BinaryResourceImpl(URI.createURI(id + ".rsa"));
		requireNonNull(r);
		r.getContents().add(rsaRequest);
		try (OutputStream os = new ByteBufOutputStream(buffer) ) {
			r.save(os, null);
		} finally {
			r.getContents().clear();
			resourceSet.getResources().clear();
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.Serializer#deserializeArgs(io.netty.buffer.ByteBuf)
	 */
	@Override
	public Object[] deserializeArgs(ByteBuf buffer) throws ClassNotFoundException, IOException {
//		Resource r = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString() + ".rsa"));
		Resource r = new BinaryResourceImpl(URI.createURI(UUID.randomUUID().toString() + ".rsa"));
		requireNonNull(r);
		try (InputStream is = new ByteBufInputStream(buffer) ) {
			r.load(is, null);
			if (!r.getContents().isEmpty()) {
				RsaRequest rsaRequest = (RsaRequest) r.getContents().get(0);
				Object[] args = new Object[rsaRequest.getParameter().size()];
				rsaRequest.getParameter().stream().
					sorted((p1, p2)-> Integer.compare(p1.getIndex(), p2.getIndex())).
					forEach((p)->{
						args[p.getIndex()] =  getObject(p);
					});
				return args;
			} else {
				System.err.println("Ecore content is empty after de-serialization");
			}
		} finally {
			r.getContents().clear();
			resourceSet.getResources().clear();
		}
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.Serializer#serializeReturn(io.netty.buffer.ByteBuf, java.lang.Object)
	 */
	@Override
	public void serializeReturn(ByteBuf buffer, Object o) throws IOException {
		RsaResponse rsaResponse = RsaFactory.eINSTANCE.createRsaResponse();
		String id = UUID.randomUUID().toString();
		rsaResponse.setId(id);
		if (isNull(o)) {
			rsaResponse.setEmpty(true);
		} else {
			RsaObject rsao = createRsaObject(o, RsaPackage.Literals.RSA_OBJECT);
			rsaResponse.setResponse(rsao);
		}
//		Resource r = resourceSet.createResource(URI.createURI(id + ".rsa"));
		Resource r = new BinaryResourceImpl(URI.createURI(id + ".rsa"));
		requireNonNull(r);
		r.getContents().add(rsaResponse);
		try (OutputStream os = new ByteBufOutputStream(buffer) ) {
			r.save(os, null);
		} finally {
			r.getContents().clear();
			resourceSet.getResources().clear();
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.Serializer#deserializeReturn(io.netty.buffer.ByteBuf)
	 */
	@Override
	public Object deserializeReturn(ByteBuf buffer) throws ClassNotFoundException, IOException {
//		Resource r = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString() + ".rsa"));
		Resource r = new BinaryResourceImpl(URI.createURI(UUID.randomUUID().toString() + ".rsa"));
		requireNonNull(r);
		try (InputStream is = new ByteBufInputStream(buffer) ) {
			r.load(is, null);
			if (!r.getContents().isEmpty()) {
				RsaResponse rsaResponse = (RsaResponse) r.getContents().get(0);
				if (rsaResponse.isEmpty()) {
					return null;
				}
				return getObject(rsaResponse.getResponse());
			} else {
				System.err.println("Ecore content is empty after de-serialization");
			}
		} finally {
			r.getContents().clear();
			resourceSet.getResources().clear();
		}
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.Serializer#dispose()
	 */
	@Override
	public void dispose() {
		this.soResourceSet.ungetService(resourceSet);
	}
	
	@SuppressWarnings("unchecked")
	private static <T extends RsaObject> T createRsaObject(Object o, EClass rsaObjectClass) {
		if (isNull(o)) {
			return null;
		}
		requireNonNull(rsaObjectClass);
		T rsao = (T) EcoreUtil.create(rsaObjectClass);
		if (o instanceof Throwable) {
			rsao.setJavaObject(o);
			rsao.setType(RsaObjectType.JAVA);
		} else if (o instanceof EObject) {
			rsao.setEObject(EcoreUtil.copy((EObject)o));
			rsao.setType(RsaObjectType.EMF);
		} else if (o.getClass().isPrimitive() || o instanceof Serializable) {
			rsao.setType(RsaObjectType.JAVA);
			rsao.setJavaObject(o);
		} else {
			rsao.setType(RsaObjectType.OTHER);
		}
		return rsao;
	}
	
	private static Object getObject(RsaObject rsaObject) {
		if (isNull(rsaObject)) {
			return null;
		}
		return switch (rsaObject.getType()) {			
		case EMF: {
			yield rsaObject.getEObject();
		}
		case JAVA: {
			yield  rsaObject.getJavaObject();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + rsaObject.getType());
		};
	}

}
