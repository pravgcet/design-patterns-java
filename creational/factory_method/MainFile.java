package factory_method

public class MainFile {

    public static void main(String() args){
        AbstractPenStandCompany glueCompany = new GlueCompany();
        glueCompany.doSomething();

        AbstractPenStandCompany tableCompany = new Tablecompany();
        tableCompany.doSomething();

    }

}