public class Parameters{
	public static void main(String[] args)
	{
		email(1,"my first mail");
		email(2,"my second mail");
		email(3,"my third mail");
		phoneCall(89716,"rijesh",91);
		phoneCall(98458,"shaji",1);
		phoneCall(97402,"reena",11);
		login("rijeshrj2001@gmail.com","ABC@123");
		login("swathi123@gmail.com","Xyz@098");
		login("shivv67@gmail.com","Lmno!123");

		
	}
	public static void email(int id,String subject)
	{
		System.out.println("emailId:"+id+"\nSubject:"+subject);
	}
	public static void phoneCall(int mobNum,String name,int countryCode){
		System.out.println("mobile_number:"+mobNum+"\nname:"+name+"\ncountry_code"+countryCode);
	}
	public static void login(String email,String password)
	{
		System.out.println("email is :"+email+"\n password is:"+password);
	}
}