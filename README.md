Software Consturction Assignment 2

Assignment Description

The task focuses on identifying and resolving code smells in a "God Class" scenario within the provided megaSystemManager Java program. A God Class is a class that has taken on too many responsibilities, leading to poor readability, maintainability, and scalability. The original class handled orders, shipping, discounts, reports, logging, notifications, and settings all in a single file with long methods and hard-coded values.

The objectives of this task were:

Analyze the code to detect code smells such as:

God Class / Large Class

Long Methods

Long Parameter Lists

Primitive Obsession / Magic Numbers

Poor and inconsistent naming

Type codes and duplicated logic

Refactor the code into a clean, modular, and maintainable design by:

Extracting multiple classes (OrderProcessor, Logger, SettingsManager, NotificationService, Order, User)

Introducing enums (UserType, PaymentType) instead of primitive type codes

Splitting long methods into smaller, reusable methods

Centralizing logging and file handling

Using constants instead of magic numbers

Simplifying the main method to coordinate objects rather than handling all business logic

Provide a code smell table identifying all problems, line numbers, and the applied refactoring techniques.

Demonstrate modular design with separate classes for each responsibility, improving readability, maintainability, and extensibility of the system.

This task reinforces software construction principles including Single Responsibility Principle (SRP), modular design, meaningful naming, and maintainable coding practices. It also prepares students to handle real-world software systems with complex responsibilities in a structured manner.
