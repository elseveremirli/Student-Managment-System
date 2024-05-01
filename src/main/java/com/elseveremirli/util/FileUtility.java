package com.elseveremirli.util;

import java.io.*;


public class FileUtility {

    public static Object readFileDeserialize(String name){
        Object object = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(name))){
            object = objectInputStream.readObject();
        } finally {
            return object;
        }
    }

    public static boolean writeObjectToFile(Object object,String name) throws RuntimeException{
        try( FileOutputStream fout = new FileOutputStream(name);
        ObjectOutputStream  oos = new ObjectOutputStream(fout);){
            oos.writeObject(object);
            return true;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
