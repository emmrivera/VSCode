import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class AppTest {
    @Test
    public void add() {
        App calculator = new App();
        assertEquals(4, calculator.add(2, 2));
    }
}
