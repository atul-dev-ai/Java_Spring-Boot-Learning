# 🧠 Learning: Phase 09 - Collections Framework

The Collections framework provides classes to store and manipulate groups of data (like dynamic arrays, sets, maps).

## 1. ArrayList
A resizable array. Best when you need to access elements fast but don't delete/insert often in the middle.
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
System.out.println(list.get(0)); // Apple
list.remove("Apple");
```

## 2. HashMap
Stores items in "key/value" pairs. Keys must be unique.
```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("Atul", 95);
map.put("Rahim", 80);

System.out.println(map.get("Atul")); // Prints 95
```

## 3. HashSet
A collection where every item is unique. It does not maintain order.
```java
import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(10); // Ignored, because 10 is already there
System.out.println(set.size()); // 1
```
