import java.util.*;

public class RandomBox<T>{
	
	private ArrayList<T> drawingList = new ArrayList<>();
	private int count = 0;
	
	public RandomBox() {
	
	}
	
	public void addEntry(T entry) {
		drawingList.add(entry);
		count++;
	}
	
	public T drawWinner() {
		if(!drawingList.isEmpty()) {
			Random draw = new Random();
			int drawNumber = draw.nextInt(count);
			T winningDraw = drawingList.get(drawNumber);
			drawingList.remove(drawNumber);
			count--;
			return winningDraw;
		} else {
			throw new IllegalStateException("There are no entries in the Box.");
		}
	}
	
	public void displayEntries() {
		if(!drawingList.isEmpty()) {
			System.out.println("Displaying all current entries.");
			for(int i = 0; i < drawingList.size(); i++) {
				System.out.println("Entry " + (i+1) + ": " + drawingList.get(i));
			}
		} else {
			throw new IllegalStateException("There are no entries in the Box.");
		}
	}
	
	public String toString() {
		return "This is a box. It holds entries. There are currently " + count + " entries in the box.";
	}
	
	public int size() {
		return count;
	}
	
}
