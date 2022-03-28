package app.entity;

public class GenerateEntityFileContent
{
    public String generate(String entityName,String entityPackageName)
    {
        return "package "+entityPackageName+";\n"+
                "\n"+
                "import javax.persistence.*;\n"+
                "\n"+
                "@Entity\n"+
                "public class "+entityName+"\n"+
                "{\n"+
                "    @Id\n"+
                "    @SequenceGenerator(name=\""+entityName+"_SEQUENCE_GENERATOR\",sequenceName=\""+entityName+"_SEQUENCE\",allocationSize=1)\n"+
                "    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator=\""+entityName+"_SEQUENCE_GENERATOR\")\n"+
                "    private Long id;\n"+
                "}";
    }
}