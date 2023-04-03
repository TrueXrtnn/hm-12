public class Puffenduy extends Student {
    private int industriousness;
    private int loyalty;
    private int honour;

    public Puffenduy(int powerMagic, int transgressionDistance, String name, String surname, int industriousness, int loyalty, int honour) {
        super(powerMagic, transgressionDistance, name, surname);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honour = honour;
    }
    public static void studentComparison(Puffenduy a, Puffenduy b){
        int sumA, sumB;
        sumA = a.getIndustriousness()+a.getLoyalty()+a.getHonour();
        sumB = b.getIndustriousness()+b.getLoyalty()+b.getHonour();
        System.out.println(a.getName()+" industriousness= "+a.getIndustriousness()+ " ,loyalty= "+ a.getLoyalty()+" ,honour= "+a.getHonour()+" , sum bal= "+sumA);
        System.out.println(b.getName()+" industriousness= "+b.getIndustriousness()+ " ,loyalty= "+ b.getLoyalty()+" ,honour= "+b.getHonour()+" , sum bal= "+sumB);
        if (sumA>sumB){
            System.out.println(a.getName()+" личший Пуффендуйец, чем "+b.getName());
        } else if (sumB>sumA){
            System.out.println(b.getName()+" личший Пуффендуйец, чем "+a.getName());
        } else if (sumB==sumA){
            System.out.println(a.getName()+" и "+b.getName()+" одинаково хорошие Пуффендуйцы");
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    @Override
    public String toString() {
        return "puffenduy{" +
                ", name="+ getName()+
                ", surname="+ getSurname()+
                ", powerMagic="+ getPowerMagic()+
                ", transgressionDistance="+ getTransgressionDistance()+
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honour=" + honour +
                '}';
    }
}
