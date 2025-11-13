package complex_task_2.library_for_streaming_service;

public class WmvVideoAdapter implements VideoAdapter {

    @Override
    public boolean supportsFormat(String format) {
        return format.endsWith(".wmv");  // Заканчивается ли строка на ".wmv"?
    }

    @Override
    public String convertToMp4(String file) {
        return file.replace(".wmv", ".mp4");
    }
}
