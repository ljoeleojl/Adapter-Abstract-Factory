package iofactory.input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String read(String Entrada) {
        System.out.print(Entrada + ": ");
        return scanner.nextLine();
    }
}