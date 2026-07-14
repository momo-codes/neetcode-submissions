class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(digits[i]==9){
                count++;
            }
        }
        int size=n;
        if(count==n){
            size++;
        }
        int[] arr = new int[size];
        int carry=0;
        for(int i = n-1;i>=0;i--){
            if(i==n-1){
                 arr[i] = digits[i]+1;
                 if(arr[i]>9){
                    carry=1;
                    arr[i]=0;
                 }
            }
            else{
                arr[i] = digits[i]+carry;
                if(arr[i]<=9){
                    carry=0;
                }
                else{
                    arr[i]=0;
                    carry=1;
                }
            }
           
        }
        if(count==n){
            arr[0]=1;
        }
        return arr;
    }
}
