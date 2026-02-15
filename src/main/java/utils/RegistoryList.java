package utils;

import objects.ToonObject;

import java.util.HashMap;

public class RegistoryList<T extends ToonObject> extends HashMap<String, RegistoryObject<T>> {

    public RegistoryList(){}

    public T get(String o, int x, int y, int w, int h) {
        RegistoryObject<T> reg = super.get(o);
        return reg.get(x, y, w, h);
    }
    public T get(String o, Position2D position2D, Scale2D scale2D) {
        RegistoryObject<T> reg = super.get(o);
        return reg.get(position2D, scale2D);
    }

    public RegistoryObject<T> create(String s, ToonMakerObjectFunc<T> objectFunc){
        RegistoryObject<T> f = new RegistoryObject<>(objectFunc);
        super.put(s, f);
        return f;
    }

}
