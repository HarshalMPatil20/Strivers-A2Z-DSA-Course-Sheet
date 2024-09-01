# __Step 1__ : Learn the Basics. `31`

## Lec 1 : Things to Know in C++/Java/Python or any language

### Step 1.1 : Variables and Data Types

- Variables are used to store data.
- Data types are used to specify the type of data a variable can hold.
- Common data types include integers, floats, strings, booleans, and lists.

### Step 1.2 : Operators

- Arithmetic operators: +, -, \*, /, %
- Comparison operators: ==, !=, <, >, <=, >=
- Logical operators: &&, ||, !

### Step 1.3 : Control Structures

- Conditional statements: if, else, switch
- Loops: for, while, do-while

### Step 1.4 : Functions

- Functions are reusable blocks of code that take arguments and reurn values.

### Step 1.5 : Arrays and Lists

- Arrays are collections of values of the same data type stored in contiguous memory locations.
- Lists are dynamic collections of values that can be of any data type.

&nbsp;

## Lec 2: Build-up Logical Thinking : `Patterns`

## 4 Rules for solving Patterns

### Patterns → `Nested Loops`

1. For __`Outer Loop`__ → Count the `Number of Rows`
2. For __`Inner Loop`__ → Count the `Number of Columns` & Somehow connect them to rows.
3. Print them inside __Inner Loop__
4. Observe Symmetry (_optional_)

&nbsp;

### Examples

## 1. Rectangular Pattern

```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

Approach :

1. Outer Loop : `5` Rows
2. Inner Loop : `5` Columns

| Row Number | Column count |
| ---------- | ------------ |
| 0 th       | 5            |
| 1 st       | 5            |
| 2 nd       | 5            |
| 3 rd       | 5            |
| 4 th       | 5            |

#### Relation : Columns are `Independent`

3. Print `*` inside Inner Loop.

```java
// This is the outer loop which will loop for the rows.
    for (int i = 0; i < 5; i++)
    {
        // This is the inner loop which here, loops for the columns
        // as we have to print a rectangular pattern.
        for (int j = 0; j < 5; j++)
        {
            System.out.print("* ");
        }

         // As soon as 5 stars are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in single line.
        System.out.println();
    }

```

&nbsp;

## 2. Lower Triangular Pattern

```
*
* *
* * *
* * * *
* * * * *
```

Approach :

1. Outer Loop : `5` Rows
2. Inner Loop : `5` Columns

| Row Number | Column Numbers | Column count |
| ---------- | -------------- | ------------ |
| 0 th       | 0              | 1            |
| 1 st       | 0→1            | 2            |
| 2 nd       | 0→2            | 3            |
| 3 rd       | 0→3            | 4            |
| 4 th       | 0→4            | 5            |

#### Relation : at `i`th Row, Column Numbers`0 → i` with `i+1` columns

3. Print `*` inside Inner Loop.

```java
// This is the outer loop which will loop for the rows.
    for (int i = 0; i < 5; i++) {

        // This is the inner loop which here, loops for the columns
        for (int j = 0; j <= i; j++)
  // or for (int j=0; j < i+1; j++)
        {
            System.out.print("* ");
        }

        System.out.println();
    }

```

&nbsp;

## 3. Incremental Numbers Pattern

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

Approach:

1. Outer Loop : `5` Rows
2. Inner Loop : `i` Columns

| Row Number | Column Numbers | Column count |
| ---------- | -------------- | ------------ |
| 0 th       | 0              | 1            |
| 1 st       | 0→1            | 2            |
| 2 nd       | 0→2            | 3            |
| 3 rd       | 0→3            | 4            |
| 4 th       | 0→4            | 5            |

#### Relation : at `i`th Row, Numbers`1 → i+1` with `i+1` columns

3. Print `j` for `i+1` times inside Inner Loop.

```java
// This is the outer loop which will loop for the rows.
  for (int i = 0; i < 5; i++) {

    // This is the inner loop which here, loops for the columns
    for (int j = 1; j <= i+1; j++) {

      System.out.print(j + " ");
    }

    System.out.println();
  }
```

&nbsp;

## 4. Inverted Right Triangle Pattern

```
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

Approach:

1. Outer Loop : `5` Rows
2. Inner Loop : `i` Columns

| Row Number | Column Numbers | Column count |
| ---------- | -------------- | ------------ |
| 0 th       | 0              | 1            |
| 1 st       | 0→1            | 2            |
| 2 nd       | 0→2            | 3            |
| 3 rd       | 0→3            | 4            |
| 4 th       | 0→4            | 5            |

