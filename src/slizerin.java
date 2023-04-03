public class slizerin extends student{
private int cunning;
private int determination;
private int ambition;
private int resourcefulness;
private int lustForPower;

    public slizerin(int powerMagic, int transgressionDistance, String name, String surname, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(powerMagic, transgressionDistance, name, surname);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public static void studentComparison(slizerin a, slizerin b){
        int sumA, sumB;
        sumA = a.getCunning()+a.getDetermination()+a.getAmbition()+a.getResourcefulness()+a.getLustForPower();
        sumB = b.getCunning()+b.getDetermination()+b.getAmbition()+b.getResourcefulness()+b.getLustForPower();
        System.out.println(a.getName()+" Cunning= "+a.getCunning()+ " ,Determination= "+ a.getDetermination()+" ,Ambition= "+a.getAmbition()+" ,Resourcefulness= "+a.getResourcefulness()+" ,LustForPower= "+a.getLustForPower()+" , sum bal= "+sumA);
        System.out.println(b.getName()+" Cunning= "+b.getCunning()+ " ,Determination= "+ b.getDetermination()+" ,Ambition= "+b.getAmbition()+" ,Resourcefulness= "+a.getResourcefulness()+" ,LustForPower= "+a.getLustForPower()+" , sum bal= "+sumB);
        if (sumA>sumB){
            System.out.println(a.getName()+" личший Слизеринец, чем "+b.getName());
        } else if (sumB>sumA){
            System.out.println(b.getName()+" личший Слизеринец, чем "+a.getName());
        } else if (sumB==sumA){
            System.out.println(a.getName()+" и "+b.getName()+" одинаково хорошие Слизеринцы");
        }
    }
    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "slizerin{" +
                ", name="+ getName()+
                ", surname="+ getSurname()+
                ", powerMagic="+ getPowerMagic()+
                ", transgressionDistance="+ getTransgressionDistance()+
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
