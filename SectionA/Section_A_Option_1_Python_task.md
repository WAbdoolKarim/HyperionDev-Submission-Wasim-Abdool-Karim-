## HyperionDev Freelance Code Reviewer Take-Home Test
# Section A, Option 1: Python task

```python
1 class Solution:
2        def groupAnagrams(self, strs):
3      result = {}
4      for i in strs:
5         x = "".join(sorted())
6         if x in result:
7            result[x].append(i)
8         else:
9            result[x] = [i]
10      return list(result.values())
11 ob1 = Solution()
12 print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
```

This program has great structure: Making the program as a class with functions that perform the necessary logic makes it easy to expand the program and incorporate it into other projects without much refactoring. 
However, without any comments describing how your code works and what it needs to work, it becomes much more limited in its reusability. To add a comment in python all you need is a '#' at the start of the line:

```python
1 #This is a comment and won't be compiled as part of the program.
```
The element iterator for loop on line 4 is a good simple way to extract the elements individually from the array though in future you may want to use "word" or "element" instead of "i" since they are more descriptive of the data stored in this variable. 

Python is a very sensitive language when it comes to indentation spacing and there are some inconsistencies that prevent your code from running correctly even if the logic is sound. Line 2 needs to be unindented here in order to properly capture the logic below within the function.

```python
1 class Solution:
2    def groupAnagrams(self, strs):
3      result = {}
4      for i in strs:
5         x = "".join(sorted())
6         if x in result:
7            result[x].append(i)
8         else:
9            result[x] = [i]
10      return list(result.values())
11 ob1 = Solution()
12 print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
```

Unfortunately your code has another error that prevents it from executing.
Without a variable or array specified for the sorted function in line 5 your code will not execute. Since there are no comments to describe what argument should be present here I tested the program with "strs", "result" and "i", the last of which made your program function correctly. 
This is an example of where a comment will be very useful. We can use comments to indicate to users how code should be run and with which parameters it should be run with.

```python
1 class Solution:
2    def groupAnagrams(self, strs):
3      result = {}
4      for i in strs:
5      #x sorts the letters in the current word in the array, alphabetically, and converts it to String
6         x = "".join(sorted(i))
7         if x in result:
8            result[x].append(i)
9         else:
10            result[x] = [i]
11      return list(result.values())
12 ob1 = Solution()
13 print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
```

Now that we've addressed your logic and structure there is a critical feature missing from your code that should not be complex to implement from here. Your program should take inputs dynamically, that is instead of having the array written in the code you should be able to take an input from the user through the command line, or a UI for a more advanced version. A combination of the input() method and split() method will be able to take a list of words from the user and store them as an array for your program to process. input() records the entered values as a string, and split() converts it into an array separating on whitespace by default.

```python
1 class Solution:
2    def groupAnagrams(self, strs):
3      result = {}
4      for i in strs:
5      #x sorts the letters in the current word in the array alphabetically and converts it to a String
6         x = "".join(sorted(i))
7         if x in result:
8            result[x].append(i)
9         else:
10            result[x] = [i]
11      return list(result.values())
12 ob1 = Solution()
13 strings=input("Enter the words: ").split()
14 print(ob1.groupAnagrams(strings))
```

Once you can take in a user input I believe your program is perfect with good efficiency since it only iterates through the array once. 
