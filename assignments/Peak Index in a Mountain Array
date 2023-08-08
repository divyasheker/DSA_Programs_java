import java.util.Arrays;

public class New {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,10,20,304,40,30,20,1,0};
    int ans=peakIndexInMountainArray(arr);
    System.out.println(ans);
  }
  static int peakIndexInMountainArray(int[] arr) 
  {
    int start=0;
    int end=arr.length-1;
    int mid=0;
    while(start<end)
    {
      mid=start+(end-start)/2;
      if(arr[mid]>arr[mid+1])
        end=mid;
      else
        start=mid+1;
    }
    return start;//or return else
  }
}
