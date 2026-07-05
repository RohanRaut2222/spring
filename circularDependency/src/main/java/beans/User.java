package beans;

public class User
{
	private final int userId;
	private Order order;
	
	public User(int userId)
	{
		this.userId = userId;
	}
	
	public void setOrder(Order order)
	{
		this.order = order;
	}
	
	public void getUserInfo()
	{
		System.out.println("UserId: "+this.userId+", OrderId: "+this.order.getOrderId());
	}
}

