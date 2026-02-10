# 🚗 Car Service Management System (Core Java)

A console-based Java application that simulates the working of a car service centre.

This project is developed using **Core Java only** (no database) to demonstrate real-life implementation of **Object Oriented Programming concepts** such as inheritance, encapsulation and class relationships.

The system stores customer, car and service records in memory and allows users to manage them through a menu-driven interface.

---

## 🎯 Objective

To understand practical usage of:
- Classes & Objects
- Inheritance (Multi-level)
- Arrays of Objects
- Constructors
- Scanner Input Handling
- Menu Driven Programs
- Real-world logic building

---

## 🧠 OOP Design Used

The project follows **multi-level inheritance**:

```
Car → Customer → ServiceRecord → ServiceCentre(Main)
```

| Class | Responsibility |
|------|------|
| `Car` | Stores car details |
| `Customer` | Stores customer details |
| `ServiceRecord` | Stores service history & billing |
| `ServiceCentre` | Main program & menu operations |

---

## 📌 Features

### 👤 Customer Management
- Add customer details
- Update customer information
- Display all customers

### 🚘 Car Management
- Store car company, model & registration
- Update car details
- Display car information

### 🔧 Service Records
- Record multiple services
- Different service types (Regular / Full / Custom)
- Store service description & date

### 💰 Billing
- Calculate total service cost
- Generate service report
- Show service history

### 📋 Menu Driven Interface
User can perform operations:

1. Update Customer Details  
2. Update Car Details  
3. Display All Records  
4. Add New Service Record  
5. Generate Service Report  
6. Exit

---

## 📂 Program Flow

1. User enters number of customers
2. System stores customer + car + service details
3. Menu appears
4. User performs operations repeatedly
5. Data stored in runtime memory (arrays)

---

## ▶️ How to Run

### Compile
```bash
javac ServiceCentre.java
```

### Run
```bash
java ServiceCentre
```

---

## 💻 Technologies Used
- Java (Core Java)
- OOP Concepts
- Console Input/Output

---

## 📖 Concepts Demonstrated

- Multi-level inheritance
- Arrays of objects
- Constructor overloading
- Method overriding style behavior
- Real-world problem modelling

---

## ⚠️ Limitations
- No database (data resets after program ends)
- Console based UI
- Fixed array size

---

## 🚀 Future Improvements
- Add file/database storage
- GUI interface (Swing/JavaFX)
- Search functionality
- Proper validation system

---

## 👨‍💻 Author
**Yashrajsinh Kanchva**

GitHub:  
https://github.com/Yashrajsinh-Kanchva
---

## 📄 Note
This project is created for learning Core Java and OOP concepts.
