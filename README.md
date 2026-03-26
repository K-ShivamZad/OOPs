

# Java OOPs & GUI Programs Collection

This repository contains a wide collection of Java programs demonstrating various Object-Oriented Programming (OOP) concepts, Graphical User Interface (GUI) development using AWT and Swing, Multithreading, Exception Handling, Database Connectivity (JDBC), and basic algorithms. 

It is an excellent resource for beginners and intermediate learners to understand how different Java components work in practice.

## 🗂️ Categories

### 1. GUI Development (AWT & Swing)
These files demonstrate how to build desktop applications, handle layouts, and listen for events using Java's AWT and Swing libraries.
* **Calculators**: `Calculator.java`, `Calculator2.java`, `SimpleCalculatorGUI.java`, `calculatorEXM.java`
* **Layouts & Components**: `AWTExample1.java`, `AWTExample2.java`, `Border.java`, `FlowLayoutExample.java`, `GridLayoutExample.java`, `CheckBoxExample.java`, `RadioButtonExample.java`, `TextAreaExample.java`, `TextFieldExample1.java`
* **Menus**: `MenuExample.java`, `MenuBarExample.java`, `PopupMenuExample.java`
* **Event Handling**: `AEvent.java`, `ButtonLevelDisplay.java`, `MouseEventExample.java`, `MouseHandlingDemo.java`
* **Graphics & Drawing**: `SmilingFaceApp.java`, `SmilingFaceApp2.java`, `SimpleImageGeneration.java`, `TitiesSwing.java`
* **Mini Applications**:
    * `DigitalWatch.java` - A digital clock GUI.
    * `IPAddressFinder.java` - Finds the IP address of a given website URL.
    * `ExpenseTracker.java` - A console-based expense tracker.

### 2. Object-Oriented Programming (OOP) Concepts
Examples of core OOP principles such as Inheritance, Polymorphism, Abstraction, and Interfaces.
* `ConstructorOverloadingExample.java` - Demonstrates multiple constructors in a single class.
* `InterfaceExtensionExample.java` - Shows how an interface can extend another interface.
* `MultipleInheritanceExample.java` - Implements multiple interfaces in a single class.
* `Labmn1.java` & `Labmn2.java` - Demonstrates Abstract classes and Interfaces (e.g., Animal and Dog).

### 3. Design Patterns
* `MVCPatternDemo.java` - Implementation of the **Model-View-Controller (MVC)** design pattern using a Student object.
* `Labmn3.java` - Implementation of the **Composite** design pattern (Component, Leaf, Composite).

### 4. Exception Handling
Examples of how to catch, handle, and throw custom and built-in exceptions.
* `ArthExec.java` & `DivisionDemo.java` - Handling `ArithmeticException` and creating custom exceptions (e.g., `DivideByEightException`).
* `ExcPro.java` & `ThrowsAndThrowExample.java` - Using `throw` and `throws` keywords for `IOException` and `IllegalArgumentException`.
* `FinallyBlockNotExecuted.java` - Demonstrates how `System.exit(0)` prevents the `finally` block from executing.
* `NullPointerExceptionExample.java` - Handling null references safely.
* `trycatch.java` - Standard try-catch implementation for `ArrayIndexOutOfBoundsException`.

### 5. Multithreading & Synchronization
* `SynchronizationExample.java` - Using the `synchronized` keyword to prevent thread interference on a counter.
* `TablePrinter.java` - Printing multiplication tables concurrently using the `Runnable` interface.
* `daem.java` - Demonstrates setting and checking Daemon threads.
* `test.java` & `syncTest.java` - Creating threads, using `Thread.sleep()`, and `Thread.join()`.

### 6. Database Connectivity (JDBC)
* `MySQLJDBCExample.java` - Complete flow of registering a driver, creating a table, and inserting records using `Statement.executeUpdate()`.
* `jdbc1.java` - Connecting to a local MySQL database and fetching data using `ResultSet`.

### 7. Algorithms & Logic Building
Various utility programs to test basic problem-solving skills.
* `AddWithoutArithmetic.java` - Adding two numbers using Bitwise operators instead of `+`.
* `DuplicateWordsFinder.java` - Uses `HashMap` and `HashSet` to find duplicate words in a string.
* `FindingLargestNum.java` - Finds the largest number in a user-input array.
* `NumberGuessingGame.java` - A simple higher/lower console game utilizing `Math.random()`.
* `SingularMatrixChecker.java` - Uses recursion to calculate the determinant of a matrix and check if it is singular.
* `SpyNumber.java` - Checks if the sum of a number's digits equals the product of its digits.
* `VowelConsonantCounter.java` & `WordCharCounter.java` - String manipulation and character counting.

---

## 🚀 How to Run

1. **Prerequisites**: Make sure you have the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) installed on your machine.
2. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd OOPs
   ```
3. **Compile a Java file**:
   ```bash
   javac FileName.java
   ```
   *(Example: `javac Calculator.java`)*
4. **Run the compiled Java class**:
   ```bash
   java FileName
   ```
   *(Example: `java Calculator`)*

## 🛠️ Built With
* **Java** (JDK 8 or higher recommended)
* **AWT / Swing** (for GUI applications)
* **JDBC** (for Database connectivity files)
