import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void stringValidatePositiveTest()
    {
        String x = "przyklad";
        Assertions.assertTrue(Main.stringValidate(x));
        x = "przyk0ad";
        Assertions.assertFalse(Main.stringValidate(x));
    }

    @org.junit.jupiter.api.Test
    void costOfSubstitutionTest()
    {
        char c1 = 'q', c2 = 'q';
        Assertions.assertEquals(0, Main.costOfSubstitution(c1, c2), 0.001);
        c2 = 'w';
        Assertions.assertEquals(0.5, Main.costOfSubstitution(c1, c2),0.001);
        c2 = 'y';
        Assertions.assertEquals(1.0, Main.costOfSubstitution(c1, c2), 0.001);

    }

    @org.junit.jupiter.api.Test
    void levQWERTYTest()
    {
        String s1 = "kot", s2 = "kita";
        Assertions.assertEquals(1.5,Main.LevQWERTY(s1, s2));
    }
}