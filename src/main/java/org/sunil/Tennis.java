package org.sunil;

public class Tennis {
	private String player;
	private int numOfPlayers;
	private String gender;
	
	public Tennis(){
		super();
	}
	
	public Tennis(String player){
		this.player = player;
	}
	public String getPlayer() {
		return player;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
}
