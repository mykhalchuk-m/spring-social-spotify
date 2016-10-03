package org.springframework.social.spotify.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.spotify.api.MeOperations;
import org.springframework.social.spotify.api.Spotify;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
public class SpotifyTemplate extends AbstractOAuth2ApiBinding implements Spotify {

	private MeOperations meOperations;

	public SpotifyTemplate(String accessToken) {
		super(accessToken);
		initOperations();
	}

	private void initOperations() {
		meOperations = new UserTemplate(getRestTemplate(), isAuthorized());
	}

	@Override
	public MeOperations me() {
		return meOperations;
	}
}
