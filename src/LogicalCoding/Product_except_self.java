package LogicalCoding;

public class Product_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product_except_self obj = new Product_except_self();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        for (int val : result) {
            System.out.print(val + " ");
        }

	}

	private int[] productExceptSelf(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
        int[] output = new int[n];

        // Step 1: Calculate prefix products
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= suffix;
            suffix *= nums[i];
        }

        return output;
	}

}
