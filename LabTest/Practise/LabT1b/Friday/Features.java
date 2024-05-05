package LabTest.Practise.LabT1b.Friday;

import java.util.Collections;
import java.util.List;

public abstract class Features<T extends Comparable<T>> {
    private List<Data<T>> data;

    public Features(List<Data<T>> data) {
        this.data = data;
    }

    public abstract Features<T> datacleaning();

    public <U extends Comparable<U>> Features<T> merge(Features<U> other, Transformer<U, T> converter) {
        for (Data<U> otherData : other.getData())
            data.add(new Data<>(otherData.getUser(), converter.convertFrom(otherData.getData()), otherData.getDate()));
        return this;
    }

    public List<Data<T>> sortByDate(){
        Collections.sort(data);
        return data;
    }

    public List<Data<T>> getData(){
        return data;
    }
}
