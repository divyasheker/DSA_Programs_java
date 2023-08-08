public class New {
   
    public static void main(String[] args)
    {
        char [] arr={'e','e','g','g','g'};
        char ch=nextGreatestLetter(arr,'e');
        System.out.println(ch);
    }
    static char nextGreatestLetter(char [] arr,char target)
    {
        int start =0,end=arr.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if((int)target<(int)arr[mid])
                end=mid-1;
            else 
                start=mid+1;
            
        }
        return arr[start%arr.length];
    }
}
