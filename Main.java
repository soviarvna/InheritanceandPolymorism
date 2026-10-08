public class Main {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("burgundy");
        b.printInfo();

        BujurSangkar bs = new BujurSangkar(9, "coklat");
        bs.printInfo();

        Lingkaran l = new Lingkaran(5, "cream");
        l.printInfo();

        Silinder s = new Silinder(20, 7, "abu-abu");
        s.printInfo();
    }
}