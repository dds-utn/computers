package domain;

import java.math.BigDecimal;

public class WiFiAntenna implements OptionalComponent{
    BigDecimal range;
    BigDecimal coefficientPrice;

    public BigDecimal price() {
        return range.multiply(coefficientPrice);
    }
}
