package domain;

import java.math.BigDecimal;

public class Motherboard {
    GraphicCardOnBoard graphicCardOnBoard;
    MicroProcessor microProcessor;
    MicroProcessorSocket microProcessorSocket;
    BigDecimal price;

    public Motherboard(GraphicCardOnBoard graphicCardOnBoard, MicroProcessor microProcessor, MicroProcessorSocket microProcessorSocket, BigDecimal price) {
        this.graphicCardOnBoard = graphicCardOnBoard;
        this.microProcessor = microProcessor;
        this.microProcessorSocket = microProcessorSocket;
        this.price = price;
    }

    public BigDecimal price(){
        return this.price.add(microProcessor.price());
    }
}
