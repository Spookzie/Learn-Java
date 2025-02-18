public class Hashing
{
    public void BasicIntArrayMethod()
    {
        int[] arr = {1, 2, 1, 3, 2};
        int[] queries = {1, 3, 4, 2, 10};

        int[] hash = new int[13];

        //Updating the hash table with count
        for(int i=0; i<arr.length; i++)
            hash[arr[i]]++;
        
        // Printing array & queries
        PrintArray("arr", arr);
        PrintArray("\nqueries", queries);
        System.out.println();

        for(int i=0; i<queries.length; i++)
            System.out.println(queries[i] + " : " + hash[queries[i]] + " ");
    }


    public void BasicStringMethod()
    {
        //    LOWERCASE    //
        // When all characters of the string are in lowercase
        String s = "abcdabefc";
        char[] queries = {'a', 'c', 'z'};

        int[] hash = new int[26];

        for(int i=0; i<s.length(); i++)
            hash[s.charAt(i) - 'a']++;

        // Printing array & queries
        System.out.print("string: " + s);
        PrintArray("\nqueries", queries);
        System.out.println();

        for(int i=0; i<queries.length; i++)
            System.out.println(queries[i] + " : " + hash[queries[i]-'a']);

        //-----------------------------------

        //   UPPERCASE   //
        /*
        In case if all characters in the string are in uppercase:
        instead of doing -'a', do -'A' 
        */
        //-----------------------------------

        //   MIXED   //
        String s1 = "abcDFghKhjALDefC";
        char[] queries1 = {'D', 'L', 'b', 'h', 'q'};

        int[] hashNew = new int[256];

        for(int i=0; i<s1.length(); i++)
            hashNew[s1.charAt(i)]++;

        // Printing array & queries
        System.out.print("string: " + s1);
        PrintArray("\nqueries1: ", queries1);
        System.out.println();

        for(int i=0; i<queries1.length; i++)
            System.out.println(queries1[i] + " : " + hashNew[queries1[i]]);
    }


    private void PrintArray(String arr_name, int[] arr)
    {
        System.out.print(arr_name + ": ");
        for(int num : arr)
            System.out.print(num + " ");
    }
    
    private void PrintArray(String arr_name, char[] arr)
    {
        System.out.print(arr_name + ": ");
        for(char ch : arr)
            System.out.print(ch + " ");
    }
}