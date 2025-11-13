package complex_task_2.library_for_streaming_service;

public class Main {
    public static void main(String[] args) {

        // Создаем видеохостинг и его сервис
        VideoService service = new VideoService(
                new AviVideoAdapter(),
                new MovVideoAdapter(),
                new WmvVideoAdapter()
        );

        // Загрузить видео
        String videoId = service.uploadVideo(".avi");
        System.out.println(service.uploadVideo(".avi"));

        // Воспроизвести видео
        System.out.println(service.streamVideo(videoId));

    }
}
