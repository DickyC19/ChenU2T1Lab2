import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ChatBot debbie = new ChatBot("debbie", 7);

        System.out.print("What is your name? ");
        String name = scan.nextLine();
        debbie.greeting(name);

        System.out.println();
        debbie.weather();

        System.out.println();
        System.out.print("Pick a number in feet: ");
        int numFeet = scan.nextInt();
        scan.nextLine();
        System.out.println("There are " + debbie.convertFeetToMeters(numFeet) + " meters in " + numFeet + " feet.");

        System.out.println();
        System.out.print("What is your favorite integer? ");
        int yourNumber = scan.nextInt();
        scan.nextLine();
        debbie.favoriteNumber(yourNumber);

        System.out.println();
        int sum = debbie.addNumbers(numFeet, yourNumber, 7);
        System.out.println("The sum of my favorite number, your favorite number, and your number in feet is: " + sum);
    }
}
