package lesson6practice;

public class Main {
    public static void main(String[] args) {
//
//        Створити список з 20 об'єктів.
//        Далі
//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник SSD Китай
//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник дисків не Китай
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//        та процессор і7 посортувати за ціною

        Disk disk1 = new Disk("disk1",DiskType.HDD,300,Manufacturer.INDIA);
        Disk disk2 = new Disk("disk2",DiskType.HDD,700,Manufacturer.CHINA);
        Disk disk3 = new Disk("disk3",DiskType.SSD,516,Manufacturer.KOREA);
        Disk disk4 = new Disk("disk4",DiskType.HDD,120,Manufacturer.INDIA);
        Disk disk5 = new Disk("disk5",DiskType.SSD,256,Manufacturer.CHINA);
        Disk disk6 = new Disk("disk6",DiskType.SSD,1000,Manufacturer.USA);
        Disk disk7 = new Disk("disk7",DiskType.HDD,1000,Manufacturer.KOREA);
        Disk disk8 = new Disk("disk8",DiskType.SSD,750,Manufacturer.USA);
        Disk disk9 = new Disk("disk9",DiskType.SSD,128,Manufacturer.USA);

        Cpu cpu1 = new Cpu("i3",2,2.4,Manufacturer.CHINA);
        Cpu cpu2 = new Cpu("i5",2,2.8,Manufacturer.INDIA);
        Cpu cpu3 = new Cpu("i7",4,3.4,Manufacturer.USA);
        Cpu cpu4 = new Cpu("pentium",2,3.84,Manufacturer.KOREA);
        Cpu cpu5 = new Cpu("celeron",2,2.45,Manufacturer.CHINA);

        Computer computer1 = new Computer("DELL1",2018,16,1700,disk1,);

        System.out.println("China, Korea, India, USA".toUpperCase());
    }
}
