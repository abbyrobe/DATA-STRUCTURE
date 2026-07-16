Question 1: Constant Time Algorithm
Explanation

The program stores a constant value and prints it. Regardless of the input size, the program performs the same number of operations. Therefore, the running time never changes.

Expected Output
The constant value is: 10
Conclusion

The execution time remains constant because only one value is printed.

Question 2: Linear Time Algorithm

Explanation

The program loops from 1 to n and adds each number to a variable called sum. The number of operations increases directly with the value of n.

Expected Output
The sum of first 10 natural numbers is: 55
Conclusion

If n doubles, the number of operations also doubles, making it a linear algorithm.

Question 3: Quadratic Time Algorithm
Explanation

The program contains two nested loops. For every value of i, the inner loop runs through all values of j. Therefore, every pair of elements is processed.

Expected Output
The sum of products is: 225
Conclusion

The number of operations grows much faster than a linear algorithm because each loop repeats n times.

Question 4: Recursive Fibonacci Algorithm
Explanation

The recursive function repeatedly calls itself twice for most values of n. As n increases, the number of function calls grows exponentially.

Expected Output
The 5th Fibonacci number is: 5
Conclusion

Recursive Fibonacci is inefficient because it repeatedly calculates the same values, resulting in exponential growth in execution time.

Question 5: Time Complexity Graph
Graph Includes
O(1) – Constant Time
O(n) – Linear Time
O(n²) – Quadratic Time

(The recursive Fibonacci algorithm has exponential complexity O(2ⁿ). Since exponential growth increases very rapidly, it may not fit well on the current graph scale. It can be added using a different scale if required.)

Expected Output

A window opens displaying a graph with:

X-axis labelled Input Size (n)
Y-axis labelled Time Complexity
A red horizontal line representing O(1)
A blue diagonal line representing O(n)
A green curved line representing O(n²)
Summary of Time Complexities
Question	Algorithm	Asymptotic Notation	Growth Rate
1	Constant Value	O(1)	Constant
2	Loop Through n Elements	O(n)	Linear
3	Nested Loops	O(n²)	Quadratic
4	Recursive Fibonacci	O(2ⁿ)	Exponential

AUTHOR: Abigael Robe--225847
      :Babra Dorol--225522
      :Yasmin Daud--225187
      :Jane Onyango--225257

UNIT: 1301 Data Structure and Algorithms
