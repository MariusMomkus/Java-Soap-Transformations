package lt.viko.eif.mariusmomkus;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

import javax.xml.transform.*;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            XslTransformer.transformToHtml(
                    "src/main/resources/starTrek.xml",
                    "src/main/resources/html/starTrek.xsl",
                    "src/main/resources/html/index.html");

            XslTransformer.transformToPdf("src/main/resources/starTrek.xml",
                    "src/main/resources/pdf/starTrek.xsl",
                    "src/main/resources/pdf/starTrek.pdf");
        }
        catch (Exception ex) {
            System.out.println("Transformation error: " + ex.getMessage());
        }
    }
}