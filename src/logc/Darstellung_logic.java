package logc;

import mediaDB.InteractiveVideo;
import mediaDB.Licensed;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Darstellung_logic {


    private final AtomicBoolean atomicBoolean = new AtomicBoolean();
    private final ArrayList<Licensed> licensedList = new ArrayList<>();
    private final ArrayList<InteractiveVideo> interactiveVideoList = new ArrayList<>();
    private final AtomicInteger atomicInteger = new AtomicInteger();
    private final static int MAXSTOREDITEMS = 10;

    /**
     * here will be created  an empty item
     *
     * @param objc the object that will be created
     * @return new object was create
     */
    public Object createItem(Object objc) throws Exception {

        if (objc instanceof InteractiveVideoImpl)
            objc = new InteractiveVideoImpl();
        if (objc instanceof LicensedAudioImpl)
            objc = new LicensedAudioImpl();
        if (objc instanceof LicensedVideoImpl)
            objc = new LicensedVideoImpl();
        if (objc instanceof LicensedAudioVideoImpl)
            objc = new LicensedAudioVideoImpl();

        return objc;
    }

    /**
     * @param neu item
     * @param old old item
     * @return true or false if the action was possible
     */
    public boolean updateItems(Object neu, Object old) {

        if (old instanceof Licensed && licensedList.contains(old) && neu instanceof Licensed) {

            licensedList.remove(old);
            atomicInteger.decrementAndGet();
            licensedList.add((Licensed) neu);

            return true;
        }

        if (old instanceof InteractiveVideo && interactiveVideoList.contains(old) && neu instanceof InteractiveVideo) {

            interactiveVideoList.remove(old);
            atomicInteger.decrementAndGet();
            interactiveVideoList.add((InteractiveVideo) neu);
            return true;
        }


        return false;
    }

    /**
     * @param obj item add a new item to the list and occupated a new place in the capacity
     */
    public Boolean addItems(Object obj) throws Exception {
        AtomicBoolean added = new AtomicBoolean();
        if (atomicInteger.get() < MAXSTOREDITEMS) {
            if (obj instanceof InteractiveVideo) {
                interactiveVideoList.add((InteractiveVideo) obj);
                atomicInteger.incrementAndGet();
                added.set(true);

            }
            if (obj instanceof Licensed) {

                licensedList.add((Licensed) obj);
                atomicInteger.incrementAndGet();
                added.set(true);

            }
        } else {

            added.set(false);
            throw new Exception("Sorry we don`t have Capacity now for");
        }

        return added.get();
    }


    /**
     * will be removed the item from the list and will be created a place for new item
     *
     * @param obj item
     * @return
     */
    public boolean removeItems(Object obj) {
        if (obj instanceof InteractiveVideo) {
            if (!interactiveVideoList.isEmpty()) {
                interactiveVideoList.remove(obj);
                atomicInteger.decrementAndGet();
                atomicBoolean.set(true);
            }
        }
        if (obj instanceof Licensed) {
            if (!licensedList.isEmpty()) {
                licensedList.remove(obj);
                atomicInteger.decrementAndGet();
                atomicBoolean.set(true);
            }
        }
        return atomicBoolean.get();
    }

    /**
     * @return the list with the information from item and id
     */
    public List<?> getItemsList() {
        List<Object> lists = new ArrayList<>();
        licensedList.stream().map(lists::add).collect(Collectors.toList());
        interactiveVideoList.stream().map(lists::add).collect(Collectors.toList());
        return lists;
    }


}
