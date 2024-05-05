package LabTest.Practise.LabT1b.Friday;

import java.util.List;
import java.util.Iterator;

public class Login extends Features<Coordinates>{

    public Login(List<Data<Coordinates>> data){
        super(data);
    }

    @Override
    public Features<Coordinates> datacleaning() {
        Iterator<Data<Coordinates>> iterator = getData().iterator();
        while(iterator.hasNext()){
            Data<Coordinates> temp = iterator.next();
            if(!temp.getData().isValid()){
                iterator.remove();
            }
        }
        return this;
    }
}
