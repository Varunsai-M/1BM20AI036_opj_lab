import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Four_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}