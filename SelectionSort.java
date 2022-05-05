//Mirza Baig
//Data Structures

public class SelectionSort{
	
	public static void main(String[] args) {
		SelectionSort ob= new SelectionSort();
		int arr[] = {3,5,1,8,2};
		ob.sort(arr);
		System.out.println("Sorted array:");
		ob.printArray(arr);
	}
		public void sort(int arr[])
		{
			int a = arr.length;
			for(int b=0; b<a-1; b++)
			{
			int min_element=b;
			for(int c = b+1; c<a;c++)
				if(arr[c] < arr[min_element])
					min_element=c;
			
			int temp= arr[min_element];
			arr[min_element] = arr[b];
			arr[b]=temp;
			}
		}
		
		 public void printArray(int arr[])
		{
			int a = arr.length;
			for(int b=0; b<a; b++)
				System.out.print(arr[b]+" ");
			System.out.println();
		}
	}
