interface Controllable{
	void play();
	void stop();
}

class VideoPlayer implements Controllable{
	public void play() {
		System.out.println("play");
	}
	public void stop() {
		System.out.println("stop");
	}
}

class VideoPlayerTest {
	

	public static void main(String[] args) {
		VideoPlayer a = new VideoPlayer() {
			public void play() {
				System.out.println("play!!!!!");
			}
			public void stop() {
				System.out.println("stop!!!!!");
			}
		};
		a.play();
		a.stop();
		
//		Controllable videoPlayer = new Controllable() {
//			public void play() {
//				System.out.println("play");
//			}
//			public void stop() {
//				System.out.println("stop");
//			}
//		};
//		videoPlayer.play();
//		videoPlayer.stop();
		
//		private class VideoPlayer implements Controllable{
//			public void play() {
//				System.out.println("play");
//			}
//			public void stop() {
//				System.out.println("stop");
//			}
//		}
		
		
	}

}
