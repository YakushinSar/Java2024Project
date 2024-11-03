package lesson12;

public class Main {

    public static void main(String[] args) {

        Outer.NestedClass nasted1 = new Outer.NestedClass();
        System.out.println(nasted1.getStaticInt());
        Outer.NestedClass nasted2 = new Outer.NestedClass();

        Outer o1 = new Outer(10);
        Outer.InnerClass inner1 = o1.new InnerClass();
        System.out.println(inner1.getInstanceInt());
        System.out.println(inner1.getStaticInt());

        System.out.println(Outer.class);
        System.out.println(o1.getClass());

        Outer o2 = new Outer(150);
        System.out.println(o1.getClass() == o2.getClass());
        System.out.println(nasted1.getClass() == nasted2.getClass());

    }


}
