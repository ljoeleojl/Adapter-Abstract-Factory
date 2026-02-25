package iofactory.factory;

import iofactory.input.ConsoleInput;
import iofactory.input.Input;
import iofactory.output.Output;
import iofactory.output.ConsoleOutput;

public class ConsoleFactory implements IOFactory {

    @Override
    public Input createInput() {
        return new ConsoleInput();
    }

    @Override
    public Output createOutput() {
        return new ConsoleOutput();
    }
}
