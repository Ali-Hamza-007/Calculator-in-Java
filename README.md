📱 Java Android Calculator App
A modern, native Android calculator application built with Java and Material Design. This app provides a clean user interface and reliable arithmetic logic, featuring real-time input handling and edge-to-edge display support. 🚀

✨ Features
Core Arithmetic: Support for addition, subtraction, multiplication, and division. ➕ ➖ ✖️ ➗

Material UI: Uses MaterialButton for a sleek, modern look and tactile feel. 🎨

Smart Calculation Logic: * AC (All Clear): Reset everything with one tap. 🧹

C (Clear): Backspace functionality to fix typing errors. ⬅️

Zero-Division Protection: Displays an "Error" message to prevent app crashes. 🛡️

Whole Number Formatting: Uses DecimalFormat to hide unnecessary .0 for clean results. 🔢

User Experience: * Edge-to-Edge: Fully immersive UI that respects system bars. 📱

Validation: Prevents starting an expression with operators like * or /. 🚫

🛠️ Built With
Language: Java ☕

Framework: Android SDK (AppCompat, Material Components) 🤖

UI Layout: XML with MaterialButton and TextView 🖼️

Architecture: View-based with a centralized onClick handler. 📐

🚀 How It Works (Code Highlights)
This app utilizes a centralized onClick listener to handle all button interactions efficiently:

Input Handling: Dynamically updates the "Solution" screen as you type.

Regex Parsing: Splits the input string based on operators to identify numbers.

Error Prevention: Automatically handles empty inputs and decimal point placement.
