package com.example.javafx.bankSimulation;

public interface Loader {
	public static void Loading() throws InterruptedException {
		String[] animationFrames = {
				"\u001B[35m▖", "\u001B[35m▗ ▘", "\u001B[35m▙", "\u001B[35m▚", "\u001B[35m▛",
				"\u001B[35m▜", "\u001B[35m▝ ", "\u001B[35m▞ ", "\u001B[35m▟", "\u001B[35m■\u001B[0m",
		};
		int frameIndex = 0;
		int iterations = 20;
		for (int i = 0; i < iterations; i++) {
			System.out.print("\rLoading " + animationFrames[frameIndex] + " ");
			frameIndex++;
			if (frameIndex >= animationFrames.length) {
				frameIndex = 0;
			}
			Thread.sleep(100);

		}
		System.out.println(); // не удаляем, для переноса след вызовов
	}

}
