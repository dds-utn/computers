package domain;

import java.math.BigDecimal;

public class SolidStateDisk implements OptionalComponent{
    private BigDecimal price;

    public BigDecimal price() {
        return price;
    }
}
