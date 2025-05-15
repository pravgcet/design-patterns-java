public class GlueCompany extends AbstractPenStandCompany {

    @override
    public PenStand getStandObject(){
        return new GluePenStand();
    }
}