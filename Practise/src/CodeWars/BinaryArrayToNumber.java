//Given an array of one's and zero's convert the equivalent binary value to an integer.

//Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    	Collections.reverse(binary);                             // reverse the list coz converting to decimal takes from right
    	//System.out.println(binary);
    	double num = 0;
    	int pow = 0;
    	for(Integer ele : binary) {         // for each loop
    		num = (num + (ele*Math.pow(2, pow)));   // ele * 2^ pow
    		pow++;
    	}   
    	
    //	return binary.stream().reduce((x, y) -> x * 2 + y).get(); // understand this single line soln
    //	https://www.sitepoint.com/java-8-streams-filter-map-reduce/
    // https://stackoverflow.com/questions/53446884/solution-of-the-binary-to-integer-code-through-stream-api-explanation
    	return (int) num;
        
    }
    
    public static void main(String[] args) {
    	Integer [] binary = new Integer[] {1, 0, 1, 1};             // array ofIntegers
    	List <Integer> nums = Arrays.asList(binary);            // convert to list 
    	System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(nums));    // since static method can , call without ibject
    }
}