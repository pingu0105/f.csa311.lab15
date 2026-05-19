package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse_empty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverse_singleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverse_ascii() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    void reverse_unicode() {
        assertEquals("вба", StringUtils.reverse("абв"));
    }

    @Test
    void isBlank_returnsTrueForNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void isBlank_returnsTrueForSpaces() {
        assertTrue(StringUtils.isBlank(" "));
    }

    @Test
    void isBlank_returnsFalseForText() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    @Test
    void capitalize_capitalizesFirstLetter() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    void capitalize_returnsBlankUnchanged() {
        assertEquals("", StringUtils.capitalize(""));
    }
}