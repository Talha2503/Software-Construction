## 🏗️ SCD - Assignment 1: UML Diagrams Implementation in Java

[cite\_start]This repository contains the Java implementation for **Assignment \#1** of the **Software Construction and Development (SCD)** course at **Iqra University**[cite: 7, 9]. [cite\_start]The goal was to implement four specific UML Class Diagrams using **Classes** and **Interfaces** [cite: 13][cite\_start], applying **clean code principles** [cite: 15] throughout the construction.

### 🎯 Demonstrated Principles & Patterns

The implementation showcases key Object-Oriented Design concepts:

| Figure | Primary Principle/Pattern | Demonstrated Concept |
| :--- | :--- | :--- |
| **Fig 1** | **Interface Segregation Principle (ISP)** | [cite\_start]Breaking a bloated interface into granular ones[cite: 20]. |
| **Fig 2** | **Dependency Inversion Principle (DIP) & Composition** | [cite\_start]Depending on abstractions (`Engine`, `Driver`)[cite: 20]. |
| **Fig 3** | **Factory Method Pattern** | [cite\_start]Creation logic delegated to subclasses[cite: 20]. |
| **Fig 4** | **Strategy Pattern** | [cite\_start]Runtime selection of shipping behavior[cite: 20]. |

-----

## 🛠️ Project Structure and Files

The entire code is written in Java and organized into four main directories, matching the four UML figures.

| Directory | Key Files | Description |
| :--- | :--- | :--- |
| **`Fig_1/`** | `Cloud_Hosting_Provider.java`, `CDN_Provider.java`, `Cloud_Storage_Provider.java`, `Amazon.java`, `Drop_Box.java` | [cite\_start]Implementation of ISP[cite: 20]. [cite\_start]`Amazon` implements all three interfaces, while `Drop_Box` only implements `Cloud_Storage_Provider`[cite: 20]. |
| **`Fig_2/`** | `Engine.java`, `Driver.java`, `Transport.java`, `Combustion_Eng.java`, `Electric_Eng.java`, `Human.java`, `Robot.java` | Implementation of DIP and Composition. [cite\_start]`Transport` uses the `Engine` and `Driver` interfaces[cite: 20]. |
| **`Fig_3/`** | `Company.java`, `Employee.java`, `Game_Dev_Company.java`, `Out_Source_Company.java`, `Designer.java`, `Programmer.java`, `Tester.java` | Implementation of the Factory Method pattern. [cite\_start]Concrete employee objects are created in concrete company subclasses[cite: 20]. |
| **`Fig_4/`** | `Shipping.java`, `Order.java`, `Ground.java`, `Air.java`, `Line_Items.java` | Implementation of the Strategy pattern. [cite\_start]`Order` can change its shipping method (strategy) at runtime[cite: 20]. |

[cite\_start]**Note:** The `Main.java` file in each directory contains the demonstration code and generates the output shown in the submission screenshots[cite: 18].

-----

## 🚀 Execution Guide

### Prerequisites

  * Java Development Kit (JDK) installed.

### Running the Code

1.  Clone this repository:
    ```bash
    git clone [YOUR_GITHUB_REPOSITORY_LINK]
    ```
2.  Navigate to the directory of the figure you want to run (e.g., `Fig_1`):
    ```bash
    cd Fig_1/
    ```
3.  Compile the Java files:
    ```bash
    javac *.java
    ```
4.  Run the main class:
    ```bash
    java Main
    ```

### Example Output Snippets

| Figure | Output Snapshot (Terminal) |
| :--- | :--- |
| **Fig 1** | [cite\_start]`Server created in region Pakistan`, `File Named Robot.txt is stored` [cite: 3] |
| **Fig 2** | [cite\_start]`Car is moving through COmbustion Engine`, `Driven by Human` [cite: 4] |
| **Fig 3** | [cite\_start]`Desiner is Designing`, `Programmer is programming` [cite: 5] |
| **Fig 4** | [cite\_start]`The total COst of the order is : 1350.0`, `Shipping Date : 2025-11-13` [cite: 6] |

-----
