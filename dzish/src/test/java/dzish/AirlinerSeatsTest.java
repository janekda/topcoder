package dzish;

import org.junit.Assert;
import org.junit.Test;

public class AirlinerSeatsTest {
    
    private AirlinerSeats airlinerSeats = new AirlinerSeats();
    
    
    @Test
    public void test1() {
    
        // Assert
        int width = 6;
        int seats = 3;
        
        // Act
        String[] seatsRow = airlinerSeats.mostAisleSeats(width, seats);
        
        // Assert
        Assert.assertArrayEquals(new String[] { ".", ".", "S", "S", ".", "S" }, seatsRow);
    }
    
    
    @Test
    public void test2() {
    
        // Assert
        int width = 6;
        int seats = 4;
        
        // Act
        String[] seatsRow = airlinerSeats.mostAisleSeats(width, seats);
        
        // Assert
        Assert.assertArrayEquals(new String[] { "S", ".", "S", "S", ".", "S" }, seatsRow);
    }
    
    
    @Test
    public void test3() {
    
        // Assert
        int width = 12;
        int seats = 10;
        
        // Act
        String[] seatsRow = airlinerSeats.mostAisleSeats(width, seats);
        
        // Assert
        Assert.assertArrayEquals(new String[] { "S", ".", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" }, seatsRow);
    }
    
    
    @Test
    public void test4() {
    
        // Assert
        int width = 11;
        int seats = 7;
        
        // Act
        String[] seatsRow = airlinerSeats.mostAisleSeats(width, seats);
        
        // Assert
        Assert.assertArrayEquals(new String[] { ".", "S", "S", ".", "S", "S", ".", "S", "S", ".", "S" }, seatsRow);
    }
    
    
    @Test
    public void test5() {
    
        // Assert
        int width = 52;
        int seats = 52;
        String[] expected = new String[52];
        for (int i = 0; i < width; i++) {
            expected[i] = "S";
        }
        
        // Act
        String[] seatsRow = airlinerSeats.mostAisleSeats(width, seats);
        
        // Assert
        Assert.assertArrayEquals(new String[] { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" }, seatsRow);
    }
    
    
    @Test
    public void test6() {
    
        // Assert
        int width = 52;
        int seats = 52;
        String[] expected = new String[52];
        for (int i = 0; i < width; i++) {
            expected[i] = "S";
        }
        
        // Act
        String[] seatsRow = airlinerSeats.mostAisleSeats(width, seats);
        
        // Assert
        Assert.assertArrayEquals(new String[] { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" }, seatsRow);
    }
    
}
