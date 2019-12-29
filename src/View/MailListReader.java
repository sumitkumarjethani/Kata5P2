package View;

import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    
    public static List<Mail> read(String fileName){
        List<Mail> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            IteratorReader iteratorReader = new IteratorReader(reader);
            for (String line : iteratorReader) if(Mail.isMail(line)) list.add(new Mail(line));
            reader.close();
            return list;
        }
        catch(FileNotFoundException exception){
            System.out.println("BufferedReader : File Not Found: " + exception);
        }
        catch(IOException exception){
            System.out.println("ERROR MailListReader : IOEXCEPTION");
        }
        return list;
    }
}
