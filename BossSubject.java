import java.util.ArrayList;

public class BossSubject implements Subject{
	
	//观察者集合
	private ArrayList<Observer> observers;

	//通知者行为
	private String action;
	
	public BossSubject()
	{
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers)
		{
			if (o != null)
			{
				o.update();
			}
		}
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
