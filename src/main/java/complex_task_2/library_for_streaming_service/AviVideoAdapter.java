package complex_task_2.library_for_streaming_service;

public class AviVideoAdapter implements VideoAdapter {

    @Override
    public boolean supportsFormat(String format) {
        return format.endsWith(".avi"); // Заканчивается ли строка на ".avi"?
    }

    @Override
    public String convertToMp4(String file) {
        return file.replace(".avi", ".mp4");
    }
}
