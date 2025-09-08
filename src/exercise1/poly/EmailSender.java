package exercise1.poly;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송: " + message);
    }
}
