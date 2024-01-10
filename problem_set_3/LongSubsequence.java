import java.util.Scanner;

public class LongSubsequence {
	static Scanner scan = new Scanner(System.in); 	//Getting the input of the user
	
	private static String loopRun(String choiceLetter){ 	//This entire method checks whether the input is valid
        while (!choiceLetter.equalsIgnoreCase("n") && !choiceLetter.equalsIgnoreCase("y")){
        	System.out.println("\nInvalid choice input. Try again!");
           System.out.println("\nDo you want to continue [Y/N]?");
           choiceLetter = scan.nextLine();
           }     
        return choiceLetter;
    }
	
	public static int longestIncreasingSubsequence(int[] numbers) {
		int n = numbers.length;
		int[] LIS = new int[n];
		int max = 0;
		
		for (int i = 0; i < n; i++) {		//Initialize all length for each subsequence to 1
			LIS[i] = 1;
		}
		
		//This entire sequence loops through the array and updates the LIS
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {				// j < i is because we only need to compare from the start of the array to where numbers[i] is
				if (numbers[i] > numbers[j] && LIS[i] < LIS[j] + 1) {		//If the number is bigger than what we are comparing to and their LIS value is larger
					LIS[i] = LIS[j] + 1;									//then we update the LIS value
				}
			}
		}
		
		
		//This sequence finds the maximum LIS
		for(int i = 0; i < n; i++) {
			if(max < LIS[i]) max = LIS[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {	
		
		String choice = "y";
		
		do {
			System.out.print("Enter the number of inputs you wish to enter: ");
			int[] numbers = new int[scan.nextInt()]; //Getting the number of inputs the user wants to use for the array
			scan.nextLine(); // Pressing enter
			
			System.out.println("\nEnter the numbers you wish to add to the array:");
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = scan.nextInt();		//This gets the input of the user to be put into the array
			}
			scan.nextLine();
			
			System.out.println("\nThe Longest Increasing Subsequence is: "+longestIncreasingSubsequence(numbers));		//This prints out the LIS
			
			System.out.println("\nDo you want to continue [Y/N]?");		//If the user wants to do it again, it gives the option to do so
	        String choiceLetter = scan.nextLine();
			choice = loopRun(choiceLetter);
			System.out.println();
		}
		while(!choice.equalsIgnoreCase("n"));
	}

}
