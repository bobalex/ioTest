package it.testio.readerClass;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;


import it.testio.interfaces.IMyReader;

/**
 * Created by test on 28.04.16.
 */
public class MyReaderFile implements IMyReader{
    public byte[] myRead(String name) throws Exception{
        FileInputStream inFile = new FileInputStream(name);
        byte[] tmp = new byte[inFile.available()];
        inFile.read(tmp, 0, inFile.available());
        return tmp;
    }
}
