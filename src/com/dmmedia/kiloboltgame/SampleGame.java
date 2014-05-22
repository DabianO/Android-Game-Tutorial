package com.dmmedia.kiloboltgame;

import com.dabian.framework.Screen;
import com.dabian.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {

	
	@Override
	public Screen getInitScreen() {
        return new LoadingScreen(this); 
	}
	
	@Override
	public void onBackPressed() {
	getCurrentScreen().backButton();
	}

}
