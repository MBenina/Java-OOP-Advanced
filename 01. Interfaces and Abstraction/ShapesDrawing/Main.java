package ex1.ShapesDrawing;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String scannerNextLine = scanner.nextLine();
		Queue<Integer> queue = new ArrayDeque<>();
		
		for (int i = 0; i < 5; i++) 
		{
			queue.add(Integer.parseInt(scannerNextLine));
		}
		
		Drawable circle = new Circle(queue.poll(), queue.poll(), queue.poll()); //takes out the first 3 
		Drawable rect = new Rectangle(queue.poll(), queue.poll());
		
//		circle.draw();
//		rect.draw();
		printShapes(circle);
		printShapes(rect);

	}
	
	public static void printShapes(Drawable shape)
	{
		shape.draw();
	}
	

}
