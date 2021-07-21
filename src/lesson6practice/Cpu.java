package lesson6practice;

public class Cpu {
    private String cpuType;
    private int cpuCores;
    private double cpuFrequency;
    private Manufacturer cpuManufacturer;

    public Cpu() {
    }

    public Cpu(String cpuType, int cpuCores, double cpuFrequency, Manufacturer cpuManufacturer) {
        this.cpuType = cpuType;
        this.cpuCores = cpuCores;
        this.cpuFrequency = cpuFrequency;
        this.cpuManufacturer = cpuManufacturer;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public Manufacturer getCpuManufacturer() {
        return cpuManufacturer;
    }

    public void setCpuManufacturer(Manufacturer cpuManufacturer) {
        this.cpuManufacturer = cpuManufacturer;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "cpuType='" + cpuType + '\'' +
                ", cpuCores=" + cpuCores +
                ", cpuFrequency=" + cpuFrequency +
                ", cpuManufacturer=" + cpuManufacturer +
                '}';
    }
}