#### Relation : at `i`th Row, Number`i+1`, `i+1` times

3. Print `i+1` times `i+1` inside Inner Loop.

```java
// This is the outer loop which will loop for the rows.
  for (int i = 0; i < 5; i++) {

    // This is the inner loop which here, loops for the columns
    for (int j = 1; j <= i+1; j++) {

      System.out.print(i+1 + " ");
    }

    System.out.println();
  }
```

&nbsp;

## 5. Inverted Right Triangle Pattern with Asterisks

```
* * * * *
* * * *
* * *
* *
*
```

Approach:

1. Outer Loop : `5` Rows
2. Inner Loop : `5-i` Columns

| Row Number | Column Numbers | Column count |
| ---------- | -------------- | ------------ |
| 0 th       | 0→ 4           | 5            |
| 1 st       | 0→ 3           | 4            |
| 2 nd       | 0→ 2           | 3            |
| 3 rd       | 0→ 1           | 2            |
| 4 th       | 0              | 1            |

#### Relation : at `i`th Row, Column `0 → 5-i` with `5-i` columns

3. Print `i+1` Asterisks inside Inner Loop.

```java
// This is the outer loop which will loop for the rows.
  for (int i = 0; i < 5; i++) {

    // This is the inner loop which here, loops for the columns
    for (int j = 0; j < 5-i; j++) {

      System.out.print("* ");
    }

    System.out.println();
  }
```

&nbsp;

## 6. Inverted Right Triangle Pattern with Numbers

```
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

Approach:

1. Outer Loop : `5` Rows
2. Inner Loop : `5-i` Columns

| Row Number | Column Numbers | Column count |
| ---------- | -------------- | ------------ |
| 0 th       | 0→ 4           | 5            |
| 1 st       | 0→ 3           | 4            |
| 2 nd       | 0→ 2           | 3            |
| 3 rd       | 0→ 1           | 2            |
| 4 th       | 0              | 1            |

#### Relation : at `i`th Row, Column `0 → 5-i` with `N-i` columns

```java
// This is the outer loop which will loop for the rows.
  for (int i = 0; i < 5; i++) {

    // This is the inner loop which here, loops for the columns
    for (int j = 0; j < 5-i; j++) {
      System.out.print((j+1) + " ");
    }

    System.out.println();
  }
```

## &nbsp;

&nbsp;

## 7. Full Triangle with Asterisks

- In Patterns like these, `Space` is also important to iterate and print.
- Printing Approach should be :

  | Space | Asterisks | Space |
  | ----- | --------- | ----- |

```
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
```

Approach:

1. Outer Loop : `n` Rows

Here `n = 5`
| Row No.| Space | Asterisks | Space |
|--------|------- |-----------|-------- |
| 0 | 4 |1 |4 |
| 1 | 3 |3 |3 |
| 2 | 2 |5 |2 |
| 3 | 1 |7 |1 |
| 4 | 0 |9 |0 |
| `i` | `n - (i+1)` |`2i+1` |`n - (i+1)` |

2. Inner Loops :
   - First Inner Loop : `n-(i+1)` Spaces
   - Second Inner Loop : `2i+1` Asterisks
   - Third Inner Loop : `n-(i+1)` Spaces

```java
// Outer Loop
  for(i=0; i < n; i++){

    // First Inner Loop : n-(i+1) Spaces
    for(j=0; j < n - (i+1); j++){
      System.out.print("  ");
      }

    // Second Inner Loop : 2i+1 Asterisks
    for(k=0; k < 2*i+1; k++){
      System.out.print("* ");
      }

    // Third Inner Loop : n-(i+1) Spaces
    for(l=0; l < n - (i+1); l++){
      System.out.print("  ");
      }

    System.out.println();
  }
```

&nbsp;

## 8. Inverted Full Triangle with Asterisks

```
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
```

Approach:

1. Outer Loop : `n` Rows

Here `n = 5`
| Row No.| Space | Asterisks | Space |
|--------|------- |-----------|-------- |
| 0 | 0 |9 |0 |
| 1 | 1 |7 |1 |
| 2 | 2 |5 |2 |
| 3 | 3 |3 |3 |
| 4 | 4 |1 |4 |
| `i` | `i` |`2(n-(i+1)) + 1` |`i` |

2. Inner Loops :
   - First Inner Loop : `i` Spaces
   - Second Inner Loop : `2(n-(i+1)) + 1` Asterisks
   - Third Inner Loop : `i` Spaces

```java
// Outer Loop
  for(i=0; i < n; i++){

    // First Inner Loop : n-(i+1) Spaces
    for(j=0; j < i; j++){
      System.out.print("  ");
      }

    // Second Inner Loop : 2i+1 Asterisks
    for(k=0; k < 2(n-(i+1)) + 1; k++){
      System.out.print("* ");
      }

    // Third Inner Loop : n-(i+1) Spaces
    for(l=0; l < i; l++){
      System.out.print("  ");
      }

    System.out.println();
  }
