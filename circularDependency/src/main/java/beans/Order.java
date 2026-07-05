package beans;

public class Order
{
	private final int orderId;
	private final User user;
	
	public Order(User user, int orderId)
	{
		this.user = user;
		this.orderId = orderId;
	}
	
	public int getOrderId()
	{
		return this.orderId;
	}
}

