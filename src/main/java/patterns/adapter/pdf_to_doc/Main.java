package patterns.adapter.pdf_to_doc;

public class Main {
    public static void main(String[] args) {


        // Создаем PDF
        PDFProcessor pdf = new PDFProcessor("content_from_pdf");

        // Работаем с PDF через адаптер
        DocumentAdapter adapter = new DocumentAdapter(pdf);
        adapter.process();
    }
}
