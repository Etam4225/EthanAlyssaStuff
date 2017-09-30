package primenumstuffs;

public class FindPrimeNums {
		String aString = "Hello World!";
		static int counter = 0;
		static int primeNums = 0;
		public static void primeNumsDisplay() {
			while(primeNums < 50) {
				if(counter == 1)
				{
					counter++;
				}
				for(int i = 2; i < counter + 2; i++)
				{
					if (counter % i == 0 && counter != i)
					{
						break;	
					}
					if(counter == i ){
							
						primeNums++;
						System.out.println(counter);
							
							
					}	
					
				}
				
				counter++;
			}
			//System.out.println(primeNums);
		}
		
		

	public static void main(String[] args) {
		FindPrimeNums.primeNumsDisplay();

	}


}
