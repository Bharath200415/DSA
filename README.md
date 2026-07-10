# 🚀 DSA Java Practice Repository

Welcome to the **Data Structures and Algorithms (DSA)** practice repository! This repo is designed as a structured learning path for beginners and intermediate programmers looking to master core DSA concepts using Java.

Each topic contains well-documented source code files with optimized solutions, time/space complexities, and problem summaries.

---

## 📂 Repository Index & Roadmap

The topics are organized from fundamental math concepts to advanced search and bitwise operations. Use this guide to study the problems in a step-by-step manner, ordered from **Easy to Hard** within each section.

### 🧮 1. Basic Math

Mathematical foundations form the basis of many algorithm optimizations.

| # | Problem / Concept | File Link | Difficulty | Complexity | Description |
|---|---|---|---|---|---|
| 1 | **Prime Check** | [`Prime.java`](./Basic%20Math/Prime.java) | 🟢 Easy | Time: $O(\sqrt{n})$<br>Space: $O(1)$ | Checks if a number $n$ is prime by iterating up to $\sqrt{n}$ (since factors repeat beyond that point). |
| 2 | **Sieve of Eratosthenes** | [`Sieve.java`](./Basic%20Math/Sieve.java) | 🟡 Easy-Medium | Time: $O(n \log \log n)$<br>Space: $O(n)$ | Efficiently finds all prime numbers up to $n$ by iteratively marking the multiples of each prime as composite. |

---

### 🗃️ 2. Arrays & Searching/Sorting Algorithms

Arrays are the most fundamental data structure. This section covers searching, sorting, and bitwise manipulation.

#### 🔍 Linear Search
| # | Problem / Concept | File Link | Difficulty | Complexity | Description |
|---|---|---|---|---|---|
| 1 | **Linear Search** | [`LinearSearch.java`](./Arrays/LinearSearch/LinearSearch.java) | 🟢 Easy | Time: $O(n)$<br>Space: $O(1)$ | Scans the array sequentially from start to end to find the target element. |

#### 📈 Sorting Algorithms
| # | Problem / Concept | File Link | Difficulty | Complexity | Description |
|---|---|---|---|---|---|
| 1 | **Bubble Sort** | [`BubbleSort.java`](./Arrays/Sorting/BubbleSort.java) | 🟢 Easy | Time: $O(n^2)$ (Worst)<br>Space: $O(1)$ | Compares adjacent elements and swaps them. Optimized with a `swapped` flag to exit early if the array becomes sorted. |
| 2 | **Selection Sort** | [`SelectionSort.java`](./Arrays/Sorting/SelectionSort.java) | 🟢 Easy | Time: $O(n^2)$<br>Space: $O(1)$ | Repeatedly selects the minimum element from the unsorted portion and swaps it to its correct position. |
| 3 | **Cyclic Sort** | [`CyclicSort.java`](./Arrays/Sorting/CyclicSort.java) | 🟡 Easy-Medium | Time: $O(n)$<br>Space: $O(1)$ | An $O(n)$ sorting pattern used specifically when elements are in the range $[1, N]$. Places each element at its correct index in-place. |

#### 🎯 Binary Search
Binary Search is a highly efficient search method used on sorted arrays.

