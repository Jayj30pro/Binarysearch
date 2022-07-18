/*Project: Binary Search Algorithm
 *Author: Jason Jacobs
 * Course: CPT307 Data Structures & Algorithms
 * Instructor: Dr. J. Reichard
 * Date: July 19, 2022
 */

import java.util.*;

public class BinSearch
{
    public static void main(String[] args) {
        // add numbers to check
        int [ ] numbers = {5,10,15,20,25,30,35,40,45,50,55,60,65,70};
        // set halfway point
		int srcPoint = numbers.length/2;
        //create pointers for each search
        int a = srcPoint;
        int b = srcPoint;
        // numbers the search will try to find
        int entry1 =17;
        int entry2 = 45;


        // check first entry 
        if (numbers[a] > entry1) {
            // start at midpoint and move down the list
            while (a > 0){
                //reduce index entry by 1
                a--;
                if (numbers[a] == entry1) {
                    System.out.println(entry1 +" Was found");
                    //stop loop because entry is found
                    break;
                }
                if (a == 0){
                    //end of list 
                    System.out.println(entry1 + " Was not found");
                    
                }
            }
        } else {
            // if entry is the midpoint this will retrun found
            if (numbers[a] == entry1) {
                System.out.println(entry1 +" Was found");
                // chang vaiable value to prevent while loop from running
                a = numbers.length-1;
            }
            while (a != numbers.length-1){
                // index entries are 1 less than the total length
                a++;
                if (numbers[a] == entry1) {
                    System.out.println(entry1 +" Was found");
                    //stop loop because entry is found
                    break;
                }
                if (a == numbers.length-1){
                    //end of list 
                    System.out.println(entry1 + " Was not found");
                    
                }
            }               
        }
        // Check second entry
        if (numbers[b] > entry2) {
            // start at midpoint and move down the list
            while (b > 0){
                //reduce index entry by 1
                b--;
                if (numbers[b] == entry2) {
                    System.out.println(entry2 +" Was found");
                    //stop loop because entry is found
                    break;
                }
                if (b == 0){
                    //end of list 
                    System.out.println(entry2 + " Was not found");
                    
                }
            }
        } else {
            // if entry is the midpoint this will retrun found
            if (numbers[b] == entry2) {
                System.out.println(entry2 +" Was found");
                // chang vaiable value to prevent while loop from running
                b = numbers.length-1;
            }
            while (b != numbers.length-1){
                // index entries are 1 less than the total length
                b++;
                if (numbers[b] == entry2) {
                    System.out.println(entry2 +" Was found");
                    //stop loop because entry is found
                    break;
                }
                if (b == numbers.length-1){
                    //end of list 
                    System.out.println(entry2 + " Was not found");
                    
                }
            }               
        } 

	}
}

