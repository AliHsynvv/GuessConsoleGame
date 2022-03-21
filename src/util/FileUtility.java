package util;

import java.io.*;

public class FileUtility {
    public static boolean WriteObjectToFile(Serializable object, String name) throws Exception{
        try (FileOutputStream fout=new FileOutputStream(name);
             ObjectOutputStream oos=new ObjectOutputStream(fout);){
            oos.writeObject(object);
        }
        return true;
    }
    public static Object readFileDeserialazible (String name) throws Exception{
        Object obj=null;
        FileInputStream fi=new FileInputStream(name);
        ObjectInputStream in=new ObjectInputStream(fi);
        obj=in.readObject();
        return obj;
    }

}
