package domain;

import java.math.BigDecimal;

public class MicroProcessor {
    BigDecimal speed;
    BigDecimal maxHeat;
    BrandTypeMP brandTypeMP;

    public MicroProcessor(BigDecimal speed, BigDecimal maxHeat, BrandTypeMP brandTypeMP) {
        this.speed = speed;
        this.maxHeat = maxHeat;
        this.brandTypeMP = brandTypeMP;
    }

    public BigDecimal price(){
        return speed.subtract(maxHeat);
    }
}
