public class CollegeDetails
{
    int collegeId;
	String collegeName;
	String collegePlace;
	String phoneNo;
	String pincode;

	public CollegeDetails()
	{
	System.out.println("this is a no parameter constructor");
	}
	public CollegeDetails(int collegeId)
	{
	this.collegeId=collegeId;
	}
	public CollegeDetails(int collegeId,String collegeName)
	{
	this(collegeId);
	this.collegeName=collegeName;
	}
	public CollegeDetails(int collegeId,String collegeName,String collegePlace)
	{
	this(collegeId,collegeName);
	this.collegePlace=collegePlace;
	}
	public CollegeDetails(int collegeId,String collegeName,String collegePlace,String phoneNo)
	{
	this(collegeId,collegeName,collegePlace);
	this.phoneNo=phoneNo;
	}
	public CollegeDetails(int collegeId,String collegeName,String collegePlace,String phoneNo,String pincode)
	{
	this(collegeId,collegeName,collegePlace,phoneNo);
	this.pincode=pincode;
	}

	public void printDetails()
	{
		System.out.println("collegeId:"+collegeId+"\ncollegename:"+collegeName+"\nplace:"+collegePlace+"\nphone number:"+phoneNo+"\npincode:"+pincode);
	}

}