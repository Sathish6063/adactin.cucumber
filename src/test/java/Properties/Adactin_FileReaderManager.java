package Properties;

import java.io.IOException;

public class Adactin_FileReaderManager {
	
	private Adactin_FileReaderManager() {
		
	}
	public static Adactin_FileReaderManager propfile(){
		Adactin_FileReaderManager  rk = new Adactin_FileReaderManager();
		return rk;
		
	}
	
	public Adactin_ConfigurationReader config () throws IOException {
		
		Adactin_ConfigurationReader configuration = new Adactin_ConfigurationReader();
		return configuration;
		
		
	}
}
	