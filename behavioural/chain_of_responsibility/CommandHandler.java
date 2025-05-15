public class CommandHandler {

    private CommandHandler nextHandler;

    protected void setNextHandler(CommandHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Request request);

}