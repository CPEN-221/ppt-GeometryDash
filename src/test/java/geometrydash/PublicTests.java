package geometrydash;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PublicTests {

    @Test
    public void test_smallLevelPass() {
        String level = "__^^__";
        String play = "131";
        assertTrue(GeometryDash.isSuccessfulPlay(level, play));
    }

    @Test
    public void test_smallLevelFail() {
        String level = "_^_^_";
        String play = "1111";
        assertFalse(GeometryDash.isSuccessfulPlay(level, play));
    }

    @Test
    public void test_smallPlaySet() {
        String level = "_^^___^*^^^_";
        Set<String> possiblePlays = new HashSet<>();
        Set<String> successfulPlays = new HashSet<>();

        possiblePlays.add("3112");
        possiblePlays.add("3112");
        possiblePlays.add("313");
        possiblePlays.add("3131");
        possiblePlays.add("1231");
        successfulPlays.add("3112");
        successfulPlays.add("313");

        assertEquals(successfulPlays, GeometryDash.successfulPlays(level, possiblePlays, 0, -7));
        assertTrue(GeometryDash.successfulPlays(level, possiblePlays, 0, 0).isEmpty());
    }

    @Test
    public void test_shortestPlay() {
        String level = "_____";
        try {
            assertEquals(GeometryDash.shortestPlay(level, 0,-4).length(), 3);
        } catch(UnplayableLevelException e) {
            fail();
        }
    }

    @Test
    public void test_numberOfPlays() {
        String level = "_^_^_^_^_^_^_";
        assertEquals(GeometryDash.numberOfPlays(level, 0,-11), 6);
    }
}
