package domain;

import java.math.BigDecimal;

public class PowerSupply {
    Integer power;

    public BigDecimal price(){return new BigDecimal(power * 0.8);}
}
