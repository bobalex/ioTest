package it.testio.readerClass;
import it.testio.interfaces.IMyReader;

/**
 * Created by test on 28.04.16.
 */
public class MyReaderString implements IMyReader{
        public byte[] myRead(String name) throws Exception{
            byte[] tmp = name.getBytes();
            return tmp;
        }
}
