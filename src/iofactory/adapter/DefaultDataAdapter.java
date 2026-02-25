package iofactory.adapter;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DefaultDataAdapter implements DataAdapter {

    @Override
    public String toText(Object value) {
        if (value == null) return "null";

        // Ejemplo de adaptación "especial": fechas
        if (value instanceof TemporalAccessor) {
            return DateTimeFormatter.ISO_DATE_TIME.format((TemporalAccessor) value);
        }

        // Caso general (sirve para int, double, boolean, objetos, etc.)
        return String.valueOf(value);
    }
}