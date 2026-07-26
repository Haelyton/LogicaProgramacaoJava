package TwoSumLeetCode;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/07/26
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] resultado = new int[2];

        // Implementação melhorada
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                final int soma = nums[i] + nums[j];

                if (soma == target) {
                    resultado[0] = i;
                    resultado[1] = j;
                    break;
                }
            }
        }

        // Solução inicial
//        for (int i = 0; i < nums.length; i++) {
//            final int soma = nums[i] + nums[i + 1];
//
//            if (soma == target) {
//                resultado[0] = i;
//                resultado[1] = i+1;
//                break;
//            }
//        }

        return resultado;
    }
}
