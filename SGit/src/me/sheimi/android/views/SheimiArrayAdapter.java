package me.sheimi.android.views;

import java.util.Collection;

import android.content.Context;
import android.widget.ArrayAdapter;

public class SheimiArrayAdapter<T> extends ArrayAdapter<T> {

    public SheimiArrayAdapter(Context context, int resource) {
        super(context, resource);
    }

    public void adapterAddAll(Collection<? extends T> collection) {
        for (T item : collection) {
            add(item);
        }
    }

    public void adapterAddAll(T[] collection) {
        for (T item : collection) {
            add(item);
        }
    }
    
}
