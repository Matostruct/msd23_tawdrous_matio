# Exercise 3

## Dokumentation der Arbeitschritte

### 1. Voraussetzungen
___

1. Maven zum Path hinzufügen (Tipp: Terminal schließen und wieder öffnen nach dem neu hinzufügen)
   <br><code>mvn -v</code> ==> 3.9.6
3. <code>java -version</code> ==> 17.0.8
4. <code>javac -version</code> ==> 17.0.8

___

### 2. Calculator
___

1. Java Klasse <code>Calculator</code> erstellen mit folgenden Methoden:
   <ul>
      <li><code>add</code></li>
      <li><code>minus</code></li>
      <li><code>multiply</code></li>
      <li><code>divide</code></li>
   </ul>
2. Java Klasse <code>Main</code> erstellen und Methoden testen.
3. Ausführen und den neuen Order <i>target</i> anschauen:
   <img src="/resources/images/ex3_1.png" alt="screenshot of the target folder" style="width: 500px"/>
   In diesem Order sind zwei weitere Ordner: <i>classes</i> und <i>generated-sources</i>
   <br>
   In Classes sind die zwei Klassen <code>Calculator</code> und <code>Main</code> drinnen als .class file

___

### 3. Maven
___

1. In <code>pom.xml</code> den <code>maven.compiler</code> hinzufügen mit aktueller Version: 3.13.0 Release: 17
2. Progamm builden über Konsole: <code>mvn compile</code>
   <img src="/resources/images/ex3_2.png" alt="screenshot of the successful maven build">
3. Push to git
___
### 4. Maven Exec
___
1. Neues plugin in pom.xml hinzufügen und in der \<mainClass>com.example.Main\</mainClass> zu Main ändern.
2. <code>mvn exec:java</code> ausführen
   <img src="/resources/images/ex3_3.png" alt="screenshot of the successful maven exec">