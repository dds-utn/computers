package domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Computer {
    Motherboard motherboard;
    PowerSupply powerSupply;
    HardDriveDisk hardDriveDisk;

    List<OptionalComponent> optionalComponents;

    public Computer(Motherboard motherboard, PowerSupply powerSupply, HardDriveDisk hardDriveDisk, List<OptionalComponent> optionalComponents) {
        this.motherboard = motherboard;
        this.powerSupply = powerSupply;
        this.hardDriveDisk = hardDriveDisk;
        this.optionalComponents = optionalComponents;
    }

    public BigDecimal price(){
        return optionalComponents.stream().map(OptionalComponent::price).reduce(new BigDecimal(0),BigDecimal::add)
                .add(motherboard.price())
                .add(powerSupply.price())
                .add(hardDriveDisk.price())
                .setScale(0, RoundingMode.HALF_UP);

    }

}
