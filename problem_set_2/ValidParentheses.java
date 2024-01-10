import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	static Scanner scan = new Scanner(System.in); 	//Getting the input of the user
	
	private static String loopRun(String choiceLetter){ 	//This entire method checks whether the input is valid
        while (!choiceLetter.equalsIgnoreCase("n") && !choiceLetter.equalsIgnoreCase("y")){
        	System.out.println("\nInvalid choice input. Try again!");
           System.out.println("\nDo you want to continue [Y/N]?");
           choiceLetter = scan.nextLine();
           }     
        return choiceLetter;
    }
	
	public static boolean checkParen(String word) {

		int size = word.length();
		
        if (word.isEmpty()) {		//If it is empty, then it is still valid
            return true;
        } 
        
        if (size % 2 == 1) return false;	//If it is not even, it is automatically false
        else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < size; i++) {
                char current = word.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                	if(stack.isEmpty()) stack.push(current);			// If the stack is empty, it is safe to push
                	else return false;									// If the stack contains an existing opening parenthesis, it is automatically false
                } else {
                    if(stack.isEmpty()) {
                          return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')				//If it is not the correct closing parenthesis, it is faalse
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;  
                    } else {
                        stack.pop();
                    }
                }
            }
            
            if(stack.isEmpty())				//If there is nothing left in the stack, then it returns true
            return true; 
            
            return false;
        }
    }

	public static void main(String[] args) {
		String choice = "y";
		
		do {
			System.out.print("Enter a valid parentheses: ");
			String word = scan.nextLine(); //Getting the parentheses input from the user
			
			System.out.println("\n"+ checkParen(word));		//This prints out if the input is valid or not
			
			System.out.println("\nDo you want to continue [Y/N]?");		//If the user wants to do it again, it gives the option to do so
	        String choiceLetter = scan.nextLine();
			choice = loopRun(choiceLetter);
			System.out.println();
		}
		while(!choice.equalsIgnoreCase("n"));
	}

}
