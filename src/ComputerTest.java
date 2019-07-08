public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        computer1.name = "HP";
        computer1.ram = 8;
        computer1.disc = 120;

        computer2.name = "Dell";
        computer2.ram = 4;
        computer2.disc = 240;

        System.out.println("Komputer 1 - nazwa: " + computer1. name + " RAM: " + computer1.ram + " dysk: " + computer1.disc);
        System.out.println("Komputer 2 - nazwa: " + computer2. name + " RAM: " + computer2.ram + " dysk: " + computer2.disc);
    }
}