```

&nbsp;

## 9. Diamond with Asterisks

```
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
```

#### Combine Two Patterns = Pattern 7 + Pattern 8

&nbsp;

## 10. Half Kite with Asterisks

```
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
```

Approach:

1. Outer Loop : `2n-1` Rows

Here `n = 5`
| Row No.| Asterisks |
|--------|-----------|
| 0 |1 |
| 1 |2 |
| 2 |3 |
| 3 |4 |
| 4 |5 |
| 5 |4 |
| 6 |3 |
| 7 |2 |
| 8 |1 |

2. Inner Loops :
   - if `i > n` : `stars = 2n - i`
     else : `stars = i`
   - Inner Loop : `stars` Asterisks

```java
// Outer Loop
  for (int i = 1; i <= 2 * n - 1; i++){

      // to Reverse the process after symmetry
      int stars = i;
      if (i > n) { stars = 2*n - i; }

      // Inner Loop2
      for (int j = 0; j < stars; j++) {
          System.out.print("* ");
        }

      System.out.println();
    }
```

## &nbsp;

&nbsp;

## 11. Alternate Binary Pattern

```
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

Approach :

1. Outer Loop : `n` Rows

   - Each row have alternate starting
   - Decides Starting element of each row.

     | Row No. | `Start` Number |
     | ------- | -------------- |
     | Even    | 1              |
     | Odd     | 0              |

2. Inner Loops :

   - Inner Loop is Printing in Alternate Pattern.
   - `Next Element = 1 - Previous element.`
   - Prints Alternate `0 1 0 1 0.....`

```java
  // Outer loop for the no. of rows
    for(int i = 0; i < n ; i++){

          int start;

          // if the row index is even then 1
          if( i % 2 ==0) start = 1;

          // if odd, then starting from 0
          else start = 0;

          // We alternatively print 1's and 0's in each row by using
          // the inner for loop.

          for(int j = 0; j <= i; j++){

              System.out.print(start);

              start = 1-start; // Alternate changer
          }

        System.out.println();
    }
```

## &nbsp;

&nbsp;

## 12. Mirror Image Triangle

```
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
```

Approach :

| Number | Space | Number (Mirror Sequence) |
| ------ | ----- | ------------------------ |

1. Outer Loop : `n` Rows

Here `n = 4`
| Row No.| Number | Space | Number (Mirror Sequence) |
|--------|------- |----------- |-------- |
| 0 | 1 | `2(n-1)` = 6 &nbsp; `-2` |1 |
| 1 | 1 2 | 4 &nbsp; `-2` |2 1 |
| 2 | 1 2 3 | 2 &nbsp; `-2` |3 2 1 |
| 3 | 1 2 3 4 | 0 &nbsp; |4 3 2 1 |

2. Inner Loops :
   - First Inner Loop : `1 → i+1` Numbers
   - Second Inner Loop : `2(n-1-i)` Spaces
   - Third Inner Loop : `i+1 → 1` Numbers

```java
    for(int i = 0; i < n ; i++){

          // First Inner Loop : `1 → i+1` Numbers
            for(int j = 0 ; j <= i ; j++){
                System.out.print(j+1 + " ");
            }

          // Second Inner Loop : `2(n-1-i)` Spaces
            for(int k = 0 ; k < 2*(n-1-i) ; k++){
                System.out.print("  ");
            }

          // Third Inner Loop : `i+1 → 1` Numbers
            for(int j = i ; j >= 0 ; j--){
                System.out.print(j+1 + " ");
            }

          System.out.println();
      }
```

## &nbsp;

&nbsp;

## 13. Preceding Triangular Sequence

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

Approach :

1. Outer Loop : `n` Rows
2. Inner Loops : `i + 1` times `number++`

```java
 // Global Variable independent of loop initialization
  int number = 1;

// Outer Loop : `n` Rows
  for(int i = 0; i < n ; i++){

// Inner Loops : `i + 1` times `number++`
// `number++` is a post Increment
// First Print then Increment

    for(int j = 0 ; j <= i ; j++){

      System.out.print( number++ + " ");
      }

    System.out.println();
  }
```

