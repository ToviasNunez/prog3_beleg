package observerPattern;

import mediaDB.Tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConcreteSubjectTags implements Subject {

    List<Beobachter> beobachterList = new ArrayList<>();


    @Override
    public void meldeAn(Beobachter beobachter) {
        beobachterList.add(beobachter);
    }

    @Override
    public void meldeAb(Beobachter beobachter) {
        beobachterList.remove(beobachter);
    }

    @Override
    public void notificate() {

        for (Beobachter beobachter : beobachterList) {

           beobachter.update();
        }
    }


    private Collection<Tag> tag;

    public Collection<Tag> getTag() {
        return tag;
    }

    public void setNewTags(Collection<Tag> tag){
        this.tag = tag;

        notificate();
    }

}
