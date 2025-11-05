package patterns.adapter.pdf_to_doc;

public class DocumentAdapter implements DocumentProcessor {

    private PDFProcessor pdfProcessor;


    public DocumentAdapter (PDFProcessor pdfProcessor){
        this.pdfProcessor = pdfProcessor;
    }


    private String convertPdfToDoc(){
        String content = pdfProcessor.getFile();
        return content.replace("[PDF]", "[DOC]");
    }

    @Override
    public void process(){
        System.out.println("Обрабатываем DOC файл..." );
        String docContent = convertPdfToDoc();
        System.out.println("Обрабатываем DOC-файл: " + docContent);
    }

}
