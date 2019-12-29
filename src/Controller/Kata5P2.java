package Controller;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import java.util.List;

public class Kata5P2 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        //I
        List<Mail> mailList = MailListReader.read(fileName);
        //P
        Histogram<String> histo = MailHistogramBuilder.build(mailList);
        //O
        HistogramDisplay histogramDisplay = new HistogramDisplay(histo);
        histogramDisplay.execute();
    }
}
