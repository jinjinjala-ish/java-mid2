package question.generic.unit;

import question.generic.unit.Marine;
import question.generic.unit.Zealot;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("MARINE1", 40);
        Marine m2 = new Marine("MARINE2", 50);
        Marine resultMarine = UnitUtil.maxHp(m1,m2);
        System.out.println("resultMarine = " + resultMarine);

        Zealot z1 = new Zealot("ZEALOT1", 100);
        Zealot z2 = new Zealot("ZEALOT2", 200);
        Zealot resultZealot = UnitUtil.maxHp(z1, z2);
        System.out.println("resultZealot = " + resultZealot);
    }
}
