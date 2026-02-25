package iofactory.output;

public class WebOutput implements Output {

    @Override
    public void write(String message) {
        System.out.println("[WEB] <div class='alert'>" + message + "</div>");
    }
}