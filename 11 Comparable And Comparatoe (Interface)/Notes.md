# 📘 Comparable & Comparator in Java

---

## 🔹 Comparable Interface

- ✅ **Comparable** is an interface present in the `java.lang` package 📦
- It contains **only one method**:

```java
public int compareTo(Object obj)
```

- Usage:

```java
obj1.compareTo(obj2);
```

- Return values meaning:
  - ➕ **Positive value** → `obj1` is greater than `obj2`
  - ➖ **Negative value** → `obj2` is greater than `obj1`
  - 🟰 **Zero** → `obj1` is equal to `obj2`

- 📌 `String` and all **wrapper classes** (`Integer`, `Long`, `Float`, etc.) implement the `Comparable` interface

---

### ❌ Problems with Comparable Interface

1. 🔧 By implementing `Comparable`, the **original class code must be modified**
2. 🎯 We can sort objects based on **only one entity at a time**  
   - Example: A `Student` object can be sorted **either by name or by roll number**, not both

👉 To overcome these problems, Java provides another interface called **Comparator** 🚀

---

## 🔹 Comparator Interface

- ✅ **Comparator** is an interface present in the `java.util` package 📦
- It contains **two methods**:

```java
public int compare(Object obj1, Object obj2)
public boolean equals(Object obj)
```

- 🧠 Used when we want **custom sorting logic** without modifying the original class

---

## 🔥 Difference Between Comparable & Comparator

| 🧩 Feature | Comparable | Comparator |
|---------|------------|------------|
| 📌 Method | `compareTo()` | `compare()` |
| 📦 Package | `java.lang` | `java.util` |
| 🛠️ Original class modification | Required | Not required |
| 🎯 Sorting entities | Only one | Multiple |
| ⚙️ Sorting type | Implicit sorting | Explicit sorting |

---

## ✨ Summary

- 🟢 Use **Comparable** when there is a **single natural sorting order**
- 🔵 Use **Comparator** when you need **multiple sorting strategies**
- 💡 Prefer `Comparator` for **flexibility and clean design**

###  🎯 TASK : WAP to compare and add different elements according to length and alphabetical order

> For example : A, B, AA, BB, AAA, BBB, AAAA

Happy Coding! 😄☕