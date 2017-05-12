package domain;

import java.math.BigDecimal;

public class HardDriveDisk {
    BigDecimal storage;

    public HardDriveDisk(BigDecimal storage, BigDecimal speed) {
        this.storage = storage;
        this.speed = speed;
    }

    BigDecimal speed;

    public BigDecimal price() {
        return storage.divide(speed);
    }
}
