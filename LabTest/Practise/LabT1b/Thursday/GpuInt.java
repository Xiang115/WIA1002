package LabTest.Practise.LabT1b.Thursday;

public class GpuInt implements NumberInterface<GpuInt>{
    private int value;

    public GpuInt(){

    }

    public GpuInt(int value) {
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
    public GpuInt fromInteger(int value) {
        return new GpuInt(value);
    }

    @Override
    public Integer toInteger() {
        return value;
    }


    // Operations
    public GpuInt add(GpuInt o) {
        System.out.printf("GPU Debug: %d + %d = %d\n", this.value,
                o.value, this.value + o.value);
        return new GpuInt(this.value + o.value);
    }

    public GpuInt mul(GpuInt o) {
        System.out.printf("GPU Debug: %d * %d = %d\n", this.value,
                o.value, this.value * o.value);
        return new GpuInt(this.value * o.value);
    }
}
