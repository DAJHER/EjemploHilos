package mx.com.superq.cursos.threads.threadsimplo;

public class Tarea implements Runnable{

    @Override
    public void run() {
        System.out.println("Una tarea MUY IMPORTANTE se esta ejecutando... - " + Thread.currentThread().getName());
    }
}
