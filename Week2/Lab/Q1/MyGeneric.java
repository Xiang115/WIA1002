package Week2.Lab.Q1;

public class MyGeneric<e> {
    private e E;

    public MyGeneric(){

    }

    public MyGeneric(e E){
        this.E = E;
    }

    public void setE(e E){
        this.E = E;
    }

    public e getE(){
        return E;
    }
}
