package iofactory.output;

import javax.swing.JOptionPane;

public class DialogOutput implements Output {

    @Override
    public void write(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}