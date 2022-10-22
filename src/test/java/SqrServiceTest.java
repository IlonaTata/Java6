import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SqrService;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void testNumberSqr(int expected, int x, int y) {
        SqrService service = new SqrService();
        int actual = service.rangeLimits(x,y);
        Assertions.assertEquals(expected,actual);
    }
}
