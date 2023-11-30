package cerney.annotation.basic;

public class DeprecatedTest {
    @Deprecated(since = "4.5", forRemoval = true)
    public void testLegacyFunction() {
        System.out.println("This is a legacy function");
    }
}
