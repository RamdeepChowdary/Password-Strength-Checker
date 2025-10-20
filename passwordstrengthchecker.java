    package PasswordStrengthChecker;

	import java.util.Scanner;
	
	public class passwordstrengthchecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a password: ");
	        String password = scanner.nextLine();
	        scanner.close();

	        int strength = checkPasswordStrength(password);
	        System.out.println("Password Strength: " + getStrengthLevel(strength));
	        System.out.println(getFeedback(strength));
	    }

	    private static int checkPasswordStrength(String password) {
	        int strength = 0;

	        // Check length
	        if (password.length() >= 8) {
	            strength++;
	        }

	        // Check for uppercase letters
	        if (password.matches(".*[A-Z].*")) {
	            strength++;
	        }

	        // Check for lowercase letters
	        if (password.matches(".*[a-z].*")) {
	            strength++;
	        }

	        // Check for numbers
	        if (password.matches(".*\\d.*")) {
	            strength++;
	        }

	        // Check for special characters
	        if (password.matches(".*[^a-zA-Z0-9].*")) {
	            strength++;
	        }

	        return strength;
	    }

	    private static String getStrengthLevel(int strength) {
	        switch (strength) {
	            case 5:
	                return "Very Strong";
	            case 4:
	                return "Strong";
	            case 3:
	                return "Medium";
	            case 2:
	                return "Weak";
	            default:
	                return "Very Weak";
	        }
	    }

	    private static String getFeedback(int strength) {
	        switch (strength) {
	            case 5:
	                return "Your password is very strong. Good job!";
	            case 4:
	                return "Your password is strong, but consider adding more complexity.";
	            case 3:
	                return "Your password is medium strength. Consider adding more characters or complexity.";
	            case 2:
	                return "Your password is weak. Consider adding more characters, uppercase letters, numbers, or special characters.";
	            default:
	                return "Your password is very weak. Please change it to a stronger one.";
	        }
	    }
	}
