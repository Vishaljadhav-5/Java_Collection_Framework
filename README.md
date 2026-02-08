# Java Collections Framework 📦

This repository is created as a **learning guide for the Java Collections Framework (JCF)**. It covers the core concepts, interfaces, classes, and common use cases to help you understand how collections work in Java.

---

## 📌 What is the Java Collections Framework?

The **Java Collections Framework** is a set of classes and interfaces in Java that provide a standard way to store, manipulate, and retrieve groups of objects.

It helps you:
- Store data efficiently
- Reduce programming effort
- Improve code readability and reusability
- Use well-tested, optimized data structures

---

## 🧩 Core Interfaces

| Interface | Description |
|---------|------------|
| `Collection` | Root interface of the collection hierarchy |
| `List` | Ordered collection, allows duplicates |
| `Set` | Unordered collection, does not allow duplicates |
| `Queue` | Used for holding elements prior to processing |
| `Deque` | Double-ended queue |
| `Map` | Stores key-value pairs (not a subtype of Collection) |

---

## 📚 Common Implementations

### 🔹 List Implementations
- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

### 🔹 Set Implementations
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

### 🔹 Queue / Deque Implementations
- `PriorityQueue`
- `ArrayDeque`

### 🔹 Map Implementations
- `HashMap`
- `LinkedHashMap`
- `TreeMap`
- `Hashtable`

---

## 🔄 Collection Hierarchy (Simplified)

```
Iterable
   └── Collection
         ├── List
         ├── Set
         └── Queue

Map (separate hierarchy)
```

---

## ⚙️ Basic Operations

Common operations provided by collections:
- `add()`
- `remove()`
- `contains()`
- `size()`
- `isEmpty()`
- `clear()`
- `iterator()`

---

## 🔁 Iterating Through Collections

Ways to iterate:
- Enhanced for-loop
- `Iterator`
- `ListIterator`
- `forEach()` method

Example:
```java
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");

for (String lang : list) {
    System.out.println(lang);
}
```

---

## 🧠 When to Use What?

- **ArrayList** → Fast random access
- **LinkedList** → Frequent insertions/deletions
- **HashSet** → No duplicates, fast lookup
- **TreeSet** → Sorted data
- **HashMap** → Fast key-value access
- **TreeMap** → Sorted keys

---

## 🚀 Learning Goals

- Understand collection interfaces and classes
- Know differences between List, Set, Queue, and Map
- Choose the right collection for a given problem
- Practice common operations and iteration

---

## 📖 References

- Official Java Documentation
- Oracle Java Tutorials
- Java Programming Books & Online Resources

---

## ✨ Author

Created for learning and practice purposes.

Happy Coding! 💻🎉

