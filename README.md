# Electricity Bill Calculator (Java)

A simple Java application that calculates electricity bills using slab-based tariff rates. The project demonstrates object-oriented programming concepts such as classes, encapsulation, constructors, and method-based billing logic.

## Features
- Consumer information management
- Slab-wise electricity tariff calculation
- Automatic bill generation based on units consumed
- Clean and beginner-friendly Java code

## Tariff Structure

| Units Consumed | Rate |
|---------------|------|
| 0 - 100 | Rs. 1.5/unit |
| 101 - 200 | Rs. 2.5/unit |
| 201 - 300 | Rs. 4.0/unit |
| Above 300 | Rs. 6.0/unit |

## Classes

### Consumer
Stores:
- Consumer ID
- Consumer Name
- Units Consumed

### TariffCalculator
Calculates the electricity bill based on slab rates.

### ElectricityBill
Main class that:
1. Creates a consumer object
2. Generates the bill
3. Displays consumer details and total bill amount

## Sample Output

```text
Consumer ID: 101
Name: Ananya Gupta
Units Consumed: 250
Total Electricity Bill: Rs.600.0
```

## Technologies Used
- Java
- Object-Oriented Programming (OOP)

## How to Run

```bash
javac ElectricityBill.java
java ElectricityBill
```

## Learning Concepts
- Classes and Objects
- Constructors
- Encapsulation
- Method Invocation
- Conditional Statements
- Slab-Based Billing Logic

## License
This project is open source and available for educational purposes.
