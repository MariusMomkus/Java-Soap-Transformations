package lt.viko.eif.mariusmomkus;

import org.apache.fop.apps.*;

import javax.xml.transform.*;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class XslTransformer {
    public static void transformToHtml(String xmlFilePath, String xslFilePath, String outputFilePath) throws FileNotFoundException, TransformerException {
        File xmlFile = new File(xmlFilePath);
        File xslFile = new File(xslFilePath);

        if (!xmlFile.isFile()) throw new FileNotFoundException("Xml file not found");
        if (!xslFile.isFile()) throw new FileNotFoundException("Xsl file not found");

        TransformerFactory factory = TransformerFactory.newInstance();

        Source xslt = new StreamSource(new File(xslFilePath));
        Transformer transformer = factory.newTransformer(xslt);
        Source text = new StreamSource(new File(xmlFilePath));
        transformer.transform(text, new StreamResult(new File(outputFilePath)));
    }

    public static void transformToPdf(String xmlFilePath, String xslFilePath, String outputFilePath) throws IOException, FOPException, TransformerException {
        File xmlFile = new File(xmlFilePath);
        File xslFile = new File(xslFilePath);

        if (!xmlFile.isFile()) throw new FileNotFoundException("Xml file not found");
        if (!xslFile.isFile()) throw new FileNotFoundException("Xsl file not found");

        StreamSource xmlSource = new StreamSource(xmlFile);
        FopFactory fopFactory = FopFactory.newInstance(new File("src/main/resources/pdf").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        OutputStream out = new FileOutputStream(outputFilePath);

        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xslFile));
            Result res = new SAXResult(fop.getDefaultHandler());
            transformer.transform(xmlSource, res);
        } finally {
            out.close();
        }
    }
}
