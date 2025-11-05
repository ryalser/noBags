package patterns.adapter.pdf_to_doc;

public class DOCProcessor implements DocumentProcessor {

    private String file;

    public DOCProcessor(String file){
        this.file = file;
    }

    @Override
    public void process(){
        System.out.println("Работаем с файлом: " + file);
    }

    public String getFile(){
        return  "[DOC]" + file;
    }
}
