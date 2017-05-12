package domain;

import java.math.BigDecimal;

public class AmdMotherBoardFactory extends MotherBoardFactory {

    private BigDecimal price;

    public AmdMotherBoardFactory(BigDecimal price) {
        this.price = price;

    }

    @Override
    protected BigDecimal price() {
        return this.price;
    }

    @Override
    protected BrandTypeMP getBrandTypeMP() {
        return BrandTypeMP.AMD;
    }

    @Override
    protected BrandTypeMB getBrandTypeMB() {
        return BrandTypeMB.AMD;
    }
}
