import java.util.Arrays;

public class New {
   public static void main(String[] args) {
    int[] nums={2,3,4,7,7,7,8,8,9};
    System.out.println(Arrays.toString(searchRange(nums,7)));
   }
    static int[] searchRange(int[] nums,int target)
    {
        int[] arr={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        arr[0]=start;
        arr[1]=end;
        return arr;
    }
    static int search(int[]nums,int target,boolean findStartIndex)
    {
        int ans=-1;
        int start=0,mid=0;
        int end=nums.length-1;
        while(start<=end)
        {
           mid=start+(end-start)/2;
           if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else
            {
                ans=mid;
                if(findStartIndex)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return ans;
    }
}
