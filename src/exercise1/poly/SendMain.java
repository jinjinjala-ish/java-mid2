package exercise1.poly;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender()};
        for (Sender sender : senders) {
            sender.sendMessage("한영합니다!");
        }
    }
}
