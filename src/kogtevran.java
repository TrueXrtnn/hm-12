public class kogtevran extends student {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creative;

    public kogtevran(int powerMagic, int transgressionDistance, String name, String surname, int intellect, int wisdom, int wit, int creative) {
        super(powerMagic, transgressionDistance, name, surname);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }
    public static void studentComparison(kogtevran a, kogtevran b){
        int sumA, sumB;
        sumA = a.getIntellect()+a.getWisdom()+a.getWit()+a.getCreative();
        sumB = b.getIntellect()+b.getWisdom()+b.getWit()+b.getCreative();
        System.out.println(a.getName()+" intellect= "+a.getIntellect()+ " ,wisdom= "+ a.getWisdom()+" ,wit= "+a.getWit()+" ,creative= "+a.getCreative()+" , sum bal= "+sumA);
        System.out.println(b.getName()+" intellect= "+b.getIntellect()+ " ,wisdom= "+ b.getWisdom()+" ,wit= "+b.getWit()+" ,creative= "+a.getCreative()+" , sum bal= "+sumB);
        if (sumA>sumB){
            System.out.println(a.getName()+" личший Когтевранец, чем "+b.getName());
        } else if (sumB>sumA){
            System.out.println(b.getName()+" личший Когтевранец, чем "+a.getName());
        } else if (sumB==sumA){
            System.out.println(a.getName()+" и "+b.getName()+" одинаково хорошие Когтевранцы");
        }
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "kogtevran{" +
                ", name="+ getName()+
                ", surname="+ getSurname()+
                ", powerMagic="+ getPowerMagic()+
                ", transgressionDistance="+ getTransgressionDistance()+
                "intellect=" + intellect +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creative=" + creative +
                '}';
    }
}
