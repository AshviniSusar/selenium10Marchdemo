package MyClass;

import java.util.HashMap;
public class CountOfNumberUsingHashmap {
	

	
	    public static void main(String[] args) {
	        String inputString = "programming";

	        // Create a HashMap to store character frequencies
	        HashMap<Character, Integer> charFrequency = new HashMap<>();

	        // Count the occurrences of each character in the string
	        for (char c : inputString.toCharArray()) {
	            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
	        }

	        // Display the character frequencies
	        System.out.println("Character Frequencies:");
	        for (char c : charFrequency.keySet()) {
	            System.out.println("'" + c + "': " + charFrequency.get(c));
	        }
	    }
	}


