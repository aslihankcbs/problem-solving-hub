## Solution: Pair with Target Sum


When I read this problem I immediately think about these questions:
- What is the min size for array length? I think it must be 2 lol :D (Of course 2.  Just kidding )
- Is there more than one valid answer? (No)

Okay. We got answers. So let's get focus on some examples.


Input: [1, 2, 3, 4, 6], target=6

Output: [1, 3]

Our target is 6. Starting at the beginning we have to calculate what we need when we decrease the first number.

6 - 1 = 5 -> we need five. The array is sorted. Because of this we can search for 5 with binary search algorithm. 
But this algorithm complexity will be O(nlogn). Can we do better than O(nlogn). Yes !!

If we use two-pointers approach we can achive O(n) time complexity. How? Let's get find out!

### Algorithm
* Start with the one pointer at the beginning, and another pointer at the end. 
* As I said we'll use two pointers pattern. So we need two pointers :) Declare start and end pointers variables. These variables are our indices about pair.
* In every step check these pointer's sum is equal to the target sum. 
  * If they return these pointers indices.
  * If they don't we have two options. 
    * If sum of the two pointers is greater than target sum, decrement end pointer. 
    * If sum of the two pointers is smaller than the target sum, increment the start pointer.
* If we can't find  any pair return -1, -1. 

### Time and Space Complexity


#### 1) Time Complexity

When we check through the start and end of the array we will reach O(n) time complexity.
Because while loop runs as long as left is than right. In the worst case, this loop iterates over all elements of the array. 
So this makes O(n) complexity, n is the number of elements in the array. 

#### 2) Space Complexity

Algorithm uses a fixes amount of extra space for pointers and sum. These variables are not depend on the size of the input array because there is additional data structures are used that grow with the input size.
So, the space complexity is O(1),  constant space.