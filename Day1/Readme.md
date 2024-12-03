## JDK
- Java development typically requires the Java Development Kit (JDK), which includes the Java compiler and other essential tools. You can download the JDK from the official Oracle website and follow the installation instructions for your operating system.
---

Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform.

![alt text](image.png)

![alt text](image-1.png)

##  JVM, JRE, and JDK
-  JVM, JRE, and JDK three are all platform-dependent because the configuration of each Operating System is different. But, Java is platform-independent.  Few things must be clear before setting up the environment which can better be perceived from the below image provided as follows:
![alt text](image-2.png)

- **JDK(Java Development Kit)**: JDK is intended for software developers and includes development tools such as the Java compiler, Javadoc, Jar, and a debugger.
- **JRE(Java Runtime Environment)**: JRE contains the parts of the Java libraries required to run Java programs and is intended for end-users. JRE can be viewed as a subset of JDK.
- **JVM** : JVM (Java Virtual Machine) is an abstract machine. It is a specification that provides a runtime environment in which java bytecode can be executed. JVMs are available for many hardware and software platforms.

## JAR File:-
- [Code Link](./Jar/)
- Create Jar File
    ```
    jar --create --file  .\JarTesting.jar .\JarTesting.class
    ```
- Execute JarFile
    ```
    java -cp  .\JarTesting.jar JarTesting
    ```

## JVM(Java Virtual Machine)
![alt text](image-3.png)


- We can access class details which is available in the method area is like class name,immediate parent class, Whether the “.class” file is related to Class or Interface or Enum, Modifier, Variables and Method information etc. [Code Link](./JVM/)