package iofactory.factory;

import iofactory.input.Input;
import iofactory.output.Output;

public interface IOFactory {

    Input createInput();

    Output createOutput();
}