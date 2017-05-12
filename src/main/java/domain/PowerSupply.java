package domain;

import java.math.BigDecimal;

public class PowerSupply {
    public PowerSupply(Integer power) {
        this.power = power;
    }

    Integer power;

    public BigDecimal price(){return new BigDecimal(power * 0.8);}
}
