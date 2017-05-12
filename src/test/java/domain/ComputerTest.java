package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ComputerTest {

    private MotherBoardFactory amdMotherBoardFactory = new AmdMotherBoardFactory(new BigDecimal(150));
    private List<OptionalComponent> optionalComponents;

    @Before
    public void setUp() {
        CoolerSystem cooler = new CoolerSystem();
        WiFiAntenna wiFiAntenna = new WiFiAntenna(new BigDecimal(100), new BigDecimal(0.35));
        GraphicCard graphicCard = new GraphicCard(new BigDecimal(3000), new BigDecimal(100));
        SolidStateDisk solidStateDisk = new SolidStateDisk(new BigDecimal(50));
        this.optionalComponents = Arrays.asList(cooler, wiFiAntenna, graphicCard, solidStateDisk);
        //nvidia funciona solo con intel y amd solo con amd
    }

    @Test
    public void ComputerWithOnlyRequiredComponentsPrice() {
        Computer computer = new ComputerBuilder()
                .highPerformanceComputer(amdMotherBoardFactory)
                .build();
        Assert.assertEquals(computer.price(), new BigDecimal(452));

    }

    @Test(expected = ComputerDoesNotHaveRequiredComponents.class)
    public void computerLackOfARequiredComponentShouldRaisedException() {
        HardDriveDisk hardDriveDisk = new HardDriveDisk(new BigDecimal(30000), new BigDecimal(1000));
        new ComputerBuilder().withHardDriveDisk(hardDriveDisk).build();
    }

    @Test
    public void ComputerWithRequiredAndOptionalComponentsPrice() {
        Computer computer = new ComputerBuilder()
                .highPerformanceComputer(amdMotherBoardFactory)
                .withOptionalComponents(optionalComponents)
                .build();
        Assert.assertEquals(computer.price(), new BigDecimal(617));
    }
}
