package complex_task_2.library_for_streaming_service;

public interface VideoAdapter {
    boolean supportsFormat(String format);
    String convertToMp4(String file);
}
