package cliU2;


import logc.Darstellung_logic;
import logc.G_logik;
import logc.InteractiveVideoImpl;
import logc.UploaderImpl;

import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class CLI {

    public static void main(String[] args) throws Exception {

        // create a producer
        G_logik g_logik = new G_logik();
        Darstellung_logic darstellung_logic = new Darstellung_logic();
        UploaderImpl uploader = new UploaderImpl();
        InteractiveVideoImpl interactiveVideo = new InteractiveVideoImpl();

        Command command = Command.valueOf(args[0]);
        String createData = args[1];
        String deletedData = args[1];

        switch (command) {
            case p:
                System.out.println("Create producer");
                uploader = new UploaderImpl(args[1]);
                g_logik.createProduzenten(uploader);

                break;
            case c:

                switch (createData) {
                    case "INTERACTIVEVIDEO":

                        System.out.println("Interative video will be create");

                        darstellung_logic.createItem(interactiveVideo);
                        darstellung_logic.addItems(interactiveVideo);
                        // System.out.println(g_logik.getListProduzenten());
                        break;
                    case "LICENSEDVIDEO":
                        System.out.println("LICENSEDVIDEO will be create");

                        break;
                    case "LICENSEDAUDIO":
                        System.out.println("LICENSEDAUDIO will be create");
                        break;
                    case "LICENSEDAUDIOVIDEO":
                        System.out.println("LICENSEDAUDIOVIDEO will be create");
                        break;
                }
                break;
            case d:
                switch (deletedData) {
                    case "INTERACTIVEVIDEO":
                        System.out.println("Interative video will deleted");

                        break;
                    case "LICENSEDVIDEO":
                        System.out.println("LICENSEDVIDEO will be deleted");

                        break;
                    case "LICENSEDAUDIO":
                        System.out.println("LICENSEDAUDIO will be deleted");
                        break;
                    case "LICENSEDAUDIOVIDEO":
                        System.out.println("LICENSEDAUDIOVIDEO will be deleted");
                        break;
                }
                break;
        }


        try {
            File file = new File("test.txt");
            if (!file.exists())
                file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.append(uploader.getName());
            writer.append(System.lineSeparator());
            for (Object obj : darstellung_logic.getItemsList()) {
                writer.append(obj.toString());
            }


            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

