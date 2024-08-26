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

| Row No.| Space     | Asterisks | Space    |
|--------|-------    |-----------|--------  |
| 0      | 4         |1          |4         |
| 1      | 3         |3          |3         |
| 2      | 2         |5          |2         |
| 3      | 1         |7          |1         |
| 4      | 0         |9          |0         |
| i      | n - (i+1) |2 (i+1)    |n - (i+1) |





```
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        * 
```
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
```
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```
```
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
```
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```
```
A
A B
A B C
A B C D
A B C D E 
```
```
A B C D E
A B C D
A B C
A B
A
```
```
A 
B B
C C C
D D D D
E E E E E
```
```
      A
    A B A
  A B C B A
A B C D C B A
```
```
E
D E
C D E
B C D E
A B C D E
```
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

