# Lab Report 4 | Ryan Ding
## Week 7 Competition: Efficient Tactics to Reduce Typing Time  
During the Week 7 Lab section, we 
### 1. (Setup) Delete any existing forks of the repository you have on your account  
For people who are just starting to do this competition for the first time, this is an unnecessary step, but I will add it in to demonstrate how to delete an entire directory off your Secure Shell, as it can be difficult at times.  

First, sign into your Secure Shell using `ssh cs15lwi23xxx@ieng6.ucsd.edu<Enter>`, with _xxx_ replaced by your unique student login characters. If everything has been setup properly from the lab, you should not need to enter your password in anymore.  
![Image]()
Then, whilst in the current working directory, do `rm -rf l<tab><Enter>` in order to remove the `lab7/` directory from your SSH. By typing out just the letter l and then pressing `<tab>`, it autocompletes the directory your are trying to delete, saving a few seconds that may add up in the process. The `-rf` operator serves to a. recursively remove all files within the directory being removed and to b. forcefully remove the directory, as it will prompt you with a warning unless otherwise specified with -f.
![Image]()
After all this, you should type `logout` to logout of your SSH in order to continue to prepare for the competition, with the next steps being browser preparation.  
![Image]()
### 2. (Setup) Fork the repository  
Again, very easily done by going to [this](https://github.com/ucsd-cse15l-w23/lab7) link and clicking the fork button, as can be seen on the screen circled in red.  
![Image]()
### 3. (The real deal) Set the timer  
Nothing too special with this step, for me it is as easy as searching up 'stopwatch' on Google and readying up to start the competition. Refer to the image for extra guidance:  
![Image]()  
### 4. Log into ieng6  
If you did not need to setup your SSH in the first few steps, you may just need to manually type out `ssh cs15lwi23xxx@ieng6.ucsd.edu<Enter>` for the first time. However, if you have done steps 1-3 religiously, there is a shortcut way to pull up the login command again, simply by pressing the `<up><Enter>` arrow key as it gets the history of all commands done by the user in a specific instance. Since the last command done while logged out of the SSH was the login command, you only need to press the up arrows once instead of a few different times.  
### 5. Clone your fork of the repository into your Github account 
While this has been done before with `git clone [URL]<Enter>`, an alternative way to do this would be to go onto the Github repository for YOUR PERSONAL FORK of lab7/, clicking the `Code` button, selecting `SSH` and hitting the copy symbol next to the password-protected SSH key:  
![Image]()  
This is all under the pretense that the pre-lab preparations were done beforehand that linked Github to your SSH with a key. Now you can execute the command to clone the fork of the repository by typing `git clone <Ctrl + V>` as a way to shorten the process of cloning.  
### 6. Run the tests, demonstrating that they fail
Instead of going through various stages of pressing tab to access the specific JUnit and Hamcrest files needed to run the Tester, I myself prefer to go to Professor Politz' [Week 3](https://ucsd-cse15l-w23.github.io/week/week3/#setuphttps://ucsd-cse15l-w23.github.io/week/week3/#setup) CSE 15L page, click `Setup` on the side bar, scroll down an inch or so, and copy the commands using `<Ctrl + C>` he has located on there. It is important to highlight the commands listed under MAC USERS and that, when you highlight the second line to run the tester, you omit the ending file `ArrayTests` and instead add your own file name, which in this case is `TestListExamples`. However, if you want an even easier time in doing the competition, you can copy and paste the commands that I added below for ease: 
`javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java<Enter>` or simply `<Ctrl + V><Enter>` after it is copied
`java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamples` or simply `<Ctrl + V><Backspace x10>L<Tab><Enter>`. Alternatively, if you did not decide to copy the `ArrayTests` at the end of the command, it is just `<Ctrl + V>L<Tab><Enter>`.  
### 7. Edit the code file to fix the failing test

### 8. Run the tests, demonstrating that they now succeed 
As the commands have already been done before, simply press `<up><up><up><Enter>` to compile the tester once more and `<up><up><up><Enter>` to run the tester once more to demonstrate how it passes now.  
### 9. Commit and push the resulting change to your Github account  
`git add .`  
`git commit -m "Done"`  
'git push`  
