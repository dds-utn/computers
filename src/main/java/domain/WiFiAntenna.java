package domain;

import java.math.BigDecimal;

public class WiFiAntenna implements OptionalComponent{
    BigDecimal range;

    public WiFiAntenna(BigDecimal range, BigDecimal coefficientPrice) {
        this.range = range;
        this.coefficientPrice = coefficientPrice;
    }

    BigDecimal coefficientPrice;

    public BigDecimal price() {
        return range.multiply(coefficientPrice);
    }
}
