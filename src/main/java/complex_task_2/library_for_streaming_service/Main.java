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
        String videoId = service.uploadVideo("movie.avi");
        System.out.println("ID загруженного видео: " + videoId);

        // Воспроизвести видео
        System.out.println(service.streamVideo(videoId));
    }
}