## &nbsp;

&nbsp;

## 14. Ascending number of Character Printing

```
A
A B
A B C
A B C D
A B C D E
```

Approach :

1. Outer Loop : `n` Rows
2. Inner Loop : `i+1` Columns
3. `char` Variable to store the character to be printed
4. `char` Variable is incremented by 1 in each iteration of the inner loop

```java
    for(int i=0;i<n;i++){

            // Inner loop will loop for i times and
            // print alphabets from A to A + i.
        for(char ch = 'A'; ch <='A'+ i; ch++){

                System.out.print(ch + " ");
            }

        System.out.println();
      }
```

## 15. Descending number of Character Printing

```
A B C D E
A B C D
A B C
A B
A
```

Approach :

1. Outer Loop : `n` Rows
2. Inner Loop : `n-i` Columns
3. `char` Variable to store the character to be printed
4. `char` Variable is incremented by 1 in each iteration of the inner loop

```java
    for(int i=1;i<=n;i++){

        for(char ch = 'A'; ch <='A'+ (n-i); ch++){

                System.out.print(ch + " ");
            }

        System.out.println();
      }
```

## 16.Row times Character Printing

```
A
B B
C C C
D D D D
E E E E E
```

Approach :

1. Outer Loop : `n` Rows
2. Inner Loop : `i` Columns

```java
  char ch = 'A';

    for(int i=1;i<=n;i++){

        for(int j=1; j <= i; j++){

                System.out.print(ch + " ");
            }

        ch++;
         System.out.println();
      }
```

## &nbsp;

&nbsp;

## 17. Character Printing with mirror sequence

| Space | Sequence characters | Reverse Sequence characters |
| ----- | ------------------- | --------------------------- |
| n-1   | A B C D             | C B A                       |

```
      A
    A B A
  A B C B A
A B C D C B A
```

Approach :

1. Outer Loop : `n` Rows
2. Inner Loop :
   - First Inner Loop : `n-1` Spaces
   - Second Inner Loop : `A → A+i` characters
   - Third Inner Loop : `A+i-1 → A` characters

```java
  char ch= 'A';
  int spaces = n-1;

      for(int i=0;i<n;i++){

          // First Inner Loop : `n-1` Spaces
            for(int j=0;j<spaces;j++){
                System.out.print("  ");
            }

          // Second Inner Loop : `A → A+i` characters
            for(ch = 'A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }

            // here ch is ch++ so to become ch-1 we minus -2 from ch.
            ch-=2;

            // Third Inner Loop : `A+i-1 → A` characters
            while(ch>='A'){
                System.out.print(ch+ " ");
                ch--;
            }

          spaces -=1;
          System.out.println();
      }
```

## 18. Ascending reverse ordering

```
E
D E
C D E
B C D E
A B C D E
```

Approach :

1. Outer Loop : `n` Rows
2. Inner Loop : `i` columns

```java
  char ch= 'A';

      for (int i=1;i<=n;i++){

          for (ch = (char) ('A'+ n-i); ch <'A'+ n; ch++){
                System.out.print(ch + " ");
            }

            System.out.println();
        }
```

## &nbsp;

&nbsp;

## 19. Hollow Diamond with Asterisks

| Asterisks | Space | Asterisks |
| --------- | ----- | --------- |
| `n-i`     | `2i`  | `n-i`     |

```
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
```

Approach :

1. Outer Loop : `2n` Rows
2. Inner Loop : `2n` Columns

```java

```

```
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
```

```
* * * *
*     *
*     *
* * * *
```

```
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
```

## &nbsp;

&nbsp;

## Lec 4: Know Basic Maths

### 1. Extracting Digits from Number

- Extraction happens from unit place.
- `% 10` = `Extracts digit of unit place`.
- `/ 10` = `Removes digit of unit place` and Brings digit next to it on units place to extract further.

#### Example

_Extracting All digits from `56789` number._

- 56789 `% 10` = `9` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Extracts digit of unit place)

  56789 `/ 10` = 5678 &nbsp;(Removes `9` digit of unit)

- 5678 `% 10` = `8` &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; (Extracts digit of unit place)

      5678 `/ 10` = 567 &nbsp;&nbsp;&nbsp;&nbsp; (Removes `8` digit of unit place)

- 567 `% 10` = `7` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Extracts digit of unit place)

      567 `/ 10` = 56 &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp; (Removes `7` digit of unit place)

