/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.facade.complexmedialibrary;

/**
 *
 * @author FA20-BSE-037
 */
import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        File oggVideo = converter.convertVideo("youtubevideo.mp4", "ogg");
        File aviVideo = converter.convertVideo("youtubevideo.avi", "mp4");
        
    }
}
