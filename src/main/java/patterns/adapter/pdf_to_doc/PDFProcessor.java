package patterns.adapter.pdf_to_doc;

public class PDFProcessor implements DocumentProcessor {

    private String file;

    public PDFProcessor (String file){
        this.file = file;
    }

    @Override
    public void process(){
        System.out.println("Работаем с файлом: " + file);
    }


    public String getFile(){
        return  "[PDF]" + file;
    }
}
