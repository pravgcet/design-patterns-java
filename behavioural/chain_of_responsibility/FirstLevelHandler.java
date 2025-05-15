public class FirstLevelHandler extends CommandHandler {

    @override
    public void handle(Request request){
        if(request.type == 'Basic'){
            System.out.println("Handling it");
            return;
        }
        if(this.nextHandler != null){
            this.nextHandler.handle();
        }
    }

}