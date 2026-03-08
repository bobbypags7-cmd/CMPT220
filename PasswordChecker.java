import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Please enter your password");
        Scanner sc = new Scanner(System.in);

        boolean valid = false;   // Checks if the user entered anything
        String password = "";    // Initialize the password variable
        
        while (!valid) {
            password = sc.nextLine();    // Gets user input
            if (password.length() == 0) {   // If nothing is entered
                System.out.println("Password cannot be empty, please try again");
            } else {
                valid = true;
            }
        }
        password = password.trim(); // Removes spaces before or after password (for example "  password    " = "password")

        String[] common_passwords = {
"123456",
"123456789",
"qwerty",
"password",
"111111",
"12345678",
"abc123",
"1234567",
"password1",
"12345",
"1234567890",
"123123",
"000000",
"iloveyou",
"1234",
"1q2w3e4r5t",
"qwertyuiop",
"123",
"monkey",
"dragon",
"123456a",
"654321",
"123321",
"666666",
"1qaz2wsx",
"myspace1",
"121212",
"homelesspa",
"123qwe",
"a123456",
"123abc",
"1q2w3e4r",
"qwe123",
"7777777",
"qwerty123",
"target123",
"tinkle",
"987654321",
"qwerty1",
"222222",
"zxcvbnm",
"1g2w3e4r",
"gwerty",
"zag12wsx",
"gwerty123",
"555555",
"fuckyou",
"112233",
"asdfghjkl",
"1q2w3e",
"123123123",
"qazwsx",
"computer",
"princess",
"12345a",
"ashley",
"159753",
"michael",
"football",
"sunshine",
"1234qwer",
"iloveyou1",
"aaaaaa",
"fuckyou1",
"789456123",
"daniel",
"777777",
"princess1",
"123654",
"11111",
"asdfgh",
"999999",
"11111111",
"passer2009",
"888888",
"love",
"abcd1234",
"shadow",
"football1",
"love123",
"superman",
"jordan23",
"jessica",
"monkey1",
"12qwaszx",
"a12345",
"baseball",
"123456789a",
"killer",
"asdf",
"samsung",
"master",
"azerty",
"charlie",
"asd123",
"soccer",
"FQRG7CS493",
"88888888",
"jordan",
"michael1",
"jesus1",
"linkedin",
"babygirl1",
"789456",
"blink182",
"thomas",
"qwer1234",
"333333",
"liverpool",
"michelle",
"nicole",
"qwert",
"j38ifUbn",
"131313",
"asdasd",
"0",
"987654",
"lovely",
"q1w2e3r4",
"0123456789",
"gfhjkm",
"andrew",
"hello1",
"joshua",
"Status",
"justin",
"anthony",
"angel1",
"iloveyou2",
"1111111",
"zxcvbn",
"hello",
"1111",
"jennifer",
"hunter",
"naruto",
"bitch1",
"welcome",
"159357",
"101010",
"tigger",
"147258369",
"babygirl",
"jessica1",
"parola",
"5201314",
"robert",
"fuckyou2",
"696969",
"102030",
"0987654321",
"loveme",
"123456q",
"apple",
"pokemon",
"mother",
"money1",
"secret",
"anthony1",
"purple",
"q1w2e3r4t5y6",
"baseball1",
"qazwsxedc",
"1111111111",
"abc",
"buster",
"matthew",
"andrea",
"soccer1",
"basketball",
"hannah",
"freedom",
"golfer",
"chelsea",
"passw0rd",
"george",
"trustno1",
"friends",
"william",
"iloveu",
"amanda",
"number1",
"chocolate",
"qwerty12",
"summer",
"flower",
"charlie1",
"maggie",
"pakistan",
"samantha",
"asdf1234",
"letmein",
"asshole1",
"superman1",
"marina",
"147258",
"batman",
"fuk19600",
"butterfly",
"010203"
};
        /*
        This string contains 200 commonly used passwords
        I used ChatGPT to format these into a java array
        I got them from GitHub...
        danielmiesseler
        SecLists/Passwords/Common-Credentials/100k-most-used-passwords-NCSC.txt
        */

        int score = 0;

        boolean upper = false;  // What kind of character is it
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        boolean common = false;

        for (int i = 0; i < common_passwords.length; i++) {      // Check if the password is common
           if (password.equalsIgnoreCase(common_passwords[i])) { // Ignores case of password, makes it more secure
               common = true;
               break; // No need to check the rest of them
           }
       }
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);    // Get the current character
            if (Character.isLowerCase(c)) { // Find out what kind of character it is
                lower = true;               // "The password has a lowercase letter"
            } else if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            } else {
                special = true;
            }

        }
        
        if (password.length() >= 8) {   // If the password has it, increase score
            score += 1;
        }
        if (upper) {
            score += 1;
        } 
        if (lower) {
            score += 1;
        }
        if (digit) {
            score += 1;
        }
        if (special) {
            score += 1;
        }

        if (common) {
            System.out.println("Password is too common and is insecure.");
            System.out.println("Score: 0/5");

        } else {
                System.out.println("Score: " + score + "/5");
            if (score <= 2) {
                System.out.println("Password is weak");
            } 
            else if (score == 3 || score == 4) {
                System.out.println("Password is okay");
            } 
            else {
                System.out.println("Password is strong");
            }
            System.out.println(""); // Empty line for spacing
            
            System.out.println("Password strengths:");
            System.out.println("Contains:");
            if (password.length() >= 8) {
                System.out.println("- at least 8 characters");
            }
            if (upper) {
                System.out.println("- uppercase letter(s)");
            }
            if (lower) {
                System.out.println("- lowercase letter(s)");
            }
            if (digit) {
                System.out.println("- digit(s)");
            }
            if (special) {
                System.out.println("- special character(s)");
            }
            if (!upper && !lower && !digit && !special) {
                System.out.println("- Your password sucks bruh"); // Can't really happen but just in case
            }
            System.out.println("");
            
            if (!upper || !lower || !digit || !special || password.length() < 8) { // If any weaknesses are found, print weaknesses
                System.out.println("Password weaknesses");
                System.out.println("Is missing:");
                if (password.length() < 8) {
                    System.out.println("- at least 8 characters");
                }
                if (!upper) {
                    System.out.println("- uppercase letters");
                }
                if (!lower) {
                    System.out.println("- lowercase letters");
                }
                if (!digit) {
                    System.out.println("- digits");
                }
                if (!special) {
                    System.out.println("- special characters");
                }
            }
        }
    }
}