import java.util.ArrayList;
import java.util.List;

public class MyObservable{
	private List<MyObserver> observers;

	public MyObservable(){
		this.observers = new ArrayList<>();
	}

	public void addObserver(MyObserver o){
		this.observers.add(o);
	}

	public void notifyObservers(Object value){
		this.observers.forEach(o -> o.update(this, value));
	}
}