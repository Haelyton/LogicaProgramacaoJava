package IsPalindrome;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/07/26
 */
class Solution {
    public boolean isPalindrome(String x) {

        String x1 = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            x1 = x1 + x.charAt(i);
        }

        return x1.equals(x);
    }
}
