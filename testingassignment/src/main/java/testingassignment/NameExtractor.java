package testingassignment;

public class NameExtractor {

	private String name;
	private String[] titleList = {"Mr", "Dr", "Sir", "Mrs", "Ms"};
	public NameExtractor(String fullName)
	{
		this.name = fullName;
	}
	public String getTitle()
	{
		String val = "";
		String[] nameparts = this.name.split(" ");
		if(nameparts.length > 2)
		{
			for(String title : titleList )
			{
				String n = nameparts[0].replace('.', ' ').trim(); 
				if( n.equals(title))
				{
					val = title;
				}
			}	
		}
		
		return val;
	}
	public String getFirstName()
	{
		String val = "";
		String[] nameparts = this.name.split(" ");
		if(nameparts.length == 1)
		{
			val = this.name;
		}
		else if(nameparts.length == 2)
		{
			val = nameparts[0];	
		}
		else
		{
			val = nameparts[1];
		}
		
		return val;
	}
}
