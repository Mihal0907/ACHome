package ua.artcode.week6.io;

import java.io.*;

public class IOUtils {

    public static byte[] getBytes(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);
        StringBuilder res = new StringBuilder();

        int val = -1;
        try {
            while ((val = is.read()) != -1) {
                res.append(val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString().getBytes();
    }

    public static void writeInto (byte[] in, String path) throws FileNotFoundException {
        OutputStream os = new FileOutputStream(path);
        try {
            os.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
