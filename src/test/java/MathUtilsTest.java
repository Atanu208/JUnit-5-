import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;


class MathUtilsTest {
    MathUtils obj;
    @BeforeEach
    void init()
    {
        obj=new MathUtils();
    }
    @Test
    void TestAddMethod() {
        Assertions.assertEquals(40,obj.add(10,30));
    }
    @Test
    void TestComputeCircleArea()
    {
        Assertions.assertEquals(314.0,obj.computeCircleArea(10));
    }

    @Test
    void TestDevide()
    {
        assumeTrue(true);
        Assertions.assertThrows(ArithmeticException.class, () -> obj.devide(10,0));
    }
    @DisplayName("Check sub method")
    @Disabled
    @Test
    void TestSub()
    {
        Assertions.assertEquals(10,obj.sub(20,10));
    }
}