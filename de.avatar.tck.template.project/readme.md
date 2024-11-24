# Test Compatibility Kit 

## Setup

This bundle contains the Test for the *Connector API*. 

As a implementation help, there is a mocked test the shows some implementation details. This mock test will always run together with the other tests.

Running the TCK Standalon will fail because it will always need an implementation. Therefore this setup just creates a library containing the tests to be run.

* ConnectionInfoTest
* DryRequestTest
* ExecuteRequestTest
* MockedRequestTest (will alwys succeed and can be run in the TCK project as well)

The compile setup works in a way, that no *Test-Cases* Manifest header will be generated. This avoids accidentially launching the bnd Test-Runner, that inspects jars for this header.

## Content

The test should cover basic assumptions of the interface, its methods and parameters. If the implementation is excpected to have a certain behvior, this can be tested here as well.

## Usage 

Every implementation of an API should run these tests in addition to its owns. This ensures a basic compatibility to the requirements and capabilities as well as used data models. 
To do that, implementors have to integrate this library into their tests. On important task is to add the *Test-Cases* header to their own test manifests.

This is done in the *de.avatar.connector.isma.test* project. The *bnd.bnd* file contains the important steps:

```
-buildpath: \
	...
	de.avatar.connector.api.tck;version=snapshot,\
	...
	
-includeresource: \
	tck/de.avatar.connector.api.tck.jar=${repo;de.avatar.connector.api.tck}
	
Test-Cases: ${classes;HIERARCHY_INDIRECTLY_ANNOTATED;org.junit.platform.commons.annotation.Testable;CONCRETE}
Bundle-ClassPath: \
	tck/de.avatar.connector.api.tck.jar,\
	.
```
1. At first, we need the TCK jaron the build path, to declare a general dependency
2. In this case we include it into our own test jar, to be capable to run additional tests as well
3. Generate the *Test-Cases* Manifest header for the JUnit Launcher
4. Define the OSGi Class-Path dependency in the manifest
 


