import java.io.*;
import java.util.LinkedList;

public class IOChamber {


    public static void main(String[] args) throws IOException {
        BufferedReader readerFile;
        BufferedReader reader = null;
        String fileName = null;
        String line = null;
        LinkedList<String> list = new LinkedList();
        int count = 2;



        try {
            fileName = args[0];
            readerFile = new BufferedReader(new FileReader(fileName));

            try {

                while(true){
                    try {
                        line = readerFile.readLine();
                        if (line == null) break;
                        System.out.println(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                readerFile.close();
            }
            catch (FileNotFoundException e) {
            }

        }
        catch (Exception e)
        {

            System.out.println("Файл не распознан. Введите ваши сообщения");


            reader = new BufferedReader(new InputStreamReader(System.in));


            while (true) {
                line = reader.readLine();
                if (line.isEmpty()) break;
                list.add(line);
            }

            for (String s : list) {
                if (count % 2 == 0)
                    System.out.println(s);
                count++;
            }


            reader.close();
        }



    }

}

