package logc;

import mediaDB.Items;
import mediaDB.Tag;
import observerPattern.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class G_logikTest  {
    G_logik g_logik;
    String exceptionMessage = "";

    Darstellung_logic darstellung_logic;
    UploaderImpl uploader, uploader1;
    InteractiveVideoImpl interactiveVideo5;
    Beobachter beobachterKapazitaet;
    Beobachter beobachterTags;
    ConcreteSubjectCapasity concreteSubjectCapasity;
    ConcreteSubjectTags concreteSubjectTags;
    @BeforeEach
    void setUp() throws Exception {

        g_logik = new G_logik();

        uploader = new UploaderImpl("Tovias Nunez");
        uploader1 = new UploaderImpl("Ameli Nunez");
        g_logik.createProduzenten(uploader);
        interactiveVideo5 = new InteractiveVideoImpl();
        interactiveVideo5.setUploader(uploader);
        interactiveVideo5.setTags(Collections.singleton(Tag.Animal));
        darstellung_logic = new Darstellung_logic();
        darstellung_logic.addItems(interactiveVideo5);


    }

    @Test
    void cretaeProduzenten() throws Exception {
        g_logik.createProduzenten(uploader);


    }

    /**
     * list the creator with the amount a product
     *
     * @throws Exception
     */
    @Test
    void getListProduzenten() throws Exception {

        InteractiveVideoImpl interactiveVideo = new InteractiveVideoImpl();
        InteractiveVideoImpl interactiveVideo1 = new InteractiveVideoImpl();
        InteractiveVideoImpl interactiveVideo2 = new InteractiveVideoImpl();
        InteractiveVideoImpl interactiveVideo3 = new InteractiveVideoImpl();

        LicensedAudioImpl licensedAudio1 = (LicensedAudioImpl) darstellung_logic.createItem(new LicensedAudioImpl());
        LicensedAudioImpl licensedAudio2 = new LicensedAudioImpl();

        LicensedAudioVideoImpl licensedAudioVideo = new LicensedAudioVideoImpl();
        LicensedAudioVideoImpl licensedAudioVideo2 = new LicensedAudioVideoImpl();


        interactiveVideo.setUploader(new UploaderImpl("Mathias"));
        //   g_logik.addItems(interactiveVideo);
        interactiveVideo1.setUploader(uploader);
        interactiveVideo3.setUploader(uploader);
        interactiveVideo.setUploader(uploader);
        interactiveVideo2.setUploader(uploader);

        licensedAudio1.setUploader(uploader);
        licensedAudio2.setUploader(uploader);


        licensedAudioVideo.setUploader(uploader1);
        licensedAudioVideo2.setUploader(uploader1);

        assertTrue(darstellung_logic.addItems(interactiveVideo));
        assertTrue(darstellung_logic.addItems(interactiveVideo2));
        assertTrue(darstellung_logic.addItems(interactiveVideo3));
        assertTrue(darstellung_logic.addItems(interactiveVideo1));
        assertTrue(darstellung_logic.addItems(licensedAudio1));
        assertTrue(darstellung_logic.addItems(licensedAudio2));

        assertTrue(darstellung_logic.addItems(licensedAudioVideo));
        assertTrue(darstellung_logic.addItems(licensedAudioVideo2));
        assertTrue(darstellung_logic.addItems(licensedAudio2));


      System.out.println(darstellung_logic.getItemsList().size());
      System.out.println(g_logik.getListProduzenten(darstellung_logic.getItemsList()));

    }

    @Test
    void testPreufenObProduzenterExitiert() {
        assertFalse(g_logik.preufenObProduzenterExitiert(uploader1));
    }

    @Test
    void testPrueftGesamtkapazitaet() {
        try {
            g_logik.prueftGesamtkapazitaet(BigDecimal.valueOf(101));
        } catch (IllegalArgumentException exception) {
            exceptionMessage = exception.getMessage();
        }
        assertEquals("Kapazitat wurde ueberschritten", exceptionMessage);

    }

    @Test
    void testPrueftGesamtkapazitaet2() {

            g_logik.prueftGesamtkapazitaet(BigDecimal.valueOf(90.000001));

    }


    @Test
    void loeschenProduzenten() {

        assertFalse(g_logik.loeschenProduzenten(uploader1));
        assertTrue(g_logik.loeschenProduzenten(uploader));
        g_logik.getListProduzenten(darstellung_logic.getItemsList());
    }

    @Test
    void removeItems() throws Exception {
        LicensedAudioImpl licensedAudio = (LicensedAudioImpl) darstellung_logic.createItem(new LicensedAudioImpl());
        assertTrue(darstellung_logic.addItems(licensedAudio));
        darstellung_logic.getItemsList();

        assertTrue(darstellung_logic.removeItems(licensedAudio));


    }

    @Test
    void testgetList() throws Exception {


        InteractiveVideoImpl interactiveVideo = new InteractiveVideoImpl();
        LicensedAudioImpl licensedAudio = new LicensedAudioImpl();

        interactiveVideo.setUploader(uploader1);
        darstellung_logic.addItems(interactiveVideo);


        darstellung_logic.addItems(new LicensedAudioImpl());
        licensedAudio.setAddress("test address");
        darstellung_logic.addItems(licensedAudio);

        System.out.println(g_logik.getList(Items.LICENSEDAUDIO , darstellung_logic.getItemsList()));
        //  System.out.println(g_logik.getItemsAndIDList());


    }


    @Test
    void preufenObProduzenterExitiert() {
        assertTrue(g_logik.preufenObProduzenterExitiert(uploader));
    }



    @Test
    void hochladen() throws Exception {

        interactiveVideo5.setUploader(new UploaderImpl("Karl"));
        interactiveVideo5.setSize(BigDecimal.valueOf(4242));
        interactiveVideo5.setAddress("google.com");
        interactiveVideo5.setAccessCount(12345);
        assertFalse(g_logik.hochladen(interactiveVideo5));
        interactiveVideo5.setUploader(uploader);
     //   assertTrue(g_logik.hochladen(interactiveVideo5));
    }


    @Test
    void getItemsList() {

        darstellung_logic.getItemsList().stream().forEach(v -> System.out.println(v));


    }

    @Test
    void getList() {
        System.out.println( g_logik.getList(Items.INTERACTIVEVIDEO , darstellung_logic.getItemsList())) ;
    }

    @Test
    void getAccount() {
        interactiveVideo5.setAccessCount(12345);
      assertEquals( 12345,g_logik.getAccount(interactiveVideo5.getAccessCount()));

    }


    @Test
    void testGetNichtvergebenenTags(){
     g_logik.getNichtvergebenenTags(darstellung_logic.getItemsList()).stream().forEach(x -> System.out.println(x));

    }

// dont work
    @Test
    void observerFuction() throws Exception {

        ConcreteSubjectCapasity concreteSubjectCapasity = new ConcreteSubjectCapasity();
        beobachterKapazitaet = new BeobachterKapazitaet(concreteSubjectCapasity);

        G_logik dataMedia = new G_logik();
        ConcreteSubjectTags  concreteSubjectTags  = new ConcreteSubjectTags();
        BeobachterTags beobachterTags = new BeobachterTags(concreteSubjectTags);
      //  ConcreteSubjectCapasity concreteSubjectCapasity = new ConcreteSubjectCapasity();
        //concreteSubjectCapasity.meldeAn(beobachterTags);

        InteractiveVideoImpl interactiveVideo = new InteractiveVideoImpl();
      //  interactiveVideo.setSize(BigDecimal.valueOf(90.0001));
       // interactiveVideo.setSize(BigDecimal.valueOf(89.0001));
      //  interactiveVideo.setSize(BigDecimal.valueOf(92.0001));
        interactiveVideo.setSize(BigDecimal.valueOf(90.0001));


        concreteSubjectCapasity.setSize(interactiveVideo.getSize());

        interactiveVideo.setTags(Collections.singleton(Tag.Animal));
        interactiveVideo.setTags(Collections.singleton(Tag.Animal));
        interactiveVideo.setTags(Collections.singleton(Tag.Animal));
        interactiveVideo.setTags(Collections.singleton(Tag.News));
        interactiveVideo.setTags(Collections.singleton(Tag.News));
        interactiveVideo.setTags(Collections.singleton(Tag.Animal));
        interactiveVideo.setTags(Collections.singleton(Tag.Animal));

        concreteSubjectTags.setNewTags(interactiveVideo.getTags());

      //

    //    client.addItems(interactiveVideo);

    }

}