- 56 `% 10` = `6` &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (Extracts digit of unit place)

      56 `/ 10` = 5 &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  (Removes `6` digit of unit place)

- 5 `% 10` = `5` &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (Extracts digit of unit place)

#### Code

```java
// Function to Extract digits
public static void extractDigits(int number) {

  // until Number becomes less than 1 and 'int' value become 0.
    while (number > 0) {

       // Extracts digit of unit place
        int digit = number % 10;

        System.out.println(digit);

        // Removes digit from unit place
        number /= 10;
    }
}

extractDigits(56789);
```

#### Output

```
9
8
7
6
5
```

---

&nbsp;

### 2. Count Digits

- Same As Extracting the digits but without storing just count the iterations.

#### Example

_Count All digits from `56789` number._

#### Code

```java
// Function to Extract digits
public static int CountDigits(int number) {

  int counter = 0;

  // until Number becomes less than 1 and 'int' value become 0.
    while (number > 0) {

       // Extracts digit of unit place
        int digit = number % 10;

      // count iterations
        counter++;

        // Removes digit from unit place
        number /= 10;
    }

    return counter;
}

System.out.println(CountDigits(56789));
```

#### Output

```
5
```

---

&nbsp;

### 3. Reverse Number

- Extract Digits
- Store in New Variable : `Number = Number*10 + Digit`
- Repeat until all digits are extracted.

> [!NOTE]  
> If a number has `trailing zeros`, then its reverse will `not include` them. \
> For e.g., reverse of `10400` will be `401` instead of 00401.

#### Code

```java
public static int ReverseNumber(int number) {

        // Variable to store reversed number
        int reversed = 0;

        while (number > 0) {

            // Extracts digit of unit place
            int digit = number % 10;

            reversed = reversed * 10 + digit;

            // Removes digit from unit place
            number /= 10;
        }

        return reversed;
    }

System.out.println(ReverseNumber(10400));
```

#### Output

```
401
```

---

&nbsp;

### 4. Check Palindrome Number

- A palindrome number is a number which remains the same when its digits are reversed.\
  For e.g., 121, 12321 are palindrome numbers.

- #### `Number = Reversed Number`

#### Code

```java
public static int ReverseNumber(int number) {
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

// Checking Palindrome Using Reversed Number
public static boolean Check_Palindrome(int number){

        // Storing Reversed of Number
        int reversed_number = ReverseNumber(number);

        // returning True or false
        return number == reversed_number;
    }

System.out.println(Check_Palindrome(56789));
System.out.println(Check_Palindrome(12321));
```

#### Output

```
False
True
```

---

&nbsp;

### 4. Check Armstrong Number

- #### What is `Armstrong Number` ?

  An Armstrong Number, also known as a `Narcissistic Number`,\
   is a number that is equal to `the sum of its own digits each raised to the power of the number of digits`.

- Example:

  - __153__ is an Armstrong Number :

    - The number of digits is `3`.
    - Calculation : 1<sup>`3`</sup> + 5<sup>`3`</sup> + 3<sup>`3`</sup> = 1 + 125 + 27 = `153`.
    - Therefore, 153 is Armstrong Number.

  - __1634__ is an Armstrong Number :
    - The number of digits is `4`.
    - Calculation : 1<sup>`4`</sup> + 6<sup>`4`</sup> + 3<sup>`4`</sup> + 4<sup>`4`</sup> = 1 + 1296 + 81 + 256 = `1634`
    - Therefore, 1634 is Armstrong Number.

- #### `Armstrong Number = the sum of its own digits each raised to the power of the number of digits`

- Examples of Armstrong Numbers

  - __3-digit Armstrong Number__ : 153, 370, 371, 407
  - __4-digit Armstrong Number__ : 1634, 8208, 9474
  - __5-digit Armstrong Number__ : 54748, 92727, 93084
  - __6-digit Armstrong Number__: 548834.

#### Code

```java
import java.lang.Math;

public static boolean Check_ArmStrong(int number){

        int actual = number;
        int expected = 0;

        // Calculate the number of digits in the given number
        int count = String.valueOf(number).length();

        while(number > 0){

            int digit = number %10;

            expected += Math.pow(digit, count);

            number /=10;
        }
        return expected == actual;
    }

System.out.println(Check_ArmStrong(56789));
System.out.println(Check_ArmStrong(371));
System.out.println(Check_ArmStrong(1634));
```

#### Output

```
false
true
true
```

---

&nbsp;

