package love.programming;

public class timesTable {
    static int i;
    static int j;
    static int k;

    public static void main(String[] args) {


        for (i = 1; i < 11; i++) {

            for (j = 1; j < 11; j++) {

                k = i * j;

                System.out.println(i + " X " + j + " = " + k);
            }
        }

    }
}
