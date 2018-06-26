package org.jabref.logic.importer.fileformat.bibtexml;


import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ObjectFactoryTest {

	// testando classe principal ObjectFactory
	@Test
	public void validate01() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1);
	}






	// testando funcoes para chamar construtores de cada classe
	@Test
	public void validate001() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createConference());
	}

	@Test
	public void validate002() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createTechreport());
	}

	@Test
	public void validate003() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createBook());
	}

	@Test
	public void validate004() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createInbook());
	}

	@Test
	public void validate005() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createBooklet());
	}

	@Test
	public void validate006() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createManual());
	}

	@Test
	public void validate007() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createUnpublished());
	}

	@Test
	public void validate008() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createInproceedings());
	}

	@Test
	public void validate009() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createPhdthesis());
	}

	@Test
	public void validate010() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createArticle());
	}

	@Test
	public void validate011() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createEntry());
	}

	@Test
	public void validate012() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createMastersthesis());
	}

	@Test
	public void validate013() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createIncollection());
	}

	@Test
	public void validate014() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createProceedings());
	}

	@Test
	public void validate015() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createMisc());
	}

	@Test
	public void validate016() {
		ObjectFactory teste1 = new ObjectFactory();

		assertNotNull(teste1.createFile());
	}






//	testando funcoes que chamam os construtores da classe Inbook para atributos especificos
@Test
public void validate0001() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookCrossref("asd"));
}

@Test
public void validate0002() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookKey("asd"));
}

@Test
public void validate0003() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookLccn("asd"));
}

@Test
public void validate0004() {
	ObjectFactory teste1 = new ObjectFactory();
	BigInteger numero = new BigInteger("0");

	assertNotNull(teste1.createInbookNumber(numero));
}

@Test
public void validate0005() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookMrnumber("asd"));
}

@Test
public void validate0006() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookPages("asd"));
}

@Test
public void validate0007() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookAffiliation("asd"));
}

@Test
public void validate0008() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookPrice("asd"));
}

@Test
public void validate0009() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookEdition("asd"));
}

@Test
public void validate0010() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookAnnotate("asd"));
}

@Test
public void validate0011() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookLanguage("asd"));
}

@Test
public void validate0012() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookTitle("asd"));
}

@Test
public void validate0013() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookType("asd"));
}

@Test
public void validate0014() {
	ObjectFactory teste1 = new ObjectFactory();
	BigInteger numero = new BigInteger("0");

	assertNotNull(teste1.createInbookChapter(numero));
}

@Test
public void validate0015() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookNote("asd"));
}

@Test
public void validate0016() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookCopyright("asd"));
}

@Test
public void validate0017() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookKeywords("asd"));
}

@Test
public void validate0018() {
	try{
		ObjectFactory teste1 = new ObjectFactory();

		GregorianCalendar gcal = new GregorianCalendar();
		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

		assertNotNull(teste1.createInbookYear(xgcal));
	}
	catch(Exception e){
	}
}

@Test
public void validate0019() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookAbstract("asd"));
}

@Test
public void validate0020() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookPublisher("asd"));
}

@Test
public void validate0021() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookIsbn("asd"));
}

@Test
public void validate0022() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookLocation("asd"));
}

@Test
public void validate0023() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookCategory("asd"));
}

@Test
public void validate0024() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookDoi("asd"));
}

@Test
public void validate0025() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookVolume("asd"));
}

@Test
public void validate0026() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookMonth("asd"));
}

@Test
public void validate0027() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookIssn("asd"));
}

@Test
public void validate0028() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookSize("asd"));
}

@Test
public void validate0029() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookContents("asd"));
}

@Test
public void validate0030() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookSeries("asd"));
}

@Test
public void validate0031() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookUrl("asd"));
}

@Test
public void validate0032() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookEditor("asd"));
}

@Test
public void validate0033() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookAddress("asd"));
}
/*
@Test
public void validate0034() {
	ObjectFactory teste1 = new ObjectFactory();

	assertNotNull(teste1.createInbookCrossref("asd"));
}
*/


}
