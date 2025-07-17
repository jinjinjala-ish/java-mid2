package question.generic.unit;

public class UnitPrinterTest {

    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("marine",40));

        Shuttle<Zealot> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zealot("ZEALOT", 50));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle2);
    }
}
