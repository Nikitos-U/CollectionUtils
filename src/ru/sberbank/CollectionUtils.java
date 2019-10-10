package ru.sberbank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List newArrayList() {
        return new ArrayList<T>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static<T> List limit(List<? extends T> source, int size) {
        return(source.subList(0,size));
    }

    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? super T> c2) {
        return (c2.containsAll(c1));
    }

    public static<T> boolean containsAny(List<? extends T> c1, List<? super T> c2) {
        for (int i = 0; i < c2.size(); i++) {
            if (c2.contains(c1.get(i))) {
                return (true);
            }
        }
        return (false);
    }

    public static<T extends Comparable<T>> List range(List<? extends T> list, T min, T max) {
        List<? super T> result = new ArrayList<>();
        for (T t : list) {
            if ((t.compareTo(min) > 0) && (t.compareTo(max) < 0)) {
                result.add(t);
            }
        }
        return (result);
    }

    public static<T> List range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<? super T> result = new ArrayList<>();
        for (T t : list) {
            if (comparator.compare(t, min) > 0 && comparator.compare(t, max) < 0) {
                result.add(t);
            }
        }
        return (result);
    }
}
