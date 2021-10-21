package OliverBark;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInputTitle = sc.nextLine();
        String userInput = sc.nextLine();


            try {
                File file = new File(userInputTitle + ".txt");
                FileWriter fw = new FileWriter(file, true);
                fw.append(userInput);
                fw.append("\n");
                fw.close(); //Lukker dokumentet

                //Flush tømme eller ikke tømme filer

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }