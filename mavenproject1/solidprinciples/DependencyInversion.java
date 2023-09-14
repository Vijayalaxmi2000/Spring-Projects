package solidprinciples;

interface OnlineApps
{
	void sendmsg();
	void sendVoicemsg();
	void videoCall();
	void media();	
}
class Whatsapp implements OnlineApps
{
	@Override
	public void sendmsg() 
	{
		System.out.println("Whatsapp Message");	
	}

	@Override
	public void sendVoicemsg() 
	{
		System.out.println("Whatsapp Voice message");
	}
	@Override
	public void videoCall() 
	{
		System.out.println("Whatsapp videoCall");
		
	}
	@Override
	public void media() 
	{
		System.out.println("Send Images/Videos/Documents in Whatsapp");
	}
	
}
class Instagram implements OnlineApps
{
	@Override
	public void sendmsg() 
	{
		System.out.println("Instagram Message");	
	}

	@Override
	public void sendVoicemsg() 
	{
		System.out.println("Instagram Voice message");
	}
	@Override
	public void videoCall() 
	{
		System.out.println("Instagram videoCall");
		
	}
	@Override
	public void media() 
	{
		System.out.println("Send Images/Videos/Documents in Instagram");
	}
	
}
class Facebook implements OnlineApps
{
	@Override
	public void sendmsg() 
	{
		System.out.println("Facebook Message");	
	}

	@Override
	public void sendVoicemsg() 
	{
		System.out.println("Facebook Voice message");
	}
	@Override
	public void videoCall() 
	{
		System.out.println("Facebook videoCall");
		
	}
	@Override
	public void media() 
	{
		System.out.println("Send Images/Videos/Documents in Facebook");
	}
	
}
class Service
{
	public OnlineApps login(OnlineApps o)
	{
		OnlineApps oa;
		if(o instanceof Whatsapp)
		{
			oa=new Whatsapp();
			return oa;
		}
		else if(o instanceof Instagram)
		{
			oa=new Instagram();
			return oa;
		}
		else
		{
			oa=new Facebook();
			return oa;
		}
	}
}
public class DependencyInversion 
{

	public static void main(String[] args) 
	{
		Service s=new Service();
		Whatsapp w=new Whatsapp();
		Instagram i=new Instagram();
		Facebook fb=new Facebook();
		s.login(w);
		w.sendmsg();
		w.videoCall();
		w.sendVoicemsg();
		w.media();
		System.out.println("--------------");
		s.login(i);
		i.sendmsg();
		i.videoCall();
		i.sendVoicemsg();
		i.media();
		System.out.println("--------------");
		s.login(fb);
		fb.sendmsg();
		fb.videoCall();
		fb.sendVoicemsg();
		fb.media();
		
	}

}
