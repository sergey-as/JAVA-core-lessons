package lesson6practice;

public class Disk {
    private String diskModel;
    private DiskType diskType;
    private int diskSpace;
    private Manufacturer diskManufacturer;

    public Disk() {
    }

    public Disk(String diskModel, DiskType diskType, int diskSpace, Manufacturer diskManufacturer) {
        this.diskModel = diskModel;
        this.diskType = diskType;
        this.diskSpace = diskSpace;
        this.diskManufacturer = diskManufacturer;
    }

    public String getDiskModel() {
        return diskModel;
    }

    public void setDiskModel(String diskModel) {
        this.diskModel = diskModel;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }

    public int getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Manufacturer getDiskManufacturer() {
        return diskManufacturer;
    }

    public void setDiskManufacturer(Manufacturer diskManufacturer) {
        this.diskManufacturer = diskManufacturer;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "diskModel='" + diskModel + '\'' +
                ", diskType=" + diskType +
                ", diskSpace=" + diskSpace +
                ", diskManufacturer=" + diskManufacturer +
                '}';
    }
}
