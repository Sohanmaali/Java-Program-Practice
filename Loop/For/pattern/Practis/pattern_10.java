/*
   1
  212
 32123
4321234
 32123
  212
   1
   
*/

import java.util.Scanner;
class Pattern_10
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int a=1;
		for(int i=1;i<(row<<1);i++)
		{
			int x = row;
			for(int j=1;j<row<<1;j++)
			{
				if(i<=row&&(j>=row-i+1&&(j<row+i))||((i>row)&&(j>=a&&j<=(row<<1)-a)))
				{
					System.out.print(x+" ");
				}
				else
				{
					System.out.print("  ");
				}
				x = (j<row?--x:++x);
			}
			a = (i>=row?++a:a);
			System.out.println("");
		}
	}
}