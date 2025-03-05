public class fibonnaci {
    public static void main(String[] args) {
         int n = 6;
         System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1)
            return n;
        int s1 = fibo(n-1);
        int s2 = fibo(n-2);
        return s1+s2;
        
    }
}
