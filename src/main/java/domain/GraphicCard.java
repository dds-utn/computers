package domain;

import java.math.BigDecimal;

public class GraphicCard {
    BigDecimal storage;
    BigDecimal speed;

    public BigDecimal price() {
        return storage.divide(speed);
    }
}
