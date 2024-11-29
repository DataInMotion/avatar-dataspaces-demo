# Test Compatibility Kit - Infrastruktur

## Einführung

Schnittstellen sind in einer modularen Umgebung die Basis für Services. Diese wiederum sind das Mittel zur Kommunikation zwischen Modulen. 

Diese Schnittsteller, der Contract, muss klar definierte Erwartungen und Funktionalität beider Seiten ausdrücken. In diesem Fall ist die Schnittstelle modelliert und generiert. Trotzdem können Bedingungen bei der Kommunikation enthalten sein, die existieren aber nicht klar im entsprechenden Meta-Modell formuliert werden können.

TCK dienen dazu, diese grundlegenden Erwartungshaltungen bei der Seiten, der Produzentenseite, sowie der Konsumentenseite zu formulieren und in Form von Testfällen jedem Produzenten zur Verfügung zu stellen.

Jeder Implementierer kann dieses TCK nutzen, um seine Implementierung gegen die definierten Anforderungen automatisiert zu testen.

## Voraussetzungen

Das hier ausgewählte Setup basiert auf OSGi, das in anderen Teilprojekt-Beispielen für eine service-orientierte, dynamische, modulare, föderierte Architektur gewählt wurde. Aus diesem Grund werden die API’ durch Services als Kommunikationsmedium für den Austausch der Module verwendet.

## Unit Test vs. Integrations Test vs. TCK Test

Da der service-basierte Ansatz im Zentrum steht, werden in diesen OSGi Umgebungen und Anwendungen primär Services getestet. 

Hinsichtlich der Art der Tests muss unterschieden werden, welche Mittel man heranzieht, welcher Auslöser für die Tests existiert. Nachfolgend sollen folgende 3 Test - Arten beschrieben werden:

* Unit Tests
* Integrations Tests
* TCK Tests

Daneben gibt es noch weitere Arten, die aber in diesem Kontext nicht relevant sind. Die drei genannten Arten test die Services und das üblicherweise mit dem selben Test-Framework, hier *JUnit 5 - Jupiter*

Nachfolgend soll eine inhaltliche Abgrenzung erfolgen.

### Unit Tests

In Unit Tests werden die Service-Implementierung direkt dort getestet, wo sie entwickelt werden. Dies geschieht also üblicherweise im selben Projekt, in dem der Implementierungs-Code liegt. Diese Test sind für eine test-getriebene Entwicklung gedacht. Es soll also nur die *Unit* der Service Implementierung getestet. Die Grundannahme bei Unit-Tests ist, das eine normale Ablaufumgebung / Runtime nicht zur Verfügung stehen muss. Dadurch werden die Tests schnell und können nach wenigen Codeänderungen immer wieder ausgeführt werden.

Mit Bndtools ist es sogar möglich, die Tests automatisch nach dem Speichern der Codeänderungen mitlaufen zu lassen. Dadurch bekommt man unmittelbares Feedback, ob die Änderungen die Tests nach wie vor bestehen.

Da Services Abhängigkeiten zu andern Services haben, treten diese oft kaskadiert auf. Da diese Service Ablaufumgebung von der Anwendung bereitgestellt wird, haben wir nun potenziell die Herausforderung, mit diesen Abhängigkeiten manuell umzugehen. Hier kommen Mock-Frameworks ins Spiel, die abhängige Service-Implementierung simulieren / nachahmen können. Mit Mocks kann dann wiederum geprüft werden, wann und wie oft diese Services aufgerufen werden oder wie man auf potenzielle Fehlern bei diesen Aufrufen reagiert.

Dadurch bleibt der Fokus auf der Implementierung und deren Funktion. Die abhängigen Services werden als Blackboxes betrachtet und deren Implementierung interessiert hier nicht.

### Integrationstest

Bei dieser Testart geht man einen Schritt weiter und testet seine Services unter Realbedingungen. Dazu wird eine Service-Runtime mit allen nötigen abhängigen Services gestartet. 

Bei dieser Testart liegt der Fokus nicht auf **der** einen Implementierung, sondern eher auf der korrekten Funktionsweise der Service Orchestrierung.

* Wie funktionieren die Services zusammen?
* Was muss konfiguriert werden?
* Welche Services sind verpflichtend, welche optional?
* Wie ist der Lebenszyklus sowie die Dynamik umgesetzt?

Es geht also um die Architektur, den Schnitt der Services. Diese Art des Testens offenbart nicht nur Laufzeitverhalten sondern auch den Abhängigkeitsbaum der verwendeten Service und derer Komponenten.

