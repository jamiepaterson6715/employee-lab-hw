import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Johnny", "NYWTF",  56000);
    }

    @Test
    public void canRaiseSalery() {
        this.developer.raiseSalery(1000);
        assertEquals(56000, developer.getSalery());
    }

    @Test
    public void canPayBonus() {
        this.developer.getBonus();
        assertEquals(560, developer.getBonus(), 0.01);
    }

}
