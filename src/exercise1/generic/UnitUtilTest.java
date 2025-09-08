package exercise1.generic;

public class UnitUtilTest {
    public static void main(String[] args) {

        Marine m1 = new Marine("MARINE1", 40);
        Marine m2 = new Marine("MARINE2", 50);
        Marine resultMarine = UnitUtil.maxHp(m1,m2);
        System.out.println("resultMarine = " + resultMarine);
    }
}
