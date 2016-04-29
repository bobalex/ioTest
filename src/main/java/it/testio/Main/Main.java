package it.testio.Main;

import it.testio.closeClass.CloseStream;
import it.testio.interfaces.IMyOpen;
import it.testio.interfaces.IMyReader;
import it.testio.interfaces.IMyTransformer;
import it.testio.openClass.MyOpenFile;
import it.testio.openClass.MyOpenString;
import it.testio.outputClass.OutputStream;
import it.testio.readerClass.MyReaderStream;
import it.testio.transformerClass.TransformStream;

import java.io.InputStream;

/**
 * Main class
 */
public class Main {
    public static void main(final String[] args){

        InputStream tmp;
        byte[] tmpBytes;

        IMyOpen testFileOpen = new MyOpenFile();
        IMyReader testFileRead = new MyReaderStream();
        IMyTransformer testFileTrans = new TransformStream();

        IMyOpen testStringOpen = new MyOpenString();
        IMyReader testStringRead = new MyReaderStream();
        IMyTransformer testStringTrans = new TransformStream();

        try {
            tmp = testFileOpen.openStream("/home/test/project_java/homework_io_git/src/test.txt");
            OutputStream.printFile(testFileRead.myRead(tmp));

            System.out.println(testFileTrans.transformStream(testFileRead.myRead(tmp)));

            CloseStream.closeStream(tmp);
        }catch(java.io.FileNotFoundException e){
            System.out.print("File not found");
        }catch (Exception e) {
            System.out.print("Problem");
        }


        try {
            tmp = testStringOpen.openStream("1.txt\n");
            OutputStream.printFile(testStringRead.myRead(tmp));

            System.out.println(testStringTrans.transformStream(testStringRead.myRead(tmp)));

            CloseStream.closeStream(tmp);
        }catch (Exception e){
            System.out.print("Problem");
        }

    }
}
