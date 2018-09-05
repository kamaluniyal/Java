
public class ReverseArray {

	public static void main(String[] args) {
		
		//initilize array
		int [] original = {50,40,30,20,10};
		int [] reverse = new int[original.length];
		
		// Logic for reverse
		int i=1;
		for(int item:original){			
			reverse[original.length-i]=item;
			i++;
		}
		
		//print original
		System.out.println("Original:");
		for(int item:original){			
			System.out.println(item);		
		}
		
		//print reverse
		System.out.println("reverse:");
		for(int item:reverse){			
			System.out.println(item);		
		}

	}

}
