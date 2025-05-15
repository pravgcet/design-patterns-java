public abstract class AbstractPenStandCompany {

    public void doSomething(){
        PenStand penStand = getStandObject();
        penStand.place();
    }

    public abstract PenStand getStandObject();

}