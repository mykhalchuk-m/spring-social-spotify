package org.springframework.social.spotify.api.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.spotify.api.Spotify;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
public class SpotifyServiceProvider extends AbstractOAuth2ServiceProvider<Spotify> {

	/**
	 * @param clientId     the client ID
	 * @param clientSecret the client secret
	 */
	public SpotifyServiceProvider(@Value("org.springframework.social.spotify.client.id") String clientId,
	                              @Value("org.springframework.social.spotify.client.secret") String clientSecret) {
		super(new OAuth2Template(clientId, clientSecret, "https://accounts.spotify.com/authorize",
				"https://accounts.spotify.com/authorize", "https://accounts.spotify.com/api/token"));
	}

	/**
	 * @param clientId        the client ID
	 * @param clientSecret    the client secret
	 * @param authorizeUrl    the base URL to redirect to when doing authorization code or implicit grant authorization
	 * @param authenticateUrl the URL to redirect to when doing authentication via authorization code grant
	 * @param accessTokenUrl  the URL at which an authorization code, refresh token, or user credentials may be exchanged for an access token
	 */
	public SpotifyServiceProvider(@Value("org.springframework.social.spotify.client.id") String clientId,
	                              @Value("org.springframework.social.spotify.client.secret") String clientSecret,
	                              String authorizeUrl, String authenticateUrl, String accessTokenUrl) {
		super(new OAuth2Template(clientId, clientSecret, authorizeUrl, authenticateUrl, accessTokenUrl));
	}

	@Override
	public Spotify getApi(String accessToken) {
		return new SpotifyTemplate(accessToken);
	}
}
