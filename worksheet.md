- Name: Yurii Ilnytskyi
- Student ID: s2634187
- Tutorial group: 06
- Tutor: Damini Iyer
- Date: 09/03/2025

# Worksheet #
<h2>1. Introduction</h2>
<p>The following challenge requires developing a program to return the <strong>day number</strong> in the year for a given date in the format <code>YYYY/MM/DD</code>. The solution follows <strong>Object-Oriented Programming (OOP)</strong> principles, breaking logic into <strong>reusable classes and methods</strong>.</p>

<h2>2. Breaking Down the Problem</h2>

<h3>Handling the Input or Output</h3>
<h4>Input Format:</h4>
<ul>
    <li>A date in the format <code>YYYY/MM/DD</code>, where:</li>
    <ul>
        <li><b>YYYY</b> is the year.</li>
        <li><b>MM</b> is the month.</li>
        <li><b>DD</b> is the day.</li>
    </ul>
</ul>

<h4>Output Format:</h4>
<p>A single integer representing the day number of the year, meaning how many days have passed since January 1st of that year.</p>

<h4>Example:</h4>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>Input</th>
        <th>Output</th>
    </tr>
    <tr>
        <td>2016/07/05</td>
        <td>187</td>
    </tr>
    <tr>
        <td>2000/03/28</td>
        <td>88</td>
    </tr>
    <tr>
        <td>0666/06/06</td>
        <td>157</td>
    </tr>
    <tr>
        <td>6789/10/11</td>
        <td>284</td>
    </tr>
    <tr>
        <td>0004/04/04</td>
        <td>95</td>
    </tr>
    <tr>
        <td>1337/07/13</td>
        <td>194</td>
    </tr>
</table>

<h3>Handling Leap Years</h3>
<p>A leap year affects February, making it 29 days instead of 28. Leap years are:</p>
<ul>
    <li>A year is a leap year if it is divisible by 4, but is not divisible by 100.</li>
    <li>A year is a leap year if it is divisible by 400.</li>
</ul>

<h2>3. Implementation</h2>

<h3><i>DateCalculator Class</i></h3>
<ul>
    <li>Stores year, month, and day as instance variables.</li>
    <li><b>Methods:</b></li>
    <ul>
        <li><code>isLeapYear()</code>: Determines if the year is a leap year.</li>
        <li><code>getDaysOfYear()</code>: Calculates the day number of the year.</li>
    </ul>
</ul>

<h3><i>Main Method</i></h3>
<ul>
    <li>Reads the date from user input (<code>YYYY/MM/DD</code>).</li>
    <li>Parses the data into correct variables (e.g., day = <code>DD</code> and so on).</li>
    <li>Passes the values to <code>DateCalculator</code>.</li>
    <li>Prints the calculated day number.</li>
</ul>

<h2>4. Step-by-Step Explanation</h2>

<h3>Handle User Input</h3>
<ul>
    <li>We use <code>Scanner</code> to read the date from the console.</li>
    <li>The <code>split("/")</code> method separates the year, month, and day.</li>
    <li>We convert them into integers using <code>Integer.parseInt()</code>.</li>
</ul>

<h3>Check for Leap Year</h3>
<ul>
    <li>The <code>isLeapYear()</code> method follows the leap year rules.</li>
    <li>A leap year is divisible by 4 but not by 100. It is also a leap year if it is divisible by 400.</li>
</ul>

<h3>Calculate the Day Number</h3>
<ul>
    <li>We store month lengths in an array.</li>
    <li>If the year is a leap year, February is set to 29 days.</li>
    <li>The loop starts at January (index 0) and adds up all days until the given month and also adds the given day.</li>
</ul>

<h3>Summary</h3>
<ol>
    <li>Read input (<code>YYYY/MM/DD</code>) using <code>Scanner</code>.</li>
    <li>Split the string and convert to int values.</li>
    <li>Check if the year is a leap year.</li>
    <li>Store month lengths and adjust for leap years.</li>
    <li>Loop through previous months and sum up days.</li>
    <li>Add the given day to the total.</li>
    <li>Print the final day number.</li>
</ol>
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
  /* Specific font with generic fall-back */
  /* font-family: "Calibri Light", sans-serif; */
  font-family: "OpenDyslexic", sans-serif;
}
pre,
code,
pre code {
  /* line spacing */
  line-height: 150%;
  /* Default monospace */
  /* Specific fixed-width font with generic fall-back */
  /*font-family: "Consolas", monospace;*/
  font-family: "OpenDyslexicMono", monospace;
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