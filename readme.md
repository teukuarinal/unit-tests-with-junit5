# 🧪 Calculator Unit Test Demo

This repository contains a **unit testing demo** in **Java** using **JUnit 5**. The `CalculatorTest` class tests basic arithmetic operations such as addition, subtraction, multiplication, and division. It includes both successful scenarios and edge cases like division by zero, as well as parameterized tests.

## 📂 Project Structure

```
src/
└── test/
    └── java/
        └── com/
            └── appstest/
                └── CalculatorTest.java
```

> The tested `Calculator.java` class must implement methods like `integerAdd`, `integerSubtraction`, `integerMultiply`, and `integerDivide`.

## ✅ Tested Methods

| Method | Description |
|--------|-------------|
| `integerAdd(int a, int b)` | Returns the result of `a + b` |
| `integerSubtraction(int a, int b)` | Returns the result of `a - b` |
| `integerMultiply(int a, int b)` | Returns the result of `a * b` |
| `integerDivide(int a, int b)` | Returns the result of `a / b` (throws `ArithmeticException` if `b = 0`) |

## 🧪 Test Features

- ✅ Basic unit testing using `assertEquals`
- ❌ Disabled test using `@Disabled`
- ⚠️ Division by zero testing using `assertThrows`
- 🔁 Parameterized testing with `@CsvSource`
- 🛠️ Calculator instance setup using `@BeforeEach`

## ▶️ How to Run Tests

Make sure you have **Maven** and **Java 11+** installed.

To run the tests:

```bash
mvn test
```

To package the app while skipping tests:

```bash
mvn package -DskipTests=true
```

## 📦 Requirements

- Java 11 or newer
- Maven 3.6+
- JUnit 5 (Jupiter)

## 📌 Sample Output

Running the tests will output messages like:

```
Before each test method
Running 6*2 = 12
Before each test method
Running 6/2 = 3
...
```

## 🚧 Future Improvements

- Add more complex calculator functions
- Enable `@MethodSource` for more flexible parameter input
- Implement and test the `percentage` method

---

## 📄 License

This project is for demonstration and educational purposes only.
