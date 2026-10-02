package SearchBiggerAndYounger;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 25/09/26
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 15, 25};

        int bigger = 0;
        int younger = 12;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > bigger) {
                bigger = array[i];
            }

            if (array[i] < younger) {
                younger = array[i];
            }
        }

        System.out.println(bigger);
        System.out.println(younger);
    }
}
