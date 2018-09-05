
public class ReverseArray2 {

	void reverseArray(int []originalArray)
	{
		for(int i=0 ;i<=originalArray.length/2;i++){
			int tmp=originalArray[i];
			originalArray[i]=originalArray[originalArray.length-i-1];
			originalArray[originalArray.length-i-1]=tmp;						
		}
		for(int item:originalArray){
			System.out.println(item);
		}
	}
			
	public static void main(String[] args) {
		ReverseArray2 reverseArray = new ReverseArray2();
		int[] array = {3,4,5,6,7,8,9};
		reverseArray.reverseArray(array);

	}

}
