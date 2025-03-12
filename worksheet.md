- Name: Yurii Ilnytskyi
- Student ID: s2634187
- Tutorial group: 06
- Tutor: Damini Iyer
- Date: 09/03/2025

# Worksheet #
<b>1. Introduction </b>

The following challenge requires to develop a program to return the day number in the year for a given date in the format YYYY/MM/DD. The solution is created by using Object-Oriented Programming (OOP) with the logic split into reusable classes and methods. Our solution is dealing with leap years, month durations, and looping through months to determine the number of days passed since January 1st of the year.

<br>
<br>
<br>

<b>2. Breaking down the problem </b>

<i>Handling the input or output</i>

Input Format:

A date in the format YYYY/MM/DD, where:
YYYY is the year.
MM is the month.
DD is the day.

Output Format - a single integer representing the day number of the year, meaning how many days have passed since January 1st of that year.

Example:

Input	Output

2016/07/05 -> 187

2000/03/28 -> 88

0666/06/06 -> 157

6789/10/11 -> 284

0004/04/04 -> 95

1337/07/13 -> 194

<i> Handling the leap year </i>

A leap year affects February, making it 29 days instead of 28. Leap years are:

-A year is a leap year if it is divisible by 4, but is not divisible by 100.

-The year is divisible by 400.

<br>
<br>
<br>

<b>3. Implementation </b>

Instead of writing all the logic in the main method, we separate functionality into a class called DateCalculator.

<i>DateCalculator class </i>

Stores year, month, and day as instance variables.
Methods: 

isLeapYear(): Determines if the year is a leap year.

getDaysOfYear(): Calculates the day number of the year.

<br>
<br>

<i> Main method </i>

-Reads the date from user input (YYYY/MM/DD).

-Parses the data into correct variables (e.g day = DD and so on)

-Passes the values to DateCalculator.

-Prints the calculated day number.

<br>
<br>
<br>

<b> 4.  Step-by-step explanation </b>
<br>
<br>

<i> Handle user input </i>

We use Scanner to read the date from the console.

The split("/") method separates the year, month, and day.

We convert them into integers using Integer.parseInt().

<br>

<i> Check for leap year </i>

The isLeapYear() method follows the leap year rules.

A leap year is divisible by 4 but not by 100 and also it is leap year if it is divisible by 400.

<br>

<i> Calculate the day number </i>


We store month lengths in an array.

If the year is a leap year, February is set to 29 days.

The loop starts at January (index 0) and adds up all days until the given month and also adds the given day.

<br>

<i> Summary </i>

1	Read input (YYYY/MM/DD) using Scanner

2	Split the string and convert to int values

3	Check if the year is a leap year

4	Store month lengths and adjust for leap years

5	Loop through previous months and sum up days

6	Add the given day to the total

7	Print the final day number

# Original challenge question from CodeGolf #

[Calculate the day number of the year](https://codegolf.stackexchange.com/questions/70400/calculate-the-day-number-of-the-year "Calculate the day number of the year")

The Challenge

Write a program or function that takes a date as input and outputs the day number of the year. You may not use any builtins for that!

Rules

As usual you may write a full program or a function.
The format of the input is up to you, but it has to contain a year, a month and a day. Make clear which one your solution uses!
No date-related builtins allowed! You gotta do the work by yourself. Builtins which are not related to date operations are fine.
Base for the calcultion is the gregorian calendar.
You have to take account of leap-years.
You only need to handle years in the range [1, 9999]
Standard loopholes are forbidden.
Lowest byte count wins!
Testcases

Input format here is YYYY/MM/DD

2016/07/05 -> 187
2000/03/28 -> 88
0666/06/06 -> 157
6789/10/11 -> 284
0004/04/04 -> 95
1337/07/13 -> 194


<STYLE>
* { /* Don't leave any empty lines or IntelliJ might not render correctly */
  /* Text size */
  font-size:   1.1rem;
  /*font-size:   1.2rem;*/
  /* Zenburn dark theme */
  background-color: #2A252A;
  color:            #D5DAD5;
  /* One Dark theme */
  /*background-color: #282C34;
  color:            #ABB2BF;*/
  /* white-ish on dull blue-ish */
  /*background-color: DarkSlateGray;
    color:            AntiqueWhite;*/
  /* white on black */
  /*background-color: black;
  color: white;*/
  /* black on white */
  /*background-color: white;
  color: black;*/
  /* nearly black on bright yellow */
  /*background-color: #FFFFAA;
  color:            #080808;*/
  /* black on bright blue */  
  /*background-color: #99CCFF;
  color:            black;*/
}
body {
  /* width of the text column */
  width: 80%;
  /* line spacing */
  line-height: 180%;
  /*line-height: 200%;*/
  /* Font styles: */
  /* Default sans serif */
  /*font-family: sans-serif;*/
  /* Default serif */
  font-family: serif;
  /* Specific font with generic fall-back */
  /* font-family: "Calibri Light", sans-serif; */
  /*font-family: "OpenDyslexic", sans-serif;*/
}
pre,
code,
pre code {
  /* line spacing */
  line-height: 150%;
  /* Default monospace */
  font-family: monospace;
  /* Specific fixed-width font with generic fall-back */
  /*font-family: "Consolas", monospace;*/
  /*font-family: "OpenDyslexicMono", monospace;*/
}
ol,
ol ol,
ol ol ol { /* Nested lists all use decimal numbering */
  list-style-type: decimal;
}
em {
  /* if you want underlining instead of italics */
  /*font-style: normal;
  border-bottom-style: solid;
  border-bottom-width: 1px;
  padding-bottom:      2px;*/
  text-decoration-skip-ink: auto;
}
h2 { /* Put a horizontal line above major headings to assist screen viewing */
  border-top:  1px solid #D5DAD5;
  margin-top:  80px;
  padding-top: 20px;
  }
</STYLE>