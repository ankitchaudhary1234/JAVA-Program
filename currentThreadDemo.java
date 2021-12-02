public class currentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread: " + t);
        t.setName("My Thread");
        System.out.println("after name change: "+ t);
            for (int n = 5; n > 0; n--)
                System.out.println(n);


            }
        }


