# 📌 Cursors in Java

## 🔍 What are Cursors?

➡️ In Java, whenever we print an object reference, internally the JVM calls the `toString()` method of the `Object` class.

- For **simple objects** 👉 output looks like: `ClassName@referenceValue`
- For **Collection objects** 👉 it prints all elements present in the collection

⚠️ But printing a collection retrieves **all elements at once**.

👉 If we want to retrieve elements **one by one**, we use **Cursors**.

---

![alt text](Cursor_Diagram.png)


## 🧭 Types of Cursors

1️⃣ Enumeration

2️⃣ Iterator

3️⃣ ListIterator

---

## 🟢 Enumeration

➡️ Enumeration is a cursor used to retrieve elements **one by one** from a collection object.

### 📅 Introduction
- Introduced in **JDK 1.0**
- Used only for **legacy classes**

### 🧪 Legacy Classes
- `Vector`
- `Stack`

### ⚙️ How to Use Enumeration

#### 1️⃣ Create Enumeration Cursor Object
```java
public Enumeration elements();
```
*(Available in Vector & Stack)*

#### 2️⃣ Read Elements One by One
```java
public boolean hasMoreElements();
public Object nextElement();
```
*(Methods from Enumeration interface)*

### ❌ Limitations of Enumeration

🚫 Works only with legacy classes (not universal).

📖 Read-only (no update or remove).

➡️ Forward direction only.

![alt text](EnumerationDiag1.png)

![alt text](EnumerationDiag2.png)

![alt text](EnumerationDiag3.png)

![alt text](EnumerationDiag4.png)

---

## 🔵 Iterator

➡️ Iterator is a **universal cursor** used to retrieve elements one by one from any collection.

### 📅 Introduction
- Introduced in **JDK 1.2**

### ✅ Features
- Works with **all collection objects**
- Supports **read & remove** operations

### ⚙️ How to Use Iterator

#### 1️⃣ Create Iterator Cursor Object
```java
public Iterator iterator();
```
*(Available for every collection)*

#### 2️⃣ Read Elements One by One
```java
public boolean hasNext();
public Object next();
public void remove();
```
*(Methods from Iterator interface)*

### ❌ Limitations of Iterator

🚫 Cannot add or replace elements.

➡️ Forward direction only.

---

## 🟣 ListIterator

➡️ ListIterator is a **bi-directional cursor** used with List implementations.

### 📅 Introduction
- Introduced in **JDK 1.2**

### ✅ Features

🔄 Traverse in **forward & backward** directions.

✏️ Supports **read, remove, add, and replace** operations.

### ⚙️ How to Use ListIterator

#### 1️⃣ Create ListIterator Cursor Object

```java
public ListIterator listIterator();
```
*(Available only for List implementations)*

#### 2️⃣ Forward Traversal Methods

```java
public boolean hasNext();
public Object next();
public int nextIndex();
```

#### 3️⃣ Backward Traversal Methods

```java
public boolean hasPrevious();
public Object previous();
public int previousIndex();
```

#### 4️⃣ Modification Methods

```java
public void remove();
public void add(Object obj);
public void set(Object obj);
```

### ❌ Limitations of ListIterator

🚫 Works only with List implemented classes.

❌ Not a universal cursor.

---

## 📝 Quick Comparison Table

| Cursor        | Direction        | Operations Supported              | Universal |
|---------------|------------------|-----------------------------------|-----------|
| Enumeration   | ➡️ Forward only  | Read only                         | ❌ No     |
| Iterator      | ➡️ Forward only  | Read, Remove                     | ✅ Yes    |
| ListIterator  | 🔄 Both ways     | Read, Remove, Add, Replace       | ❌ No     |

---

✨ **Tip:**
- Use **Iterator** for general-purpose traversal
- Use **ListIterator** when you need bi-directional traversal or modification
- Avoid **Enumeration** in modern Java (legacy only)

📚 Happy Learning Java! ☕🚀

