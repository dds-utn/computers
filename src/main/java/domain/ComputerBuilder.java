package domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComputerBuilder {


    private List<OptionalComponent> optionalsComponents = new ArrayList();
    private Motherboard motherBoard;
    private PowerSupply powerSupply;
    private HardDriveDisk hardDriveDisk;

    public ComputerBuilder withOptionalComponent(OptionalComponent optionalComponent) {
        this.optionalsComponents.add(optionalComponent);
        return this;
    }

    public ComputerBuilder withOptionalComponents(List<OptionalComponent> optionalComponents) {
        this.optionalsComponents.addAll(optionalComponents);
        return this;
    }

    public ComputerBuilder withMotherBoard(Motherboard motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }
    public ComputerBuilder withPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }
    public ComputerBuilder withHardDriveDisk(HardDriveDisk hardDriveDisk) {
        this.hardDriveDisk = hardDriveDisk;
        return this;
    }

    public Computer build() {
        if (computerHasRequiredComponents()) throw new ComputerDoesNotHaveRequiredComponents("Computer must have required components to be initialized");
        return new Computer(this.motherBoard, this.powerSupply, this. hardDriveDisk, this.optionalsComponents);
    }

    private boolean computerHasRequiredComponents() {
        return this.motherBoard == null
                || this.powerSupply == null
                || this.hardDriveDisk == null;
    }

    public ComputerBuilder highPerformanceComputer(MotherBoardFactory motherBoardFactory) {
        MicroProcessor amdMicroProcessor = new MicroProcessor(new BigDecimal(300), new BigDecimal(100), BrandTypeMP.AMD);
        GraphicCardOnBoard amdGraphicCardOnBoard = new GraphicCardOnBoard(BrandTypeMB.AMD);
        MicroProcessorSocket amdMicroProcessorSocket = new MicroProcessorSocket(BrandTypeMP.AMD);

        this.motherBoard = motherBoardFactory.create();
        this.powerSupply = new PowerSupply(90);
        this.hardDriveDisk = new HardDriveDisk(new BigDecimal(30000), new BigDecimal(1000));

        return this;
    }
}
