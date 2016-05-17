/*
 * Free Code Camp algorithm practice but in Java instead of JavaScript.
 * Problem #01
 * Reverse the provided string.
 * You may need to turn the string into an array before you can reverse it.
 *  Your result must be a string.
 */
public class ReverseString {

	public final static String reverse(String string){
		char[] chars = string.toCharArray();
		String reversedString = "";
		for(int i = chars.length-1; i >= 0 ; i--){
			reversedString = reversedString + chars[i];
		}
		return reversedString;
	}
	
	public static void main(String[] args) {
		if(args.length > 0){
			String myString = args[0];
			System.out.println("Input: myString, reversed: "+ReverseString.reverse(myString));	
		}
		

		//Tests
		System.out.println("hello should be olleh: "+ReverseString.reverse("hello"));
		System.out.println("Howdy should be ydwoH: "+ReverseString.reverse("Howdy"));
		System.out.println("Greetings from Earth should be htraE morf sgniteerG: "+ReverseString.reverse("Greetings from Earth"));
	}

}
