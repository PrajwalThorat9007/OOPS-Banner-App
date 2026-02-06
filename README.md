# OOPS Banner App

## Overview
The **OOPS Banner App** is a console-based Java application designed to showcase the progressive evolution of code through Object-Oriented Programming (OOPS) principles. The application renders the word **"OOPS"** as a high-quality ASCII banner, serving as a practical case study in refactoring, modularity, and scalable software design.

---

## Objectives
- **Iterative Refactoring:** Demonstrate the transition from procedural string manipulation to a modular, OOPS-driven architecture.
- **Principle Application:** Implement core concepts including Encapsulation, Abstraction, and the SOLID principles.
- **Code Quality:** Utilize the Java Collections Framework to optimize pattern management and eliminate redundancy.
- **Version Control Excellence:** Maintain a professional development lifecycle using the **GitFlow branching strategy**.

---

## Technologies Used
* **Language:** Java
* **IDE:** IntelliJ IDEA
* **Version Control:** Git (GitHub)
* **Workflow:** GitFlow Methodology

---

## Features
* **Dynamic ASCII Rendering:** High-fidelity console output for character banners.
* **Pattern Reusability:** Helper methods designed to generate recurring ASCII shapes, adhering to the DRY principle.
* **Encapsulated Data:** Utilization of static inner classes to isolate character logic from rendering logic.
* **Scalable Architecture:** HashMap-based lookups that allow for easy expansion to the full alphabet.
* **Consistent Output:** Strict verification to ensure UI consistency across all eight refactoring stages (UC1–UC8).

---

## OOPS Concepts Implemented
* **Encapsulation:** Protecting character data within dedicated structures.
* **Abstraction:** Hiding complex pattern generation behind simple rendering interfaces.
* **Modularity:** Breaking the application into distinct, manageable components.
* **DRY Principle:** Minimizing code duplication through reusable logic.
* **Single Responsibility Principle:** Ensuring each class and method has one focused purpose.
* **Separation of Concerns:** Distinguishing between data storage and console presentation.

---

## GitFlow Implementation
The repository history serves as a roadmap for the project's development, strictly adhering to GitFlow standards:

1. **main branch:** Reserved for project documentation and stable releases.
2. **develop branch:** The primary integration branch containing the final, optimized implementation (UC8).
3. **feature branches:** Independent branches were used for each stage of the OOPS evolution before merging into develop.

---

## Final Outcome
The project successfully bridges the gap between basic coding and professional software engineering. By the final stage, the application boasts a collection-driven architecture that is highly readable, maintainable, and ready for scaling—proving that even a simple "Banner" can reflect industry-standard design patterns.
