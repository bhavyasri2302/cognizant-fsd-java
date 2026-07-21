public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("--- Factory Method Pattern Test ---\n");

        System.out.println("1. Processing Word Document:");
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.processDocument();

        System.out.println("\n2. Processing PDF Document:");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.processDocument();

        System.out.println("\n3. Processing Excel Document:");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.processDocument();
    }
}