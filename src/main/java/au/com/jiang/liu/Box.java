package au.com.jiang.liu;

import java.io.Serializable;

public class Box implements Serializable {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = 7203274388653411262L;
	
	private String color = "";
	private int weight = 0;
	
	public Box(final int weight, final String color) {
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
	
	public String toString() {
	    return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
	}
}