Sie sind eine weitere Stufe aufbauend auf den Unit Tests der Module / Service-Implementierungen. Durch die benötigten Ablaufumgebungen kann das Testsetup umfangreicher sein. Das ist ok, da diese Tests näher den realistischen Ablaufszenario entspricht. Dies hat allerdings zur Folge, das diese Tests möglicherweise eine größere Latenz verursachen. Es ist dann nicht mehr sinnvoll, diesen Art von Tests bei jeder Code-Änderung auszuführen. Stattdessen werden diese Tests eher bei jedem autotmaisierten Build oder in noch längeren Zyklen (täglich nachts) ausgeführt.

### TCK Tests

TCK Tests testen ein spezifiziertes Verhalten von Schnittstellen / Services. Nicht alle Services unterliegen solch strengen Spezifikationen. Insbesondere wenn eine größere Zahl an unterschiedlichen, potenziellen Implementierern erwarte wird, sollte nicht nur die Schnittstelle sondern auch deren Verhalten, Erwartungshaltungen und Funktionen klar definiert / spezifiziert werden. Darin sind nicht nur technische Definitionen enthalten sondern auch verhaltens-orientierte Funktionen oder Anforderungen sowie entsprechende Fehlerbehandlung.

Dabei nehmen die Test die Konsumentenseite ein und testen, ob eine Implementierung das Spezifizierte Verhalten an den Tag legt oder dagegen verstößt. Sie dienen Implementierern, eine Kompatibilität zu den Spezifikationen herzustellen und dem erwartet Verhalten des Service gerecht zu werden.

Grundlegend benötigen auch TCK Tests eine Ablaufumgebung und sind den Integrationstests sehr ähnlich. Abhängig vom Umfang der Spezifikation, können diese Test-Bibliotheken viele Tests enthalten. Damit ist die Laufzeit auch eher für automatisierte Builds geeignet. Allerdings liegt es in der Natur dieser Tests, dass man eine Implementierung gegen sie testet. Darum werden diese Tests vom Entwickler auch während der Entwicklung ausgeführt. Automatisierte Build sollten diese Tests in jeden Fall ausführen, da sie eine Kompatibilität zu einer Spezifikation aufzeigen.

Im Unterschied zu Integrationstest und Unit Tests werden die Test-Fälle selten selbst entwickelt. Diese wurde im Rahmen des Spezifizierungsprozesses definiert und dienen einer Implementierung als Abnahmekriterium. Es werden also existierende Testbibliotheken gegen das Laufzeitszenario / -konfiguration meiner Implementierung getestet.

## Technische Mittel

