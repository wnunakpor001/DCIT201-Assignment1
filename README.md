# DCIT 201 – Programming I

## Object-Oriented Programming Assignment (Java)

### Author

**Name:** Wisdom Nunakpor
**Course:** DCIT 201 – Programming I
**Program:** BSc. Mathematical Science
**Institution:** University of Ghana

---

# Project Overview

This project contains solutions to the **DCIT 201 Object-Oriented Programming Assignment** implemented using **Java**.

The assignment demonstrates the use of fundamental **Object-Oriented Programming (OOP)** principles including:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Interfaces
* Method Overriding
* Data Validation

Each question in the assignment is implemented as a Java class or group of classes that demonstrate a specific OOP concept.

---

# Project Structure

```
oop-java-assignment
│
├── BankAccount.java
├── Student.java
├── Employee.java
├── FullTimeEmployee.java
├── PartTimeEmployee.java
├── Vehicle.java
├── Car.java
├── Motorcycle.java
├── Payment.java
├── CreditCardPayment.java
├── MobileMoneyPayment.java
├── BankTransferPayment.java
├── ATMOperations.java
├── BankATM.java
└── Main.java
```

---

# Question 1 – BankAccount Class

This class demonstrates **encapsulation** and **data validation**.

### Features

* Private fields for account details
* Deposit and withdrawal methods
* Prevention of:

  * Negative deposits
  * Withdrawal exceeding balance
* Getter methods to access account information

### Example Methods

```java
public void deposit(double amount)
public void withdraw(double amount)
public double getBalance()
public String getAccountNumber()
```

---

# Question 2 – Student Class

This class demonstrates **getters, setters, and validation**.

### Fields

* `studentID`
* `name`
* `score`

### Validation

The score must be between **0 and 100**.

```java
if(score >= 0 && score <= 100)
```

### Grade Classification

| Score    | Grade |
| -------- | ----- |
| 70 – 100 | A     |
| 60 – 69  | B     |
| 50 – 59  | C     |
| 45 – 49  | D     |
| Below 45 | F     |

---

# Question 3 – Employee Inheritance

This section demonstrates **inheritance and method overriding**.

### Classes

* `Employee` (Superclass)
* `FullTimeEmployee`
* `PartTimeEmployee`

Each subclass overrides:

```java
calculateAnnualSalary()
```

---

# Question 4 – Vehicle Hierarchy

This demonstrates **method overriding and use of the `super` keyword**.

### Classes

* `Vehicle`
* `Car`
* `Motorcycle`

Each subclass overrides:

```java
startEngine()
```

---

# Question 5 – Abstract Class and Polymorphism

An **abstract class `Payment`** is used to demonstrate **runtime polymorphism**.

### Subclasses

* `CreditCardPayment`
* `MobileMoneyPayment`
* `BankTransferPayment`

Each class implements:

```java
processPayment(double amount)
```

Objects are stored in a list and processed polymorphically.

---

# Question 6 – Interfaces

An **interface `ATMOperations`** defines ATM functionality.

### Methods

```java
withdraw(double amount)
deposit(double amount)
checkBalance()
```

### Implementation

The class `BankATM` implements the interface and manages the account balance.

---

# OOP Concepts Demonstrated

| Concept           | Example                       |
| ----------------- | ----------------------------- |
| Encapsulation     | `BankAccount` private fields  |
| Data Validation   | `setScore()` method           |
| Inheritance       | `Employee` subclasses         |
| Method Overriding | `Car` and `Motorcycle`        |
| Abstract Classes  | `Payment`                     |
| Polymorphism      | Processing different payments |
| Interfaces        | `ATMOperations`               |

---

# How to Run the Project

1. Open the project in **IntelliJ IDEA** or **VS Code**.
2. Compile the Java files.
3. Run the `Main.java` class.

Example command:

```
javac *.java
java Main
```

---

# Sample Output

```
Deposit successful: 200
Withdrawal successful: 100
Error: Insufficient funds

Student ID: ST101
Name: Wisdom
Score: 75
Grade: A

Processing credit card payment of $500
Processing mobile money payment of $500
Processing bank transfer payment of $500
```

---

# Conclusion

This project demonstrates the implementation of **core Object-Oriented Programming concepts in Java**, including encapsulation, inheritance, polymorphism, abstraction, and interfaces.

These principles help build **modular, reusable, and maintainable software systems**.
