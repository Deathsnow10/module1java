import java.util.Scanner;

/*
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers.
 */
public class BIKERS {
    public static void main(String[] args){
        float r1,r2,r3,r4,r5,avg;
        System.out.println("Enter The speed the racers : ");
        Scanner sc = new Scanner(System.in);
        r1=sc.nextFloat();
        r2=sc.nextFloat();
        r3=sc.nextFloat();
        r4=sc.nextFloat();
        r5=sc.nextFloat();
        avg=(r1+r2+r3+r4+r5)/5;
        System.out.println(avg);
        if (r1>avg){
            System.out.println("Racer R1 qualified");
        }
        if (r2>avg){
            System.out.println("Racer R2 qualified");
        }
        if (r3>avg){
            System.out.println("Racer R3 qualified");
        }
        if (r4>avg){
            System.out.println("Racer R4 qualified");
        }
        if (r5>avg){
            System.out.println("Racer R5 qualified");
        }
        // using for loop
        int a[]=new int[5];
        System.out.println(" Input in an array");
        a[0]= sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]=sc.nextInt();
        a[4]=sc.nextInt();
        int newavg= (a[1]+a[2]+a[3]+a[4]+a[4])/5;
        System.out.println(newavg);
        for(int i=0;i<=4;i++){
            if (a[i]>newavg){
                System.out.println(" The racer "+(i+1)+" qualified");
            }
        }
    }
}
