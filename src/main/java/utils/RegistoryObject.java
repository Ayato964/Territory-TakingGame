package utils;


import objects.ToonObjects;

public class RegistoryObject<T extends ToonObjects>{

    private final ToonMakerObjectFunc<T> t;

    public RegistoryObject(ToonMakerObjectFunc<T> o){
        t = o;
    }

    public T get(int x, int y, int w, int h){
        return get(new Position2D(x, y), new Scale2D(w, h));
    }

    public T get(Position2D position, Scale2D scale){
        return t.create(position, scale);
    }
}
