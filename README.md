# Problem Set 9

It's time to put your skills to the test. This problem set should look very familiar. It's the same thing as last time, except we're using lists instead of arrays.

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-9`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.

```
$ cd ~/Desktop/APCSA
```

3. Clone my skeleton repository into a directory named `pset-9`.

```
$ git clone git@github.com:ap-java-ucvts/pset-9-skeleton.git pset-9
```

4. Change into your newly created `pset-9` directory.

```
$ cd pset-9
```

5. Overwrite the remote, which originally points at my skeleton repository.

```
$ git remote rename origin upstream
```

6. Add a new remote that points at your `pset-9` repository. Replace `YOUR-USERNAME` with your actual username.

```
$ git remote add origin git@github.com:YOUR-USERNAME/pset-9.git
```

7. Open up the `Exercises.java` file, which is where you'll implement each of your solutions.

The first exercise is partially done for you (the input verification part, anyway). You'll be on your own for the rest. There are a lot of exercises in this problem set, but none of them are too challenging. Take your time and try not to get frustrated.

## Exercises

The specifications for each exercise are outlined below. Your job is to write lines of code to solve the problems and return the desired values. Your code must meet the requirements set forth in this section. Each solution must be written in its own method, and named accordingly.

Work through these exercises on your own. Experiment, make mistakes, ask questions, and fix your mistakes. It's the only way to get good at programming.

While each of these exercises can be solved using loops and conditional statements, the built-in methods of the `ArrayList` class will surely make your lives much easier. [Read the documentation](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/ArrayList.html) and use these methods to help streamline your code!

### Exercise 1 (`commonEnd`)

Given two `ArrayList`s of `Integer`s, `a` and `b`, return `true` if the `ArrayList`s have either the same first element or the same last element. The `A`rrayList`s must meed the following specifications, otherwise you should return `false`.

- `a` and `b` must not be `null`
- `a` and `b` must have a `size` of at least `1`

I've written the input verification portion of this exercise (i.e., the stuff that makes sure the above specifications are met). You'll need to finish the remainder of the exercise.

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 2 (`endsMeet`)

Given an `ArrayList` of `String`s, `values`, return a new `ArrayList` comprised of the first and last `n` elements of the original `ArrayList`. The input `ArrayList` must meet the following specifications, otherwise you should return an empty `ArrayList`.

- `values` must not be `null`
- `values` must have a `size` of at least `n`
- `n` must be a non-negative integer

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 3 (`difference`)

Given an `ArrayList` of `Integer`s, `numbers`, return the difference between the largest and smallest values. The input `ArrayList` must meet the following specifications, otherwise you should return `-1`.

- `numbers` must not be `null`
- `numbers` must have a `size` of at least `1`

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 4 (`biggest`)

Given an `ArrayList` of `Double`s, `numbers`, return the largest value among the first, middle, and last elements in the `ArrayList`. The input `ArrayList` must meet the following specifications, otherwise you should return `-1`.

- `numbers` must not be `null`
- `numbers` must have an odd `size` of at least `3`
- `numbers` must not contain any negative values

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 5 (`middle`)

Given an `ArrayList` of `String`s, `words`, return a new `ArrayList` comprised of the middle three elements of the original `ArrayList`. The input `ArrayList` must meet the following specifications, otherwise you should return an empty `ArrayList`.

- `values` must not be `null`
- `values` must not contain any `null` values
- `values` must have an odd `size` of at least `3`

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 6 (`increasing`)

Given an `ArrayList` of `Integer`s, `numbers`, return `true` if there exists three consecutively increasing integers somewhere in the `ArrayList`. The input `ArrayList` must meet the following speciications, otherwise you should return `false`.

- `numbers` must not be `null`
- `numbers` must have a `size` of at least `3`

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 7 (`everywhere`)

Given an `ArrayList` of `Integer`s, `values`, and a target `int`, `x`, return `true` if `x` is _everywhere_ in the `ArrayList`. A target is defined as being _everywhere_ if it is located adjacent to every other element. The input `ArrayList` and target must meet the following specifications, otherwise you should return `false`.

- `values` must not be `null`
- `values` must have a `size` of at least `1`

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 8 (`consecutive`)

Given an `ArrayList` of `Integer`s, `numbers`, return `true` if the `ArrayList` contains three consecutive even or three consecutive odd numbers. The input `ArrayList` must meet the following specifications, otherwise you should return `false`.

- `numbers` must not be `null`
- `numbers` must have a `size` of at least `3`

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 9 (`balance`)

Given an `ArrayList` of `Integer`s, `numbers`, return `true` if it is possible to split the `ArrayList` so that the sum of the left half is equal to the sum of the right half. The input `ArrayList` must meet the following specifications, otherwise you should return `false`.

- `numbers` must not be `null`
- `numbers` must have a `size` of at least `2`

Use the provided `grademe.sh` script to verify your code against my test cases.

### Exercise 10 (`clumps`)

Given an `ArrayList` of `String`s, `values`, return the number of _clumps_ in the `ArrayList`. A _clump_ is defined as a consecutive series of two or more identical values. The input `ArrayList` must meet the following specifications, otherwise you should return `-1`.

- `values` must not be `null`
- `values` must not contain any `null` values

Use the provided `grademe.sh` script to verify your code against my test cases.

## Tests

To test your code, use the provided `grademe.sh` script. To run the script, use the following command.

```
./grademe.sh exerciseName
```

It'll output the number passing test cases, as well as the input, expected output, and actual output of any failing test cases. Make sure your code is compiling before running this script, as it depends on the existence of a successfully compiling `Exercises.java` file.

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

- February 5, 2020, at 11:59pm.

If you submit your problem set at midnight (i.e., February 6, 2020, at 12:00am), it is considered **late**!

### Submission Requirements

- Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
- There must be **at least** 15 unique commits to your repository.
- Your code must meet each requirement outlined in the _Exercises_ and _Deliverables_ sections.
- Your code must adhere to the course style guidelines.

Happy coding!
