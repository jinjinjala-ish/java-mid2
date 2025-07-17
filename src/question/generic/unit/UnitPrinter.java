package question.generic.unit;

import question.generic.unit.BioUnit;

public class UnitPrinter {
    public static<T extends BioUnit> void  printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", hp: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t2) {
        BioUnit unit = t2.out();
        System.out.println("이름: " + unit.getName() + ", hp: " + unit.getHp());
    }
}
