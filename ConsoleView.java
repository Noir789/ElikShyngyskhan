import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayData(String data) {
        System.out.println("Current Data: " + data);

    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}