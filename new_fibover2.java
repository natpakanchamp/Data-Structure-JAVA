public class new_fibover2 {
public static long fibo2(int n){
    long [] f = new long[n+1]; // ต้องเป็น n+1 เนื่องจากมันต้องทำงานตั้งแต่ 0 ไปจนถึง n+1 ตัว
    f[0] = 0; // ตัวแรกเริ่มที่ 0
    f[1] = 1; // ตัวที่สองเริ่มตัวที่ 1
    for (int i=2; i<=n; i++){
        f[i] = f[i-1] + f[i-2];
    }

    return f[n];
}

    public static void main(String[] args) {
        System.out.println(fibo2(100));
    }
}

