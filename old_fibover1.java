
public class old_fibover1{

    public static long fibo(int n){
        if (n <= 1) 
            return n;
        else 
            return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}

//-------------------------------------------
