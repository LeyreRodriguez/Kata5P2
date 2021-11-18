package kata5p2.main;

import kata5p2.view.HistogramDisplay;
import static kata5p2.view.MailHistogramBuilder.build;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import java.io.IOException;
import java.util.List;
import static kata5p2.view.MailListReaderBD.read;

public class main {
    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    private main aux;
 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new main().execute();
       

    }
    
    private void execute () {
        input();
        process();
        output();
    }
    
    private void input () {
        mailList = read();
    }
    
    private void process() {
        histogram = build(mailList);
    }
    
    private void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}