# 🧠 Learning: Phase 04 - Loops

Loops are used to execute a block of code repeatedly.

## 1. For Loop
Best when you know exactly how many times you want to loop.
```java
// Prints 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## 2. While Loop
Loops through a block of code as long as a specified condition is `true`.
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## 3. Do-While Loop
Similar to `while`, but it will execute the code block at least once before checking the condition.
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

## 4. Break and Continue
- `break`: Stops the entire loop.
- `continue`: Skips the current iteration and moves to the next one.
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // Skips printing 3
    System.out.println(i);
}
```
