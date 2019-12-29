package Controller;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReaderBD;
import java.util.List;

public class Kata5P2 {

    public static void main(String[] args) {
        //I
        List<Mail> mailList = MailListReaderBD.read();
        //P
        Histogram<String> histo = MailHistogramBuilder.build(mailList);
        //O
        HistogramDisplay histogramDisplay = new HistogramDisplay(histo);
        histogramDisplay.execute();
    }
}
