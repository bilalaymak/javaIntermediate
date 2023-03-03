package projects.oopwithlayeredapp.core.logging;

public class Filelogger implements Logger {


    @Override
    public void log(String data) {
        System.out.println("dosyaya loglandi : " + data);
    }
}
