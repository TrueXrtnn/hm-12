public class Griffindor extends Student {
    private int nobility;
    private int honor;
    private int honesty;

    public Griffindor(int powerMagic, int transgressionDistance, String name, String surname, int nobility, int honor, int honesty) {
        super(powerMagic, transgressionDistance, name, surname);
        this.nobility = nobility;
        this.honor = honor;
        this.honesty = honesty;
    }
    public static void studentComparison(Griffindor a, Griffindor b){
        int sumA, sumB;
        sumA = a.getHonor()+a.getHonesty()+a.getNobility();
        sumB = b.getHonor()+b.getHonesty()+b.getNobility();
        System.out.println(a.getName()+" nobility= "+a.getNobility()+ " ,honor= "+ a.getHonor()+" ,honesty= "+a.getHonesty()+" , sum bal= "+sumA);
        System.out.println(b.getName()+" nobility= "+b.getNobility()+ " ,honor= "+ b.getHonor()+" ,honesty= "+b.getHonesty()+" , sum bal= "+sumB);
        if (sumA>sumB){
            System.out.println(a.getName()+" личший Гриффиндорец, чем "+b.getName());
        } else if (sumB>sumA){
            System.out.println(b.getName()+" личший Гриффиндорец, чем "+a.getName());
        } else if (sumB==sumA){
            System.out.println(a.getName()+" и "+b.getName()+" одинаково хорошие Гриффендорцы");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "griffindor{" +
                ", name="+ getName()+
                ", surname="+ getSurname()+
                ", powerMagic="+ getPowerMagic()+
                ", transgressionDistance="+ getTransgressionDistance()+
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", honesty=" + honesty +
                '}';
    }
}
