package refactor.models;

import java.util.*;

public class PlayerModel {
	private List<String> redApples;
	private List<String> greenApples;
	private List<String> discardedRedApples;
	private List<String> discardedGreenApples;
		   
	public List<String> getRedApples() {
		return redApples;
	}
		   
	public void setRedApples(List<String> redApples) {
		this.redApples = redApples;
	}
		   
	public List<String> getGreenApples() {
		return greenApples;
	}
		   
	public void setGreenApples(List<String> greenApples) {
		this.greenApples = greenApples;
	}
	
	public List<String> getDiscardedRedApples() {
		return discardedRedApples;
	}
	
	public List<String> getDiscardedGreenApples() {
		return discardedGreenApples;
	}
}