### 5. Print all divisors

- `Divisors = a number which divides another number with remainder 0`
  Example :\
   Divisors of `36` are 1, 2, 3, 4, 6, 9, 12, 18, 36.

  ### 5.1. Brute Force Approach

  - Check Every Number till the actual one.

  #### Code

  ```java
  public static void print_Divisors(int number) {

      for (int i = 1; i <= number; i++) {

          if (number % i == 0) {
            System.out.print(i + " ");
          }

      }
  }

  print_Divisors(36);
  ```

  #### Output

  ```
  1 2 3 4 6 9 12 18 36
  ```

  ### 5.2. Optimal Approach

  - Check Every Number from `1 to sqrt(Number)`.
  - If Number is divisible by i then print `i` and `number/i` both.
  - But if `i` is `sqrt(Number)` then print only one.

    Example :\
    Divisors of `36` are 1, 2, 3, 4, 6, 9, 12, 18, 36.
    | |36 | |
    |-------|------- |-------|
    |1 |&nbsp;_|36 |
    |2 |&nbsp;_ |18 |
    |3 |&nbsp;_|12 |
    |4 |&nbsp;_ |9 |
    |6 |&nbsp;_|6 |
    |9 |&nbsp;_ |4 |
    |12 |&nbsp;_| 3 |
    |18 |&nbsp;_ | 2 |
    |36 |&nbsp;\* | 1 |

  #### Code

  ```java
  public static void print_Divisors(int number) {

    // for (int i = 1; i <= Math.sqrt(number); i++)

    for (int i = 1; i*i <= number; i++) {

        if (number % i == 0) {

            System.out.print(i + " ");

            if (i != number / i) {
              System.out.print(number / i + " ");
            }
          }
      }
  }

  print_Divisors(36)
  ```

  #### Output

  ```
  1 36 2 18 3 12 4 9 6
  ```

> [!NOTE]  
> Calling `Math.sqrt()` also takes time so for further optimization.
>
> - Form : &nbsp;for ( int i = 1; `i <= Math.sqrt(number);` i++ )
> - To : &nbsp; &nbsp;&nbsp; for ( int i = 1; `i*i <= number;` i++ )

  ---

  &nbsp;

### 6. Check for Prime

- A prime number have `exactly 2 factors, 1 & itself`.
- Example : 2, 3, 5, 7, 11......

  ### 6.1. Brute Force Approach

  - Check all numbers from 1 to `n` 
  - Count the number of divisors and it should be `2`.

   #### Code

  ```java
    static boolean checkPrime(int n) {

        // Initialize a counter variable to count the number of factors.
        int count = 0;

        // Loop through numbers from 1 to n.
        for (int i = 1; i <= n; i++) {

            // If n is divisible by i without any remainder.
            if (n % i == 0) {

                // Increment the counter.
                count++;
            }
        }

      // If the number of factors is exactly 2, then true.
        return count == 2;
    }

  System.out.println(checkPrime(11));

  ```

  #### Output

  ```
  true
  ```

  ### 6.2. Optimal Approach

  - Check Every Number from `1 to sqrt(Number)`.

  - If Number is divisible by i then print `i` and `number/i` both.

  - Count the number of divisors and it should be `2`.

  #### Code

  ```java
  static boolean checkPrime(int n) {

      // Initialize a counter variable to count the number of factors.
      int count = 0;

      // Loop through numbers from 1 to sqrt(n).
      // for (int i = 1; i <= Math.sqrt(n); i++)
      for (int i = 1; i * i <= n; i++) {

          // If n is divisible by i without any remainder.
          if (n % i == 0) {

              // Increment the counter.
              count++;

              // If i is not the square root of n, then n/i is also a factor.
              if (i != n / i) {
                  count++;
              }
          }
      }

      // If the number of factors is exactly 2, then true.
      return count == 2;
  }

  System.out.println(checkPrime(11));
  ```
  #### Output

  ```
  true
  ```
  ---
  &nbsp;

  
### 7. Find `GCD/HCF` of two numbers

- `GCD` : `Greatest Common Divisor` or `HCF` : `Highest Common Factor`
- `GCD` of two numbers is the largest number that divides both of them.

