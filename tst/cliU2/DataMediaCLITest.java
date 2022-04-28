package cliU2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataMediaCLITest {

    @Test
    void createItems() throws Exception {
       DataMediaCLI createdata = new DataMediaCLI();

       createdata.createItems();



       readData();
    }

    @Test
    void deletedItems() {
    }

    @Test
    void readData() {
    }
}