package it.testio.Main;

import it.testio.interfaces.IMyReader;
import it.testio.outputClass.OutputFile;
import it.testio.readerClass.MyReaderFile;
import it.testio.readerClass.MyReaderString;

import java.rmi.server.ExportException;

/**
 * Main class
 */
public class Main {
    public static void main(final String[] args){

        IMyReader testFile = new MyReaderString();
        IMyReader testString = new MyReaderFile();

        try {
            OutputFile.printFile(testFile.myRead("/home/test/project_java/homework_io_git/src/test.txt"));
            OutputFile.printFile(testString.myRead("Hello, world(String)"));
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("The file does not exist: " + e);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Problem with index: " + e);
        }
        catch (Exception e){
            System.out.println("Some problem: " + e);
        }
    }
}