| # | Problem / Concept | File Link | Difficulty | Complexity | Description |
|---|---|---|---|---|---|
| 1 | **Standard Binary Search** | [`BinarySearch.java`](./Arrays/BinarySearch/BinarySearch.java) | 🟢 Easy | Time: $O(\log n)$<br>Space: $O(1)$ | Classic divide-and-conquer search on a sorted 1D array. |
| 2 | **Order-Agnostic BS** | [`OrderAgnostic.java`](./Arrays/BinarySearch/OrderAgnostic.java) | 🟢 Easy | Time: $O(\log n)$<br>Space: $O(1)$ | A binary search implementation adapted to handle arrays sorted in descending order. |
| 3 | **Ceiling of a Number** | [`CeilingNumber.java`](./Arrays/BinarySearch/CeilingNumber.java) | 🟢 Easy | Time: $O(\log n)$<br>Space: $O(1)$ | Finds the smallest element in the array that is $\ge$ target. |
| 4 | **Floor of a Number** | [`FloorNumber.java`](./Arrays/BinarySearch/FloorNumber.java) | 🟢 Easy | Time: $O(\log n)$<br>Space: $O(1)$ | Finds the largest element in the array that is $\le$ target. |
| 5 | **Infinite Array Search** | [`InfiniteBS.java`](./Arrays/BinarySearch/InfiniteBS.java) | 🟡 Medium | Time: $O(\log p)$<br>Space: $O(1)$ | Searches in a sorted array of unknown/infinite size. Doubles the search window size exponentially to find bounds first. |
| 6 | **Staircase Search (2D)** | [`TwoDArraySearch.java`](./Arrays/BinarySearch/TwoDArraySearch.java) | 🟡 Medium | Time: $O(R + C)$<br>Space: $O(1)$ | Searches in a 2D matrix where rows and columns are sorted. Starts from the top-right corner to prune search space. |
| 7 | **Fully Sorted 2D Matrix** | [`Sorted2D.java`](./Arrays/BinarySearch/Sorted2D.java) | 🔴 Medium-Hard | Time: $O(\log R + \log C)$<br>Space: $O(1)$ | Binary search on a fully sorted 2D array (treated as one contiguous sorted list) by reducing rows first. |

#### 🎛️ Bit Manipulation
Manipulating bits directly allows you to perform lightning-fast arithmetic and logical checks.

| # | Problem / Concept | File Link | Difficulty | Complexity | Description |
|---|---|---|---|---|---|
| 1 | **Rightmost Set Bit** | [`RightsetBit.java`](./Arrays/BitManipulation/RightsetBit.java) | 🟢 Easy | Time: $O(1)$<br>Space: $O(1)$ | Extracts the value of the rightmost set bit using the formula `n & (-n)`. |
| 2 | **Count Set Bits** | [`CountSetBits.java`](./Arrays/BitManipulation/CountSetBits.java) | 🟡 Easy-Medium | Time: $O(\text{set bits})$<br>Space: $O(1)$ | Counts the number of active bits (1s) in a binary number by repeatedly clearing the lowest set bit. |
| 3 | **Fast Exponentiation** | [`Powerofnumber.java`](./Arrays/BitManipulation/Powerofnumber.java) | 🟡 Easy-Medium | Time: $O(\log p)$<br>Space: $O(1)$ | Computes $base^{power}$ using binary exponentiation by shifting powers bitwise. |
| 4 | **Range XOR Sum** | [`XORaTob.java`](./Arrays/BitManipulation/XORaTob.java) | 🟡 Medium | Time: $O(1)$<br>Space: $O(1)$ | Finds the XOR sum from $a$ to $b$ in constant time by exploiting the 4-step cyclic pattern of XOR prefix sums. |

---

## 🛠️ Compilation and Execution

To compile and run any Java file in this repository:

1. Open your terminal in the repository root directory.
2. Compile the desired `.java` file:
   ```bash
   javac "path/to/File.java"
   ```
3. Run the compiled `.class` file:
   ```bash
   java "path/to/File"
   ```

*Example for Binary Search:*
```bash
javac "Arrays/BinarySearch/BinarySearch.java"
java Arrays.BinarySearch.BinarySearch
```

---

## 🌟 Tips for Beginners
1. **Understand Complexities**: Pay attention to the Big-O time and space notations listed for each algorithm.
2. **Trace by Hand**: Before running the code, trace the binary search steps and array modifications on paper to build intuition.
3. **Start Small**: Master basic math checks and search strategies before tackling 2D array searches or bitwise hacks.
