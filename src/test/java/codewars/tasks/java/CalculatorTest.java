package codewars.tasks.java;

import codewars.tasks.java.calculator.Calculator;
import codewars.tasks.java.calculator.Square;
import codewars.tasks.java.calculator.Triangle;
import codewars.tasks.java.calculator.Circle;
import codewars.tasks.java.calculator.Rectangle;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

    private Calculator sut = new Calculator();

    @Test(testName = "6.1", description = "Verify Triangle area")
    public void testAreaOfATriangleIsBaseMultipliedByHeight(){

        double triangleBase = 6;
        double triangleHeight = 4;

        System.out.println("@Test - testAreaOfATriangleIsBaseMultipliedByHeight");

        assertThat(sut.getTotalArea(new Triangle(triangleBase, triangleHeight))).isEqualTo(12.0000);
    }

    @Test(testName = "6.2", description = "Verify Square area")
    public void testAreaOfASquareIsSquareOfSide(){

        double side = 6;

        System.out.println("@Test - testAreaOfASquareIsSquareOfSide");

        assertThat(sut.getTotalArea(new Square(side))).isEqualTo(36.0000);
    }

    @Test(testName = "6.3", description = "Verify Rectangle area")
    public void testAreaOfARectangleIsWidthMultipliedByHeight(){

        double height = 4;
        double width = 8;

        System.out.println("@Test - testAreaOfARectangleIsWidthMultipliedByHeight");

        assertThat(sut.getTotalArea(new Rectangle(width, height))).isEqualTo(32.0000);
    }

    @Test(testName = "6.4", description = "Verify Circle area")
    public void testAreaOfACircleIsSquareOfRadiusMulitpliedByPi(){

        double radius = 3;

        System.out.println("@Test - testAreaOfACircleIsSquareOfRadiusMulitpliedByPi");

        assertThat(sut.getTotalArea(new Circle(radius))).isEqualTo(28.2700);
    }

    @Test(testName = "6.5", description = "Verify sum of areas all figures")
    public void testTotalAreaIsSumOfAreasOfDifferentShapes(){

        System.out.println("@Test - testTotalAreaIsSumOfAreasOfDifferentShapes");

        assertThat(sut.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4),
                new Circle(1), new Square(1), new Triangle(10, 5))).isEqualTo(49.1400);
    }

    @Test(testName = "6.6", description = "Verify area is rounded to 2 decimals")
    public void testTotalAreaIsRoundedTo2Decimals(){

        System.out.println("@Test - testTotalAreaIsRoundedTo2Decimals");

        assertThat(sut.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2))).isEqualTo(4.45);
    }

    @Test(testName = "6.7", description = "Verify no shapes given")
    public void testTotalAreaIs0WhenThereAreNoShapes(){

        System.out.println("@Test - testTotalAreaIs0WhenThereAreNoShapes");

        assertThat(sut.getTotalArea()).isEqualTo(0);
    }
}
