import java.util.Arrays;

public class wk7Lab03
{
	public static void main(String[] args)
	{
		int[] arrayNums;
		arrayNums = new int[6];
		
		arrayNums[0] = 123;
		arrayNums[1] = 456;
		arrayNums[2] = 479;
		arrayNums[3] = 135;
		arrayNums[4] = 246;
		arrayNums[5] = 135;
		
		int total;
		total = arrayNums[0] + arrayNums[1] + arrayNums[2] + arrayNums[3] + arrayNums[4] + arrayNums[5];
		int realTotal = total/6;
		
		//Arranges the numbers chronologically
		Arrays.sort(arrayNums);
		
		
		for ( int i = 0; i < arrayNums.length; i++)
		{
			System.out.println( "Num: " + arrayNums[i]);
		}
		
		System.out.printf( "The average is: %d\n" , realTotal );
		
	}

}
