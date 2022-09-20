package com.miniproject.grpp;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question {
	
	 int correctAns = 0;
	 int wrongAns = 0;
	 
	
	
	public void m1() {
		
		Scanner sc = new Scanner (System.in);
		
		   System.out.println("Enter Your Student Name");
		    
		   String Name = sc.next();
		   
		   
		   Quizz q1 = new Quizz ("Q )Who invented java languge ? "," A) James Gosling"," B) Isaac Newton", " C) Galilio", " D) Stfen Hawkins");
		   Quizz q2 = new Quizz ("Q )which of following not feature of java ?"," A) Dynamic "," B) Architecture Neutral ", " C) Use of Pointers ", " D) Object oriented");
		   Quizz q3 = new Quizz ("Q )Which is used to find and fix the bug in java"," A) jvm "," B) JRE ", " C) JDK ", " D) JDB ");
		   Quizz q4 = new Quizz ("Q )What is return type of hashcode() method of object class"," A) Object "," B) int ", " C) Long", " D) Void ");
		   Quizz q5 = new Quizz ("Q )What does the expression float a 35/0 return "," A) 0 "," B) Not a number ", " C) Infinity ", " D) Run time exception ");
		   Quizz q6 = new Quizz ("Q )What is output of program when x=5,y=6  x+y = ??"," A) 11"," B) 1", " C) 10", " D) 12");
		   Quizz q7 = new Quizz ("Q )Which of package contains the scanner class "," A) java.util.package"," B) java.lang.package", " C) java.awt.package", " D) java.io.package");
		   Quizz q8 = new Quizz ("Q )Interface with no fields or methods is known as "," A) Runnabale interface"," B) Marker Interface", " C) Abstract interface", " D) Char sequence Interface");
		   Quizz q9 = new Quizz ("Q )Which of following is marker Interface "," A) Runnable Interface"," B) Remote Interface", " C) Readable interface", " D) Result interface");
		   Quizz q10 = new Quizz("Q )Which of following is a reserved keyword in Java "," A) Object"," B) main", " C) System", " D) strictfp");
		   
	       Map <Quizz,Character> hmap = new HashMap<>();
	       hmap.put(q1, 'A');
	       hmap.put(q2, 'C');
	       hmap.put(q3, 'A');
	       hmap.put(q4, 'B');
	       hmap.put(q5, 'C');
	       hmap.put(q6, 'A');
	       hmap.put(q7, 'A');
	       hmap.put(q8, 'B');
	       hmap.put(q9, 'B');
	       hmap.put(q10,'D');
	       
	       
	       for (Map.Entry<Quizz, Character> map : hmap.entrySet()) {
	    	   System.out.println(map.getKey().getQuestions());
	    	   System.out.println(map.getKey().getOption1());
	    	   System.out.println(map.getKey().getOption2());
	    	   System.out.println(map.getKey().getOption3());
	    	   System.out.println(map.getKey().getOption4());
	    	   
	    	   System.out.println("Enter Your Answer : ");
	    	   Character ans =sc.next().charAt(0) ;
	    	   
	    	   int correct = Character.compare(ans,map.getValue());
	    	   
	    	   if (correct==0) {
	    		//System.out.println("CORRECT" );
	    		   correctAns++;
	    		   
	    	   }else {
	    		//System.out.println("WRONG");
	    		   wrongAns++;
	    	   }
	    	   }
	       System.out.println("=====================================");
	       System.out.println("Your Name = "+Name);
	       System.out.println("Your Marks are = "+correctAns);
	       if (correctAns>=8) {
	    	   System.out.println("You got A Grade");
	    	   }
	       else if (correctAns<8 && correctAns >=6) {
	    	   System.out.println("You got B Grade");}
	       else {System.err.println("Try next time u failed ---");}
	}

}


