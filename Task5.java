import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("Введіть, будь ласка, перший рядок:");
        String firstSentence = sr.nextLine();

        System.out.println("Введіть, будь ласка, другий рядок:");
        String secondSentence = sr.nextLine();

        int a = firstSentence.length();
        int b = secondSentence.length();
        if (a>b){
            System.out.println("Перший рядок більший за другий");
        } else{
            System.out.println("Другий рядок більший за перший");
        }

    }
}
