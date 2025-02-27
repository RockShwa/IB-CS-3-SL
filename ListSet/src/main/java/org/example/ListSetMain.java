package org.example;

public class ListSetMain {
    public static void main(String[] args) {
        ListSet<String> set = new ListSet<String>();
        set.add(0, "HELLO");
		set.add(1, "BYEBYE");
		set.add(2, "WHOA");

        System.out.println(set);
    }
}
