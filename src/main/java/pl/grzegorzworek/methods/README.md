# Methods
<a href="https://github.com/grzesiek-worek/Java-Basics">Go back Main Page Repository</a>

## Task 1

In the `Task01.java` file, write a method with the signature:

`public static int multiply(int multipler, int index)`,

which will return the value of the variable `multipler` multiplied by the value of the argument `index`.

## Task 2

In the `Task02.java` file, write a method with the signature:

`public static int square(int num)`,

which will return `num` squared.

## Task 3

In the file `Task03.java`, write a public method `convertToEuro`, which takes the parameter `pln`, i.e. the amount in PLN.
The method is supposed to return the given amount in Euro.

Use 4.25 PLN = 1 EUR as a conversion factor.

## Task 4

In the `Task04.java` file, write a public `createName` method that takes the following parameters:

* `name`: name,
* `surname`: surname,
* `nickname`: nickname.

The method is to return a text string with combined parameters, in the form: "first name nickname last name".

## Task 5

In the file `Task05.java` write a public method `checkMaturity` which:

* will accept the numerical parameter `age` meaning the user's age,
* check if the user is an adult,
* will return `true` &ndash; if he is an adult,
* will return `false` &ndash; if it isn't.

## Task 6

In the file `Task06.java` write a public method `calculateNet` that will accept arguments:

* `gross`: the gross amount of the purchase price,
* `tax`: value of TAX. You can assume TAX to be a floating point number in the range 0 &ndash; 1.

The method is supposed to return the net value of the price. Write in the comment what calculations you need to do.

## Task 7

In the `Task07.java` file, write a public `maxOfThree` method that takes three numeric parameters. The method is supposed to return the largest number.

## Task 8

In the file `Task08.java` write a public method `factorial`,
which will take a natural number `n` as a parameter.

The method is to return the value `n!`, which is the result of multiplying all natural numbers in the range `1...n`.

## Task 9

In the `Task09.java` file, write a public `checkEvenOdd` method that:

* will accept the numeric parameter `number`,
* will return a value of type `String`,
* will return "even" if the number is even,
* will return "odd" if the number is odd.

## Task 10

In the `Task10.java` file

1. put a method `public static double dogAge(double dogAge)` which will calculate the dog's age in dog years.
* the function should take the dog's age as a parameter,
* for the first two years, each dog year is equal to 10.5 human years,
* over two years old, each year of a dog's life is 4 human years,
* the function should return the dog's age.

Example:
```
dogAge(1.5) # expected result: 1.5 * 10.5 = 15.75

dogAge(5) # expected result: 2 * 10.5 + 3 * 4 = 33
```