package it.testio.Main;
import it.testio.closeClass.CloseStream;
import it.testio.interfaces.*;
import it.testio.openClass.MyOpenReadFile;
import it.testio.openClass.MyOpenWriteFile;
import it.testio.outputClass.MyOutputStream;
import it.testio.readerClass.MyReaderStream;
import it.testio.transformerClass.TransformStream;
import it.testio.writeClass.MyWriteStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Main class
 */
public class Main {
    public static void main(final String[] args){

        InputStream descInStream;
        OutputStream descOutStream;

        byte[] tmpBytes;

        IMyOpenRead testFileOpenRead = new MyOpenReadFile();
        IMyOpenWrite testFileOpenWrite = new MyOpenWriteFile();
        IMyWriter testFileWrite = new MyWriteStream();
        IMyReader testFileRead = new MyReaderStream();
        IMyTransformer testFileTrans = new TransformStream();

   //     IMyOpenRead testStringOpen = new MyOpenReadString();
     //   IMyReader testStringRead = new MyReaderStream();
       // IMyTransformer testStringTrans = new TransformStream();

        try {
            descInStream = testFileOpenRead.openStream("/home/test/project_java/homework_io_git/src/test.txt");
            descOutStream = testFileOpenWrite.openStream("1.txt");

            tmpBytes = testFileRead.myRead(descInStream);
            MyOutputStream.printFile(tmpBytes);



            System.out.println(testFileTrans.transformStream(testFileRead.myRead(descInStream)));
            CloseStream.closeStream(descInStream);
        }catch(java.io.FileNotFoundException e){
            System.out.print("File not found");
        }catch (Exception e) {
            System.out.print("Problem");
        }


//        try {
  //          tmp = testStringOpen.openStream("1.txt\n");
    //        MyOutputStream.printFile(testStringRead.myRead(tmp));
//
  //          System.out.println(testStringTrans.transformStream(testStringRead.myRead(tmp)));
//
  //          CloseStream.closeStream(tmp);
    //    }catch (Exception e){
      //      System.out.print("Problem");
        //}

    }
}
