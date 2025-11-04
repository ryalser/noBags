package practice_8.functionalinterface;

public class AnonymousClass {

    public static void main(String[] args) {

        // анонимный класс от Runnable
        Runnable r1 = new Runnable() {

            // переопределяем метод run (от интерфейса Runnable)
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        // обращаемся к r1 и его методу run, который был переопределен
        r1.run();
    }



}
