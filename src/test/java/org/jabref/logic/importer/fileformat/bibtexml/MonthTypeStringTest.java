package org.jabref.logic.importer.fileformat.bibtexml;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonthTypeStringTest {

	@Test
	public void validate01() {
		MonthTypeString teste1;

		assertNotEquals("JAN", MonthTypeString.JAN);
	}

	@Test
	public void validate02() {
		MonthTypeString teste2 = MonthTypeString.JAN;


		assertEquals("Jan", teste2.value());
	}

	@Test
	public void validate03() {
		MonthTypeString teste3 = MonthTypeString.JAN;
		MonthTypeString teste4 = MonthTypeString.JAN;
		assertEquals(teste4, teste3.fromValue("Jan"));
	}




	@Test
	public void validate04() {
		MonthTypeString teste5 = MonthTypeString.JAN;
		MonthTypeString teste6 = MonthTypeString.DEC;
		assertNotEquals(teste6, teste5.fromValue("Jan"));
	}

	@Test
	public void validate05() {
		MonthTypeString teste8 = MonthTypeString.DEC;
		assertThrows(IllegalArgumentException.class, ()->{teste8.fromValue("asdasd");});
	}

}
