/*
 * Free Code Camp algorithm practice but in Java instead of JavaScript.
 * Problem #02
 * Return the factorial of the provided integer.
 * If the integer is represented with the letter n, 
 * a factorial is the product of all positive integers less than or equal to n.
 * Factorials are often represented with the shorthand notation n!
 * For example: 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class Factorialize {

	public static final long factorialize(int number){
		int returnNumber = 1;
		if(number <= 0){
			return 1;
		}
		for(int i = 1; i <= number; i++){
			returnNumber = i * returnNumber;
		}
		return returnNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tests
		System.out.println("factorialize(5) should return 120: "+Factorialize.factorialize(5));
		System.out.println("factorialize(10) should return 3628800: "+Factorialize.factorialize(10));
		System.out.println("factorialize(20) should return 2432902008176640000: "+Factorialize.factorialize(20));
		System.out.println("factorialize(0) should return 1: "+Factorialize.factorialize(0));

	}

}