DIe Schnittstellen Modell wurden mit UML, genau mit dem EMF designt und entsprechend Java Code generiert ([https://eclipse.dev/modeling/emf/](https://eclipse.dev/modeling/emf/)).

Zum Testen wird Java verwendet mit den Bibliotheken:
* Unit5 Jupiter [https://junit.org/junit5/docs/current/user-guide/](https://junit.org/junit5/docs/current/user-guide/)
* OSGi-Test [https://github.com/eclipse-osgi-technology/osgi-test](https://github.com/eclipse-osgi-technology/osgi-test)
* Mockito [https://site.mockito.org/](https://site.mockito.org/)
* Gradle als Buildtool [https://gradle.org/](https://gradle.org/)
* BndTools als Gradle Plugin [https://github.com/bndtools/bnd](https://github.com/bndtools/bnd)

## Zielsetzung

Ziel soll es sein dem Entwickler Hilfsmittel an die Hand zu geben, um einfach ein TCK Setup zur Verfügung zu haben. Es soll ein Template zur Verfügung gestellt werden, mit dem einfach ein solches TCK Test Projekt für eine Implementierung erstellt werden kann.

DAfür ist zuvor ein Beispiel-Setup nötig anhand dessen das Template extrahiert werden kann. Das TCK selbst muss zwar als Test entwickelt werden. Allerdings kann es ohne Implementierung nicht zur erfolgreichen Ausführung kommen. das TCK Projekt muss demzufolge eine Bibliothek werden, die nur im Zusammenhang einer Implementierung ausgeführt werden kann.

## Setup

Die involvierten Projekte sind:

* *de.avatar.connector.api* - Connector API
* *de.avatar.connector.api.tck* - TCK Tests Library für Connector API mit Testfällen
* *de.avatar.connector.isma* - Implementation 1
* *de.avatar.connector.isma.test* - TCK Setup für Implementation 1
* *de.avatar.connector.other* - Implementation 2
* *de.avatar.connector.other* - TCK Setup für Implementation 2
* *de.avatar.tck.template.project* - Template Projekt zum Erstellen von TCK Tests 

### TCK Mocks

Zur den Requirements und Capabilities der modellierten API werden nun entsprechende Test-Fälle entwickelt. Da es aber keine Implementierung gibt, kann man diese als sogenannte Mocks simuliert. Die Mocks sind “dumme” Implementierungen, denen man ein Verhatlten antrainieren kann. Im Anschluss wird dann geprüft, ob ein Mock die erwarteten Aufrufe mit entsprechenden Parametern erfahren hat.

Mit diesem Ansatz kann man zukünftigen Implementierern Hinweise zum umzusetzenden Verhalten geben. Die Mocktests können dann auch sofort ausgeführt werden. Daraus ableitend werden die eigentlichen Test erstellt. Diese können dann aber durchaus umfangreicher sein, als die gemockten Tests. 

### Test-Setup für Implementierung

In diesem Setup werden die TCK Bibliothek zusammen mit der Implementierung ausgeführt. Dadurch kommen die Dependencies zur API und dem entsprechenden Modell für die Datenstruktur mit. 

Das *de.avatar.connector.isma.test* Projekt enthält ein manuell erstelltes Setup zum Ablaufen lassen. Im *bnd.bnd* Build-Deskriptor wird definiert, wie die TCK Bibliothek eingebettet und den Bundle-Klassenpfad hinzugefügt wird. Damit sind die Test “Eigentum” des Bundles. Nachfolgend müssen noch alle Klassen nach entsprechenden JUnit Annotation wie bspw. `@Test` gescannt werden. Das `${classes;;}`Macro liefert dann eine Liste der Klassen, die diese Annotationen verwenden. Diese Informationen werden in das Test-Bundle Manifest geschrieben, damit der Test Launcher in der IDE oder dem Gradle Build, diese Informationen nutzen kann, um die Test-Suite auszuführen und die Ergebnisse aufzuzeichnen.

```properties
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
* **-buildpath** - Definiert die Dependencies des Bundles
* **-includeresource** - Embedded hier die TCK Bibliothek physisch in das Test-Projekt-Artefakt / Datei
* **Test-Cases:** - Bundle-Manifest Header mit einer Liste aller auszuführenden Test-Fälle
* **Bundle-ClassPath:** - Bundle-Deskriptor, dass das TCK zur Ausführung auch geladen werden kann.

### Projekt Template - Projekt

Um die Akzeptanz von test-getriebener Entwicklung zu Erhöhen, sollten manuelle Setup-Schritte für Entwickler / Implementierer vermieden werden. Wir verwenden den Template Ansatz des verwendeten Buildtools *Bndtools*. Damit können wir konfigurierbare Projekt-Vorlagen erstellen.

Anwender erstellen dann ein Projekt auf Basis einer Vorlage und werden dann nach bestimmten Parametern gefragt, die notwendig für das Setup des Projektes sind. Der Rest ist im Template vorbereitet und wird durch die Angaben vervollständigt.

Nach Analyse des Test-Setups für das *de.avatar.connector.isma.test* Projektes, wurden notwendigen Variablen extrahiert, anhand derer man ein Setup abstrahieren kann. Damit also dieses TCK Setup funktioniert sind 2 Parameter relevant:

1. Der Name (Bundle-Symbolic-Name) des TCK Moduls / Bibliothek
2. Der Name (Bundle-Symbolic-Name) des Modul, das gegen das TCK getestet werden soll

In der Definition des TCK Template - Projektes wurden zusätzlich noch Meta-Informationen und Hilfedaten für eine Oberfläche definiert. Daneben ist das Layout eines neuen Projektes enthalten. Dieser Mechanismus erlaubt es ein Projekt für einen TCK Test direkt in der Entwicklungumgebung zu erstellen, indem man die beiden obigen Parameter definiert.

Für Buildtools wie bspw. Maven existieren ähnliche Möglichkeiten, um solche Template-Projekte zu erstellen. Sie dienen der Erhöhung der Produktivität der Entwickler. Die Leichtigkeit, ein solches Projekt aufzusetzen, erhöht gleichzeitig die Akzeptanz für ein solches Testvorgehen.

## Spezifizierungsprozesse

Final muss noch erwähnt werden, dass jede Spezifikation nur so gut ist, wie das TCK. Man könnte das Test-Compatibility-Kit als den Unit-Test für die Spezifikation betrachten. Sie technisieren die verbalen Beschreibungen bzw- Use-Cases.

Dabei ist die größte Herausforderungen umfassende Spezifikationen zu erstellen. Dieser Prozess benötigt neben Sorgsamkeit ein hohes Maß an Interaktion mit anderen Stakeholdern eine Spezifikation. Da man Spezifikation eher für andere schreibt, ist sind die Formulierungen wichtig. TCK’s können den eine noch höhere Ausdrucksstärke verleighen.

