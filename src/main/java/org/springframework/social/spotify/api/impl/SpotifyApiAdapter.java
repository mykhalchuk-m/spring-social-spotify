package org.springframework.social.spotify.api.impl;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.spotify.api.Spotify;
import org.springframework.social.spotify.entities.SpotifyUser;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
public class SpotifyApiAdapter implements ApiAdapter<Spotify> {

	@Override
	public boolean test(Spotify api) {
		try {
			api.me().getProfile();
			return true;
		} catch (Exception e) {
			// TODO add custom exception
			return false;
		}
	}

	@Override
	public void setConnectionValues(Spotify api, ConnectionValues values) {

	}

	@Override
	public UserProfile fetchUserProfile(Spotify api) {
		SpotifyUser spotifyUser = api.me().getProfile();
		return new UserProfileBuilder().setName(spotifyUser.getDisplayName()).setId(spotifyUser.getId()).build();
	}

	@Override
	public void updateStatus(Spotify api, String message) {

	}
}
