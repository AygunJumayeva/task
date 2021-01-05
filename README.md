# task
task-interview
Note: This is Maven project, all needed dependencies are in pom xml file.
mvn -Dtest=jUnitTests.java 

Task requirements:
Create a class with a method to return the length and longest words in a sentence.
for example: "The cow jumped over the Moon", should return 6 and "jumped"

"Main" and "longestWords" methods created to run this task.

In order to test "longestWords" method I am using jUnit.
Below are the test cases that we need to make sure my code works as supposed:
1. After the input the "longestWords" method splits it to words by blank spaces, selects the longest word and prints its length and the word itself;
2. If the input is empty(""), it must print this result: 0, "";
3. If the input consists of 1 word, then the result must be: the length of that word and the word itself;
4. If the input has 2 or more same length longest words, then as a result each of that words with the same length must be printed;
5. If the input has all the words with the same length it prints each word with the same length.
6. If the input consists of just 1 blank space, then the blank space and the 1 must be printed.


****Assumption:
When input equals to "null" value on method itself: It will return empty ("") string and we will throw "NullPointerException".
It can be handled by try-catch blocks.


****Usually Unit tests are done by developers in my company.
