package geometrydash;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;


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
    public void test_smallPlaySet0() {
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

        assertEquals(successfulPlays, GeometryDash.successfulPlays(level, possiblePlays, 7, 0));
        assertTrue(GeometryDash.successfulPlays(level, possiblePlays, 0, 0).isEmpty());
    }

    @Test
    public void test_smallPlaySet1() {
        String level = "__^*_";
        Set<String> possiblePlays = new HashSet<>();
        Set<String> successfulPlays = new HashSet<>();

        possiblePlays.add("12");
        possiblePlays.add("3");
        possiblePlays.add("13");
        possiblePlays.add("31");
        successfulPlays.add("13");

        assertEquals(successfulPlays, GeometryDash.successfulPlays(level, possiblePlays, 7, 0));
        assertTrue(GeometryDash.successfulPlays(level, possiblePlays, 0, 0).isEmpty());
    }

    @Test
    public void test_shortestPlay0() {
        String level = "_____";
        try {
            assertEquals(2, GeometryDash.shortestPlay(level, 4,0).length());
        } catch(UnplayableLevelException e) {
            fail();
        }
    }

    @Test
    public void test_shortestPlay1() {
        String level = "_^_^_^_^_^_^_";
        try {
            assertEquals(7, GeometryDash.shortestPlay(level, 11,0).length());
        } catch(UnplayableLevelException e) {
            fail();
        }
    }

    @Test
    public void test_shortestPlay2() {
        String level = "___^____^____^*_____^^__";
        try {
            assertEquals(17, GeometryDash.shortestPlay(level, 11,0).length());
            // "22330100301000301" is a shortest successful play
        } catch(UnplayableLevelException e) {
            fail();
        }
    }


    @Test
    public void test_numberOfPlays0() {
        String level = "_^_^_^_^_^_^_";
        assertEquals(2, GeometryDash.numberOfPlays(level, 11,0));
        // The only valid plays are "2222202" or "22222002"
    }

    @Test
    public void test_numberOfPlays1() {
        String level = "____";
        assertEquals(4, GeometryDash.numberOfPlays(level, 20,0));
        // The valid plays are "111", "12", "21", "3"
    }

    @Test
    public void test_numberOfPlays2() {
        String level = "___^_^^*_____^_";
        assertEquals(9, GeometryDash.numberOfPlays(level, 7,1));
    }

    @Test
    public void test_numberOfPlays3() {
        String level = "___^_^^*_____^_";
        assertEquals(0, GeometryDash.numberOfPlays(level, 7,2));
    }

    @Test
    public void test_numberOfPlays4() {
        String level = "___^_^^*_____^_";
        assertEquals(21, GeometryDash.numberOfPlays(level, 7,0));
    }

}
