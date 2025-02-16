import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
    @Test
    void TestAddMethod() {
        MathUtils obj=new MathUtils();
        Assertions.assertEquals(40,obj.add(10,30));
    }
}