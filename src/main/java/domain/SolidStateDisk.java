package domain;

import java.math.BigDecimal;

public class SolidStateDisk implements OptionalComponent{
    public SolidStateDisk(BigDecimal price) {
        this.price = price;
    }

    private BigDecimal price;

    public BigDecimal price() {
        return price;
    }
}
