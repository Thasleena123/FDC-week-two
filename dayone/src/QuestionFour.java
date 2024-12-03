import java.io.*;

public class QuestionFour {


    public void readfile(String filepath) throws FileNotFoundException {

        File file=new File(filepath);
        if (!file.exists()) {
            throw  new FileNotFoundException("file is not found");

            }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 3; i++) {
                String line = reader.readLine();
                if (reader.readLine() == null) {
                    System.out.println("yoy have come to an end");
                }
                System.out.println(line);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}