- Example :

    Lets take the two number are 12 & 18.
    
     → Divisors of 12 : 1, 2, 3, 4, `6`, 12.

     → Divisors of 18 : 1, 2, 3, `6`, 9, 18.

     → GCD or HCF is `6`.

  ### 7.1. Brute Force Approach :

    - Check all numbers from `1 → min(a,b)`
    - Check if both `a` and `b` are divisible by `i`.
    - Store latest `i` which will be Greatest.

  #### Code
  
    ```java
    static int GCD (int a, int b) {

        // Initialize a variable to store the GCD.
        int gcd = 1;

        // Loop through numbers from 1 to the minimum of a and b.
        for (int i = 1; i <= Math.min(a, b); i++) {

            // If both a and b are divisible by i.
            if (a % i == 0 && b % i == 0) {

                // Store the latest i as the GCD.
                gcd = i;
            }
        }

        return gcd;
    }

    System.out.println(GCD(12, 18));
    ```
  #### Output
  
    ```
    6
    ```
  ### 7.2. Better Approach :

     - Check all numbers from `min(a,b) → 1`.
     - Check if both `a` and `b` are divisible by `i`.
     - return `i` as soon as condition satisfies. 

  #### Code
    
    ```java
    static int GCD (int a, int b) {

        // Loop through numbers from the minimum of a and b to 1.
        for (int i = Math.min(a, b); i >= 1; i--) {

            // If both a and b are divisible by i.
            if (a % i == 0 && b % i == 0) {

                // Return i as the GCD.
                return i;
            }
        }

        return 1;
    }

    System.out.println(GCD(12, 18));
    ```
  #### Output
  
    ```
    6
    ```

  ### 7.3. Optimal Approach : `Euclidean Algorithm`

    - The Euclidean algorithm is a method for finding the greatest common divisor (GCD) of two integers. 

    - The Euclidean algorithm is based on the principle that `the GCD of two numbers also divides their difference`.

      If `a > b` 
        - `GCD(a,b) = GCD(b, a%b)` or `GCD(a,b) = GCD(b, a-b)`
        - `GCD(a,0) = a`

    
  #### Code : Iterative Approach
  ```java
  public static int findGcd(int a, int b) {

        while(a > 0 && b > 0) {
          
            if(a > b) { a = a % b; }

            else { b = b % a; }
        }

        if(a == 0) {
            return b;
        }

        return a;
    }

  System.out.println(GCD(12, 18));
    ```
  #### Output
  
    ```
    6
    ```

  #### Code : Recursive Approach

  ```java
  static int GCD (int n1, int n2) {
        // Base Case
        if (n2 == 0) {
            return n1;
        }
        // Recursive Case
        // Swapped positions 
        return GCD(n2, n1 % n2);
    }

  System.out.println(GCD(12, 18));
  System.out.println(GCD(18, 12));
  ```
  #### Output
  
    ```
    6
    6
    ```

> [!NOTE]  
> Swapping `n1` and `n2` is must because 
>
> - If `n1 > n2` : &nbsp;`n1 % n2` will reduce number.
> - If `n1 < n2` : &nbsp;`n1 % n2` will keep `n1` same but swapping will `correct their order` in passing parameters.
> - First Parameter should be greater than second.
> - `GCD(18, 12)` will be `GCD(12, 18 % 12)` = `GCD(12, 6)` → `GCD(6, 12 % 6)` = `GCD(6, 0)` = `6`.
> - `GCD(12, 18)` will be `GCD(18, 12 % 18)` = `GCD(18, 12)` → `GCD(12, 18 % 12)` = `GCD(12, 6)` → `GCD(6, 12 % 6)` = `GCD(6, 0)` = `6`.

---

&nbsp;

## Lec 5 : Learn Basic Recursion

### What is Recursion?

- `Recursion` is a process in which a function calls itself indefinitely until a specified condition is fulfilled.

- The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, or one that uses excess amounts of memory or processor power.

- Recursion is a method where the solution to a problem depends on solutions to smaller instances of the same problem.

- `Base condition` is the condition where the recursion stops.

- `Recursive case` is the condition where the function calls itself.

### Example : Understand Recursion by printing something N times


```java
static int count = 0;

    static void print(){
        
         // Base Condition.
         if(count == 3 ) return;

         System.out.println(count);
         // Count incremented.
         count++;

         // Recursive Case.
         print();
    }

```
#### Output : 
  
  ```
  0
  1
  2
  ```

