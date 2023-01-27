//Finding duplicate character in asentence
public class Practice_40 {
    public static void main(String[] args) {
        String sentence="Now many duplicates are there";
        System.out.println(sentence);

        String characters="";
        String duplicates="";



        for (int i=0;i<sentence.length();i++)
        {
        String current=Character.toString(sentence.charAt(i));
            if (characters.contains(current)){
               if (!duplicates.contains(current)){

                duplicates += current+",";
               }
            }
            characters += current;
        }
            System.out.println(duplicates);
    }
}