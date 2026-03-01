import java.util.HashMap;

public class OopsBannerApp {


    public static HashMap<Character, String[]> createMap() {

        HashMap<Character, String[]> map = new HashMap<>();

     
        map.put('O', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        });


        map.put('P', new String[]{
                "******",
                "*     *",
                "*     *",
                "******",
                "*      ",
                "*      ",
                "*      "
        });


        map.put('S', new String[]{
                "*******",
                "*      ",
                "*      ",
                "*******",
                "      *",
                "      *",
                "*******"
        });

        return map;
    }

   
    public static void display(String word, HashMap<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);
                String[] pattern = map.get(ch);

                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {

        HashMap<Character, String[]> map = createMap();

        display("OOPS", map);
    }
}
