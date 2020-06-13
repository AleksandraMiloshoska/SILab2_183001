import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class SILab2test {

    List<String> a = Arrays.asList();
    List<String> b = Arrays.asList("0", "#", "0");
    List<String> brez = Arrays.asList("1", "#", "1");


    @Test
    void everyBranchTest() {

        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(a));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        assertTrue(SILab2.function(b).equals(brez));


    }
}
