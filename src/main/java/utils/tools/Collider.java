package utils.tools;

import objects.ToonObject;

import java.util.ArrayList;

public interface Collider extends ToolObjectTools{

    public void inObject(ArrayList<ToonObject> targets);
}
