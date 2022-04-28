package cliU2;

import logc.*;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Cli_Uebung2 {


    public static void main(String[] args) throws Exception {

        AtomicBoolean running = new AtomicBoolean();
        G_logik g_logik = new G_logik();
        Darstellung_logic darstellung_logic = new Darstellung_logic();
        UploaderImpl uploader = new UploaderImpl();
        InteractiveVideoImpl interactiveVideo = new InteractiveVideoImpl();
        LicensedAudioImpl licensedAudio = new LicensedAudioImpl();
        LicensedVideoImpl licensedVideo = new LicensedVideoImpl();
        LicensedAudioVideoImpl licensedAudioVideo = new LicensedAudioVideoImpl();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hallo what would you like to do");
        Command command = Command.valueOf(br.readLine());
        while (command != command.exit) {
            System.out.println("Hallo what would you like to do");

            switch (command) {
                case createProducer:
                    System.out.println("create producer give the name");
                    String produzentinfocli = br.readLine();
                    uploader.setName(produzentinfocli);
                    g_logik.createProduzenten(new UploaderImpl(uploader.getName()));
                    break;
                case createTwoItems:
                    String createItem1 = br.readLine();
                    String createItem2 = br.readLine();

                    if (!createItem1.equals(createItem2)) {

                        switch (createItem1) {
                            case "INTERACTIVEVIDEO":
                                System.out.println("Interative video will be create");
                                darstellung_logic.addItems(interactiveVideo);
                                break;
                            case "LICENSEDVIDEO":
                                System.out.println("licensed vedio was create");
                                darstellung_logic.addItems(licensedVideo);
                                break;
                            case "LICENSEDAUDIO":
                                System.out.println("licensed audio was create");
                                darstellung_logic.addItems(licensedAudio);
                                break;

                            case "LICENSEDAUDIOVIDEO":
                                System.out.println("licensed audo video was create");
                                darstellung_logic.addItems(licensedAudioVideo);
                                break;
                            default:
                                throw new IllegalArgumentException("Media no fund");
                        }

                        switch (createItem2) {
                            case "INTERACTIVEVIDEO":
                                System.out.println("Interative video will be create");
                                darstellung_logic.addItems(interactiveVideo);
                                break;
                            case "LICENSEDVIDEO":
                                System.out.println("licensed vedio was create");
                                darstellung_logic.addItems(licensedVideo);
                                break;
                            case "LICENSEDAUDIO":
                                System.out.println("licensed audio was create");
                                darstellung_logic.addItems(licensedAudio);
                                break;

                            case "LICENSEDAUDIOVIDEO":
                                System.out.println("licensed audo video was create");
                                darstellung_logic.addItems(licensedAudioVideo);
                                break;
                            default:
                                throw new IllegalArgumentException("Media no fund");
                        }

                    }
                    System.out.println("create two items");
                    break;
                case deletedItems:
                    String deleteItem = br.readLine();
                    switch (deleteItem) {
                        case "INTERACTIVEVIDEO":
                            System.out.println("Interative video will be removed");

                            darstellung_logic.removeItems(interactiveVideo);
                            break;
                        case "LICENSEDVIDEO":
                            System.out.println("licensed vedio was removed");
                            darstellung_logic.removeItems(licensedVideo);
                            break;
                        case "LICENSEDAUDIO":
                            System.out.println("licensed audio was removed");
                            darstellung_logic.removeItems(licensedAudio);
                            break;

                        case "LICENSEDAUDIOVIDEO":
                            System.out.println("licensed audo video was removed");
                            darstellung_logic.removeItems(licensedAudioVideo);
                            break;
                        default:
                            throw new IllegalArgumentException("Media no fund");
                    }
                    System.out.println("items was deleted");
                    break;
                case exit:
                    System.out.println("Done");

                default:
                    throw new IllegalArgumentException("not command recognized ");
            }
        }
    }


}







