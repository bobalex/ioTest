package it.testio.interfaces;


import java.io.OutputStream;

/**
 *This is interface for Writer.
 */
public interface IMyWriter {
    /**
     * This is method of myWiter.
     * @param
     */
    public void myWrite(byte[] data, OutputStream streamDesc) throws Exception;
}
