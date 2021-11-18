package kata5p2.view;

import java.util.Iterator;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build (List<Mail> lista) {
        Histogram<String> histogram = new Histogram();
        for (Mail i : lista) {
            histogram.increment(i.getDomain());
        }
        
        
        return histogram;
    }
}