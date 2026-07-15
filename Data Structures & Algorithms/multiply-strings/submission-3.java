class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int n = num1.length();
        int m  = num2.length();

        int[] ans = new int[n+m];

        for(int i=n-1;i>=0;i--){
            int a = num1.charAt(i)-'0';
            for(int j = m-1;j>=0;j--){
                int b = num2.charAt(j)-'0';
                int p = a*b;
                int sum = p+ans[i+j+1];
                ans[i+j+1] = sum%10;
                ans[i+j]+=sum/10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n+m;i++){
            if(ans[i]==0 && sb.length()==0){
                continue;
            }
            char c =  (char) (ans[i]+'0');
            sb.append(c);
        }
        return sb.toString();
    }
}
