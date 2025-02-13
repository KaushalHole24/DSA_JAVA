package Java_Basic;
import java.util.*;

public class IMP_functionReuse {

    public static int fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static int binoCoe(int n, int r){
        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n-r);

        int binoCoe = nfact/(rfact*nmrfact);
        return binoCoe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int Binomial_Coefficient = binoCoe(n,r);
        System.out.println(Binomial_Coefficient);
        sc.close();
    }
}
