
public interface Subject {
	void registerObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void notifyObservers();
	
	void setAction(String action);
	
	String getAction();
}
