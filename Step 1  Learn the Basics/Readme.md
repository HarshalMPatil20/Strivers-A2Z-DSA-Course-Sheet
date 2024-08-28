# **Step 1** : Learn the Basics. ```31```

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
- Functions are reusable blocks of code that take arguments and return values.
### Step 1.5 : Arrays and Lists
- Arrays are collections of values of the same data type stored in contiguous memory locations.
- Lists are dynamic collections of values that can be of any data type.

&nbsp;

## Lec 2: Build-up Logical Thinking : `Patterns`
 
## 4 Rules for solving Patterns : 
### Patterns  → `Nested Loops`

1. For __`Outer Loop`__ → Count the `Number of Rows`
2. For __`Inner Loop`__ → Count the `Number of Columns` & Somehow connect them to rows.
3. Print them inside __Inner Loop__
4. Observe Symmetry (_optional_)

&nbsp;

### Examples :
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

| Row Number     |  Column count  |
|----------|----------|
| 0 th     |    5   |
| 1 st     |    5   |
| 2 nd     |    5   |
| 3 rd     |    5   |
| 4 th     |    5   |

####  Relation : Columns are  `Independent`.

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


## 2. Lower Triangular Pattern.
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

| Row Number| Column Numbers| Column count  |
|----------|  --------   |----------|
| 0 th     |   0         |    1   |
| 1 st     |   0→1       |    2   |
| 2 nd     |   0→2       |    3   |
| 3 rd     |   0→3       |    4   |
| 4 th     |   0→4       |    5   |

####  Relation : at `i`th Row, Column Numbers`0 → i` with `i+1` columns

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

## 3. Incremental Numbers Pattern.
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

| Row Number| Column Numbers| Column count  |
|----------|  --------   |----------|
| 0 th     |   0         |    1   |
| 1 st     |   0→1       |    2   |
| 2 nd     |   0→2       |    3   |
| 3 rd     |   0→3       |    4   |
| 4 th     |   0→4       |    5   |

####  Relation : at `i`th Row, Numbers`1 → i+1` with `i+1` columns
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

## 4. Inverted Right Triangle Pattern.
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

| Row Number| Column Numbers| Column count  |
|----------|  --------   |----------|
| 0 th     |   0         |    1   |
| 1 st     |   0→1       |    2   |
| 2 nd     |   0→2       |    3   |
| 3 rd     |   0→3       |    4   |
| 4 th     |   0→4       |    5   |

####  Relation : at `i`th Row, Number`i+1`, `i+1` times 

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


## 5. Inverted Right Triangle Pattern with Asterisks.
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

| Row Number| Column Numbers| Column count  |
|----------|  --------   |----------|
| 0 th     |   0→ 4       |    5   |
| 1 st     |   0→ 3       |    4   |
| 2 nd     |   0→ 2       |    3   |
| 3 rd     |   0→ 1       |    2   |
| 4 th     |    0        |    1   |

####  Relation : at `i`th Row, Column `0 → 5-i` with `5-i` columns

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

## 6. Inverted Right Triangle Pattern with Numbers.
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

| Row Number| Column Numbers| Column count  |
|----------|  --------   |----------|
| 0 th     |   0→ 4       |    5   |
| 1 st     |   0→ 3       |    4   |
| 2 nd     |   0→ 2       |    3   |
| 3 rd     |   0→ 1       |    2   |
| 4 th     |    0        |    1   |

####  Relation : at `i`th Row, Column `0 → 5-i` with `N-i` columns

``` java
// This is the outer loop which will loop for the rows.
  for (int i = 0; i < 5; i++) {

    // This is the inner loop which here, loops for the columns
    for (int j = 0; j < 5-i; j++) {
      System.out.print((j+1) + " ");
    }

    System.out.println();
  }
```
&nbsp;
-----
&nbsp;

## 7. Full Triangle with Asterisks.

- In Patterns like these, `Space` is also important to iterate and print.
- Printing Approach should be :

    | Space | Asterisks | Space |
    |-------|-----------|--------|


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
| Row No.| Space     | Asterisks | Space    |
|--------|-------    |-----------|--------  |
| 0      | 4         |1          |4         |
| 1      | 3         |3          |3         |
| 2      | 2         |5          |2         |
| 3      | 1         |7          |1         |
| 4      | 0         |9          |0         |
| `i `    | `n - (i+1)` |`2i+1`    |`n - (i+1)` |

2. Inner Loops :
    - First Inner Loop : `n-(i+1)` Spaces
    - Second Inner Loop : `2i+1` Asterisks
    - Third Inner Loop : `n-(i+1)` Spaces

``` java
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

## 8. Inverted Full Triangle with Asterisks.

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
| Row No.| Space     | Asterisks | Space    |
|--------|-------    |-----------|--------  |
| 0      | 0         |9          |0         |
| 1      | 1         |7          |1         |
| 2      | 2         |5          |2         |
| 3      | 3         |3          |3         |
| 4      | 4         |1          |4         |
| `i `   | `i`       |`2(n-(i+1)) + 1`    |`i` |

2. Inner Loops :
    - First Inner Loop : `i` Spaces
    - Second Inner Loop : `2(n-(i+1)) + 1` Asterisks
    - Third Inner Loop : `i` Spaces

``` java
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

## 9. Diamond with Asterisks.
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

## 10. Half Kite with Asterisks.
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
| 0      |1          |
| 1      |2          |
| 2      |3          |
| 3      |4          |
| 4      |5          |
| 5      |4          |
| 6      |3          |
| 7      |2          |
| 8      |1          |



2. Inner Loops :
    - if  `i > n`  : `stars = 2n - i`    
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
&nbsp;
-----
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

      | Row No.| `Start` Number    |
      |--------|-----------|
      | Even   |1          |
      | Odd    |0          |

2. Inner Loops :

    - Inner Loop is Printing in Alternate Pattern.
    - `Next Element = 1 - Previous element.`
    - Prints Alternate `0 1 0 1 0.....` 

``` java
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
&nbsp;
---
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
  |-------|-----------|--------|

  1. Outer Loop : `n` Rows

  Here `n = 4`
| Row No.| Number     | Space                         | Number (Mirror Sequence)    |
|--------|-------     |-----------                    |--------  |
| 0      | 1          | `2(n-1)` = 6  &nbsp;  `-2`     |1         |
| 1      | 1 2        | 4  &nbsp;  `-2`                |2 1       |
| 2      | 1 2 3      | 2  &nbsp; `-2`                 |3 2 1     |
| 3      | 1 2 3 4    | 0    &nbsp;                    |4 3 2 1   |

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
&nbsp;
---
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

``` java
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
&nbsp;
---
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
&nbsp;
---
&nbsp;

## 17. Character Printing with mirror sequence

  | Space |Sequence characters|Reverse Sequence characters | 
  |-------|-----------|--------|
  |n-1 |A B C D|C B A|
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

``` java
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
## 18. Ascending reverse ordering.
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
&nbsp;
---
&nbsp;

## 19. Hollow Diamond with Asterisks. 
  | Asterisks |Space|Asterisks | 
  |-------|-----------|--------|
  |`n-i` |`2i`|`n-i`|
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

