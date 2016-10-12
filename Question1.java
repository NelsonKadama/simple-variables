// Question 1, Assignment 1
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 24/07/13


public class Question1 {
    public static void main (String [] args){
        int x = 760;
	int y = 3000;
		
        int z, hours, minutes, seconds, remainder;
		
        z = x+y;;
        hours = z/3600;
        remainder = z%3600;
        minutes = remainder/60;
        seconds = remainder%60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

    }
          
    
}