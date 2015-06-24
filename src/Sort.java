
public class Sort
	{
	public static void main ( String [] args )
		{
		// choose a test example
		int [] a = {5, 4, 6, 1, 2, 5, 3, 8};
		outArray (a, "The original numbers are:") ;
		insertionSort (a);
		outArray (a, " After sorting :") ;
		}
	static void insertionSort (int [] a)
		// sorts the integer array a by direct insertion
		{
			for (int j=1; j < a.length; j++) 
			{
	            // insert a[j] into the sorted sequence  a[0]...a[j-1]
				int key = a[j];
				int i = j-1;
				// find i so that key >= a[i] and move the 
				//elements a[i+1]...a[j-1] one to the right
				while ( i >= 0 && key < a[i] ) 
				{
					a[i+1] = a[i];
					i--;
				}
				// now either i<0 or key >= a[i]
				a[i+1]=key;
			}
		}
		
	static void outArray (int [] a, String info )
		// output the array elements a [0] ,... on a single line
		// printing out the string info beforehand
		{
			System .out . println ( info );
				// ===== your program for printing the array
				// goes here ====
	        for (int i=0; i < a.length; i++)
	            System.out.print(a[i] + "  ");
	        System.out.println();
		}
	}