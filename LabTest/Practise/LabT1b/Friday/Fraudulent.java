package LabTest.Practise.LabT1b.Friday;

import java.util.List;
import java.util.Iterator;

public class Fraudulent<T extends Comparable<T>> extends Features<T> implements Comparable<Fraudulent<T>>{
    public Fraudulent(List<Data<T>> data) {
        super(data);
    }

    @Override
    public int compareTo(Fraudulent<T> o) {
        return 0;
    }

    @Override
    public Fraudulent<T> datacleaning() {
        Iterator<Data<T>> iterator = getData().iterator();
        while (iterator.hasNext()) {
            Data<T> fraudulentData = iterator.next();
            T value = fraudulentData.getData();
            if (value == null || value instanceof Double aDouble && (aDouble < 0 || aDouble > 1)) iterator.remove();
        }
        return this;
    }

    public Fraudulent<T> transformation(Transformer<T, T> transformer) {
        for (Data<T> fradulentData : getData())
            fradulentData.setData(transformer.convertFrom(fradulentData.getData()));
        return this;
    }

    @Override
    public <E extends Comparable<E>> Fraudulent<T> merge(Features<E> other, Transformer<E, T> converter) {
        return (Fraudulent<T>) super.merge(other, converter);
    }
}
