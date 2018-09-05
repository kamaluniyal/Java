
public class Pyramid {

	public static void main(String[] args) {
		int rows=5;
		int space=rows;
		for (int i=1;i<=rows;i++)
		{				
			for (int k=space;k>=1;k--){				
				System.out.print(" ");
			}			
			for (int j=1;j<=i;j++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
			space--;
		}	
	}

}
