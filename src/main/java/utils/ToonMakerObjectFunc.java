package utils;

import objects.ToonObject;

public interface ToonMakerObjectFunc<T extends ToonObject> {


    public T create(Position2D position, Scale2D scale);
}
