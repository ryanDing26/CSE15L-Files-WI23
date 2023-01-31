# Lab Report 2 (Week 3)  
## Part 1: StringServer + Code
![Image]()  
### Usages
#### Sample 1: /add-message?s=Ryan  
![Image]() 
What this did is that it added my name, Ryan, to the array of messages present within the code  
#### Sample 2: /add-message?s=1234  
![Image]()  
While appearing to be an integer instead of a string value, it actually reads the number 1234 as the string literal, "1234"

## Part 2: ArrayExamples and ArrayTests Case Analysis  
This section will go over the ArrayExamples and ArrayTests files provided to us in the lab3 repository, and will go over the various inputs, tweaks, and test methods that were present for the reverseInPlace function
Failed tests for reverseInPlace:  
Checks the reverseInPlace function with both an even and odd-length array;  
Failure-inducing inputs: the length 4 and length 3 input1 array in both test methods:  
```
@Test
public void testReverseInPlaceEven() {
  int[] input1 = { 1, 2, 3, 4 };
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input1);
}

@Test
public void testReverseInPlaceOdd() {
  int[] input1 = { 1, 2, 3 };
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{ 3, 2, 1}, input1);
}  
```  
Not a failure-inducing input: the length 1 input1 array in the following test methods:  
```
@Test
public void testReverseInPlace() {  
  int[] input1 = { 3 };  
  ArrayExamples.reverseInPlace(input1);  
  assertArrayEquals(new int[]{ 3 }, input1);
}
```  
Symptoms of the testReverseInPlace (No failures):  
![Image](./images/test1.jpg)  
Symptoms of the testReverseInPlaceEven and testReverseInPlaceOdd (failures):  
![Image](./images/test2.jpg)  
**Why the failure-inducing inputs failed (expected vs actual values)**: For testReverseInPlaceOdd, the 
The only test that was able to pass with the initial code was testReverseInPlace, whereas the other test methods produced an error in the way that the expected value, being the content of the array, was not the actual value upon the methods being called.
Code before changes were made to fix it:  
```
static void reverseInPlace(int[] arr) {
  for(int i = 0; i < arr.length; i += 1) {
    arr[i] = arr[arr.length - i - 1];
  }
}
```  
Code after it was fixed:  
```
static void reverseInPlace(int[] arr) {
  for(int i = 0; i < arr.length / 2; i += 1) {
    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;
  }
}
```  
**What was done to fix it**: A temporary integer variable in the loop of the function was created to capture arr[i] before arr[i] was reassigned to the value of arr[arr.length - i - 1], since then the original arr[i] value will not be overwritten/lost.  Additionally, the loop was stopped halfway through the length of the array instead of iterating through the entire array, so that the array does not end up being the same as it was initially at the end.  

## Part 3: Learning Outcomes  
For me, I was entirely new to the concept of servers, and fairly new to JUnit testing of code. In fact, the first that I had heard of it was the course that we were required to concurrently enroll in with CSE 15L, CSE 12, this quarter. In terms of other things that I learned, working with GitHub Desktop for the first time was really nice, as I did not know it would be so easy to commit and push changes to my code in repositories to the website. The servers were the most interesting part of these past two weeks, and I hope that I am able to work more with them in the future as they are loads of fun to play with in general.  
# Happy Coding
