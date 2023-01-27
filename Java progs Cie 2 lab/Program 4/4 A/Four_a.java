import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Four_a{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int characters = 0;
        int lines = 0;
        int words = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] arr = new String[200];
                arr = line.split(" ");
                words += arr.length;
            }
        } catch (IOException e) {
            System.out.println("error");
        }

        System.out.println("No of characters: " + characters);
        System.out.println("No of lines: " + lines);
        System.out.println("No of words: " + words);
    }
}