public class power{
    public static void main(String[] args) {
        int n = 5;
        int a = 3;
        int ans = 1;
        System.out.println(power_of(a,n,ans));
    }
    public static int power_of(int a, int n, int ans){
        if(n==0){
            return ans;
        }
        return power_of(a,n-1,ans*a);
    }
}