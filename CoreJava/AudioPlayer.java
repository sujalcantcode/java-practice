import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;

public class AudioPlayer {
    public static void main(String[] args) throws IOException {
    
      
        // Replace with your audio file path
        String filePath = "C:\\Users\\ASUS\\OneDrive\\ドキュメント\\git demo\\java demo\\Demo\\lib\\Chand Se Parda Kijiye - Aao Pyar Karen 320 Kbps.wav";
        File audioFile = new File(File.separator + filePath);
        if (!audioFile.exists()) {
            System.err.println("Audio file not found: " + filePath);
            return;
        }

        try (Scanner sc = new Scanner(System.in);
             AudioInputStream audioStream = javax.sound.sampled.AudioSystem.getAudioInputStream(audioFile)) {
            try (javax.sound.sampled.Clip clip = javax.sound.sampled.AudioSystem.getClip()) {
                clip.open(audioStream);

                String response = "";
                while (true) {
                    System.out.print("Press 'P' to play, 'S' to stop, 'R' to reset, or 'Q' to quit:");

                    response = sc.nextLine().toUpperCase();
                    if (response.equals("Q")) {
                        break;
                    }
                    switch (response) {
                        case "P" -> {
                                clip.start();
                                System.out.println("Playing audio...");
                            }
                            case "S" -> {
                                if (clip.isRunning()) {
                                    clip.stop();
                                    System.out.println("Audio stopped.");
                                } else {
                                    System.out.println("Audio is not currently playing.");
                                }
                            }
                            case "R" -> {
                                if (clip.isRunning()) {
                                    clip.stop();
                                }
                                clip.setFramePosition(0);
                                System.out.println("Audio reset to the beginning.");
                            }
                            default -> System.out.println("Invalid option. Please try again.");
                        }
                    }
                }
                System.out.println("Exiting the audio player.");
            } catch (javax.sound.sampled.LineUnavailableException e) {
                System.err.println("Audio line unavailable: " + e.getMessage());
            } catch (javax.sound.sampled.UnsupportedAudioFileException e) {
                System.err.println("Unsupported audio file format: " + e.getMessage());
            } catch (java.io.IOException e) {
                System.err.println("Error reading audio file: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }}