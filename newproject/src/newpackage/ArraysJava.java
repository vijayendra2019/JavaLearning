package newpackage;

import org.omg.Messaging.SyncScopeHelper;

public class ArraysJava {
	
	public static void main(String args[]) {
		
		int[] empID;
		empID = new int[10];
		empID[0] = 1;
		
		/*System.out.println(""+empID[0]);
		System.out.println();
		System.out.println(empID.length);*/
		
		
		String[] month = {"Vijay","Ashi","Madhu"};
		//System.out.println(month.length);
		
		for (int i = 0; i<month.length;i++)
		{
			System.out.println(month[i]);
			
		}
		
		
		int rows = 3;
		int cols = 3;
		
		int[][] table;
		table = new int[rows][cols];
		
		table[0][0] = 10;
		table[0][1] = 11;
		table[0][2] = 12;
		
		table[1][0] = 20;
		table[1][1] = 21;
		table[1][2] = 22;
		
		table[2][0] = 20;
		table[2][1] = 21;
		table[2][2] = 22;
		
		System.out.println(table.length);
		System.out.println(table[1].length);
		
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table[1].length;j++)
			{
				System.out.print(" "+table[i][j]);
				
			}
			System.out.println(" ");
		}
		
			
	}

}
