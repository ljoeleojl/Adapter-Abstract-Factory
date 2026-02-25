package iofactory.client;

import iofactory.adapter.DataAdapter;
import iofactory.adapter.DefaultDataAdapter;
import iofactory.factory.ConsoleFactory;
import iofactory.factory.DialogFactory;
import iofactory.factory.IOFactory;
import iofactory.factory.WebFactory;
import iofactory.input.Input;
import iofactory.output.Output;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        IOFactory factory = chooseFactory();   //  el cliente decide
        Input input = factory.createInput();
        Output output = factory.createOutput();

        DataAdapter adapter = new DefaultDataAdapter();

        String nombre = input.read("Ingrese su nombre");

        int edad = 20; // dato NO String para probar Adapter
        LocalDateTime ahora = LocalDateTime.now();

        output.write("Hola " + nombre); // directo, ya es String
        output.write(adapter.toText(edad));  // aquí sí se nota
        output.write(adapter.toText(ahora)); // aquí sí se nota
    }

    private static IOFactory chooseFactory() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione entorno:");
        System.out.println("1) Consola");
        System.out.println("2) Ventana (JOptionPane)");
        System.out.println("3) Web");

        String opt = sc.nextLine().trim();

        return switch (opt) {
            case "1" -> new ConsoleFactory();
            case "2" -> new DialogFactory();
            case "3" -> new WebFactory();
            default -> new ConsoleFactory(); // por defecto
        };
    }
}