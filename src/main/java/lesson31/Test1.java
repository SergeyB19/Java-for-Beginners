package lesson31;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(100);
        System.out.println(info2);
        Integer i = info2.getValue();

    }

  /*  public void abc(Info<String> info) {
        String s = info.getValue();
    }

    public void abc(Info<Integer> info) {
        Integer i = info.getValue();
    }*/
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
    /*public void abc(Info<String> info) {
        Integer i = info.getValue();
    }*/
}
