//Mirza Baig
//Data Structures

public class InsertionSort{
	
	public static void main(String[] args) {
		int arr[] = { 3,5,1,8,2 };
		 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
	}
	public void sort(int arr[])
    {
        int a = arr.length;
        for (int b = 1; b < a; b++) {
            int key = arr[b];
            int c = b - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (c >= 0 && arr[c] > key) {
                arr[c + 1] = arr[c];
                c = c - 1;
            }
            arr[c + 1] = key;
        }
    }
 
    /* A utility function to print array of size n*/
    public static void printArray(int arr[])
    {
        int a = arr.length;
        System.out.println("Sorted array: ");
        for (int b = 0; b < a; b++)
            System.out.print(arr[b] + " ");
 
        System.out.println();
    }
	}
