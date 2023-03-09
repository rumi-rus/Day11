package exercise6;
import java.util.ArrayList;

public class BrowserHistory {
	public ArrayList<String> history= new ArrayList<String>();
	String homePage;
	//String string;
	int a;
	
	BrowserHistory(String homePage) {
		this.homePage=homePage;
	}
	void visit(String url) throws InvalidURLException{
		String str;
		str=url.substring(url.length()-4);
		if((str.equals(".com"))||(str.equals(".org"))||(str.equals(".in"))) {
			
			history.add(url);
			a=history.size()-1;
		}
		else {
			//System.out.println("continuing");
			throw new InvalidURLException("Invalid url extension"); 
		}
	}
	
	String back(int step) throws NoHistoryFoundException{
		String str;
		if((a-step)<0) {
			
			throw new NoHistoryFoundException("No History Found");
		}else if(step<0) {
			throw new InvalidPositionException("Provide only positive values");
		}
		else {
			str=history.get(a-step);
			a=history.indexOf(str);
			return str;
		}
		
	}
	
	String forward(int steps) throws NoHistoryFoundException{
		if((a+steps)>=history.size()) {
			throw new NoHistoryFoundException("No History Found");
		}
		else {
			String str=history.get(a+steps);
			a=history.indexOf(str);
			return str;
		}	
	}
	
	String get(int position) {
		if(position-1>history.size()) {
			throw new IndexOutOfBoundsException("Invalid Position");
		}
		else if(position-1<0) {
			throw new InvalidPositionException("Provide only positive values");
		}
		else {
		String str=history.get(position-1);
		return str;
		}
	}

}
