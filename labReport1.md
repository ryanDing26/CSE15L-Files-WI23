# Remotely Accessing a Course Specific Account on `ieng6`  
## Lab Report 1 | Ryan Ding    
### 1. Install Visual Studio Code onto your computer!  
This can be done rather easily by going to the [Visual Studio Code](https://code.visualstudio.com/download) website and downloading the software onto your computer. Remember to choose the version appropriate to your computer's operating system. For the sake of this tutorial, it will mainly be regarding the Windows installation of VS Code.  
<br>
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/78fec84bbebd8b05e4fab12089531a517bcc4a4d/vsc%20dl%20screen.JPG)    
### 2. Install Git onto your computer!  
Again, this step is insanely simple in the fact that all you need to do is install a software called [Git](https://gitforwindows.org/) at that link. This step is mainly needed for Windows users. Simply click the download button and go through the steps needed to install the software on your device of choice!  
<br>
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/364b1c4b5e5db4a453a6e2201594d8a5dbaa5458/git%20snippet.png)  
***
#### Before continuing ahead...  
- Make sure that you have a valid CSE 15L account from Educational Technology Services by going to [this](https://sdacs.ucsd.edu/~icc/index.php) link and looking up your account:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/23d554e008ee5cd850d088ca3390d46d66b5c796/ets%20snippet%201.png)      
- Make sure that you have an account under the title of **cs15l**_xxxxyyy_, where _xxxx_ signifies the term you are on (for instance, the winter 2023 quarter would be _wi23_) and _yyy_ signifies your unique student login.   
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/eb75c84b432c15800c0a486342d966a5cfa29abb/ets%20snippet%202.png)
#### Resetting your password  
If your login information does not work later on in this tutorial, more specifically at the point where entering your password into the terminal does not work, consider resetting your password:  
1. Click on the cs15lxxxxyyy user to select that ETS account (by default, your general, all-purpose ETS should be selected; make sure to do this!)
2. There should be a yellow popup with a password reset option; Click it and fill it out; Select `No` for __Change my TritonLink Password?__
3. Instead of clicking the `Check Password` button at the bottom of the screen, make sure that your cursor is active in the _Confirm Password_ text box and click `Enter`; your password should be updated within 15 minutes!
***
### 3. Remotely connect to the server via the integrated terminal!  
At this point, everything should be functional and setup correctly. Now we can move on to accessing the SSH, or the Secure Shell
<br>
Open an integrated terminal by clicking Terminal:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/e65307456bc38ddcf2ac02c826d2df247d4539f6/terminal1.png)  
Then, select New Terminal:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/43a56b480a4cefe538a7d4998474cefd1f5d5f7d/terminal2.png)  
<br>
After the terminal window is open, there are a few things that need to be done to use Git Bash, which is required to connect to the Secure Shell. Click the dropdown arrow next to the plus sign to show the various terminal options, and select Git Bash:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/e6b152ad20bc0eef59abb5e1f520256caf968845/terminal5.png)  
Ensure that the terminal selected is __NOT__ PowerShell, but rather Git Bash, so that a screen like this pops up:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/3f913eeefa381f644a7b47d688a71a339b0950bb/terminal4.JPG)  

After all this, type `ssh [username]@ieng6.ucsd.edu` in order to enter the Secure Shell.  
- If this is your first time doing such a connection, you will then be prompted with a question asking if you would like to continue to connect, to which you should type `yes` to.  

Finally, enter the password that you created for the _cs15lxxxxyyy_ Educational Technology Services account in order to enter the Secure Shell.  
- Note that keys you type will not show up on the screen as an added security measure; make sure you type your password in precisely!  

Congrats, you are now inside the Secure Shell! You should see this screen:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/5e1d2f0785f0630f8f5041759604ee68eb660a79/terminal3.JPG)  
You may now enter in a variety of commands that you would like to use! Here is a sample of some commands I used:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/56a69f044f3aa59723b81dff10841596dac07d45/command1.png)  
> Context: I first ran ls -lat to list the -lat path. Then, I changed the directory from my personal directory to the parent directory, cs15lwi23, using “..” (this changes the current directory to that of the parent directory). I then printed the working directory to the terminal to check it, and then tried to access my lab group member's directory from my terminal, which did not work, as anticipated, since I did not have the permission. Finally, I changed the directory back to my own personal one and then printed the working directory out the final time to check my changes.  

Here are some interesting commands that you can start out with:
- `cd`: changes the directory of the user  
- `ls <directory>`: lists all the files in a directory; if no directory is stated, it will list the current directory  
- `cat <directory>`: prints all files in the directory specified to the terminal  

# Happy Coding!
