package domain;

import java.math.BigDecimal;

public class GraphicCard implements OptionalComponent {
    BigDecimal storage;
    BigDecimal speed;

    public BigDecimal price() {
        return storage.divide(speed);
    }
}
