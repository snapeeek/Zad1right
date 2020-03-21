import java.util.HashMap;
import java.util.LinkedHashSet;

public class AssociationTable
{
    String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    HashMap<String, LinkedHashSet<Character>> literki;


    public AssociationTable()
    {
        literki = new HashMap<>();

        for (String s : keyboard)
        {
            for (int j = 0; j < s.length(); j++)
            {
                if (j == 0)
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(s.charAt(j + 1));
                    literki.put(String.valueOf(s.charAt(j)), set);
                } else if (j == s.length() - 1)
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(s.charAt(j - 1));
                    literki.put(String.valueOf(s.charAt(j)), set);
                } else
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(s.charAt(j - 1));
                    set.add(s.charAt(j + 1));
                    literki.put(String.valueOf(s.charAt(j)), set);
                }
            }
        }
    }
}
