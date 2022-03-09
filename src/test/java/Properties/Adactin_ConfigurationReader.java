package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Adactin_ConfigurationReader {
	public static Properties pk;
	public Adactin_ConfigurationReader() throws IOException {
	
	
	File sk= new File("C:\\Users\\saskl\\eclipse-workspace\\com.cucumber\\src\\test\\java\\Properties\\Adactin.properties");
	
	FileInputStream inputFile= new FileInputStream(sk);
	pk=new Properties();
	pk.load(inputFile);
	
	}
	
	public String getbrowser() {
		String browser= pk.getProperty("Browsername");
		return browser;
		
	}
	
	public String geturl() {
		String url=pk.getProperty("Url");
		return url;		
				
	}
		
		public String getusernmae() {
			String username=pk.getProperty("Username");
			return username;
			
		}		
	
			public String getFirstname() {
				String Firstname=pk.getProperty("Firstname");
				return Firstname;
			}
			
	
			public String getLastname() {
				String Lastname=pk.getProperty("Lastname");
				return Lastname;
			}
			public String getAdress() {
				String Adress=pk.getProperty("Adress");
				return Adress;
			}
			public String getCardnumber() {
				String Cardnumber=pk.getProperty("Cardnumber");
				return Cardnumber;
			}
			public String getCVV() {
				String CVV=pk.getProperty("CVV");
				return CVV;
			}
			
			public String getpassword() {
				String password=pk.getProperty("Password");
				return password;
			}
			}



	


