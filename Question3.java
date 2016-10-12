// Question 3, Assignment1 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 24/07/13

import java.util.Scanner;

public class Question3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        int start, end;
        System.out.println("Enter the starting point N:");
        start = input.nextInt();
        System.out.println("Enter the ending point M:");
        end = input.nextInt();
        
		  boolean printed = false;
        for(int i=start; i<= end; i++){
            int k = i;
            int holder = 0;
				
            
            while(k > 0){           //creates possible palindrome
                holder += k%10;
                k= k/10;
                if (k>0)
                    holder *= 10;                
            }
            
            int square;
            
            if (holder == i){                   // checks if its a palindrome and finds the square root
                square = (int) Math.sqrt(i);
                if ((square*=square) == i){					       //checks if its a perffect square
					 		
							if(printed == false)
								System.out.println("The palindromic perfect squares are as follows:"); 
							printed = true;           
						  System.out.println(i);
					 }
                
            }
        }
        
                
    }


}
