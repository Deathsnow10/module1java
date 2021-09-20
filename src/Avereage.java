public class Avereage {
    public static void main(String[] args) {
        student a =new student(10,10,10,10,10);
        student b = new student(9,9,9,9,9);
        //WE CAN ALSO USE THIS
        //a.setmarks(10,10,10,10,10);


        double averagea = (a.subject1 + a.subject2+ a.subject3+ a.subject4+ a.subject5)/5;
        double averageb = (b.subject1 + b.subject2+ b.subject3+ b.subject4+ b.subject5)/5;
        System.out.println(a.percentage());
        System.out.println(b.percentage());

        System.out.println(averagea);
        System.out.println(averageb);
    }
}
