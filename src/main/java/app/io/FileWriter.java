package app.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter
{
    public void write(String filePath,String data) throws IOException
    {
        File file=new File(filePath);
        if(!file.exists())
        {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(data.getBytes());
        fileOutputStream.close();
    }
}