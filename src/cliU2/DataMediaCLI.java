package cliU2;

import logc.*;
import mediaDB.InteractiveVideo;

import mediaDB.Licensed;
import mediaDB.Tag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Scanner;


public class DataMediaCLI {


    private G_logik g_logik = new G_logik();
    private Darstellung_logic darstellung_logic = new Darstellung_logic();
    private InteractiveVideoImpl interactiveVideo = new InteractiveVideoImpl();
    private LicensedAudioImpl licensedAudio = new LicensedAudioImpl();
    private LicensedAudioVideoImpl licensedAudioVideo = new LicensedAudioVideoImpl();
    private LicensedVideoImpl licensedVideo = new LicensedVideoImpl();
    private UploaderImpl uploader = new UploaderImpl();
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void createItems() throws Exception {
        commandlineInfo();
        int value = Integer.parseInt(bufferedReader.readLine());
        switch (value) {
            case 1:
                System.out.println("interaction video will be created ");

                interactiveVideo = (InteractiveVideoImpl) darstellung_logic.createItem(createInteractionVideo());

                break;
            case 2:
                System.out.println("licensedVideo  will be create ");
                licensedVideo = (LicensedVideoImpl) darstellung_logic.createItem(createLicensedVideo());

                break;
            case 3:
                System.out.println("licensedAudio will be create ");
                licensedAudio = (LicensedAudioImpl) createLicensedAudio();

                break;
            case 4:
                System.out.println("licensed AudioVideo will be create ");

                licensedAudioVideo = (LicensedAudioVideoImpl) darstellung_logic.createItem(createLicensedAudioVideo());

                break;
            default:
                throw new IllegalArgumentException("the media is no in the list");
        }
    }


    private InteractiveVideo createInteractionVideo() throws Exception {

        System.lineSeparator();
        interactiveVideo.setUploader(createProducer());
        System.out.println(" enter Tags");
        interactiveVideo.setTags(Collections.singleton(selectTags()));
        System.out.println("enter Bitrate bigger 768000");
        interactiveVideo.setBitrate(BigDecimal.valueOf(Long.parseLong(String.valueOf(bufferedReader.readLine()))));
        System.out.println("enter size positive");
        interactiveVideo.setSize(BigDecimal.valueOf(Long.parseLong(bufferedReader.readLine())));
        darstellung_logic.addItems(interactiveVideo);
        return interactiveVideo;
    }

    private Licensed createLicensedVideo() throws Exception {


        System.lineSeparator();
        licensedVideo.setUploader(createProducer());
        System.out.println(" enter Tags");
        licensedVideo.setTags(Collections.singleton(selectTags()));
        System.out.println("enter Bitrate bigger 768000");
        licensedVideo.setBitrate(BigDecimal.valueOf(Long.parseLong(bufferedReader.readLine())));
        System.out.println("enter size positive");
        licensedVideo.setSize(BigDecimal.valueOf(Long.parseLong(bufferedReader.readLine())));
        darstellung_logic.addItems(licensedVideo);
        return licensedVideo;
    }

    private Licensed createLicensedAudio() throws Exception {

        System.lineSeparator();

        licensedAudio.setUploader(createProducer());
        System.out.println(" enter Tags");
        licensedAudio.setTags(Collections.singleton(this.selectTags()));
        System.out.println("enter Bitrate bigger 768000");
        licensedAudio.setBitrate(BigDecimal.valueOf(Long.parseLong(bufferedReader.readLine())));
        System.out.println("enter size positive");
        licensedAudio.setSize(BigDecimal.valueOf(Long.parseLong(bufferedReader.readLine())));
        darstellung_logic.addItems(licensedAudio);
        return licensedAudio;
    }

    private Licensed createLicensedAudioVideo() throws Exception {

        System.lineSeparator();
        licensedAudioVideo.setUploader(createProducer());
        System.out.println(" enter Tags");
        licensedAudioVideo.setTags(Collections.singleton(selectTags()));
        System.out.println("enter Bitrate bigger 768000");
        licensedAudioVideo.setBitrate(BigDecimal.valueOf(Long.parseLong(bufferedReader.readLine())));
        System.out.println("enter size positive");
        licensedAudioVideo.setSize(BigDecimal.valueOf(Long.parseLong(bufferedReader.readLine())));
        darstellung_logic.addItems(licensedAudioVideo);
        return licensedAudioVideo;
    }


    private UploaderImpl createProducer() throws Exception {
        System.lineSeparator();
        System.out.println("give the name of the producer");
        uploader.setName(bufferedReader.readLine());
        g_logik.createProduzenten(uploader);
        return uploader;
    }


    private Tag selectTags() throws IOException {
        System.lineSeparator();
        System.out.println("enter 1 Tag Animal");
        System.out.println("enter 2 Tag Tutorial");
        System.out.println("enter 3 Tag News");
        System.out.println("enter 4 Tag Lifestyle");
        int val = Integer.parseInt(bufferedReader.readLine());
        switch (val) {
            case 1:
                return Tag.Animal;

            case 2:
                return Tag.Tutorial;

            case 3:
                return Tag.News;

            case 4:
                return Tag.Lifestyle;

            default:
                throw new IllegalArgumentException("the value it not correct");

        }
    }

    public void deletedItems() throws IOException {

        commandlineInfo();

        int value = Integer.parseInt(bufferedReader.readLine());
        switch (value) {
            case 1:
                System.out.println("interaction video will be deleted");
                break;
            case 2:
                System.out.println("licensed audio will be deleted ");
                break;
            case 3:
                System.out.println("licensed video will be deleted ");
                break;
            case 4:
                System.out.println("licensed AudioVideo will be deleted ");
                break;
            default:
                throw new IllegalArgumentException("the media is no in the list");
        }
    }

    public void readData() {
        System.out.println(g_logik.getListProduzenten(darstellung_logic.getItemsList()));
        darstellung_logic.getItemsList().stream().forEach(x -> System.out.println(x));

    }

    private static void commandlineInfo() {
        System.out.println("type 1 for Interaction Videos");
        System.out.println("type 2 for Licensed Audio ");
        System.out.println("type 3 for Licensed Video ");
        System.out.println("type 4 for Licensed AudioVideo ");
    }


}
