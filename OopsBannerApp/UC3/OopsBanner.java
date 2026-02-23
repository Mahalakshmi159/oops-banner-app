public class OopsBanner {

    public static void main(String[] args) {

        String gap = "   ";

        String line1 = String.join(gap, " ***** ", "*     *", " ***** ", " ***** ");
        String line2 = String.join(gap, "*     *", "*     *", "*     *", "*      ");
        String line3 = String.join(gap, "*     *", "*     *", " ***** ", " ***** ");
        String line4 = String.join(gap, "*     *", "*     *", "*      ", "      *");
        String line5 = String.join(gap, " ***** ", "*     *", "*      ", " ***** ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
