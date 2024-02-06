package GenericUtility;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;


public class JavaUtility 
{
	
	public static int getRandomNum()
	{
		Random ran = new Random();
		
		int rannum = ran.nextInt(1000);
		return rannum;
		
		
		
	}
	
	
	public String getSystemCurrentDate()
	{
		Date date=new Date();
		String dateAndTime = date.toString();
		String yyyy = dateAndTime.split(" ")[5];
		int mm = date.getMonth()+1;
		String dd = dateAndTime.split(" ")[2];
		String dateformat=dd +"-"+mm+"-"+yyyy;
		return dateformat;
	}
	
	public String getSystemCurrentDateAndTime()
	{
		Date date=new Date();
		String dateAndTime = date.toString();
		String dateAndTime2 = dateAndTime.replaceAll(":", "-");
		return dateAndTime2;
	}
	
	 public  String generateRandomString() {
		 int length=3;
	        
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	        
	        StringBuilder randomString = new StringBuilder();

	        
	        Random random = new Random();

	        
	        for (int i = 0; i < length; i++) {
	            
	            int index = random.nextInt(characters.length());
                randomString.append(characters.charAt(index));
	        }

	       
	        return randomString.toString();
	    }

	   }
	


