package hwassignment5csc250;

import java.util.Scanner;

public class Driver 
{
	   public static void main(String[] args) 
	   {
		      Scanner scnr = new Scanner(System.in);
		      int weightone = 0;
		      int weighttwo = 0;
		      int weightthree = 0;
		      int weightfour = 0;
		      int weightfive = 0;
		      int totalWeight = 0;
		      int average = 0;
		      int maxWeight = 0;
		      
		      System.out.println("Enter weight one: ");
		      weightone = scnr.nextInt();
		      System.out.println("Enter weight two: ");
		      weighttwo = scnr.nextInt();
		      System.out.println("Enter weight three: ");
		      weightthree = scnr.nextInt();
		      System.out.println("Enter weight four: ");
		      weightfour = scnr.nextInt();
		      System.out.println("Enter weight five: ");
		      weightfive = scnr.nextInt();
		      System.out.println("You entered: " + weightone + " " + weighttwo + " " + weightthree + " " + weightfour + " " + weightfive);
		      totalWeight = weightone + weighttwo + weightthree + weightfour + weightfive;
		      System.out.println("Total weight: " + totalWeight);
		      average = (totalWeight / 5);
		      System.out.println("Average weight is: " + average);
		      maxWeight = weightone;
		      if (maxWeight < weighttwo)
		      {
		    	  maxWeight = weighttwo;
		      }
		      if (maxWeight < weightthree)
		      {
		    	  maxWeight = weightthree;
		      }
		      if (maxWeight < weightfour)
		      {
		    	  maxWeight = weightfour;
		      }
		      if (maxWeight < weightfive)
		      {
		    	  maxWeight = weightfive;
		      }
		     System.out.println("Max weight is: " + maxWeight);
		      
	   }
}
