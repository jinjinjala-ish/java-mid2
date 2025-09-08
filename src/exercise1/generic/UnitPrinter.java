package exercise1.generic;

public class UnitPrinter {

    public static <T extends BioUnit>  void printV1(Shuttle<T> t) {
        T unit = t.out();
        System.out.println("이름: " + unit.getName() + ", 체력: " + unit.getHp());
    }

    public static void printV2 (Shuttle<? extends BioUnit> t) {
        BioUnit unit = t.out();
        System.out.println("이름: " + unit.getName() + ", 체력: " + unit.getHp());
    }
}
