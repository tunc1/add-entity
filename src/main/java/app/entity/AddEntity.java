package app.entity;

import app.io.FileWriter;

import java.io.IOException;

public class AddEntity
{
    private GenerateEntityFileContent generateEntityFileContent;
    private FileWriter fileWriter;
    public AddEntity()
    {
        generateEntityFileContent=new GenerateEntityFileContent();
        fileWriter=new FileWriter();
    }
    public void add(String projectPath,String entityName,String entityPackageName) throws IOException
    {
        String fileContent=generateEntityFileContent.generate(entityName, entityPackageName);
        String filePath=projectPath+"/src/main/java/"+entityPackageName.replace('.','/')+"/"+entityName+".java";
        fileWriter.write(filePath,fileContent);
    }
}
