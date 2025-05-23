package ageOfEmpiresFlyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> mapa = new ArrayList<>();

        Caballero c1 = new Caballero("Caballero1", 10);
        Caballero c2 = new Caballero("Caballero2", 9);
        Caballero c3 = new Caballero("Caballero3", 11);

        Dragon dragon1 = new Dragon("Dragon1", 100);
        Dragon dragon2 = new Dragon("Dragon2", 120);
        Dragon dragon3 = new Dragon("Dragon3", 110);

        mapa.add(c1);
        mapa.add(c2);
        mapa.add(c3);
        mapa.add(dragon1);
        mapa.add(dragon2);
        mapa.add(dragon3);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(dragon1.toString());
        System.out.println(dragon2.toString());
        System.out.println(dragon3.toString());

        System.out.println("Objetos: " + mapa.size());
        System.out.println("Cache: " + PersonajeFlyweightFactory.getCacheSize());
    }
}

