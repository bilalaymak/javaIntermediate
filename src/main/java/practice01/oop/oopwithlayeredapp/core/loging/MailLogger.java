package practice01.oop.oopwithlayeredapp.core.loging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("mail gonderildi : " + data);
    }
}
