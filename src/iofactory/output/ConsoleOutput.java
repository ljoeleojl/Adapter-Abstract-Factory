package iofactory.output;

public class ConsoleOutput implements Output {

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}