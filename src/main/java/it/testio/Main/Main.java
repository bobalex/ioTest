package it.testio.Main;

import it.testio.interfaces.IMyOpen;
import it.testio.interfaces.IMyReader;
import it.testio.openClass.MyOpenFile;
import it.testio.openClass.MyOpenString;
import it.testio.outputClass.OutputStream;
import it.testio.readerClass.MyReaderStream;

import java.io.InputStream;

/**
 * Main class
 */
public class Main {
    public static void main(final String[] args){

        IMyOpen testFileOpen = new MyOpenFile();
        IMyReader testFileRead = new MyReaderStream();

        IMyOpen testStringOpen = new MyOpenString();
        IMyReader testStringRead = new MyReaderStream();

        try {
            InputStream tmp = testFileOpen.openStream("/home/test/project_java/homework_io_git/src/test.txt");
            OutputStream.printFile(testFileRead.myRead(tmp));
        }catch(java.io.FileNotFoundException e){
            System.out.print("File not found");
        }catch (Exception e){
            System.out.print("Problem");
        }

        try {
            InputStream tmp = testStringOpen.openStream("1.txt");
            OutputStream.printFile(testStringRead.myRead(tmp));
        }catch (Exception e){
            System.out.print("Problem");
        }



    }
}
