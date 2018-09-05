
public class PrimeNumber {

	boolean checkPrime(int number)
	{
		for(int i=2 ;i<=number/2;i++){
			if(number%i==0)
			{   //System.out.println(number+" is not a prime number");
				return false;
			}			
		}
		//System.out.println(number+" is a prime number");
		return true;		
	}
	
	void printPrime(int number){
		for (int i=1;i<=number;i++){
			boolean isPrime=false;
			isPrime=checkPrime(i);
			if(isPrime){
				System.out.println(i);
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber prime = new PrimeNumber();
		prime.printPrime(100);
		System.out.println("91 is prime ?"+prime.checkPrime(91));
		
	}
	

}
