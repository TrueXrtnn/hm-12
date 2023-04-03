public class Main {
    public static void main(String[] args) {

        griffindor[] Griffindor={
                new griffindor(4,4,"Гарри","Поттер",5,3,7),
                new griffindor(4,4,"Гермиона","Грейджер",5,3,7),
                new griffindor(4,4,"Рон","Уизли",5,3,7)
        };
        System.out.println(Griffindor[0]);
        griffindor.studentComparison(Griffindor[0],Griffindor[1]);
        student.studentComparison(Griffindor[0],Griffindor[1]);
    }
}