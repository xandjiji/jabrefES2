package org.jabref.logic.importer.fileformat.bibtexml;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.xml.datatype.XMLGregorianCalendar;

public class BookletTest {

    Booklet teste1 = new Booklet();

    @Test
    public void validate01() {
        String Nome1;
        teste1.setAuthor("author");
        Nome1 = teste1.getAuthor();
        assertEquals("author", Nome1);
    }

    @Test
    public void validate02() {
        String Nome2;
        teste1.setTitle("title");
        Nome2 = teste1.getTitle();
        assertEquals(Nome2, "title");
    }

    @Test
    public void validate03() {
        String Nome4;
        teste1.setHowpublished("publicher");
        Nome4 = teste1.getHowpublished();
        assertEquals(Nome4, "publicher");
    }

    @Test
    public void validate04() {
        XMLGregorianCalendar Nome5;
        teste1.setYear(null);
        Nome5 = teste1.getYear();
        assertEquals(Nome5, null);
    }

    @Test
    public void validate05() {
        String Nome9;
        teste1.setAddress("address");
        Nome9 = teste1.getAddress();
        assertEquals(Nome9, "address");
    }

    @Test
    public void validate06() {
        String Nome11;
        teste1.setMonth("month");
        Nome11 = teste1.getMonth();
        assertEquals(Nome11, "month");
    }

    @Test
    public void validate07() {
        String Nome12;
        teste1.setNote("note");
        Nome12 = teste1.getNote();
        assertEquals(Nome12, "note");
    }

    @Test
    public void validate08() {
        String Nome13;
        teste1.setKey("key");
        Nome13 = teste1.getKey();
        assertEquals(Nome13, "key");
    }

    @Test
    public void validate09() {
        String Nome14;
        teste1.setAnnotate("annotate");
        Nome14 = teste1.getAnnotate();
        assertEquals(Nome14, "annotate");
    }

    @Test
    public void validate10() {
        String Nome15;
        teste1.setCrossref("crossref");
        Nome15 = teste1.getCrossref();
        assertEquals(Nome15, "crossref");
    }

    @Test
    public void validate11() {
        String Nome16;
        teste1.setAbstract("abstract");
        Nome16 = teste1.getAbstract();
        assertEquals(Nome16, "abstract");
    }

    @Test
    public void validate12() {
        String Nome17;
        teste1.setAffiliation("affiliation");
        Nome17 = teste1.getAffiliation();
        assertEquals(Nome17, "affiliation");
    }

    @Test
    public void validate13() {
        String Nome18;
        teste1.setContents("contents");
        Nome18 = teste1.getContents();
        assertEquals(Nome18, "contents");
    }

    @Test
    public void validate14() {
        String Nome19;
        teste1.setCopyright("copyright");
        Nome19 = teste1.getCopyright();
        assertEquals(Nome19, "copyright");
    }

    @Test
    public void validate15() {
        String Nome20;
        teste1.setDoi("doy");
        Nome20 = teste1.getDoi();
        assertEquals(Nome20, "doy");
    }

    @Test
    public void validate16() {
        String Nome21;
        teste1.setIsbn("isbn");
        Nome21 = teste1.getIsbn();
        assertEquals(Nome21, "isbn");
    }

    @Test
    public void validate17() {
        String Nome22;
        teste1.setIssn("issn");
        Nome22 = teste1.getIssn();
        assertEquals(Nome22, "issn");
    }

    @Test
    public void validate18() {
        String Nome23;
        teste1.setKeywords("keywords");
        Nome23 = teste1.getKeywords();
        assertEquals(Nome23, "keywords");
    }

    @Test
    public void validate19() {
        String Nome24;
        teste1.setLanguage("language");
        Nome24 = teste1.getLanguage();
        assertEquals(Nome24, "language");
    }

    @Test
    public void validate20() {
        String Nome25;
        teste1.setLccn("lccn");
        Nome25 = teste1.getLccn();
        assertEquals(Nome25, "lccn");
    }

    @Test
    public void validate21() {
        String Nome26;
        teste1.setLocation("location");
        Nome26 = teste1.getLocation();
        assertEquals(Nome26, "location");
    }

    @Test
    public void validate22() {
        String Nome27;
        teste1.setMrnumber("mrnumber");
        Nome27 = teste1.getMrnumber();
        assertEquals(Nome27, "mrnumber");
    }

    @Test
    public void validate23() {
        String Nome28;
        teste1.setPrice("price");
        Nome28 = teste1.getPrice();
        assertEquals(Nome28, "price");
    }

    @Test
    public void validate24() {
        String Nome29;
        teste1.setSize("size");
        Nome29 = teste1.getSize();
        assertEquals(Nome29, "size");
    }

    @Test
    public void validate25() {
        String Nome30;
        teste1.setUrl("url");
        Nome30 = teste1.getUrl();
        assertEquals(Nome30, "url");
    }

    @Test
    public void validate26() {
        String Nome31;
        teste1.setCategory("category");
        Nome31 = teste1.getCategory();
        assertEquals(Nome31, "category");
    }

}
