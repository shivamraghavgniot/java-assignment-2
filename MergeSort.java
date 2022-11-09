import java.util.Scanner;
class MergeSort 
{
    public static void main(String[] args)
    {
		int N;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements in Array: ");
		N = scan.nextInt();
        int[] a = new int [N];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0; i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
        
        int size = a.length;
        System.out.println("Unsorted Array is: ");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
        mergeSort(a, 0, size - 1);
        System.out.println("Sorted Array is: ");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
    }
    static void mergeSort(int[] a, int left, int right)
    {
        int mid;
        if(left < right)
        {
            mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }
    static void merge(int[] a, int left, int mid, int right)
    {
        int i = left;
        int j = mid + 1;
        int index = left;
        int[] temp = new int[10];

        while(i <= mid && j <= right) 
        {
            if(a[i] < a[j]) 
            { 
                temp[index] = a[i]; 
                i = i + 1; 
            } 
            else 
            { 
                temp[index] = a[j]; 
                j = j + 1; 
            } 
            index++; 
        } 
        if(i > mid)
        {
            while(j <= right) {
                temp[index] = a[j];
                index++;
                j++;
            }
        }
        else {
            while(i <= mid)
            {
                temp[index] = a[i];
                index++;
                i++;
            }
         }
        int p = left;

        while(p < index)
        {
            a[p] = temp[p];
            p++;
        }
    }
}