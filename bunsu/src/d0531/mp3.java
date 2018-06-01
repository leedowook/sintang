package d0531;

public interface mp3 {
	public void musicon();
	public void musicstop();
	default void vup() {
		System.out.println("볼륨을 최대로~~");
	}
	default void vdown() {
		System.out.println("볼륨을 낮추자");
	}
}
