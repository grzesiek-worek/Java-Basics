# Arrays
<a href="https://github.com/grzesiek-worek/Java-Basics">Go back Main Page Repository</a>

## Task 1

In the `Task01.java` file:

1. create a 50-element array called `mainTab` with consecutive integers from 0 to 49,
2. print the elements of this array on the console one by one, ten in each line,
3. for one-digit numbers, complete with an additional zero at the beginning (e.g. 03).

```
00, 01, 02, 03, 04, 05, 06, 07, 08, 09,
10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
```

## Task 2

In the `Task02.java` file:

1. using the `for` loop, create an array called `randNumbers`, containing 20 random numbers from the `0-100` range (use the method described in the snippets to get a random value),
2. print the minimum value from the table in the console.

## Task 3

In the `Task03.java` file:

1. create a 10 element array filled with a single value "5". The table should look like this:
     ````
     [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
     ````
Do task **without using the `for` loop**.

## Task 4

In the `Task04.java` file:

1. create an array called `numbers` containing 10 arbitrary numbers,
2. create an array variable `reverse` and put the elements of the `numbers` array in it in reverse order,
3. print the elements from the `reverse` array to the console.

For an array with elements:
```
13, 25, 71, 24, 11
```
we will get the result:
```
11, 24, 71, 25, 13
```

## Task 5

In the `Task05.java` file:

1. create an array called `numbers` containing 10 arbitrary numbers,
2. sort the array in ascending order using the methods of the `Arrays` class,
3. display the sorted array in the console - also using the method from the `Arrays` class.

## Task 6

In the `Task06.java` file:

1. create an array called `numbers` containing 10 arbitrary numbers,
2. create a second array, name it `secondNumbers`, fill it with any 10 numbers,
3. create a third array containing the sums of the elements that have the same index position in the arrays.

For sample arrays:
```java
int[] numbers = {12, 31};
int[] secondNumbers = {13, 14};
```
the result will be an array with elements `25 and 45`.

## Task 7

In the `Task07.java` file

1. put the method `public static boolean contains(int[] arr, int element)`.
2. complete the method body so that it checks whether there is an `element` in the `arr` array,
3. if yes, return `true`,
4. if it is not supposed to return `false`.

## Task 8

In the `Task08.java` file

1. put the method `public static int[] append(int[] arr)`.
2. complete the method body so that the content of the received array is copied to a temporary array, the size of which is to be twice as large as the given array.
3. complete the missing elements of the temporary array with the elements of the original array in reverse order.
4. method is to return the copied and completed array. 

Example: for an array int arr[] = {1,2,3}; an array is to be returned int arrTmp[] = {1,2,3,3,2,1};

## Task 9

In the `Task09.java` file

1. put the method `public static int[] returnUnique(int[] arr)`.
2. complete the method body in such a way that it selects only unique values from the `arr` array, which are then to be returned from the method. 

Example: for array [1,1,2,3,3,4], we should get array [1,2,3,4].