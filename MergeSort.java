import java.io.*;
public class MergeSort
{
// Merge Sort function with parameters as array,low,high of datatype int
	public static void sort(int[] a, int low, int high)
	{
		int N = high - low;
		if (N <= 1)
			return;
		int mid = low + N/2;
// recursive sorting of array
		sort(a, low, mid);
		sort(a, mid, high);
// now merge two sorted sub-arrays
		int[] temp = new int[N];
		int i = low, j = mid;
		for (int k = 0; k < N; k++)
		{
			if (i == mid)
				temp[k] = a[j++];
			else if (j == high)
				temp[k] = a[i++];
			else if (a[j]<a[i])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for (int k = 0; k < N; k++)
			a[low + k] = temp[k];
	}
// now in the same class,we are writing the main method and invoking the staticsort method
public static void main(String[] args) throws IOException
{
//creating a object as obj for InputStreamReader class
	InputStreamReader obj=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(obj);
	System.out.println("Merge Sort Test\n");
	int n, i;
	//taking input of number of elements 
	System.out.println("Enter number of integer elements");
	n = Integer.parseInt(br.readLine());
	//Creating array of n  elements 
	int arr[] = new int[ n ];
	// taking elements from user and storing it in arr[]
	System.out.println("\nEnter "+ n +" integer elements");
	for (i = 0; i < n; i++)
		arr[i] = Integer.parseInt(br.readLine());
	//now we have to sort the given input by using sort method
	sort(arr, 0, n);
	//Finally,we are going to print the sorted order of array elements
	System.out.println("\nElements after sorting ");
	for (i = 0; i < n; i++)
		System.out.print(arr[i]+" ");
	System.out.println();
}
}

