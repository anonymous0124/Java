/**
 * Product
 */
public class product {

    public static int pro(int num0) {
        if(num0>0){
            return num0 * pro( num0 - 1);
        }
        else{
            return 1;
        }
    }
    public static int pro1(int num1) {
        if(num1>0){
            return num1 * pro( num1 - 1);
        }
        else{
            return 1;
        }
    }
    public static int pro2(int num2) {
        if(num2>0){
            return num2 * pro( num2 - 1);
        }
        else{
            return 1;
        }
    }
    public static int pro3(int num3) {
        if(num3>0){
            return num3 * pro( num3 - 1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int r1=pro(11);
        int r2=pro1(12);
        int r3=pro2(13);
        int r4=pro3(14);


        System.out.println("r1="+r1);
        System.out.println("r1="+r2);
        System.out.println("r1="+r3);
        System.out.println("r1="+r4);
    }
}
