# **Java Practice Problems: Comparators, Comparables, and Sorting**

### **Problem Sheet Overview**  
This problem sheet contains exercises designed to help you practice implementing custom sorting mechanisms in Java using the `Comparable` and `Comparator` interfaces. You'll also work on implementing a `MergeSort` utility and building a CLI tool for sorting CSV datasets dynamically.

---

## **1. Sorting Employees by Various Attributes**

### **Objective:**  
Create a class `Employee` with the following attributes:  
- `int id`  
- `String name`  
- `double salary`  
- `int age`

### **Tasks:**  
1. Implement the `Comparable` interface to sort `Employee` objects by `id`.  
2. Write custom `Comparator` classes to sort employees by:  
   - `name` (alphabetical order)  
   - `salary` (descending order)  
   - `age` (ascending order)  
3. Print the list of employees sorted by each criterion.  

### **Example Input:**  
```java
List<Employee> employees = Arrays.asList(
    new Employee(1, "Alice", 60000, 28),
    new Employee(2, "Bob", 75000, 35),
    new Employee(3, "Charlie", 50000, 22)
);
```

**Expected Output:**
```
Sorted by id:
[Employee{id=1, name='Alice', salary=60000, age=28}, ...]

Sorted by name:
[Employee{id=1, name='Alice', salary=60000, age=28}, ...]
```

---

## **2. Sorting a Nested Data Structure**

### **Objective:**
Create a Course class with the following structure:
```java
class Course {
    String courseName;
    List<Student> students;
}
class Student {
    String name;
    int grade;
}
```

### **Tasks:**
1. Sort the courses by:
   - Average grade of enrolled students (descending)
   - If averages are tied, sort by courseName alphabetically

2. Within each course, sort students by grade (descending)

### **Example Input:**
```java
Course course1 = new Course("Math", Arrays.asList(new Student("Alice", 85), new Student("Bob", 90)));
Course course2 = new Course("History", Arrays.asList(new Student("Charlie", 80), new Student("Dave", 75)));
List<Course> courses = Arrays.asList(course1, course2);
```

**Expected Output:**
```
Sorted courses:
Math (average grade: 87.5)
History (average grade: 77.5)
```

---

## **3. Multi-Level Sorting of Books**

### **Objective:**
Create a Book class with the following structure:
```java
class Book {
    String title;
    String author;
    int publicationYear;
}
```

### **Tasks:**
1. Sort books by:
   - Author (alphabetically)
   - If authors are the same, by publicationYear (oldest first)
   - If still tied, by title (alphabetically)

2. Print the sorted list of books

### **Example Input:**
```java
List<Book> books = Arrays.asList(
    new Book("The Hobbit", "J.R.R. Tolkien", 1937),
    new Book("1984", "George Orwell", 1949),
    new Book("Animal Farm", "George Orwell", 1945)
);
```

**Expected Output:**
```
Sorted books:
1. "Animal Farm" by George Orwell (1945)
2. "1984" by George Orwell (1949)
3. "The Hobbit" by J.R.R. Tolkien (1937)
```

---

## **4. Create a CLI for Sorting a CSV Dataset**

### **Objective:**
Write a command-line interface (CLI) that allows dynamic sorting of a CSV dataset.

### **Tasks:**
1. The CLI should accept:
   - A CSV file path as input
   - Column names for sorting
   - Sort directions (e.g., asc or desc) for each column

2. The program should load the dataset, sort it based on the provided criteria, and display the top 10 entries

### **Implementation Details:**
- Use Java's Comparator for dynamic multi-column sorting
- Use a library like OpenCSV or Java's Scanner for parsing the CSV file

### **Example CLI Command:**
```
java CSVSorter data.csv name asc salary desc age asc
```

**Expected Output:**
Top 10 sorted entries in the specified order.

---

## **5. Implement a Generic MergeSort Utility**

### **Objective:**
Design a class MergeSort that can sort any Collection object in Java. The utility should support sorting using both the natural ordering (Comparable) and custom ordering (Comparator).

### **Tasks:**
1. Implement a MergeSort class with the following methods:

   ```java
   List<T> sort(Collection<T> collection):
   // Accepts a Collection of elements that implement Comparable
   // Returns a sorted List in natural order

   List<T> sort(Collection<T> collection, Comparator<T> comparator):
   // Accepts a Collection of elements and a Comparator
   // Returns a sorted List based on the Comparator
   ```

2. Implement the Merge Sort algorithm for sorting

### **Example Usage:**

**Input 1 (Natural Ordering):**
A collection of integers: [5, 2, 8, 1, 3]
**Output:** [1, 2, 3, 5, 8]

**Input 2 (Custom Comparator):**
A collection of strings: ["apple", "banana", "pear", "kiwi"] sorted by length
**Output:** ["pear", "kiwi", "apple", "banana"]

---

## **Evaluation Criteria:**

- **Correctness:** Solutions must produce the correct output for various inputs
- **Efficiency:** Sorting implementations should adhere to O(n log n) complexity where applicable
- **Code Quality:** Code should be clean, well-documented, and easy to follow
- **Edge Case Handling:** Solutions should handle empty collections, null values, and invalid inputs gracefully

Good luck, and happy coding!