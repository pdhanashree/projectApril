package Assignment;
//an Armstrong number of three digits is an integer such that the sum of the the cubes of its digits is equal total number itself

public class armstrongnum {
public static void main(String[] args) {
	int number=153,originalnumber,reminder,result=0;
    originalnumber=number;
    
    while(originalnumber !=0) {
    	reminder=originalnumber % 10;
    	result +=Math.pow(reminder, 3);
    	originalnumber /=10;
    	
    }
    if (result==number)
    	System.out.println(number + "  is an armstrong number.");
    else
    	System.out.println(number + "  is not an armstrong number.");
}
}
