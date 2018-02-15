package ua.artcode.week6.io;

import java.io.*;
import java.util.List;

public class IOUtils {

    public static byte[] getBytes(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);
        StringBuilder res = new StringBuilder();

        int val = -1;
        try {
            while ((val = is.read()) != -1) {
                res.append((char) val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString().getBytes();
    }

    public static byte[] getBytesWithBuff(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);

        byte[] buff = new byte[1000];

        ByteArrayOutputStream byteArrayOutputStream =
                new ByteArrayOutputStream();

        int count = -1;
        try{
            while((count = is.read(buff)) != -1){
                byteArrayOutputStream.write(buff, 0, count);
            }
            byteArrayOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }


        return byteArrayOutputStream.toByteArray();
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

    public static String readFileContent(String path) throws FileNotFoundException {


        Reader reader = new FileReader(path);

        StringBuilder stringBuilder = new StringBuilder();
        char[] buff = new char[10000];

        int count;

        try {
            while ((count = reader.read(buff)) != -1){
                stringBuilder.append(buff, 0, count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void writeIntoFile (List<String> content, String path){
        Writer writer = null;
        try {
            writer = new FileWriter(path);
            for (String part : content) {
                writer.write(part + " ");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void writeIntoFile2 (List<String> content, String path){
        try (Writer writer = new FileWriter(path)) {
            for (String part : content) {
                writer.write(part + " ");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
