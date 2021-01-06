import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        File sorceFile=new File("sourceFile.txt");
        File targetFile=new File("targetFile");
        FileWriter fileWriter=null;
        BufferedWriter writer=null;
        try {
            FileReader fileReader=new FileReader(sorceFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line=null;
            fileWriter=new FileWriter(targetFile);
            writer=new BufferedWriter(fileWriter);
            while ((line=reader.readLine())!=null){
                writer.write(line+"\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            try {
                writer.close();
                System.out.println(targetFile.length());
            }catch (IOException e){}
        }
    }
}
