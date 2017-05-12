package domain;

import java.math.BigDecimal;

public abstract class MotherBoardFactory {
    public Motherboard create() {
        MicroProcessor microProcessor = new MicroProcessor(new BigDecimal(300), new BigDecimal(100), this.getBrandTypeMP());
        GraphicCardOnBoard graphicCardOnBoard = new GraphicCardOnBoard(this.getBrandTypeMB());
        MicroProcessorSocket microProcessorSocket = new MicroProcessorSocket(this.getBrandTypeMP());
        return new Motherboard(graphicCardOnBoard, microProcessor, microProcessorSocket, this.price());
    }

    protected abstract BigDecimal price();
    protected abstract BrandTypeMP getBrandTypeMP();
    protected abstract BrandTypeMB getBrandTypeMB();


}
