package Week2.Tutorial2;

public class Container<T>{
    private T t;

    public void add(T data){
        this.t = data;
    }

    public T retrieve(){
        return t;
    }
}