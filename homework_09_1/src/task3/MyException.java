package task3;
public class MyException extends Exception{

    //створюємо конструктор батьківського класу
    //Alt + Insert -> Constructor (message:String)
    public MyException(String message) {
        super(message);
    }
}
