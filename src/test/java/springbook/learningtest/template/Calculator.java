package springbook.learningtest.template;

import org.hamcrest.Matcher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by dw on 2016. 1. 19..
 */
public class Calculator {
    BufferedReader br = null;

    public Integer calcSum(String filepath) throws IOException {
        BufferedReaderCallBack sumCallback =
                new BufferedReaderCallBack() {
                    @Override
                    public Integer doSomethingWithReader(BufferedReader br) throws IOException {
                        Integer sum = 0;
                        String line = null;
                        while ((line = br.readLine()) != null) {
                            sum += Integer.valueOf(line);
                        }
                        return sum;
                    }
                };
        return fileReadTemplate(filepath, sumCallback);
    }

    public Integer fileReadTemplate(String filepath, BufferedReaderCallBack callBack) throws IOException {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filepath));
            int ret = callBack.doSomethingWithReader(br);
            return ret;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        finally {
            if (br != null) {
                try{ br.close(); }
                catch (IOException e) { System.out.println(e.getMessage()); }
            }
        }
    }

    public Integer calcMultiply(String filepath) throws IOException {
        BufferedReaderCallBack multiplyCallback =
                new BufferedReaderCallBack() {
                    @Override
                    public Integer doSomethingWithReader(BufferedReader br) throws IOException {
                        Integer multiply = 1;
                        String line = null;
                        while ((line = br.readLine()) != null) {
                            multiply *= Integer.valueOf(line);
                        }
                        return multiply;
                    }
                };
        return fileReadTemplate(filepath, multiplyCallback);
    }
}
