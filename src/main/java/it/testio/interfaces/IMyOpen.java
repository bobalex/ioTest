package it.testio.interfaces;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by test on 29.04.16.
 */
public interface IMyOpen {
    InputStream openStream(String name) throws Exception;
}
