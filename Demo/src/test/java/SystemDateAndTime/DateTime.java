package SystemDateAndTime;

import java.time.LocalDateTime;

public class DateTime 
{
	public static void main(String[] args) 
	{
		System.out.println(LocalDateTime.now().toString().replace(':', '-'));
		
	}

}
