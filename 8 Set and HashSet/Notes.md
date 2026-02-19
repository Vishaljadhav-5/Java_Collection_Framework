# 📘 Set & HashSet in Java ☕

---

## 🔹 Set Interface

- 📦 **Package**: `java.util`
- 🧬 **Type**: Interface
- 👪 **Parent Interface**: `Collection`
- 🕒 **Introduced In**: JDK 1.2

```java
public interface Set<E> extends Collection<E> { }
```

---

## 🏗️ Hierarchy of Set Interface

```
Collection
   |
   └── Set
        ├── HashSet
        ├── LinkedHashSet
        └── SortedSet
              └── NavigableSet
                    └── TreeSet
```

![alt text](Hierarchy.png)

---

## ✨ Properties of Set Interface

1️⃣ Not index-based (stores elements using **hashcode**) 🔑  
2️⃣ ❌ Does not follow insertion order (✔️ except `LinkedHashSet`)  
3️⃣ ❌ Does not follow sorting order (✔️ except `SortedSet`, `NavigableSet`, `TreeSet`)  
4️⃣ Supports heterogeneous elements 🌈 (❌ except sorted sets)  
5️⃣ ❌ Duplicate elements not allowed  
6️⃣ Allows **only one null value** ⚠️

---

## 🛠️ Methods of Set Interface

- Almost same as `Collection` interface methods
- Examples: `add()`, `remove()`, `contains()`, `size()`, `iterator()`

---

## 🔄 Difference Between List & Set

| Feature | List 📋 | Set 🧺 |
|------|------|------|
| Data Storage | Index based | Hashcode based |
| Duplicates | Allowed ✅ | Not allowed ❌ |
| Null Values | Multiple allowed | Only one allowed |
| Insertion Order | Maintained | Not maintained |
| Cursors | Iterator, ListIterator | Iterator only |
| Usage | Retrieval operations | Avoid duplicacy |

---

---

## 🔹 HashSet Class

- 📦 **Package**: `java.util`
- 🧱 **Implements**: `Set`
- 🕒 **Introduced In**: JDK 1.2

```java
public class HashSet<E>
  extends AbstractSet<E>
  implements Set<E>, Cloneable, Serializable { }
```

---

## ⚙️ Internal Working of HashSet

- 🔁 Backed by a **HashMap**
- 🗝️ Elements stored as **keys**
- 📌 Value stored is a constant object named `PRESENT`
- 🧮 Initial Capacity: **16**
- 📊 Load Factor: **0.75 (75%)**
- 🔄 Capacity doubles after threshold


![alt text](Internal_Working.png)

---

## ✨ Properties of HashSet

1️⃣ Not index-based 🔢❌  
2️⃣ Allows heterogeneous elements 🌈  
3️⃣ No duplicate elements ❌  
4️⃣ Only one null value allowed ⚠️  
5️⃣ No insertion order ❌  
6️⃣ No sorting order ❌  
7️⃣ Non-synchronized 🔓  
8️⃣ Allows multiple threads 🧵  
9️⃣ Supports parallel execution ⚡  
🔟 Faster execution of Application 🚀  
1️⃣1️⃣ Not thread-safe ❗  
1️⃣2️⃣ No data consistency guarantee ⚠️

---

## 🧱 Constructors of HashSet

```java
HashSet()
HashSet(Collection<? extends E> c)
HashSet(int initialCapacity)
HashSet(int initialCapacity, float loadFactor)
```

---

## 🛠️ Methods of HashSet

- Same as `Set` / `Collection`
- Examples: `add()`, `remove()`, `contains()`, `clear()`, `iterator()`

---

## ✅ When to Use HashSet?

✔️ When **duplicates are not allowed**  
✔️ When **fast searching / retrieval** is needed 🔍  
✔️ When **order does not matter**

---

✨ *Happy Learning Java Collections!* ✨

