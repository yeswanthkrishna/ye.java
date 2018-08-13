/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,count,total=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		for(count=1;count<=num;count++)
		{
			total=total+count;
		}
		System.out.println(+total);
	}
}
