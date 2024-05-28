import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){

        // random number 1 - 4
        System.out.println((int)(Math.random()*2 + 1));
	
		// Declare 5 different data types with initial values
        int x = 5;
        
        
		// A standard for loop printing a message three times
        
		
		// A for-each loop traversing a String[array]
		
		// An infinite loop
        while(true){
            
			// a short-circut conditional with four tests
            if(5 > 1 || 5 < 1 || false || true == false){
                
                // Break a loop if a conditional passes
                break;
                
            } // closes conditional 
        } // closes loop
		
		// Loop through each char in a String
        String butters = "Boy howdy!";
        for(int i = 0; i < butters.length(); i++){
            System.out.println(butters.charAt(i));
            System.out.println(butters.substring(i, i+1));
        }

        // print a string backwards
        for(int i = butters.length()-1; i >= 0; i--){
            System.out.print(butters.charAt(i));
        }
        System.out.println();
				
		// Print only the first three letters in “word”
        System.out.println("word".substring(0, 3));
        
		// Print all the odd numbers from 1 - 100
        for(int n = 1; n <= 100; n++){
            if(n % 2 == 1) System.out.println(n); 
        }
		
		// Create a Scanner and take an input
        Scanner s = new Scanner(System.in);
        int countDown = s.nextInt();
        
		// Create a Scanner, take a number, and count down from that number to 0
        for(; countDown > -1; countDown--){
            System.out.println(countDown);
        }

        System.out.println(isGreaterThan5(7000));
	}
	
	// Create a method that returns a comparison (include a JavaDoc comment)
    /**
    * Returns a boolean on whether or not the given number is greater than five
    */
    public static boolean isGreaterThan5(int num){
        return num > 5;
    }
	
}