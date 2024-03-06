/*
  Don't be afraid, just the solution looks too big, but in real it is 
  just okay!! 
  Let's dive into it. 
  We first create a two pointers, both at the startin positon of respective arrays
  We then iterate the look until either p1 or p2 reaches the end (while(p1<a.length && p2<b.length)
  Now we compare the elements at the pointer and keep pushing and moving the pointer as per the comparision. 
  The importatnt point to note here is that while comparing we keep on checking if the last element in 
  the List is equals to the element we are going to push or not or if the element size is zero. 
  Doing this we remove the duplicate.
  Now we know that we have iterated through either Array1 or Array2
  So we will push the remaining elements in the list by last two while loops! (Think about it)
  Time complexity - O(N)
  Space complexity - O(N)
*/

import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> newList = new ArrayList<>();

        int p1=0;
        int p2=0;
        while(p1<a.length && p2<b.length){
            if(a[p1]>b[p2]){
                if(newList.size()==0 || newList.get(newList.size()-1)!=b[p2]){
                    newList.add(b[p2]);
                }
                p2++;
            } else{
                if(newList.size()==0 || newList.get(newList.size()-1)!=a[p1]){
                    newList.add(a[p1]);
                }
                p1++;
            }
        }

        while(p1<a.length){
            if(newList.size()==0 || newList.get(newList.size()-1)!=a[p1]){
                newList.add(a[p1]);
            }
            p1++;   
        }
        while(p2<b.length){
            if(newList.size()==0 || newList.get(newList.size()-1)!=b[p2]){
                newList.add(b[p2]);
            }
            p2++;
        }
        return newList;
    } 
}
