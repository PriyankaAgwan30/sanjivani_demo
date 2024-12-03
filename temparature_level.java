import java.util.*;
public class temparature_level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temparature in Farhanite : ");
        int num = sc.nextInt();

        if(num < 98) {
            System.out.println("Temparature is COLD !");
        } else if(num >= 98 && num < 150) {
            System.out.println("Temparature is WARM !");
        } else {
            System.out.println("Temparature is HOT !");
        }
    }
}
