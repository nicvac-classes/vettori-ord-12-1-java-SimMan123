import java.util.*;
import java.lang.Math;

class Program {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, ns0, ns1, ns2;

        n = input.nextInt();
        int[] v = new int[n];

        riempi(v, n);
        ns0 = 0;
        ns1 = 0;
        ns2 = 0;
        ns0 = bublesort0(v, n, ns0);
        ns1 = bublesort0(v, n, ns1);
        ns2 = bublesort0(v, n, ns2);
    }
    
    public static int bublesort0(int[] v, int n, int ns) {
        int i, j, y;

        for (i = 0; i <= n - 1; i++) {
            j = 0;
            while (j <= n - 2) {
                if (v[j] > v[j + 1]) {
                    y = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = y;
                    ns = ns + 1;
                }
                j = j + 1;
            }
        }
        
        return ns;
    }
    
    public static int bublesort1(int[] v, int n, int ns) {
        int i, j, y;

        for (i = 0; i <= n - 1; i++) {
            j = 0;
            while (j <= n - 2 - i) {
                if (v[j] > v[j + 1]) {
                    y = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = y;
                    ns = ns + 1;
                }
                j = j + 1;
            }
        }
        
        return ns;
    }
    
    public static int bublesort2(int[] v, int n, int ns) {
        int i, j, y;

        i = 0;
        boolean sc;

        sc = true;
        while (i <= n - 1 && sc) {
            j = 0;
            sc = false;
            while (j <= n - 2 - i) {
                if (v[j] > v[j + 1]) {
                    y = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = y;
                    sc = true;
                    ns = ns + 1;
                }
                j = j + 1;
            }
            i = i + 1;
        }
        
        return ns;
    }
    
    public static void numeroScambi(int ns0, int ns1, int ns2) {
        if (ns0 > ns1) {
            if (ns0 > ns2) {
                System.out.println("maggiore : ns0");
            } else {
                System.out.println("maggiore : ns2");
            }
        } else {
            if (ns1 > ns2) {
                System.out.println("maggiore : ns1 ");
            } else {
                System.out.println("maggiore : ns2");
            }
        }
    }
    
    public static void riempi(int[] v, int n) {
        int i, r;

        r = n * 10;
        for (i = 0; i <= n - 1; i++) {
            v[i] = random.nextInt(r);
        }
    }
}
