## Understanding the Problem

To solve this problem we need to understand what the problem is.

We can ask some question to the interviewer. Also, we can think on some examples to clearly understand to problem and address it.
Maybe some of this question's answers may given you during the description of the problem. But some times they don't give this. They expect you figure it out.

For example when I read the problem this questions come to my mind:  

1) Can a word appear twice in the words array? 
   Yes.
2) Is there any order between word1 and word2? For example, is word1 must be appeared before word2?
   No.
3) Should the min length of the word must 2? 
   Yes.
4) Is words[i] consist of only English letters? Are they lowercase or uppercase?
   Consist of lowercase English letters. 
   When we solve the problem this question actually is not that important but it is good practice to think about these.
5) Are word1 and word2 equals?
   No, they not.

Okay. Let's get look at some examples. 

Example 1: 

words = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"];

word1 = "fox";
word2 = "dog";

We need to determine where is the fox? To find fox we have to iterate over the array and check every word is equal to fox or not. 

fox is in the 3rd index. 

We need to do the same thing for dog. So we found dog's index as 8. 
Shortest distance between them is |8-3| = 5.

Example 2: 

words = ["a", "c", "d", "b", "a"];

word1 = "a";
word2 = "b";

When we do the same approach for this example we found out a have two indices  -> 0 and 4.
b is 3. 

So we have to think about which distance is shortest is |0-3| or |4-3|. Obiviously second one. 
This example show us we have to think maybe there is better distance. Because of this when we find another indices for word1 and word2 we have to recalculate shortest distance.

### Algorithm: 

During all this examples we understand these :
- we have to iterate through the list. 
- we have to declare two pointers the track the positions 
- whenever we find one of these words in the list we'll update the pointer
- if both pointer updated we have to calculate shortest distance

### Time and Space Complexity

1) Time Complexity:
   We have only one loop, and we iterate through the list. Loop runs once for each elements. Because of that complexity is O(n). n is the number of elements in the words array.
2) Space Complexity: 
   We used 3 fixed number of integer variables, and temporary string variable word. These are consume a constant amount of space regardless of the input size.
   So, complexity is O(1).



