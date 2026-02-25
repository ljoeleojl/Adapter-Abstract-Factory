package iofactory.input;

import java.util.Scanner;

public class WebInput implements Input {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String read(String Entrada) {
        System.out.print("[WEB] <input placeholder='" + Entrada + "'> ");
        return scanner.nextLine();
    }
}