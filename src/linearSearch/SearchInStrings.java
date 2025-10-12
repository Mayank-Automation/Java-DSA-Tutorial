package linearSearch;

public class SearchInStrings {
    static void main() {
        String name="Mayank";
        char target='b';
        System.out.println(search(name, target));

    }

    static boolean search(String str, char target)
    {
        if(str.isEmpty())
            return false;
        for (int i: str.toCharArray())
       // for (int i=0; i<str.length(); i++) // We can use this loop with below commented code
        {
           if(i==target)
          //  if(target==str.charAt(i))  // We can write this way as well with normal loop
                return true;
        }
        return false;
    }

}
