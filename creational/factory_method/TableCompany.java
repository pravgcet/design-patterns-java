public class TableCompany extends AbstractPenStandCompany {

    @override
    public PenStand getStandObject(){
        return new TablePenStand();
    }
}