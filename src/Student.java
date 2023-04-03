public class Student extends Hogwarts {
    private String name;
    private String surname;

    public Student(int powerMagic, int transgressionDistance, String name, String surname) {
        super(powerMagic, transgressionDistance);
        this.name = name;
        this.surname = surname;
        }
    public static void studentComparison(Student a, Student b){
        int sumA, sumB;
        sumA = a.getPowerMagic()+a.getTransgressionDistance();
        sumB = b.getPowerMagic()+b.getTransgressionDistance();
        System.out.println(a.getName()+" PowerMagic= "+a.getPowerMagic()+ " ,TransgressionDistance= "+ a.getTransgressionDistance()+" , sum bal= "+sumA);
        System.out.println(b.getName()+" PowerMagic= "+b.getPowerMagic()+ " ,TransgressionDistance= "+ b.getTransgressionDistance()+" , sum bal= "+sumB);
        if (sumA>sumB){
            System.out.println(a.getName()+" личший ученик, чем "+b.getName());
        } else if (sumB>sumA){
            System.out.println(b.getName()+" личший ученик, чем "+a.getName());
        } else if (sumB==sumA){
            System.out.println(a.getName()+" и "+b.getName()+" одинаково хорошие ученики");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
