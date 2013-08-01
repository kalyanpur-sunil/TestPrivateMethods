package org.sunil;

public class Game {
	
	private Tennis tennis;
	
	@SuppressWarnings("unused")
	private String shout(String str){
		return str.toUpperCase();
	}
	
	
	public Tennis getTennis() {
		return tennis;
	}


	public void setTennis(Tennis tennis) {
		this.tennis = tennis;
	}


	@SuppressWarnings("unused")
	private boolean editChecks(){
		boolean hasErrors = false;
		
		if(!tennis.getPlayer().equalsIgnoreCase("player")){
			hasErrors = true;
		}
		
		if(tennis.getNumOfPlayers()!=2){
			hasErrors = true;
		}
		
		if(!tennis.getGender().matches("[MF]")){
			hasErrors = true;
		}
		return hasErrors;
	}
	
	
}
