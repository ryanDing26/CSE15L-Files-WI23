# Remotely Accessing a Course Specific Account on `ieng6`  
## Lab Report 1 | Ryan Ding  
> 10-15 minutes  
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
- Make sure that you have a valid CSE 15L account from Educational Technology Services by going to [this](https://sdacs.ucsd.edu/~icc/index.php) link:  
![Image](https://github.com/ryanDing26/cse15l-lab-reports/blob/23d554e008ee5cd850d088ca3390d46d66b5c796/ets%20snippet%201.png)      
- Looking up your account:  
![Image]()  
- Make sure that you have an account under the title of **cs15l**_xxxxyyy_, where _xxxx_ signifies the term you are on (for instance, the winter 2023 quarter would be _wi23_) and _yyy_ signifies your unique student login.   
#### Resetting your password  

***
### 3. Remotely connect to the server via the integrated terminal!  
At this point, everything should be functional and setup correctly. If anything, the only thing that should potentially be dysfunctional is your CSE 15L account, in which case you would need to [reset your password](). The protocol is rather lengthy to 

Moving on, open an integrated terminal by clicking Terminal:  
![Image]()  
Then selecting New Terminal:  
![Image](https://user-images.githubusercontent.com/110417507/212788519-076e36d4-2c84-45fd-91d8-a1466d454443.png)
After the terminal window is open, there are a few things that need to be done to use Git Bash, which is required to connect to the Secure Shell. 

After all this, type `ssh [username]@ieng6.ucsd.edu` in order to enter the Secure Shell.  
- If this is your first time doing such a connection, you will then be prompted with a question asking if you would like to continue to connect, to which you should type `yes` to.
Finally, enter the password that you created for the _cs15lxxxxyyy_ Educational Technology Services account in order to enter the Secure Shell.  
- Note that keys you type will not show up on the screen as an added security measure; make sure you type your password in precisely!  

Congrats, you are now inside the Secure Shell; you may now enter in a variety of commands that you would like to use! Here is a sample of some commands I used:  
![Image]()  

