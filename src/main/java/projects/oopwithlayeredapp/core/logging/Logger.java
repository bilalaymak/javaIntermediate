package projects.oopwithlayeredapp.core.logging;

public interface Logger {
    /*
    Loglama, bir programın çalışması sırasında çeşitli olayların kaydedilmesi ve raporlanmasıdır.
    Loglama ve inheritance bir arada kullanıldığında, miras alan sınıfın özellikleri ve yöntemleri,
    loglama işlevselliği ile genişletilebilir ve bu sayede miras alan sınıftaki işlemlerin izlenmesi
    ve kaydedilmesi kolaylaşır.
    Örneğin, miras alınan sınıfın belirli bir yöntemi çağrıldığında,
    loglama kodu bu çağrının kaydedilmesini ve belirli bir dosyaya yazdırılmasını sağlayabilir.
    Bu şekilde, programın çalışması izlenebilir ve hata ayıklanabilir hale getirilebilir.
     */

    void log(String data);








}
