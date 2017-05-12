package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerTest {

    private Motherboard intelMotherBoard;
    private PowerSupply powerSupply;
    private HardDriveDisk hardDriveDisk;
    private List<OptionalComponent> optionalComponents;

    @Before
    public void setUp() {
        CoolerSystem cooler = new CoolerSystem();
        WiFiAntenna wiFiAntenna = new WiFiAntenna(new BigDecimal(100), new BigDecimal(0.35));
        GraphicCard graphicCard = new GraphicCard(new BigDecimal(3000), new BigDecimal(100));
        SolidStateDisk solidStateDisk = new SolidStateDisk(new BigDecimal(50));
        this.optionalComponents = Arrays.asList(cooler, wiFiAntenna, graphicCard, solidStateDisk);

        MicroProcessor intelMicroProcessor = new MicroProcessor(new BigDecimal(300), new BigDecimal(100), BrandTypeMP.INTEL);
        GraphicCardOnBoard nvidiaGraphicCardOnBoard = new GraphicCardOnBoard(BrandTypeMB.NVIDIA);
        MicroProcessorSocket intelMicroProcessorSocket = new MicroProcessorSocket(BrandTypeMP.INTEL);
        MicroProcessor amdMicroProcessor = new MicroProcessor(new BigDecimal(300), new BigDecimal(100), BrandTypeMP.AMD);
        GraphicCardOnBoard amdGraphicCardOnBoard = new GraphicCardOnBoard(BrandTypeMB.AMD);
        MicroProcessorSocket amdMicroProcessorSocket = new MicroProcessorSocket(BrandTypeMP.AMD);


        Motherboard amdMotherBoard = new Motherboard(amdGraphicCardOnBoard, amdMicroProcessor , amdMicroProcessorSocket, new BigDecimal(100));
        this.intelMotherBoard = new Motherboard(nvidiaGraphicCardOnBoard, intelMicroProcessor, intelMicroProcessorSocket, new BigDecimal(150));
        this.powerSupply = new PowerSupply(90);
        this.hardDriveDisk = new HardDriveDisk(new BigDecimal(30000), new BigDecimal(1000));

        //nvidia funciona solo con intel y amd solo con amd


    }

    @Test
    public void ComputerWithOnlyRequiredComponentsPrice() {
        Computer computer = new Computer(intelMotherBoard, powerSupply, hardDriveDisk, new ArrayList<>());
        Assert.assertEquals(computer.price(), new BigDecimal(452));

    }

    @Test(expected=NullPointerException.class)
    public void computerLackOfARequiredComponentShouldRaisedException() {
        Computer computer = new Computer(intelMotherBoard, null, hardDriveDisk, new ArrayList<>());

        computer.price();
    }

    @Test
    public void ComputerWithRequiredAndOptionalComponentsPrice() {
        Computer computer = new Computer(intelMotherBoard, powerSupply, hardDriveDisk, optionalComponents);
        Assert.assertEquals(computer.price(), new BigDecimal(617));
    }
}
