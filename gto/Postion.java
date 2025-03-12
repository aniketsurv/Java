package gto;

public class Postion {
	public static void main(String[] args) 
	{
		//arr.34
		 int[][] positions = {{3, 5}, {7, 8}, {1, 3}, {6, 0}, {2, 7}};
	        for (int i = 0; i < positions.length - 1; i++)
	        {
	            int xStep = positions[i][0] > positions[i + 1][0] ? -1 : 1;
	            int yStep = positions[i][1] > positions[i + 1][1] ? -1 : 1;
	            int xChange = positions[i][0] - positions[i + 1][0];
	            int yChange = positions[i][1] - positions[i + 1][1];
	            if (Math.abs(xChange) > Math.abs(yChange))
	            {
	                System.out.print(Math.abs(yChange) + "[" + xStep + "," + yStep + "]" + "+" + (Math.abs(xChange) - Math.abs(yChange)) + "H ");
	            }
	            else
	            {
	                System.out.print(Math.abs(xChange) + "[" + xStep + "," + yStep + "]" + "+" + (Math.abs(yChange) - Math.abs(xChange)) + "V ");
	            }
	        }
	}	
	
}