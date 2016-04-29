package it.testio.closeClass;

import java.io.FileInputStream;

/**
 * Created by test on 28.04.16.
 */
public class CloseStream{
    public static void closeStream(FileInputStream descStream) throws Exception{
        descStream.close();
    }
}
