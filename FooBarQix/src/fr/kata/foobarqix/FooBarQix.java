package fr.kata.foobarqix;

public class FooBarQix {
	
	static String result = "";
	
	
	//m?thode principale
	public static String convertToFooBarQix(Integer[] myArray) {
		
		for (Integer number : myArray) {	
			
			result = "";
			
			result = divisibility(number); 
			result += checkDigits(number); 
			
			System.out.println("r?sultat pour " + number + " : " + result);
		}
	return result; 
	}
	
	
	//m?thode pour v?rifier la divisibilit?
	public static String divisibility(Integer integer) {
		
		String result = "";  
		
		if (integer%3 ==0 && integer%5 == 0 && integer%7 == 0) {
			result += "FooBarQix"; 
		}
		else if (integer%3 ==0 && integer%5 == 0) {
			result += "FooBar"; 
		}
		else if (integer%3 ==0 && integer%7 == 0) {
			result += "FooQix"; 
		}
		else if (integer%5 ==0 && integer%7 == 0) {
			result += "BarQix"; 
		}
		else if (integer%3 ==0) {
			result += "Foo"; 
		}
		else if (integer%5 ==0) {
			result += "Bar"; 
		}
		else if (integer%7 ==0) {
			result += "Qix"; 
		} 

		return result; 
	}

	
	
	//m?thode pour v?rifier la pr?sence de chacun des chiffres
		public static String checkDigits(Integer number) {
		
			int[] intTab = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
			
			StringBuilder sb = new StringBuilder(); 

			for (int i : intTab) {
				
				if (i == 0) {
					sb.append('*');
				} else if (i == 3) {
					sb.append("Foo");
				} else if (i == 5) {
					sb.append("Bar");
				} else if (i == 7) {
					sb.append("Qix");
				} else if (result == ""){
					sb.append(i);
				}
				
			}
			//System.out.println("checkDigits de " + integer + " : " + sb.toString());
			return sb.toString();
		}
}
