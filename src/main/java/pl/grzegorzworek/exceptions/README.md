# Exceptions
<a href="https://github.com/grzesiek-worek/Java-Basics">Go back Main Page Repository</a>

## Task 1

In the `Task01.java` file:

1. there is a method that returns the factorial of the natural number passed in the parameter.
2. modify the code so that the method returns an `IllegalArgumentException` exception when the `number` passed in the parameter is less than zero,
3. test the operation of the program by calling the `factorial` method with the correct and incorrect parameter,
4. when calling the `factorial` method, add the `IllegalArgumentException` exception handler,
5. test the program again.

## Task 2

In the `Task02.java` file:

1. divide the numbers by zero
2. handle division by zero - `ArithmeticException` exception

## Task 3
In the file `Task03.java` file:

1. put the method `public static int indexOf(int[] elements, int value)`.
2. complete the method body so that it returns the index of the `value` element contained in the `elements` array,
3. if the array does not have the given element, return the exception `NoSuchElementException`,
4. test the operation of the program by calling the `indexOf` method with an element that is present in the array and with one that does not appear in it,
5. when calling the `indexOf` method, add the `NoSuchElementException` exception handler.

## Task 4
In the file `Task04.java` file:

1. put the method `public static int toInt(String str)`.
2. complete the method body so that it returns the string `str` converted to the `int` type,
3. handle possible exceptions.