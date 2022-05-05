public class minmax{
	public static void main(String[] args) {
    
		int TestArray[] = {4,2,17,5,22,8,13,6};
		int max = TestArray[0];
		int min = TestArray[0];
    
		for(int index = 0; index< TestArray.length-1; index++) {
			if(TestArray[index] > max) {
			max=TestArray[index];
		}
      
	}
    
	System.out.println("The largest number is "+ max);
}
  
}
