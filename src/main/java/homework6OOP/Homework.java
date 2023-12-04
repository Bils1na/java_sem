package homework6OOP;


public class Homework {

    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        byte[] jsonReport = reportService.createReport(new Document("1", ReportType.JSON));
    }

    private static class ReportService {

        public byte[] createReport(Document document) {
            // reportType = {"pdf-1", "json", "xml", ...}
            try {
                System.out.println("Отчет сформирован");
                return document.getType().formatFile(document.getType());
            } catch (Exception e) {
            throw new UnsupportedOperationException();
            }
        }

    }

    private static class Document {
        private long id;
        private String number;
        private ReportType type;

        public Document(String number, ReportType type) {
            this.number = number;
            this.type = type;
        }

        public ReportType getType() {
            return type;
        }

    }

    private enum ReportType {
        PDF1, JSON, XML, DOCX, TXT;


        public byte[] formatFile(ReportType type) {
            // file format to type...
            return null;
        }

    }

}


