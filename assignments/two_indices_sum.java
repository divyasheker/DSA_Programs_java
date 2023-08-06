import java.net.SocketPermission;
import java.util.Arrays;

public class two_indices_sum {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(twoSum(arr, 80)));
        
    }
    static int[] twoSum(int[] nums, int target)
	{
        for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
					return new int[]{i,j};
			}
		}
		return new int[]{-1,-1};
    }
}
