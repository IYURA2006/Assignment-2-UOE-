# Challenges and notes #


* [Stewie's sequence: + * - / + * - /](#stewies-sequence-)
* [The absent-minded linguist](#the-absent-minded-linguist-)
* [Hodorize a String](#hodorize-a-string-)
* [Superstitious hotel elevator](#superstitious-hotel-elevator-)
* [The code-golfer way of searching a library](#the-code-golfer-way-of-searching-a-library-)
* [Calculate the day number of the year](#calculate-the-day-number-of-the-year-)
* [The struggling college student's GPA Calculator](#the-struggling-college-students-gpa-calculator-)
* [Rotate every row and column in a matrix](#rotate-every-row-and-column-in-a-matrix-)


## Stewie's sequence ##

[Stewie's sequence: + * - / + * - /](https://codegolf.stackexchange.com/questions/101145/stewies-sequence "Stewie's sequence")

### Initial thoughts and feelings ###

At first, the problem "print the sequence + * - /" in repeat seems easy. It seems like a problem that is mostly concerned with loops and string manipulation, and therefore it's a good one for new programmers to get used to iteration.

### Initial idea for a design ###
One easy method would be implementing a loop. A for loop could run up to n, and applying module (%) would assist in going through the characters "+", "*", "-", "/". This is the approach that we have studied in first 3 weeks of a course, Conditionals and Loops (2nd week) and Arrays (3rd week).


### Ideas for alternative designs ###
However, instead of looping through an array we could use recursion. But, I think it can overcomplicate the solution and maybe be not easy to understand .

### Later thoughts and feelings ###
With some consideration, this is a great practice problem in looping and string manipulation that are all fundamental programming concepts. And I had a thought of practising something else.

## The absent-minded linguist ##

[The absent-minded linguist](https://codegolf.stackexchange.com/questions/69084/the-absent-minded-linguist "The absent-minded linguist")

### Initial thoughts and feelings ###
When I initially looked at the problem, I was intrigued. Parsing sentences with varying word orders from input strings containing only the letters S, V, and O (subject, verb, and object) did seem a bit trouble causing but also a nice opportunity to use logic and pattern matching. It would be interesting to learn different sentence constructions in other languages and also good practise in dividing the string into possible valid sentences.

### Initial idea for a design ###
My first thought was to break up the problem into little pieces that used loops and conditionals, which we already did in class. Since the problem is trying to find varying sentence structures, I thought that I could develop a function that tries breaking the string into varying subject, verb, and object combinations depending on the six word orders. For each combination, I would loop through the string, checking if it matches the structure, then print out the valid ones.

### Ideas for alternative designs ###
While the initial solution seemed to be okay. One alternative design was to establish a set of helper functions for every word order. Instead of looking at the structure in a large function, I could establish smaller functions that operate with one specific word order at a time. This would divide the problem into more manageable chunks and make debugging easier.

The other idea was to check the string character by character. With loops and arrays, I could manually step through each position, comparing to the expected form for every word order. It would be a more tedious approach .
### Later thoughts and feelings ###
As I started to think more about the challenge, I realised that it would take more time than I originally suspected. Although it's a good exercise in thinking about how words and sentence forms are, manually parsing and handling different word orders  isn't really something I'd be happy to do.
## Hodorize a String ##

[Hodorize a String](https://codegolf.stackexchange.com/questions/48907/hodorize-a-string "Hodorize a String")

### Initial thoughts and feelings ###
This is an interesting problem. We need to convert an ASCII string to a unique "Hodorized" format by mapping each character to a predefined sentence pattern. While the logic is not complicated, we just need to be careful when considering some potential edge cases.

### Initial idea for a design ###
To Hodorize a given string, I will first extract each character's ASCII value and determine its corresponding sentence structure according to predefined rules.

### Ideas for alternative designs ###
I am not sure

### Later thoughts and feelings ###
The challenge is more of getting the correct format and following set of rules perfectly. While the task is interesting, it is rather repetitive as it is mostly about applying the same rules to all characters in the input string. So, I have not chosen this problem.

## Superstitious hotel elevator ##

[Superstitious hotel elevator](https://codegolf.stackexchange.com/questions/68866/superstitious-hotel-elevator "Superstitious hotel elevator")

### Initial thoughts and feelings ###
At first, when I read the "Superstitious Hotel" challenge, I found it interesting but also a bit tricky. The problem is to generate an elevator button panel that misses 4 and 13 numbers due to superstitions, which is a clever idea. While it looked to be a straightforward exercise in loops and conditionals, I was not particularly looking forward to having to manually handle all of the exclusions and formatting. It struck me as a bit more work than I wanted to do.

### Initial idea for a design ###
When I started thinking about how to solve this problem, I considered using conditionals and loops to first figure out the numbers to exclude (like 13 and numbers containing the digit 4). I would loop through numbers from 1 to n and create a list of valid floor numbers by checking each number individually.

After getting the right numbers, I would place them in two columns. The problem required that the output be printed in the opposite order, so I'd need to double-check the order before printing. To do that, I'd likely place the numbers in a list, reverse the list, and then print pairs of numbers with a space in between. This seemed to be a simple enough approach, but I think I will need to play around to get the output into the desired format.
### Ideas for alternative designs ###
Think of other approach, I came up with that we can loop instead to generate valid numbers and print them straight away in pairs as we move along. Even though this would eliminate the reversing of the list, I would have to pay closer attention when printing the numbers to arrange them in the required format.

### Later thoughts and feelings ###
After looking at a little more, I realised that while the problem does provide an excellent exercise in handling loops and conditionals, I was not certain if I would find the problem particularly fascinating.
## The code-golfer way of searching a library ##


[The code-golfer way of searching a library](https://codegolf.stackexchange.com/questions/118128/the-code-golfer-way-of-searching-a-library "The code-golfer way of searching a library")

### Initial thoughts and feelings ###
This problem involves creating the shortest possible search keys for all song titles such that the search string is shortest possible but still can uniquely identify each song. The problem becomes slightly more challenging because each key need to contain the substrings of the song title and the search is case-insensitive. This seems to like a fun problem for me. It also has the challenge of how to handle spaces in substrings and to make sure that no two songs have the same search key.
### Initial idea for a design ###
In order to generate the shortest search keys, I will identify the shortest unique substrings for each song that can distinguish it from all the rest. This I will do by comparing each song with the rest and using the smallest substring where they differ first. I'll compare case-insensitively by converting all the titles to lower case. For substrings with spaces, I will put them in quotes.
### Ideas for alternative designs ###
After thinking for a bit, I have realised that I can before identifying unique substrings, I could first sort the songs to simplify the comparison process. This might make it easier to find differences when generating substrings.
### Later thoughts and feelings ###
For me the problem is nice. This was one of my favourite challenges to implement, however I gave a preference to another one.

## Calculate the day number of the year ##

[Calculate the day number of the year](https://codegolf.stackexchange.com/questions/70400/calculate-the-day-number-of-the-year "Calculate the day number of the year")

### Initial thoughts and feelings ###
This is a challenge where we need to find the day number of the year for a given date. It is relatively simple idea, but we need to be careful when handling leap years and in adding days properly for each month.

### Initial idea for a design ###
I will take the input in the format of YYYY/MM/DD and extract the year, month, and day. To calculate the day number, I will need to sum the days of previous months and add the given day. I will use an array which contains month lengths with a special check for February for a leap year. Everything will be implemented  with loops and conditionals.

### Ideas for alternative designs ###
After thinking for a while, I have realised that to compute this problem I can use OOP that we have recently learned at class. It would promote readability and maintainability. So, the class will have methods to identify leap years and compute the day number by summing days from previous months and the given day. The array of month lengths will be stored as part of the class, and February will be adjusted based whether the year is leap.
### Later thoughts and feelings ###
I enjoy this problem as it's a mix of math, logic, and handling real-world constraints like leap years. Since I also want to improve my object-oriented programming skills, I've chosen to solve this challenge.
## The struggling college student's GPA Calculator ##

[The struggling college student's GPA Calculator](https://codegolf.stackexchange.com/questions/150370/the-struggling-college-students-gpa-calculator "The struggling college student's GPA Calculator")

### Initial thoughts and feelings ###
When I first read the "GPA Calculator" problem, I thought it was a nice opportunity to practice some loops, conditionals. The problem itself was straightforward enough, calculating the GPA based on letter grades and credit hours. 


### Initial idea for a design ###
Use the split() method to divide grades and credit hours from the input string.Map the grades (A=4.0, B=3.0 and so on).
Then loop through the grades and credit hours, calculating weighted GPA by grading points times credit hours.In the end,
compute the GPA by dividing the sum of weighted grades by the sum of credit hours, and round to two decimal places.

### Ideas for alternative designs ###
Instead of storing the grades and credit hours in arrays, I could handle the GPA calculation inline within a single loop. For each I could calculate and accumulate the weighted GPA. This might be slightly more efficient but would require to be more careful.

### Later thoughts and feelings ###
After giving it more thought, I was comfortable with the problem and I realised that the most important thing was parsing the input correctly and rounding the GPA.
In the end, I felt that this was a solid problem to practice the basics of Java, including loops, conditionals, and formatting. However, I wasn’t really interested in solving it.
## Rotate every row and column in a matrix ##

[Rotate every row and column in a matrix](https://codegolf.stackexchange.com/questions/74900/rotate-every-row-and-column-in-a-matrix "Rotate every row and column in a matrix")

### Initial thoughts and feelings ###
This is problem is a rotation of columns and rows of a matrix. I think it will be a challenge for mein making positive values shift to the right/down and negative values shift to the left/up and shift between columns and rows.

### Initial idea for a design ###
I think we need to store the matrix in a 2D array. Shift elements using loops, considering positive and negative values separately.
### Ideas for alternative designs ###
Instead of modifying the initial matrix, I could use a new matrix and move values and copy, but it will require slightly more memory. Also, we could use ArrayList to move more conveniently, but that would complicate things and require more time in coding .
### Later thoughts and feelings ###
While the problem looks interesting, it is quite hard for me because I need to be very careful with interchanging row and column shifts. Since I believe it might be a bit challenging to do, I haven't selected this challenge.

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