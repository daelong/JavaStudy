interface Controllable{
	void play();
	void stop();
}

class VideoPlayer implements Controllable{
	public void play() {};
	public void stop() {};
}

class VideoPlayerTest{
	
	public static void main(String[] args) {
		Controllable a = new VideoPlayer() {
			public void play() {
				System.out.println("play");
			}
			public void stop() {
				System.out.println("stop");
			}
		};
		a.play();
		a.stop();
	}				
}
