package com.week2.lesson4;

public class MainTrack {

	public static void main(String[] args) {
		Track track = new Track("NV2244AV");
		Track track2 = new Track("AA5577SV");
		
		track.roll("rolling");
		track2.roll("rolling");
		
		track.roll("rolling");
		
		track.stop("stopped");
		track2.stop("stopped");
		
		track2.stop("stopped");
	}

}
