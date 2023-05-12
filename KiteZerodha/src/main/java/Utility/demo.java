package Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String username = Parametrization1.getData(0, 1);
		System.out.println(username);

	}

}
