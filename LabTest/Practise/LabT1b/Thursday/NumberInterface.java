package LabTest.Practise.LabT1b.Thursday;

public interface NumberInterface<T> {
    public T fromInteger(int value);
    public Integer toInteger();
    public T add(T o);
    public T mul(T o);
    public String getDevice();
}
