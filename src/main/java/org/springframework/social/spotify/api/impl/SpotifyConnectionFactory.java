package org.springframework.social.spotify.api.impl;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.spotify.api.Spotify;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
public class SpotifyConnectionFactory extends OAuth2ConnectionFactory<Spotify> {

	public SpotifyConnectionFactory(String clientId, String clientSecret) {
		super("spotify", new SpotifyServiceProvider(clientId, clientSecret), new SpotifyApiAdapter());
	}
}
