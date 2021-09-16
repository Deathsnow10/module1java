import java.security.SecureRandom;

public class ATM {
    public static void main(String[] args){
        float a=45 ,b=120,c;
        c=a%5;
        if(c==0&&b>a){
            b=b-a-0.5f;
            System.out.println(b);
        }
        else{
            System.out.println(b);

        }
    }
}
