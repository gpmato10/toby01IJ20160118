package springbook.user.dao;

/**
 * Created by dw on 2016. 1. 20..
 */
public interface LineCallback<T> {
    T doSomethingWithLine(String line, T value);
}
