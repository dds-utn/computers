package domain;

import java.math.BigDecimal;

public class GraphicCard implements OptionalComponent {
    BigDecimal storage;
    BigDecimal speed;

    public GraphicCard(BigDecimal storage, BigDecimal speed) {
        this.storage = storage;
        this.speed = speed;
    }

    public BigDecimal price() {
        return storage.divide(speed);
    }
}
