package TwoSumLeetCode;

import java.util.Arrays;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/07/26
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};

        int[] resposta = solution.twoSum(nums, 9);

        System.out.println(Arrays.toString(resposta));
    }
}
