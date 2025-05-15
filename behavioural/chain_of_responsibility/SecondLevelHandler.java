public class SecondLevelHandler extends CommandHandler {

    @override
    public void handle(Request request){
        if(request.type == 'Medium'){
            System.out.println("Handling it");
            return;
        }
        if(this.nextHandler != null){
            this.nextHandler.handle();
        }
    }

}