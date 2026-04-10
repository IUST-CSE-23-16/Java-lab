# 6 April

What our interpreter will run is not the java file, but the bytecode

bytecode file will have name same as class. If there are 10 classes, 10 bytecode files will be formed.

To run a .java file:

```bash
javac HelloWorld.java # javac for java compiler
java HelloWorld
```

Use in makefile:

```bash
run:
	javac HelloWorld.java
	java HelloWorld
```

## Common error:

### No Class found exception error:

This means our class loader could not load the class..  
JVM checks class path environment variable to find class files.

## Scanner to take user input

```java
scanner S = new Scanner(System.in);
int x = s.nextInt(); 			// primitive data is not object for performance reasons  like Int
String str = S.next(); 			// One word string . string is not primitive like int, it is a class
String str2 = S.nextLine();		// multi word string
```

## To import packages
```java
Import Java.util.* 				// to include all classes
Import Java.util.Scanner 		// to include only scanner class only
```

## Miscellaneous
- start of package name with small letter like `java.util.Scanner`
- `java.util.Scanner` > means inside java folder, there is util folder and Scanner class
