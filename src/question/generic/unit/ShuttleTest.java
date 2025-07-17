package question.generic.unit;

public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("marine",100));
        shuttle1.showInfo();

        Shuttle<Zealot> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zealot("ZEALOT",200));
        shuttle2.showInfo();

        Shuttle<Zerglin> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zerglin("zerglin",300));
        shuttle3.showInfo();

    }
}
