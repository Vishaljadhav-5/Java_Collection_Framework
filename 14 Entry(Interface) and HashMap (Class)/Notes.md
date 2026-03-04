# 📘 Entry Interface & HashMap Class in Java ☕

---

## 🔹 Entry Interface

### 👉 What is Entry?
- **Entry** represents **one key–value pair** in a `Map`.
- Without Entry, a `Map` is always empty ❌.
- `Entry` is a **sub-interface of the Map interface**.

### 🧩 Hierarchy
```java
interface Map {
    // methods
    interface Entry {
        Object getKey();
        Object getValue();
        Object setValue(Object obj);
    }
}
```

### 📝 Important Points
- Every key–value pair in a Map is treated as one **Entry** 🔑➡️📦
- Used internally by Map implementations like `HashMap`, `LinkedHashMap`, etc.

---

## 🔹 HashMap

### 👉 What is HashMap?
- `HashMap` is a **direct implementation** of the `Map` interface.
- Present in **`java.util` package** 📦
- Introduced in **JDK 1.2** 🕒

### 🧩 Class Declaration
```java
public class HashMap<K,V> extends AbstractMap<K,V>
        implements Map<K,V>, Cloneable, Serializable {
}
```

### ⚙️ Underlying Data Structure
- **Hashtable** (internally uses hashing technique) 🧮

---

## ✨ Properties of HashMap

1. Stores data in **key–value pairs**, called **Entry** 🧩
2. **Keys must be unique**, values can be duplicate 🔐
3. Allows **heterogeneous elements** 🎭
4. Allows **one null key** and **multiple null values** 🚫🔑 / ✔️📦
5. Does **not maintain insertion order** ❌📋
6. Does **not follow sorting order** ❌📊
7. **Non-synchronized** Map 🚫🔒
8. Allows **multiple threads** at the same time 🧵🧵
9. Supports **parallel execution** ⚡
10. Faster performance due to no synchronization 🚀
11. **Not thread-safe** ❌🛡️
12. Does **not guarantee data consistency** ⚠️

---

## 🔄 Working of HashMap

1. Initial capacity = **16** 🪣
2. Default load factor = **0.75 (75%)** 📈

---

## 🏗️ Constructors of HashMap

```java
1. HashMap()
2. HashMap(int capacity)
3. HashMap(int capacity, float loadFactor)
4. HashMap(Map m)
```

---

## 🛠️ Methods of HashMap

- HashMap uses **all methods of Map interface**, such as:
  - `put()`
  - `get()`
  - `remove()`
  - `containsKey()`
  - `containsValue()`
  - `entrySet()`

---

## 🎯 When to Use HashMap?

- Best choice for **searching** 🔍 and **retrieval operations** 📤
- Use when **thread safety is not required**

---

## 🔐 How to Get Synchronized HashMap?

By default, `HashMap` is non-synchronized. To make it synchronized, use:

```java
Map map = Collections.synchronizedMap(new HashMap());
```

🧠 This returns a **thread-safe synchronized Map**.

---

✨ **Tip:** For thread-safe and high-performance maps, consider `ConcurrentHashMap` 🚀

---

📌 *End of Notes*

