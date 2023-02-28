package practice01.oop.oopwithlayeredapp.core.loging;

public class DatabaseLogger implements Logger {


    @Override
    public void log(String data) {
        System.out.println("veritabanina loglandi : " + data);
    }
}
