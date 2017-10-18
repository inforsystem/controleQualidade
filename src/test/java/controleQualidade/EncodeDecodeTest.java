package controleQualidade;

import java.util.Base64;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EncodeDecodeTest {

	private String texto;
	
	@Before
	public void initialize() {
		texto = "texto legivel";
	}
	
	@Test
	public void decode() {
		String encode = Base64.getEncoder().encodeToString(texto.getBytes());
		String decode = new String(Base64.getDecoder().decode(encode.getBytes()));
		Assert.assertEquals(decode, texto);
	}
	
	@Test
	public void encode() {
		String encode = Base64.getEncoder().encodeToString(texto.getBytes());
		String decode = new String(Base64.getDecoder().decode(encode.getBytes()));
		Assert.assertNotEquals(encode, decode);
	}
	
}
