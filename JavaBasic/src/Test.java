
interface Controllable {
	void play();
	void stop();
}

public class Test {

	public static void main(String[] args) {
		Controllable videoPlayer = new Controllable() {
			public void play() {
				System.out.println("play");
			}
			public  void stop() {
				System.out.println("stop");
			}
		};
		videoPlayer.play();
		videoPlayer.stop();

	}

}
