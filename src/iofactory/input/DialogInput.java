package iofactory.input;

import javax.swing.JOptionPane;

public class DialogInput implements Input {

    @Override
    public String read(String Entrada) {
        return JOptionPane.showInputDialog(null, Entrada);
    }
}