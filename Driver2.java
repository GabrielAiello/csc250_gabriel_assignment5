package hwassignment5csc250;

import java.util.Scanner;

public class Driver2 
{
	   public static void main(String[] args) 
	   {
		      Scanner scnr = new Scanner(System.in);
		      int [] weight = new int [5];

		      System.out.println("Enter weight one: ");
		      weight[0] = scnr.nextInt();
		      System.out.println("Enter weight two: ");
		      weight[1] = scnr.nextInt();
		      System.out.println("Enter weight three: ");
		      weight[2] = scnr.nextInt();
		      System.out.println("Enter weight four: ");
		      weight[3] = scnr.nextInt();
		      System.out.println("Enter weight five: ");
		      weight[4] = scnr.nextInt();
		      System.out.println("You entered: " + weight[0] + " " + weight[1] + " " + weight[2] + " " + weight[3] + " " + weight[4]);
		      int totalWeight = weight[0] + weight[1] + weight[2] + weight[3] + weight[4];
		      System.out.println("Total weight: " + totalWeight);
		      int average = (totalWeight / 5);
		      System.out.println("Average weight is: " + average);
		      int maxWeight = weight[0];
		      if (maxWeight < weight[1])
		      {
		    	  maxWeight = weight[1];
		      }
		      if (maxWeight < weight[2])
		      {
		    	  maxWeight = weight[2];
		      }
		      if (maxWeight < weight[3])
		      {
		    	  maxWeight = weight[3];
		      }
		      if (maxWeight < weight[4])
		      {
		    	  maxWeight = weight[4];
		      }
		     System.out.println("Max weight is: " + maxWeight);
		      
	   }
}
