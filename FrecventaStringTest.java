import com.itfactory.FrecventaString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FrecventaStringTest {
    private FrecventaString frecventa;
    private List<String> continutFisier;

    @Before
    public void init(){
        frecventa= new FrecventaString("buff");

    }

    @Test
    public void count() throws IOException {
        List<String> continutFisier = Files.readAllLines(Path.of("C:\\Users\\danie\\IdeaProjects\\FrecventaAparitieString\\src\\main\\java\\TextContinut"));
        int doublat = FrecventaString.cautareCuvant(continutFisier, "pantaloni");
        assertEquals(3, doublat);

    }
} 
 