import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,110,120,130,140,150,160,170,180,190,200,210,220,230};
        int sol=ans(nums, 120);
        System.out.println(sol);
    }
  static int ans(int[]arr,int target)
  {
    //first let's take the range length as 2
    int start=0,end=1,temp=0;
    //now set the condition for loop until reaching the range that includes our target element
    while(target>arr[end])
    {
        temp=end+1;//this is our new start
        //now double the size
        //new end will be equals to the sum of previous end and the twice of previous size
        end=end+(end-start+1)*2;
        start=temp;
    }
    return binarySearch(arr,target,start,end);
  }
  static int binarySearch(int[] arr,int target,int start,int end)
  {
    int mid=0;
    while(start<=end)
    {
        mid=start+(end-start)/2;
        if(target<arr[mid])
            end=mid-1;
        else if(target>arr[mid])
            start=mid+1;
        else
            return mid;
    }
    return -1;
  }
}
