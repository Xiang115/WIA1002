package Week1.Tutorial1;

public class Telephone {
    private String areaCode, number;
    static int numberOfTelephoneObject = 0;

    public Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getAreaCode(){
        return areaCode;
    }

    public String getNumber(){
        return number;
    }

    public String makeFullNumber(){
        String String =  areaCode + "-"  + number;
        return String;
    }
}
