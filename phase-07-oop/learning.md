# 🧠 Learning: Phase 07 - Object-Oriented Programming (OOP)

## 1. Class and Object
- **Class:** A blueprint or template.
- **Object:** An instance of a class.
```java
class Car {
    String color;
    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object
        myCar.color = "Red";
        myCar.drive();
    }
}
```

## 2. Constructor and `this` Keyword
Constructors are special methods called when an object is created.
```java
class Student {
    String name;
    
    // Constructor
    Student(String name) {
        this.name = name; // 'this' refers to the current object's variable
    }
}
```

## 3. Encapsulation
Hiding data by making variables `private` and providing `public` getters/setters.
```java
class Person {
    private int age; // Hidden

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }
    public int getAge() {
        return age;
    }
}
```

## 4. Inheritance
A class can inherit properties from another using `extends`.
```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}
class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}
// Dog can now eat() and bark()
```

## 5. Polymorphism
Many forms. Methods can be overridden in child classes.
```java
class Animal { void sound() { System.out.println("Animal sound"); } }
class Cat extends Animal { void sound() { System.out.println("Meow"); } } // Overriding
```

## 6. Abstraction and Interfaces
Hiding implementation details.
```java
interface Drawable {
    void draw(); // No body
}
class Circle implements Drawable {
    public void draw() { System.out.println("Drawing circle"); } // Must provide body
}
```
