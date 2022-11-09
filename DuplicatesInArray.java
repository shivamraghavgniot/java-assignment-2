import java.util.Scanner;
public class DuplicatesInArray 
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
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(" Element "+(i+1)+" is: "+arr[i]);
		}
		System.out.println("Duplicate elements in given array: ");  
		for(int i = 0; i < arr.length; i++)
		{  
			for(int j = i + 1; j < arr.length; j++) 
				{  
					if(arr[i] == arr[j])  
						System.out.println(arr[j]);
				}
		}  
	}  
}