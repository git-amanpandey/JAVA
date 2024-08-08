import java.util.Scanner;

public class RemoveCharFromString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        char[] charArray = s.toCharArray();

        int Length = charArray.length;
        System.out.println("Length of the first string: " + Length);



        System.out.print("Enter the character to delete: ");
        char del = scanner.next().charAt(0);

        boolean Found = false;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == del) {
                charArray[i] = '\0'; 
                Found = true;
            }
        }

        if (Found) {
        
            StringBuilder newString = new StringBuilder();
            for (char c : charArray) {
                if (c != '\0') {
                    newString.append(c);
                }
            }
            System.out.println("Modified string length: " + newString.length());
             System.out.println("New Modified String is: " + newString);
        } else {
            System.out.println("Character not found in the first string.");
        }

        scanner.close();
    }
}
