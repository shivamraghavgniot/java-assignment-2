import java.util.Scanner;
public class BubbleSort 
{  
	public static void main(String[] args) 
	{
		int Size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements in Array: ");
		Size = scan.nextInt();
		int [] arr = new int [Size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Unsorted Array is: ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++)
		{  
			for(int j = 1; j < arr.length-i; j++) 
				{  
					if(arr[j]< arr[j-1]) 
					{						
						int temp = arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=temp;
					}
					
				}
		} 
		System.out.println("Sorted Array is: ");
		for(int elem:arr)
		{
			System.out.print(elem+" ");
		}
	}  
}