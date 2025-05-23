package ageOfEmpiresFlyweight;

import java.util.HashMap;

public class PersonajeFlyweightFactory {

    private static final HashMap<String, PersonajeFlyweight> cache = new HashMap<>();

    public static PersonajeFlyweight getCaballeroFlyweightImpl() {
        String key = "CABALLERO";
        PersonajeFlyweight p = cache.get(key);
        if (p != null) {
            return p;
        } else {
            p = new CaballeroFlyweightImpl();
            cache.put(key, p);
        }
        return p;
    }

    public static PersonajeFlyweight getDragonFlyweightImpl() {
        String key = "DRAGON";
        PersonajeFlyweight p = cache.get(key);
        if (p != null) {
            return p;
        } else {
            p = new DragonFlyweightImpl();
            cache.put(key, p);
        }
        return p;
    }

    public static int getCacheSize() {
        return cache.size();
    }
}
