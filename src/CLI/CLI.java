package CLI;


import logc.*;
import mediaDB.InteractiveVideo;
import mediaDB.Items;
import mediaDB.Tag;

import java.util.concurrent.atomic.AtomicBoolean;

import static CLI.CLI.Command.*;


public class CLI {
    public static void main(String[] args) throws Exception {
        G_logik g_logik = new G_logik();
        Darstellung_logic darstellung_logic = new Darstellung_logic();
        InteractiveVideoImpl interactiveVideo = new InteractiveVideoImpl();
        LicensedVideoImpl licensedVideo = new LicensedVideoImpl();


            Command command = Command.valueOf(args[0]);
            String createData =  args[1];



           // UploaderImpl uploader = new UploaderImpl(args[2]);
          //  Tag tag1 = Tag.valueOf(args[3]);
          //  Tag tag2 = Tag.valueOf(args[4]);


            switch (command) {
                case c:
                    System.out.println("crete new data ");
                     switch (createData){
                         case "INTERACTIVEVIDEO":
                             System.out.println("Interative video will be create");
                             darstellung_logic.addItems(interactiveVideo);
                             break;
                         case "LICENSEDVIDEO":
                             System.out.println("LICENSEDVIDEO will be create");
                             darstellung_logic.addItems(licensedVideo);
                             break;
                         case "LICENSEDAUDIO":
                             System.out.println("LICENSEDAUDIO will be create");
                             break;
                         case "LICENSEDAUDIOVIDEO":
                             System.out.println("LICENSEDAUDIOVIDEO will be create");
                             break;
                     }

                    System.out.println("Items was created successful");
                    break;
                case d:
                    System.out.println("deleted data ");
                    darstellung_logic.removeItems(licensedVideo);
                    break;
                case r:
                    System.out.println("read data");

                    System.out.println("Done");
                    break;
                case u:
                    System.out.println("update data");
                    break;
                case p:
                    System.out.println("persist data");
                    g_logik.createProduzenten(new UploaderImpl("Tovias nunez"));
                    break;
                case x:
                    System.out.println("thank you for to use the system ");

                    break;
                default:
                    throw new IllegalArgumentException("The Argument it not valid ");

            }


    }


    public enum Command {
        c , d , r , u , p  , x ;  // c -> create , d -> deleted , r -> read , u -> update , p -> persistent; x -> exit
    }


}
