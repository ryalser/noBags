package complex_task_2.library_for_streaming_service;

import java.util.*;

public class VideoService {
    private List<VideoAdapter> adapters;
    private Map<String,String> video;

    public VideoService(VideoAdapter... adapters){
        this.adapters = Arrays.asList(adapters);
        this.video = new HashMap<>();
    }

    public String uploadVideo(String filePath) {

        for (VideoAdapter videoAdapter : adapters) {
            if (videoAdapter.supportsFormat(filePath)) {
                String convertedPath = videoAdapter.convertToMp4(filePath);
                String videoId = UUID.randomUUID().toString();
                video.put(videoId, convertedPath);

                return videoId;
            }

        }
        throw new RuntimeException("Неподдерживаемый формат: " + filePath);
    }


    public String streamVideo(String videoId){
        String filePath = video.get(videoId);
        if(filePath == null){
            throw new RuntimeException("Видео не найдено...");
        }
        System.out.println("Воспроизводим видео: ");
        return filePath;
    }
}

