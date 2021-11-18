package kata5p2.main;
import java.io.IOException;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;

public class main {

    public static void main(String args[]) throws IOException{

        main maincontrol = new main();
        maincontrol.control();
    }

    private void control() throws IOException{
        input();
        process();
        output();
    }

    private String filename;
    private Histogram<String> histogram;
    private void input() {
        filename = "email.txt";
    }

    private void process() throws IOException {
        List<Mail> mailList = MailListReader.read(filename);
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}