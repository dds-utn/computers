package domain;

import java.math.BigDecimal;

public class CoolerSystem implements OptionalComponent {

    private static final BigDecimal FIXED_PRICE = new BigDecimal(50);

    public BigDecimal price() {
        return FIXED_PRICE;
    }
}
