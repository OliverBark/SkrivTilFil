package OliverBark;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int guess = scanner.nextInt();
        boolean isRunning = true;

        while (isRunning) {
            int number = random.nextInt(5) + 1;
            if (guess == number) {
                System.out.println("You've guessed right");
                isRunning = false;
            } else {
                System.out.println("Try again");
                guess = scanner.nextInt();
                count++;
            }
        }
        try {
            File file = new File("Nemt");
            FileWriter fw = new FileWriter(file, true);
            fw.append(Integer.toString(count));//Man lægger noget til filen og omdanner int til String
            fw.append("\n");
            fw.close(); //Lukker dokumentet

            //Flush tømme eller ikke tømme filer

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
