public interface Topic {
    void registerConsumer(Consumer consumer);
    void removeConsume(Consumer consumer);
    void notify(Message message);
}