# Polymorphism-In-Java
Welcome to the Java Polymorphism Examples repository! This collection is designed to provide comprehensive examples and explanations for understanding and implementing polymorphism in Java. These examples cover essential concepts and best practices related to polymorphism.

## Introduction
Polymorphism is a core concept in object-oriented programming that allows objects of different types to be treated as objects of a common type. 
This repository explores various aspects of polymorphism, including method overriding.

### 1. Method Overriding
- **Description**: The ability of a subclass to provide a specific implementation of a method that is already defined in its superclass.
- **Example**:
  ```java
  class Animal {
      void makeSound() {
          System.out.println("Animal makes a sound");
      }
  }

  class Dog extends Animal {
      @Override
      void makeSound() {
          System.out.println("Dog barks");
      }
  }
