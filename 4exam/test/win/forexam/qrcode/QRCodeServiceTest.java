package win.forexam.qrcode;

import org.junit.Test;

public class QRCodeServiceTest {

	@Test
	public void testGetQRCodeWithAnswer() {
		// fail("Not yet implemented"); // TODO

		QRCodeService s = new QRCodeService();
		for (int i = 0; i < 1; i++)
			s.getQRCodeWithAnswer("[a=2, b=6, c=135]");
	}

}
