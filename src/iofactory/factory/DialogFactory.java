package iofactory.factory;

import iofactory.input.DialogInput;
import iofactory.input.Input;
import iofactory.output.DialogOutput;
import iofactory.output.Output;

public class DialogFactory implements IOFactory {

    @Override
    public Input createInput() {
        return new DialogInput();
    }

    @Override
    public Output createOutput() {
        return new DialogOutput();
    }
}