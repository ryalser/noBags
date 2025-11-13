package complex_task_2.library_for_streaming_service;

public class WmvVideoAdapter implements VideoAdapter {

    @Override
    public boolean supportsFormat(String format){
        boolean formatValidate = false;
        if(format.equals(".wmv")){
            formatValidate = true;
        }
        return formatValidate;
    }

    @Override
    public String convertToMp4(String file){
        return file.replace(".wmv",".mp4");
    }
}
