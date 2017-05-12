package domain;

import java.math.BigDecimal;

public class IntelMotherBoardFactory extends MotherBoardFactory {

    private BigDecimal price;

    public IntelMotherBoardFactory(BigDecimal price) {
        this.price = price;
    }

    @Override
    protected BigDecimal price() {
        return this.price;
    }

    @Override
    protected BrandTypeMP getBrandTypeMP() {
        return BrandTypeMP.INTEL;
    }

    @Override
    protected BrandTypeMB getBrandTypeMB() {
        return BrandTypeMB.NVIDIA;
    }
}