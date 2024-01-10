import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePairs {
	static Scanner scan = new Scanner(System.in); 	//Getting the input of the user
	
	private static String loopRun(String choiceLetter){ 	//This entire method checks whether the input is valid
        while (!choiceLetter.equalsIgnoreCase("n") && !choiceLetter.equalsIgnoreCase("y")){
        	System.out.println("\nInvalid choice input. Try again!");
           System.out.println("\nDo you want to continue [Y/N]?");
           choiceLetter = scan.nextLine();
           }     
        return choiceLetter;
    }
	
	static List<List<Integer>> palindromeList(String[] words) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();	//This is where the accepted palindrome lists are stored
		
		for(int i = 0; i < words.length - 1; i++) {
			for(int j = i+1; j < words.length; j++) {
				String first = words[i]+words[j];	//This adds the first word to the second word
				String second = words[j]+words[i];	//This adds the second word to the first word
				if(checkPalin(first)) {
					ArrayList<Integer> l = new ArrayList<Integer>();
					l.add(i);
					l.add(j);
					result.add(l);	//The list is added when the word is a palindrome
				}
				
				if(checkPalin(second)) {
					ArrayList<Integer> l = new ArrayList<Integer>();
					l.add(j);
					l.add(i);
					result.add(l);
				}
				
			}
		}
		
		return result;
	}
	
	static boolean checkPalin(String word) {
		int i = 0;	//Gets the first letter of the word
		int j = word.length()-1; //Gets the last letter of the word
		
		while(i<j) {
			if(word.charAt(i) != word.charAt(j)) return false;	//Compares if the first letter and the last letter of the word is the same
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {	
		
		String choice = "y";
		
		do {
			System.out.print("Enter the number of words you wish to enter: ");
			String[] words = new String[scan.nextInt()]; //Getting the number of words the user wants to use for palindrome checking
			scan.nextLine(); // Pressing enter
			
			System.out.println("\nEnter the words you wish to compare:");
			for(int i = 0; i < words.length; i++) {
				words[i] = scan.nextLine();		//This gets the words to be used for palindrome checking
			}
			
			System.out.println("\n"+palindromeList(words));		//This prints out the list of lists of palindromes in the form of indices
			
			System.out.println("\nDo you want to continue [Y/N]?");		//If the user wants to do it again, it gives the option to do so
	        String choiceLetter = scan.nextLine();
			choice = loopRun(choiceLetter);
			System.out.println();
		}
		while(!choice.equalsIgnoreCase("n"));
	}

}
