# interview-programs
Here I am sharing the program which was asked to me in the Interview (I am writing the programs in java )

# 1
"abdacf" and "jhdashf" => Find the first duplicate alphabet in this string (write an efficient program).

# 2
1. My name is Rajat Arora => (Without using inbuild functions)
	String str = "My name is Rajat Arora";
	1. arora tajar si eman ym (Without using any inbuilt method)
  2. My name is Rajat Arora
      My name is Rajat
        My name is
         My name
          My
  3. My name is Rajat Arora
-    Arora Rajat is name My (Rajat is name my)
   	 My name is Rajat (Name is Rajat)
   	 Rajat is name (Is name)
   	 name is (Name)
	   is
  4. yM eman si tajaR arorA 

# 3
WAP to print a fabonocci series (only logic).

# 4
WAP to find the count of repeatative charactor in a string 
	e.g. "Ashish" => A-1, S-2, H-2, i-1
  
# 5
WAP to find the list of duplicate number from the array means 
	{2,3,1,5,3,2,3,5,4} => {2,3,5}
  
# 6
[1,0,1,0,0,1,0,0,1,0]
Suppose this is an array you have to convert this Array to [0,0,0,0,0,0,1,1,1,1]
Write the code.

# 7
If the interview is on system then you need to prepare this types also. 
	*****
	   ****
	      ***
	         **
	            *
	         **
	      ***
	   ****
	*****
 
# 8
 Write a function "int remdup(int a[], int n)", which takes an array 'a[]' and its size 'n' as arguments and will remove all the duplicates from the array. The function will return the number of elements in the array after the duplicates have been removed. Do not use any extra array. 
Ex. If the array contains {1,2,1,2,1,3,3,5,6,1,4} then the function should change the array to {1,2,3,5,6,4} and should return 6 as its value 

# 9
Write a function "int maxPos(int x)" to find out the position of the largest digit in a given number. The position is to be counted from the left. You can assume 'x' is the positive integer. 
Ex. If x is 3482 then the function should return 3, Because the largest digit 8 is at the 3rd position from the left

# 10
Check that string is palindrome or not. Do not use extra array. 
Ex. "deed", 383

# 11
Write a function "int decSeq(int a[], int n)" to find the length of the longest decreasing sequence in a given array, where 'a[]' is the array and 'n' is the number of elements in the array.
Ex. If the contents of the array is {5,8,4,3,2,10,9,7,5,3,12,2}, then the longest decreasing sequence is {10,9,7,5,3}

# 12
Write method definition where a-array, n-no of elements in the array.
void reverse(int a[], int n) {

}

# 13
Write method definition where a-array, n-no of elements in the array, num = number to be inserted, pos=Postion at which num has to be inserted.
int[] insertAt(int a[], int n, int num, int pos) {

}

# 14
Write a program to find whether duplicate number exists in an array. 
int findDuplicate(int a[], int n) {

}

# 15
Write the logic to check palindrome number if the input is a INTEGER.

# 16
Write the logic of Armstrong Number ?

# 17
Suppose you have this type of string "3+1+5+2+4+7+6".
So WAP a program to print this string into ths form "1+2+3+4+5+6+7".

# 18
WAP that takes a single String parameter and returns a new Sstring with each whitespace block in the string replaced with a single * character. Non-space characters are  unchanges, The functions should change the string in place, Thus if string str is 
"Hey , r u free now?"
Then a call to replaceSpace(str) should return
"Hey*,*r*u*free*now?".

# 19 
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [-1, -3], the function should return 1.

# 20
Days of the week are represented as three-letter strings
("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun").

Write a function 'solution' that, given a string S representing the day of the week and an integer K(between 0 and 500 , inclusive), returns the day of the week that is K days later.

For example, given S="Wed" and K=3, function should return "Fri".

S="Sat" and K=23, the function should return "Mon"

# 21
Given an array arr[] of size n containing integers. The problem is to find the length of the longest sub-array having sum equal to the given value k.

Find a longest sub array and sub array element value should be equal to 25
int [] a = {2,4,5,9,11,21,4};
int n = 25;

# 22
Write a program to reverse a string using recursion function 

# 23
Write a program to find the most repetitive character in a string?

# 24
Write a program to calculate number of characters in a string without space?

# 25
String a = "hii how are you, Rishabh!!";
// W.a.p to reverse the words in a string and print it, by removing all the special chars.
Sample Output: Rishabh you are how hii

# 26
First question was if given string in c++ variable format then we have to convert it in Java variable format and vice-a-versa as per the input string (Rename input variable name from c++ to java and vice-versa)
ex:- If name is First_variable then convert it to FirstVariable.

# 27
Second given a string we have to find the frequency of each character in alphabetical order and return output string as alphabet and the frequency egcabbage -> a2b2c1e2g2 (Count the letter in the string and provide in proper format)
ex:- Input- babacbd then Output is – a2b3c1d1

# 28
Third question was given input1 as n and input 2 to as array of integer of length n, We have to iterate through the array and find if any number is greater than n by two times occurring in the array if yes then the output is the number else return -1 (Return the letter which is repeated more then half times else return -1)


