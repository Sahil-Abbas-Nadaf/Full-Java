import java.util.Scanner;
class StringMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Sahil";
        //Printing styles in java
        // System.out.println("Name :: "+name);
        // System.out.printf("Name :: %s\n",name);
        // System.out.format("Name :: %s\n",name);
        //System.out.println(name);
        // name.length :- return the count of String Which is stored in name.
        //int value = name.length();
        //System.out.println(value);

        // toLowerCase :- Returns new string which has all the lowercase character from the string name.
       //String lstring = name.toLowerCase();
       // System.out.println(lstring);
        
        // toUpperCase :- Returns new string which has all the Upper case character from the string name.
        //String Ustring = name.toUpperCase();
        //System.out.println(Ustring);

        // name.trim() :- /return a new string after removing all the leading and
        // trading space from the original string
       // String nonTrimmedString = "   Sahil    ";
       // System.out.println(nonTrimmedString);

        //String tremmedString = nonTrimmedString.trim();
       // System.out.println(tremmedString);

        // print subsring using name.substring(int Start) Strat is starting number 
        // of string or index  note : that index start from 0.
        //System.out.println(name.substring(2));

        // returns a substring from start index to the end index. start index is include
        // and end is excluded.
       //System.out.println(name.substring(1,5));

        // Return a new String after replacing S with R Rahil is returned in this case
        // System.out.println(name.replace('S','R')); // this is only helpful for changing the character
        // System.out.println(name.replace("ahil","ohel")); // when you replacing String or it is also change the character
        // System.out.println(name);
        // returns true if name starts with string "Sa" -true in this case otherwise returns false
        //System.out.println(name.startsWith("Sa"));

        // returns true if name ends with "hil" - true otherwise false
        //System.out.println(name.endsWith("hil"));

        System.out.println("Enter a character:: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character is:: "+ch);

        // returns character at a given position
        //System.out.println(name.charAt(2));

        // returns the index of the character;
       // System.out.println(name.indexOf("h"));

       // String Name = "Sahil Abbas Nadaf";
       // System.out.println(Name.indexOf("f",4));

        // System.out.println(name.lastIndexOf("hil"));// gives you proper index and searching starts from last character 
        // System.out.println(name.lastIndexOf("hil1524"));// returns -1 because this substring is not present
        // String ModifiedName = "xyzxyz";
        // System.out.println(ModifiedName.lastIndexOf("yz",2));//It method included Substring And Searching Starts index 
    
        //System.out.println(name.equals("Sahil")); // it macth the characters but capital or small matters
        //System.out.println(name.equalsIgnoreCase("saHil"));// it match the cracters does not matter capital or small

        // how to print Double duotes
        //System.out.println("I am Sahil Abbas Nadaf \" double quote \""); 
        
        // how to print \ in string
        // System.out.println("I am Sahil Abbas Nadaf \\\\ double quote");
    }
}