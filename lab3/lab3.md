# Lab Report 3 | Ryan Ding  
## Different Ways to Use Grep  
There are many ways for us to use grep, a command short for **Global Regular Expression Print**, from the ways with which Professor Politz taught us in lecture to other ways that can be found online. In this lab report, I will go into the different commands that grep has to offer that may be of essential use in a future Skill Demostration, lab assignment, or just casual use! All examples will be going through the written_2 folder provided in the [Skill Demonstration 1 Data Repository](https://github.com/ucsd-cse15l-w23/skill-demo1-data). Keep in mind that in these examples, should nothing be printed to the command line, there are either no results to be found using the command or the command was not used in a proper way.  
### 1. Searching for a specific string within a file
Searching for a specific string within a file is as easy as 1-2-3! Use the following syntax to search for a particular string within a specific file or even an entire directory:  
`grep <<Modifiers>> <<String query>> <<Specified Directory>>`  
While modifiers are also an essential part of scraping just the information needed for a specific task, they will only be touched upon briefly in different examples, allowing us to pick and choose what piece of information is printed to the command line. However, in these next two examples, they will not be used.  
#### Example 1: Looking for the string "Cuba" within a specific file  
In running the command `grep "Cuba" <<file name>>`, we are able to check as to whether or not the chosen file contains the string "Cuba." Without any modifiers, the terminal will print out a short excerpt of the file with the specified string. For instance, when we check for the string "Cuba" within the Vallarta-WhatToDo.txt file, we can seen where it is mentioned:  
![Image](./images/grep1.JPG)  
Command Syntax: `grep "Cuba" Vallarta-WhatToDo.txt` from within the `berlitz2` directory.  
#### Example 2: Looking for the string "Rainy" within a specific file  
Again, this example is similar to the one above, except that it searches for the string "Rainy" to see if it is located within the specific file WhatToLakeDistrict.txt. While these methods do seem inefficient should a large number of files need to be checked, there will be different and better ways to cover a large amount of files later on in this report, such as through recursive searching and the usage of different parameters.
![Image](./images/grep2.JPG)  
Command Syntax: `grep "Rainy" WhatToLakeDistrict.txt` from within the `berlitz1` directory.  
### 2. Recursively searching through multiple directories  
The recursive modifier of grep, denoted as `-r`, allows for multiple files within the local and even deeper directories to be searched to return a specific query.
#### Example 1: Finding all the file names containing "ch" in the entirety of written_2  
In this example, we will introduce the usage of the `-l` modifier as well, which is used to display just the file names of the query given to the Git Bash terminal. 
#### Example 2:
### 3. Counting the number of files with a given search query  
The grep command for counting the numbers of files is rather similar to that of the grep method, except that it uses the modifier `-c`to match a given query to the total sum of all results that can be found with such query. The formal syntax for this usage is:  
`grep -c <<Other Modifiers>> <<Specified String>> <<Given File/Directory>>`  
#### Example 1: Finding the count of files with "ch" in their name  
In this example, we will be using the `-c` modifier required for returning the count of a specific string, in this case being
#### Example 2:
### 4. Searching files that do NOT match a pattern  
In all the other examples, we have tried to find the files and locations of everything that contained a specific string. However, what if we want every file that DID NOT contain a specific string? With this, we introduce the inverse modifier, `-v`, used to return everything that does not match a query given to the terminal. The syntax for this is as follows:  
`grep -v <<Other Modifiers>> <<String query>> <<Specified File/Directory>>
#### Example 1:  
#### Example 2:
