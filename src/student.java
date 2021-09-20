class student {
        double subject1;
        double subject2;
        double subject3;
        double subject4;
        double subject5;
        double percentage() {
                return ((this.subject1+this.subject2+this.subject3+this.subject4+this.subject5)/50)*100;
        }
        void setmarks(double a, double b, double c, double d, double e){
                subject1 = a;
                subject2 = b;
                subject3 = c;
                subject4 = d;
                subject5 = e;
        }
        student(double a, double b, double c, double d, double e){
                subject1 = a;
                subject2 = b;
                subject3 = c;
                subject4 = d;
                subject5 = e;
        }
}
