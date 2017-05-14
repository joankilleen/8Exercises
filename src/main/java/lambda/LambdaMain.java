package lambda;

public class LambdaMain {

	public static void main(String[] args) {
		MyNumber myNum;
		myNum = ()-> 5.55;
		System.out.println(String.format("MyNumber interface answer: %s", myNum.getValue()));

		NumericTest isOdd= (int n)-> n%2==1;
		System.out.println(String.format("isOdd test answer %s", isOdd.test(6)));
		
	
		StringFunc reverse;
		reverse = (String s)-> {
			StringBuilder result = new StringBuilder();
			for (int i=s.length()-1; i>=0; i--){
				result.append(s.charAt(i));
			}
			return result.toString();		
		};
		System.out.println(String.format("Reverse %s. Result %s", "Big etsi", reverse.func("Big etsi")));
		
		FuncGeneric<String> reverseGeneric;
		reverseGeneric = (s)-> {
			StringBuilder result = new StringBuilder();
			for (int i=s.length()-1; i>=0; i--){
				result.append(s.charAt(i));
			}
			return result.toString();		
		};
		String genericTest = "what a load of nonsense";
		System.out.println(String.format("Reverse '%s'. Result %s", genericTest, reverseGeneric.func(genericTest)));
		
	}

}
