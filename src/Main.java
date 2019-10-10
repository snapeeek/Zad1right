import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InvalidExpressionException
    {
        String s1, s2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Daj pierwsze slowo: ");
        s1 = scan.nextLine();
        if (stringValidate(s1) == false)
            throw new InvalidExpressionException();

        System.out.println("Daj drugie slowo: ");
        s2 = scan.nextLine();
        if (stringValidate(s2) == false)
            throw new InvalidExpressionException();

        double output;
        output = LevQWERTY(s1, s2);

        System.out.println("Odleglosc wynosi: " + output);
    }

    static boolean stringValidate(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isAlphabetic(str.charAt(i)) == false || Character.isUpperCase(str.charAt(i)) == true)
                return false;
        }

        return true;
    }

    static double costOfSubstitution(char ch1, char ch2)
    {
        String s1,s2;
        s1 = String.valueOf(ch1);
        s2 = String.valueOf(ch2);

        if (s1.equals(s2))
            return 0;

        AssociationTable ass = new AssociationTable();
        if (ass.literki.get(s1).contains(ch2))
            return 0.5;
        else
            return 1.0;
    }


    static double LevQWERTY(String x, String y)
    {

        double[][] dp = new double[x.length() + 1][y.length() + 1];

        for (int i = 0; i <= x.length(); i++)
        {
            for (int j = 0; j <= y.length(); j++)
            {
                if (i == 0)
                {
                    dp[i][j] = j;
                }
                else if (j == 0)
                {
                    dp[i][j] = i;
                }
                else
                    {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1]
                                        + costOfSubstitution(x.charAt(i - 1), y.charAt(j - 1)),
                                                        dp[i - 1][j] + 1), dp[i][j - 1] + 1);
                }
            }
        }

        return dp[x.length()][y.length()];
    }
}