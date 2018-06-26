package org.jabref.logic.importer.fileformat.bibtexml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ManualTest {

	@Test
	public void validate01() {
		Manual teste1 = new Manual();

		teste1.setAuthor("asd");

		assertEquals("asd", teste1.getAuthor());
	}

	@Test
	public void validate02() {
		Manual teste1 = new Manual();

		teste1.setTitle("asd");

		assertEquals("asd", teste1.getTitle());
	}

	@Test
	public void validate03() {
		Manual teste1 = new Manual();

		teste1.setOrganization("asd");

		assertEquals("asd", teste1.getOrganization());
	}

	@Test
	public void validate04() {
		Manual teste1 = new Manual();

		teste1.setAddress("asd");

		assertEquals("asd", teste1.getAddress());
	}

	@Test
	public void validate05() {
		Manual teste1 = new Manual();

		teste1.setEdition("asd");

		assertEquals("asd", teste1.getEdition());
	}

	@Test
	public void validate06() {
		Manual teste1 = new Manual();

		teste1.setMonth("asd");

		assertEquals("asd", teste1.getMonth());
	}

	@Test
	public void validate07() {
		Manual teste1 = new Manual();

		teste1.setNote("asd");

		assertEquals("asd", teste1.getNote());
	}

	@Test
	public void validate08() {
		Manual teste1 = new Manual();

		teste1.setKey("asd");

		assertEquals("asd", teste1.getKey());
	}

	@Test
	public void validate09() {
		Manual teste1 = new Manual();

		teste1.setAnnotate("asd");

		assertEquals("asd", teste1.getAnnotate());
	}

	@Test
	public void validate10() {
		Manual teste1 = new Manual();

		teste1.setCrossref("asd");

		assertEquals("asd", teste1.getCrossref());
	}

	@Test
	public void validate11() {
		Manual teste1 = new Manual();

		teste1.setAbstract("asd");

		assertEquals("asd", teste1.getAbstract());
	}

	@Test
	public void validate12() {
		Manual teste1 = new Manual();

		teste1.setAffiliation("asd");

		assertEquals("asd", teste1.getAffiliation());
	}

	@Test
	public void validate13() {
		Manual teste1 = new Manual();

		teste1.setContents("asd");

		assertEquals("asd", teste1.getContents());
	}

	@Test
	public void validate14() {
		Manual teste1 = new Manual();

		teste1.setCopyright("asd");

		assertEquals("asd", teste1.getCopyright());
	}

	@Test
	public void validate15() {
		Manual teste1 = new Manual();

		teste1.setDoi("asd");

		assertEquals("asd", teste1.getDoi());
	}

	@Test
	public void validate16() {
		try{
			Manual teste1 = new Manual();

			GregorianCalendar gcal = new GregorianCalendar();
			XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

			teste1.setYear(xgcal);

			assertNotNull(teste1.getYear());
		}
		catch(Exception e){
		}
	}

}
