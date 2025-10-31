import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniParkingSystemTest {

    @BeforeEach
    public void setUp() {
        parking = new ParkingSlot();
    }


    @Test
    public void testParkCar() {
        parking.parkCar(1);
        assertTrue(parking.isCarParked(1));
        assertEquals(1, parking.getSlotNumber(1));
    }


    @Test
    public void testParkingFull() {
        for (int j = 0; j < 20; j++) {
            parking.parkCar(20 + j);
        }
        assertTrue(parking.isFull());
        assertFalse(parking.parkCar(000));
    }

    @Test
    public void testInvalidRemove() {
        parking.removeCar(11); 
        parking.removeCar(0);
    }

    @Test
    public void testTakeBackSlot() {
        parking.parkCar(10);

        int slotNum = parking.getSlotNumber(10);

        parking.removeCar(slotNum);

        parking.parkCar(20);
        assertEquals(slotNum, parking.getSlotNumber(20)); 
    }
}
