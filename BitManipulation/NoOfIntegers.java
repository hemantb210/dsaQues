package BitManipulation;

public class NoOfIntegers {
    public static void main(String[] args) {
        find(5);
    }

    public static void find(int n) {
        int count=0;
        for (int x = 0; x <=n ; x++) {
            if((n&x)==x){count++;}
        }
        System.out.println(count);

    }

}
