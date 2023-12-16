### Approach: Two Pointers

Initialize two pointers, one pointer (left or first) pointing to the left end of the input string and the
other pointer (right or last) pointing to the right end of the string.

We have to initialize left pointer to 0 and keep incrementing it until get a vowel. And we initialize the 
right pointer to the last index and keep decrementing it until it points to a vowel.  
When each pointer are pointing to the vowel, we would swap the characters at these pointers. 

#### Algorithm 

1) Initialize the `left` pointer `start` to `0`, and the `right` pointer `end` to `s.size() - 1`.
2) Keep iterating until the left pointer catches up with the right pointer:
   1) Keep incrementing the left pointer start until it's pointing to a vowel character. 
   2) Keep decrementing the right pointer end until it's pointing to a vowel character. 
   3) Swap the characters at the start and end. 
   4) Increment the start pointer and decrement the end pointer.
3) Return the string `s`.



#### Complexity Analysis

##### Time Complexity: O(N)
Left and right pointers will only traverse the index once. Each element of the string s will be iterating 
only once either the left pointer or right pointer or not both.

Swap will take O(1).
So, total complexity will O(N).

##### Space Complexity: O(N)
Have to convert string s to char array. This will take O(N).