public class InvalidExpressionException extends Exception
{
    public InvalidExpressionException() {
    }

    public void getWarning()
    {
        System.err.println("Podales zly wyraz");
    }
}
