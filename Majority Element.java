/*
  Brute Force Solution. 
  Time and Space Complexity - O(N)
*/
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> countFreq = new HashMap<>();
        for(int i=0; i<n; i++){
            countFreq.put(nums[i],countFreq.getOrDefault(nums[i],0)+1);
        }
        for(Integer i: countFreq.keySet()){
            Integer freq = countFreq.get(i);
            if(freq>n/2){
                return i;
            }
        }
        return -1;
    }
}

/*
  Time and space complexity trade off. 
  Better Solution
  Time complexity - O(N log N)
  Space complexity - O(1)
*/
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
        
    }
}

/*
    Optimal Solution
    Time complexity-O(n)
    Space complexity-O(1)

    Moore's Voting Algorithm 
    This is a super intuative algorithm, it almost feels like a magic at first.
    Black magic tbh lol.
    I am not sure how to even make myself understand this in words but let me take a shot.
    This algorithm only works if there exists a majority element (imp)
    So we will start by assuming that the first element is the majority element.
    Then we will check the the next element is the majorityElement that we assigned
    then count++
    else count--
    If the count reaches 0
    Then we will reassign the majority element the next element and again increase the counter by 1
    We will do this until we reach the last element.
    And thus we will get our majority element. 

    Yes, it sounds strange but it actually works.
    The intuition behind this algorithm is that.
    We kind of cancel our the non-majority element by until we reach counter=0
    And then we restart! 
    umm suppose in the below array
    (2),2,1,1,1,2,2
    ME = 2
    count = 1

    2,(2),1,1,1,2,2
    Me=2
    count=2

    2,2,(1),1,1,2,2
    Me=2
    count=1

    2,2,1,(1),1,2,2
    Me=
    count=0
    Now, that we have reached the count 0
    we know that the whatever majority element we assumed occured n times
    And by decreasing the pointer we know that this element has also occured n times
    since the counter is zero. (Basically we cancelled out)
    So no point in chasing this element. 
    Let's make the new element as our majority element and re-calculate

    2,2,1,1,(1),2,2
    Me=1
    Count=1

    2,2,1,1,1,(2),2
    Me=1
    count=0

    2,2,1,1,1,2,(2)
    Me=2
    count=1

    We reached the last element: Our majority element is 2. 

    This algorithm also works because say in an array of 7 element. 
    Majority element will occur 4 times and non-majority 3 times.
    By using our above algorithm, the 4 majority elements would anyhow cancel
    the 3 non-majority element and still win.

    Think about it, I am still not able to make it understand it in words. 
    Since it is a super intuative algorithm. Learn it. Revise it. Conquer it.
 */
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; 
        int majorityElement = 0;
        for(int num: nums){
            if(count==0){
                majorityElement=num;
            }
            if(num==majorityElement){
                count++;
            } else{
                count--;
            }
        }
        return majorityElement;
        
    }
}

