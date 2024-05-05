package LabTest.Practise.LabT1b.Friday;

public class Data<T extends Comparable<T>> implements Comparable<Data<T>> {
    private String user;
    private T data;
    private int date;

    public Data(String user, T data, int date){
        this.user = user;
        this.data = data;
        this.date = date;
    }

    public int compareTo(T other) {
        return this.data.compareTo(other);
    }

    public int compareTo(Data<T> o){
        return this.date - o.date;
    }

    public String getUser() {
        return user;
    }

    public T getData() {
        return data;
    }

    public int getDate() {
        return date;
    }

    public void setData(T data){
        this.data = data;
    }
}
