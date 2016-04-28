package it.testio.Main;

import it.testio.ifTtransformer.IMyReader;
import it.testio.transformerFunction.MyReaderString;

/**
 * Main class
 */
public class Main {
    public static void main(final String[] args){
        IMyReader test = new MyReaderString();
        System.out.println(test);
    }
}
