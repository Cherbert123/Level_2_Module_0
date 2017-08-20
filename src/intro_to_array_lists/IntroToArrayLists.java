package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> Strings = new ArrayList();
		Strings.add("Popcorn"); Strings.add("Chips"); Strings.add("Preztel"); Strings.add("Hotdog"); Strings.add("Hamburger");
		for(int i = 0; i < Strings.size(); i++){System.out.println(Strings.get(i));}
		System.out.println("");
		for(int i = 0; i < Strings.size(); i++){if(i%2 == 1){System.out.println(Strings.get(i));}}
		System.out.println("");
		for(int i = Strings.size(); i > 0; i--){System.out.println(Strings.get(i - 1));}
		System.out.println("");
		for(int i = 0; i < Strings.size(); i++){if(Strings.get(i).contains("e")){System.out.println(Strings.get(i));}}
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
