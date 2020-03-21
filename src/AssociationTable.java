import java.util.HashMap;
import java.util.LinkedHashSet;

public class AssociationTable
{
    String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    HashMap<String, LinkedHashSet<Character>> literki;


    public AssociationTable()
    {
        literki = new HashMap<>();

        for (int i = 0; i < keyboard.length; i++)
        {
            for (int j = 0; j < keyboard[i].length(); j++)
            {
                if (j == 0)
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(keyboard[i].charAt(j+1));
                    literki.put(String.valueOf(keyboard[i].charAt(j)), set);
                                    }
                else if (j == keyboard[i].length() - 1)
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(keyboard[i].charAt(j-1));
                    literki.put(String.valueOf(keyboard[i].charAt(j)), set);
                }
                else
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(keyboard[i].charAt(j-1));
                    set.add(keyboard[i].charAt(j+1));
                    literki.put(String.valueOf(keyboard[i].charAt(j)), set);
                }
            }
        }
    }
}