### 1. Print Name N times using Recursion

  - `printName(3)` will print `Harshal` 3 times.
  

    #### Code : Right Recursion
    `Right Recursion` : Recursive call is at the end of the function.

    1.  `Base Condition` : `n == 0` will stop the recursion.

    2.  `Print Name` : `System.out.println("Harshal")` will print the name.
    
    3.  `Recursive Case` : `printName(--n)` will call the function again with `n-1`.


    ```java
    static void printName(int n) {

          // Base Condition.
          if(n == 0) return;

          // Print Name
          System.out.println("Harshal");

          // Recursive Case....... Right Recursion
          printName(--n);
      }

    printName(4);
    ```
    #### Output : 

    ```
    Harshal
    Harshal
    Harshal
    Harshal
    ```

    #### Code : Left Recursion ( Backtracking )
    `Left Recursion` : Recursive call is at the start of the function.

    1.  `Base Condition` : `n == 0` will stop the recursion.

    2. `Recursive Case` : `printName(--n)` will call the function again with `n-1`.

    3. `Print Name` : `System.out.println("Harshal")` will print the name.

    ```java
    static void printName(int n) {

          // Base Condition.
          if(n == 0) return;

          // Recursive Case........ Left Recursion
          printName(--n);

          // Print Name
          System.out.println("Harshal");
      }

    printName(4);
    ```

    #### Output : 

    ```
    Harshal
    Harshal
    Harshal
    Harshal
    ```

&nbsp;

### 2. Print 1 to N using Recursion

- `printNumbers(1,3)` will print `1 2 3`.

  #### Code : Right Recursion

  ```java
  static void printNumbers(int i, int N) {

        // Base Condition.
        if(i > N) return;

        // Print Number
        System.out.println(i);

        // Recursive Case....... Right Recursion
        printNumbers(++i, N);
    }

  printNumbers(1, 3);
  ```

  #### Recursion tree :
  
    ```swift
    printNumbers(1, 3)
    |
    |---- print `1`
    |---- printNumbers(2, 3)
    |     |
    |     |---- print `2`
    |     |---- printNumbers(3, 3)
    |           |
    |           |---- print `3`
    |           |---- printNumbers(4, 3)
    |                 |
    |                 |---- {return}

    ```
  

  #### Output : 

  ```
  1
  2
  3
  ```

  #### Code : Left Recursion ( Backtracking )

  ```java
  static void printNumbers(int i, int N) {

        // Base Condition.
        if(i < 1) return;

        // Recursive Case....... Left Recursion
        printNumbers(--i, N);

        // Print Number
        System.out.println(i);
    }

  printNumbers(3, 3);
  ```

  #### Recursion tree :
  
    ```swift
    printNumbers(3, 3)
    |
    |---- printNumbers(2, 3)
    |     |
    |     |---- printNumbers(1, 3)
    |     |     |
    |     |     |---- printNumbers(0, 3)
    |     |     |     |
    |     |     |     |---- {return}
    |     |     |     
    |     |     |     
    |     |     |
    |     |     |---- print `1`
    |     |
    |     |---- print `2`
    |
    |---- print `3`
    ```
  #### Output : 
  
    ```
    1
    2
    3
    ```

&nbsp;

### 3. Print N to 1 using Recursion

- `printNumbers(3,1)` will print `3 2 1`.

  #### Code : Right Recursion

  ```java
  static void printNumbers(int i, int N) {

        // Base Condition.
        if(i == 0) return;

        // Print Number
        System.out.println(i);

        // Recursive Case....... Right Recursion
        printNumbers(--i, N);
    }

  printNumbers(3, 1);
  ```
  #### Recursion tree :
  
    ```swift
    printNumbers(3, 1)
    |
    |---- print `3`
    |---- printNumbers(2, 1)
    |     |
    |     |---- print `2`
    |     |---- printNumbers(1, 1)
    |           |
    |           |---- print `1`
    |           |---- printNumbers(0, 1)
    |                 |
    |                 |---- {return}

    ```

  #### Output : 

  ```
  3
  2
  1
  ```

  #### Code : Left Recursion ( Backtracking )

  ```java
  static void printNumbers(int i, int N) {

        // Base Condition.
        if(i > N) return;

        // Recursive Case....... Left Recursion
        printNumbers(++i, N);

        // Print Number
        System.out.println(i);
    }

  printNumbers(1, 3);
  ```
  #### Recursion tree :
  
    ```swift
    printNumbers(1, 3)
    |
    |---- printNumbers(2, 3)
    |     |
    |     |---- printNumbers(3, 3)
    |     |     |
    |     |     |---- printNumbers(4, 3)
    |     |     |     |
    |     |     |     |---- {return}
    |     |     |
    |     |     |---- print `3`
    |     |
    |     |---- print `2`
    |
    |---- print `1`
    ```

  #### Output : 

  ```
  3
  2
  1
  ```


  










