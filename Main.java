import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initializing variables
        String password;
        boolean hasUpperCase = false, hasLowerCase = false, hasLength = false, hasSpecialCharacter = false, hasDigit = false;
        int criteriaMet = 0;

        // Prompting the user to enter a password
        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        // Password validation
        // Checking password length
        if (password.length() >= 7) {
            hasLength = true;
            criteriaMet++;
        }

        // Checking for uppercase letters
        for (int i = 0; i < password.length(); i++){
            char character = password.charAt(i);
            if (Character.isUpperCase(character)) {
                hasUpperCase = true;
                criteriaMet++;
                break;
            }
        }

        // Checking for lowercase letters
        for (int i = 0; i < password.length(); i++){
            char character = password.charAt(i);
            if (Character.isLowerCase(character)) {
                hasLowerCase = true;
                criteriaMet++;
                break;
            }
        }

        // Checking for special characters
        String specialCharacters = "!@#$%^&*()-_=+\\|[{]};:'\",";
        for (int i = 0; i < password.length(); i++){
            char character = password.charAt(i);
            if (specialCharacters.contains(String.valueOf(character))) {
                hasSpecialCharacter = true;
                criteriaMet++;
                break;
            }
        }

        // Checking for digits
        for (int i = 0; i < password.length(); i++){
            char character = password.charAt(i);
            if (Character.isDigit(character)) {
                hasDigit = true;
                criteriaMet++;
                break;
            }
        }
        // Password validation completed

        // Reporting the validation results
        if (hasLength) {
            System.out.println("Password length: " + hasLength);
            System.out.println("Contains uppercase letter: " + hasUpperCase);
            System.out.println("Contains lowercase letter: " + hasLowerCase);
            System.out.println("Contains special character: " + hasSpecialCharacter);
            System.out.println("Contains digit: " + hasDigit);

            switch (criteriaMet) {
                case 0:
                    System.out.println("Your password does not meet any criteria. Please create a stronger password.");
                    break;
                case 1:
                    System.out.println("Your password meets only one criteria. Please consider strengthening it.");
                    break;
                case 2:
                    System.out.println("Your password meets two criteria. Consider improving it for better security.");
                    break;
                case 3:
                    System.out.println("Your password meets three criteria. It's reasonably secure, but can be improved.");
                    break;
                case 4:
                    System.out.println("Your password meets four criteria. It's a strong password.");
                    break;
                case 5:
                    System.out.println("Congratulations! Your password meets all criteria. It's highly secure.");
                    break;
                default:
                    System.out.println("Error occurred during password validation.");
                    break;
            }
        } else {
            System.out.println("Your password must be at least 7 characters long. Please try again.");
        }
    }
}
