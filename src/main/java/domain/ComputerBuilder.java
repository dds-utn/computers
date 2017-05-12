package domain;

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
}
