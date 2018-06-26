package org.jabref.logic.importer.fileformat.bibtexml;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {

	@Test
	public void validate01() {
		//File erro = new File().asd; //ERRO PROPOSITAL

		Entry teste1 = new Entry();
		Article teste2 = new Article();

		teste1.setArticle(teste2);

		assertNotNull(teste1.getArticle());
	}

	@Test
	public void validate02() {
		Entry teste1 = new Entry();
		Book teste2 = new Book();

		teste1.setBook(teste2);

		assertNotNull(teste1.getBook());
	}

	@Test
	public void validate03() {
		Entry teste1 = new Entry();
		Booklet teste2 = new Booklet();

		teste1.setBooklet(teste2);

		assertNotNull(teste1.getBooklet());
	}

	@Test
	public void validate04() {
		Entry teste1 = new Entry();
		Manual teste2 = new Manual();

		teste1.setManual(teste2);

		assertNotNull(teste1.getManual());
	}

	@Test
	public void validate05() {
		Entry teste1 = new Entry();
		Techreport teste2 = new Techreport();

		teste1.setTechreport(teste2);

		assertNotNull(teste1.getTechreport());
	}

	@Test
	public void validate06() {
		Entry teste1 = new Entry();
		Mastersthesis teste2 = new Mastersthesis();

		teste1.setMastersthesis(teste2);

		assertNotNull(teste1.getMastersthesis());
	}

	@Test
	public void validate07() {
		Entry teste1 = new Entry();
		Phdthesis teste2 = new Phdthesis();

		teste1.setPhdthesis(teste2);

		assertNotNull(teste1.getPhdthesis());
	}

	@Test
	public void validate08() {
		Entry teste1 = new Entry();
		Inbook teste2 = new Inbook();

		teste1.setInbook(teste2);

		assertNotNull(teste1.getInbook());
	}

	@Test
	public void validate09() {
		Entry teste1 = new Entry();
		Incollection teste2 = new Incollection();

		teste1.setIncollection(teste2);

		assertNotNull(teste1.getIncollection());
	}

	@Test
	public void validate10() {
		Entry teste1 = new Entry();
		Proceedings teste2 = new Proceedings();

		teste1.setProceedings(teste2);

		assertNotNull(teste1.getProceedings());
	}

	@Test
	public void validate11() {
		Entry teste1 = new Entry();
		Inproceedings teste2 = new Inproceedings();

		teste1.setInproceedings(teste2);

		assertNotNull(teste1.getInproceedings());
	}

	@Test
	public void validate12() {
		Entry teste1 = new Entry();
		Conference teste2 = new Conference();

		teste1.setConference(teste2);

		assertNotNull(teste1.getConference());
	}

	@Test
	public void validate13() {
		Entry teste1 = new Entry();
		Unpublished teste2 = new Unpublished();

		teste1.setUnpublished(teste2);

		assertNotNull(teste1.getUnpublished());
	}

	@Test
	public void validate14() {
		Entry teste1 = new Entry();
		Misc teste2 = new Misc();

		teste1.setMisc(teste2);

		assertNotNull(teste1.getMisc());
	}

	@Test
	public void validate15() {
		Entry teste1 = new Entry();

		teste1.setId("asd");

		assertEquals("asd", teste1.getId());
	}


}
