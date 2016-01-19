package springbook.learningtest.template;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by dw on 2016. 1. 19..
 */
public interface BufferedReaderCallBack {
    Integer doSomethingWithReader(BufferedReader br) throws IOException;
}
