package it.testio.openClass;

import it.testio.interfaces.IMyOpen;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * Created by test on 29.04.16.
 */
public class MyOpenString implements IMyOpen {
    public InputStream openStream(String name) throws Exception{
        InputStream inFile = new ByteArrayInputStream(name.getBytes());
        return inFile;
    }
}
