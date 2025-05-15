public class ThirdLevelHandler extends CommandHandler {

    @override
    public void handle(Request request){
        if(request.type == 'Advance'){
            System.out.println("Handling it");
            return;
        }
        if(this.nextHandler != null){
            this.nextHandler.handle();
        }
    }

}