package com.test.examples;

public class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 76;
        char grade;
        int compare1 = 90;
        int compare2 = 80;
        int compare3 = 70;
        int compare4 = 60;

        if (testscore >= compare1) 
            grade = 'A';
          else if (testscore >= compare2)  
            grade = 'B';
          else if (testscore >= compare3) {
            grade = 'C';
        	System.out.println("can i print this statment: " + grade + ' '  + testscore);
        	testscore = 90;
        	//System.out.println("can i print this statment: " + grade + ' '  + testscore);
        	//testscore = 76;
        	}
        else if (testscore >= compare4)  
            grade = 'D';
          else 
            grade = 'F';
         
        System.out.println("Grade = " + grade);
    
        
        if (testscore == 90)
        	grade = 'D';
        
        System.out.println("Grade = " + grade);
    }

    
    
    
}

