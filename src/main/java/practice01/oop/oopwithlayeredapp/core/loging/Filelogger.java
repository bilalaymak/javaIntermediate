package practice01.oop.oopwithlayeredapp.core.loging;

public class Filelogger implements Logger {


    @Override
    public void log(String data) {
        System.out.println("dosyaya loglandi : " + data);
    }
}
