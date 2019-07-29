import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

public class ManagerTest {

    Manager manager;

    @Before

    public void setUp() {
        manager = new Manger("Johnny", "ht6717", 56.000);
    }


    @Test
    public void hasName(){
        assertEquals("Johnny", manager.getName);
    }

    @Test

    public void hasNiNumber() {
        assertEquals("ht6717", manager.getNiNumber);
    }

    @Test


    public void hasSalery() {
        assertEquals(56.000, manager.getSalery);
    }

    @Test
    public void canRaiseSalery {
        this.manager.raise(1000);
        assertEquals(57000, manager.getSalery());
    }

    @Test

    public void canGetBonus() {
        assertEqual(560.00, manager.getSalery());
    }



}
