public class ResearchTopic implements Topic{

    private List<Consume> consumers ;

    public ResearchTopic(){
        this.consumers = new ArrayList<>();
    }

    @override
    public void registerConsumer(Consumer consumer){
        consumer.add(consumer);
    }

    @override
    public void removeConsumer(Consumer consumer){
        consumer.remove(consumer);
    }

    @override
    public void notify(Message message){
        for(Consumer c : consumers){
            c.consume(message);
        }
    }

}