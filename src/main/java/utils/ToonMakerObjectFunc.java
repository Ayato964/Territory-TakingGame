package utils;

import objects.ToonObjects;

public interface ToonMakerObjectFunc<T extends ToonObjects> {


    public T create(Position2D position, Scale2D scale);
}
