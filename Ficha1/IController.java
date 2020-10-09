public interface IController{
	void setView(IGestContView view); 
	void update(MyObservable source, Object value);
	void addObserver(MyObserver observer);
}