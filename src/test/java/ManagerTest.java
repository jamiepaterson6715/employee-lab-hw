import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Johnny", "NYWTF", "Corporate Comms", 56000);
    }



    @Test
    public void canRaiseSalery() {
        this.manager.raiseSalery(1000);
        assertEquals(57000, manager.getSalery());
    }

    @Test
    public void canGetBonus() {
        assertEquals(560, manager.getBonus(), 0.01);
    }

    @Test
    public void hasName(){
        assertEquals("Johnny", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NYWTF", manager.getNiNumber());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Corporate Comms", manager.getDeptName());
    }

    @Test
    public void hasSalery() {
        assertEquals(56000, manager.getSalery());
    }

}
