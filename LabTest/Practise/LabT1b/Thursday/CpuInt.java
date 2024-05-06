package LabTest.Practise.LabT1b.Thursday;

public class CpuInt implements NumberInterface<CpuInt>{
    private int value;

    public CpuInt(){

    }

    public CpuInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s[%d]", getDevice(), this.value);
    }

    @Override
    public String getDevice() {
        return "CPU";
    }

    @Override
    public CpuInt fromInteger(int value) {
        return new CpuInt(value);
    }

    @Override
    public Integer toInteger() {
        return value;
    }

    // Operations
    public CpuInt add(CpuInt o) {
        System.out.printf("CPU Debug: %d + %d = %d\n", this.value, o.value, this.value + o.value);
        return new CpuInt(this.value + o.value);
    }

    public CpuInt mul(CpuInt o) {
        System.out.printf("CPU Debug: %d * %d = %d\n", this.value,
                o.value, this.value * o.value);
        return new CpuInt(this.value * o.value);
    }
}
