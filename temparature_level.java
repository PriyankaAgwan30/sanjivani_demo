import java.util.*;
public class temparature_level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temparature in Farhanite : ");
        int num = sc.nextInt();

        if(num < 98) {
            System.out.println("TEMPARATURE IS - COLD !");
        } else if(num >= 98 && num < 150) {
            System.out.println("TEMPARATURE IS - WARM !");
        } else {
            System.out.println("TEMPARATURE IS - HOT !");
        }
    }
}
