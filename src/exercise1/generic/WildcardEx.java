package exercise1.generic;

public class WildcardEx {

    static<T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWildcardV1(Box<?>box) {
        System.out.println("? = " + box.get());
    }

    static <T extends BioUnit> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends BioUnit> box) {
        BioUnit bioUnit = box.get();
        System.out.println("이름 = " + bioUnit.getName());
    }

}
