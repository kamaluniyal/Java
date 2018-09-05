
public class Fibonacii {

	void fibonacii(int numOfElements){
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=3 ;i<=numOfElements;i++){
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;			
		}		
		
	}
	public static void main(String[] args) {
		Fibonacii Fibonacii = new Fibonacii();
		Fibonacii.fibonacii(10);

	}

}
