import java.util.Scanner;
import java.util.Stack;


public class Stacks {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Stack<Character> charStack = new Stack<Character>();
        String reversedStr = "";

        System.out.print("\nEnter a string >");
        String inputStr = keyboard.nextLine();

        int i = 0;
        while (i < inputStr.length()) {
            charStack.push(inputStr.charAt(i));
            i++;
        }
        System.out.println("Stack contents: " + charStack);

        while (!charStack.empty()) {
            reversedStr += charStack.pop();

        }

        System.out.printf("%s reversed is %s\n" , inputStr, reversedStr);

        if (inputStr.equals(reversedStr))
            System.out.printf("%s is a palindrome\n", inputStr);

    }


}