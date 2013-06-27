package pogo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

import pogo.Task;

public class TaskTest {
    private Date now = new Date();
    private Task t = new Task("name", 3, now, now, false);

    @Test
    public void testGetName() {
        assertEquals("name", t.getName());
    }

    @Test
    public void testSetName() {
        t.setName("other");
        assertEquals("other", t.getName());
    }

    @Test
    public void testGetPriority() {
        assertEquals(3, t.getPriority());
    }

    @Test
    public void testSetPriority() {
        t.setPriority(4);
        assertEquals(4, t.getPriority());
    }

    @Test
    public void testGetStartDate() {
        assertEquals(now, t.getStartDate());
    }

    @Test
    public void testSetStartDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.MARCH, 21);
        Date spring = cal.getTime();
        t.setStartDate(spring);
        assertEquals(spring, t.getStartDate());
    }

    @Test
    public void testGetEndDate() {
        assertEquals(now, t.getEndDate());
    }

    @Test
    public void testSetEndDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.MARCH, 21);
        Date spring = cal.getTime();
        t.setEndDate(spring);
        assertEquals(spring, t.getEndDate());
    }

    @Test
    public void testIsCompleted() {
        assertFalse(t.isCompleted());
    }

    @Test
    public void testSetCompleted() {
        t.setCompleted(true);
        assertTrue(t.isCompleted());
    }    
}
