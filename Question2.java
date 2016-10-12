// Question2, Assignment1
// Name: Nelson Kadama
// Student Number: NLSANG001    
// Date: 24/07/13


public class Question2 {
    public static void main (String [] args){
        int num1 = 5;
        int num2 = 15;
        int num3 = 10;
        int smallest = 0;
        int highest = 0;

        if ((num1 <= num2) && (num1 <= num3))
        {
                smallest = num1;	
        }
        else if ((num2 <= num1) && (num2 <= num3))
        {
                smallest = num2;
        }
        else if ((num3 <= num2) && (num3 <= num1))
        {
                smallest = num3;
        }


        if ((num1 >= num2) && (num1 >= num3))
        {
                highest = num1;	
        }
        else if ((num2 >= num1) && (num2 >= num3))
        {
                highest = num2;
        }
        else if ((num3 >= num2) && (num3 >= num1))
        {
                highest = num3;
        }

        if ((num1 > smallest) && (num1 < highest))
                System.out.println(smallest + " " + num1 + " " + highest);	
        else if ((num2 > smallest) && (num2 < highest))
                System.out.println(smallest + " " + num2 + " " +highest);
        else if ((num3 > smallest) && (num3 < highest))
                System.out.println(smallest + " " + num3 + " " +highest);

    }
    
}
