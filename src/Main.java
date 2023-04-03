public class Main {
    public static void main(String[] args) {

        Griffindor[] griffindor={
                new Griffindor(4,4,"Гарри","Поттер",5,3,7),
                new Griffindor(4,4,"Гермиона","Грейджер",5,3,7),
                new Griffindor(4,4,"Рон","Уизли",5,3,7)
        };
        System.out.println(griffindor[0]);

        Student.studentComparison(griffindor[0],griffindor[1]);

    }
}