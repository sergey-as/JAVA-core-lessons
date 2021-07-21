package lesson6practice;

public class Computer {

    private String computerModel;
    private int computerManufacturedYear;
    private int computerRam;
    private int computerPrice;
    private Disk computerDisk;
    private Cpu computerCpu;

    public Computer() {
    }

    public Computer(String computerModel, int computerManufacturedYear, int computerRam,
                    int computerPrice, Disk computerDisk, Cpu computerCpu) {
        this.computerModel = computerModel;
        this.computerManufacturedYear = computerManufacturedYear;
        this.computerRam = computerRam;
        this.computerPrice = computerPrice;
        this.computerDisk = computerDisk;
        this.computerCpu = computerCpu;
    }

    public String getComputerModel() {
        return computerModel;
    }

    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    public int getComputerManufacturedYear() {
        return computerManufacturedYear;
    }

    public void setComputerManufacturedYear(int computerManufacturedYear) {
        this.computerManufacturedYear = computerManufacturedYear;
    }

    public int getComputerRam() {
        return computerRam;
    }

    public void setComputerRam(int computerRam) {
        this.computerRam = computerRam;
    }

    public int getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(int computerPrice) {
        this.computerPrice = computerPrice;
    }

    public Disk getComputerDisk() {
        return computerDisk;
    }

    public void setComputerDisk(Disk computerDisk) {
        this.computerDisk = computerDisk;
    }

    public Cpu getComputerCpu() {
        return computerCpu;
    }

    public void setComputerCpu(Cpu computerCpu) {
        this.computerCpu = computerCpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerModel='" + computerModel + '\'' +
                ", computerManufacturedYear=" + computerManufacturedYear +
                ", computerRam=" + computerRam +
                ", computerPrice=" + computerPrice +
                ", computerDisk=" + computerDisk +
                ", computerCpu=" + computerCpu +
                '}';
    }
}
