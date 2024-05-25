import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private static List<Item> allItems;
    @BeforeAll
    static void AddItem(){
        allItems = new ArrayList<>();

    }
    @Test
    void EveryBranch(){
        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null,100));
        assertTrue(exception.getMessage().contains("allItems list can't be null!"));

        allItems.add(new Item("item","1234a6",100,0));
        RuntimeException exception1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(allItems,100));
        assertTrue(exception1.getMessage().contains("Invalid character in item barcode!"));

        allItems.clear();
        allItems.add(new Item("item",null,100,0));
        RuntimeException exception2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(allItems,100));
        assertTrue(exception2.getMessage().contains("No barcode!"));

        allItems.clear();
        allItems.add(new Item("","123456",100,0));
        boolean checker = SILab2.checkCart(allItems,100);
        assertTrue(checker);

        allItems.clear();
        allItems.add(new Item("item","012345",350,1));
        allItems.add(new Item("item","123456",100,1));
        boolean checker2 = SILab2.checkCart(allItems,50);
        assertFalse(checker2);
    }

    @Test
    void MultipleCondition(){
        allItems.add(new Item("item","012345",350,1));
        assertEquals(320,allItems.get(0).price-30);
        allItems.clear();
        allItems.add(new Item("item","123456",350,1));
        boolean checker = SILab2.checkCart(allItems,100);
        assertFalse(checker);
        allItems.clear();
        allItems.add(new Item("item","",350,0));
        boolean checker2 = SILab2.checkCart(allItems,100);
        assertFalse(checker2);
        allItems.clear();
        allItems.add(new Item("item","",100,0));
        boolean checker3 = SILab2.checkCart(allItems,10);
        assertFalse(checker3);
    }
}
