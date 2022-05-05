//Mirza Baig
//Data Structures

public class BubbleSort{
	
	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
        int arr[] = {3,5,1,8,2};
        ob.bubbleSort(arr);
        System.out.println("Sorted array:");
        ob.printArray(arr);
	}
	public void bubbleSort(int arr[])
    {
        int a = arr.length;
        for (int b = 0; b< a-1; b++)
            for (int c = 0; c < a-b-1; c++)
                if (arr[c] > arr[c+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[c];
                    arr[c] = arr[c+1];
                    arr[c+1] = temp;
                }
    }
 
    /* Prints the array */
    public void printArray(int arr[])
    {
        int a = arr.length;
        for (int b=0; b<a; b++)
            System.out.print(arr[b] + " ");
        System.out.println();
    }
	
	
	}
