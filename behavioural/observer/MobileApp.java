public class MobileApp implements Consumer{

    @override
    public void consume(Message message){
        System.out.println(message.content);
    }

}