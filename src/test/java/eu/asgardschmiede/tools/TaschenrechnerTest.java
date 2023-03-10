package eu.asgardschmiede.tools;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

class TaschenrechnerTest {
    private static Taschenrechner taschenrechner;
    private static List<Integer> zahlen;

    @BeforeAll
    public static void initAll(){
        // Wird einmalig vor allen Tests dieser Klasse ausgeführt
        taschenrechner = new Taschenrechner();
        System.out.println("All");
        zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
    }

    @BeforeEach
    public void initEach(){
        //Wird vor jedem Test ausgeführt
        System.out.println("Each");
    }

    @AfterAll
    public static void doALL(){
        // Wird einmalig nach allen Tests dieser Klasse ausgeführt
        System.out.println("After All");
    }

    @AfterEach
    public void doAllEach(){
        //Wird nach jedem Test ausgeführt
        System.out.println("After Each");
    }

    @Test
    void check_operations(){
        double[] results = { 0, 10, 20, 30};
        assertAll(() -> assertEquals(taschenrechner.add(5,5),results[1]),
        assertAll(() -> assertEquals(taschenrechner.sub(60,30),results[3]),
        assertAll(() -> assertEquals(taschenrechner.multi(10,2),results[2]),
        assertAll(() -> assertEquals(taschenrechner.div(0,10),results[0])
        );
    }

    @Test
    void add_Positiv_Add_Positiv() {
        double expected = 10.0;
        //Prüft ob die Rückgabe der Methode gleich dem erwarteten Wert ist
        //assertEquals(taschenrechner.add(5.0,5.0),expected);
        assertEquals(taschenrechner.add(5.0,5.0),expected, 5 + 5);

        //assertNotEquals(null, null);
        //assertNull(null);
    }

    @Test
    void add_Positiv_Add_Negativ() {
        double expected = 0.0;
        assertEquals(taschenrechner.add(5.0,-5.0),expected);
    }

    @Test
    void sub() {
        double expected = 1.0;
        assertEquals(taschenrechner.sub(5.0,4.0),expected);
    }

    @Test
    void multi() {
        double expected = 25.0;
        assertEquals(taschenrechner.multi(5.0,5.0),expected);
    }

    @Test
    void div() {
        double expected = 1.0;
        assertEquals(taschenrechner.div(5.0,5.0),expected);
    }

    @Test
    void hasItems_inList(){
        assertThat(zahlen, hasItems(2,3));

    }

    @Test
    void size_ofList(){
        assertThat(zahlen, hasSize(3));


    }

}