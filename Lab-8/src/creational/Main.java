package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;

public class Main {

//    public static void main(String[] args) {

            // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }

            // Expected usage
//        BookMetadataExporter exporter = new XMLBookMetadataExporter();
//        exporter.add(TestData.sailboatBook);
//        exporter.add(TestData.GoFBook);
//        exporter.export(System.out);

//    }

    public static void main(String[] args) throws XMLStreamException, IOException, ParserConfigurationException {
        BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);
        BookMetadataExporter exporterXML = new XMLBookMetadataExporter();
        exporterXML.add(TestData.sailboatBook);
        exporterXML.add(TestData.GoFBook);
        exporterXML.export(System.out);
        BookMetadataExporter exporterCSV = new CSVBookMetadataExporter();
        exporterCSV.add(TestData.sailboatBook);
        exporterCSV.add(TestData.GoFBook);
        exporterCSV.export(System.out);
    }
}
