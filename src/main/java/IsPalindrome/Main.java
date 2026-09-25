package IsPalindrome;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/07/26
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String x = "A man, a plan, a canal: Panama";

        boolean resultado = solution.isPalindrome(x);

        System.out.println(resultado);
    }
}
