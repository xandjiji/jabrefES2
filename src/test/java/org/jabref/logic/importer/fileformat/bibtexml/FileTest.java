package org.jabref.logic.importer.fileformat.bibtexml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FileTest {

	@Test
	public void validate01() {
		File teste1 = new File();

		assertNotNull(teste1.getEntry());
	}

}
