package complex_task_2.library_for_streaming_service;

public class MovVideoAdapter implements VideoAdapter {

    @Override
    public boolean supportsFormat(String format) {
        return format.endsWith(".mov");  // Заканчивается ли строка на ".mov"?
    }

    @Override
    public String convertToMp4(String file) {
        return file.replace(".mov", ".mp4");
    }
}
