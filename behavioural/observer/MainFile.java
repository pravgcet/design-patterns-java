public class MainFile {

    public static void main(String[] args) {
        Consumer mobileConsumer = new MobileApp();
        Consumer tvConsumer = new TVNotification();

        Message message = new Message("Big day for nerds quiz");

        Topic entertainment = new EntertainmentTopic();
        entertainment.registerConsumer(tvConsumer);
        entertainment.notify(message);
    }
}