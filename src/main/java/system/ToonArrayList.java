package system;

import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ToonArrayList<T> extends CopyOnWriteArrayList<T> {
    private  Consumer<T> addObject;
    public ToonArrayList(Consumer<T> addObject){
        this.addObject = addObject;
    }

    @Override
    public boolean add(T t) {
        boolean b = super.add(t);
        addObject.accept(t);
        return b;
    }
}
