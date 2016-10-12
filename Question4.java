// Question 4, Assignment 1 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 24/07/13


public class Question4 {
    public static void main (String [] args){
        int n1 = 5;
        int n2 = 15;
        int n3 = 20;
        int n4 = 10;
        
        int m1, m2;
        int max;
        
        m1 = Math.max(n1, n2);      //finds the max between n1 and n2
        m2 = Math.max(n3, n4);      //finds the max between n3 and n4
        
        max = Math.max(m1, m2);     //finds the overall maximum
        
        System.out.println(max);
    }

}
