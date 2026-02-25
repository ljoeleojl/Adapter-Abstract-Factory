package iofactory.factory;

import iofactory.input.Input;
import iofactory.input.WebInput;
import iofactory.output.Output;
import iofactory.output.WebOutput;

public class WebFactory implements IOFactory {

    @Override
    public Input createInput() {
        return new WebInput();
    }

    @Override
    public Output createOutput() {
        return new WebOutput();
    }
}