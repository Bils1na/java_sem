package homework6OOP;

public class Homework {

    public static void main(String[] args) {

    }

    static class ReportService {

        public byte[] createReport(Document document, String reportType) {
            // reportType = {"pdf-1", "json", "xml", ...}
            try {
                System.out.printf("Отчет сформирован в формате %s.", reportType);
                return null;
            } catch (Exception e) {
            throw new UnsupportedOperationException();
            }
        }

    }

    static class Document {
        private long id;
        private String number;

    }

    enum ReportType {
        PDF1, JSON, XML, DOCX, TXT
    }
}


