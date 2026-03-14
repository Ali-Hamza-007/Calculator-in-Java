# 📱 Java Android Calculator App

A **modern, native Android calculator application** built using **Java and Material Design components**.  
The application delivers a **clean, responsive user interface with reliable arithmetic logic**, featuring **real-time input handling and edge-to-edge display support** for an immersive mobile experience. 🚀📱

---

## ✨ Features

### 🔢 Core Arithmetic Operations
- Supports **Addition, Subtraction, Multiplication, and Division**.  
- Provides **accurate and instant calculations** for everyday use.  
➕ ➖ ✖️ ➗  

### 🎨 Modern Material UI
- Built using **MaterialButton components** for a **sleek, modern appearance**.  
- Ensures **responsive touch feedback and a polished interface** following **Material Design guidelines**. 🎨✨  

### 🧠 Smart Calculation Logic
- **AC (All Clear):** Instantly resets the entire calculation with a single tap. 🧹  
- **C (Clear):** Acts as a **backspace function** to remove the last entered character. ⬅️  
- **Zero Division Protection:** Prevents crashes by displaying an **"Error" message** when attempting division by zero. 🛡️  
- **Whole Number Formatting:** Uses `DecimalFormat` to **remove unnecessary `.0` values**, keeping results clean and readable. 🔢  

### 📱 Enhanced User Experience
- **Edge-to-Edge Display:** Fully immersive UI that **respects system bars** for a modern Android look. 📱✨  
- **Input Validation:** Prevents invalid expressions such as **starting calculations with operators like `*` or `/`**. 🚫  
- **Real-Time Input Display:** Dynamically updates the calculation screen as the user enters numbers and operators. ⚡  

---

## 🛠️ Technology Stack

- **Programming Language:** Java ☕💻  
- **Framework:** Android SDK *(AppCompat, Material Components)* 🤖📦  
- **UI Layout:** XML using **MaterialButton** and **TextView** components 🖼️  
- **Architecture:** View-based design with a **centralized `onClick` event handler** for efficient input processing 📐  

---

## 🚀 How It Works (Code Highlights)

### 🎛️ Centralized Button Handling
The application uses a **single `onClick` listener** to manage all calculator button interactions efficiently.

### ⌨️ Input Handling
- Updates the **Solution display in real-time** as users type numbers or operators.  
- Ensures **smooth and responsive input processing**.

### 🔍 Expression Parsing
- Utilizes **Regular Expressions (Regex)** to **split input strings by arithmetic operators**, enabling accurate extraction of numbers for computation.

### 🛡️ Error Prevention
- Handles **empty inputs and invalid expressions** automatically.  
- Prevents multiple decimal points or misplaced operators to maintain valid calculations.



⭐ If you like this project, consider **starring the repository**!
