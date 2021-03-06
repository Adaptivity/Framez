package com.amadornes.framez.util;

import java.util.Comparator;
import java.util.List;

@SuppressWarnings("rawtypes")
public class SorterElementCount implements Comparator<List> {

    @Override
    public int compare(List o1, List o2) {

        return Integer.compare(o1.size(), o2.size());
    }

}
