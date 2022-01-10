import java.util.Scanner;

class student {
    int rollno;
    String name;
    int marks;
    public student(int rollno,String name,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
}
public class NPArray {
    public static void main(String[] args) {

        student arr[]= new student[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=new student(s.nextInt(),s.next(),s.nextInt());

        }
        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i].rollno + "\t" + arr[i].name + "\t" + arr[i].marks);

        }
    }

}
