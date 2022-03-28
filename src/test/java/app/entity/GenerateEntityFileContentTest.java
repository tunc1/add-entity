package app.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateEntityFileContentTest
{
    @Test
    void generate()
    {
        GenerateEntityFileContent generateEntityFileContent=new GenerateEntityFileContent();
        String expected="package app.domain.entity;\n"+
                "\n"+
                "import javax.persistence.*;\n"+
                "\n"+
                "@Entity\n"+
                "public class Example\n"+
                "{\n"+
                "    @Id\n"+
                "    @SequenceGenerator(name=\"Example_SEQUENCE_GENERATOR\",sequenceName=\"Example_SEQUENCE\",allocationSize=1)\n"+
                "    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator=\"Example_SEQUENCE_GENERATOR\")\n"+
                "    private Long id;\n"+
                "}";
        String entityPackageName="app.domain.entity",entityName="Example";
        String actual=generateEntityFileContent.generate(entityName,entityPackageName);
        Assertions.assertEquals(expected,actual);
    }
}