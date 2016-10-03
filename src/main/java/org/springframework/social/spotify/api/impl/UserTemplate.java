package org.springframework.social.spotify.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.social.spotify.api.MeOperations;
import org.springframework.social.spotify.entities.CursoredSpotifyList;
import org.springframework.social.spotify.entities.SpotifyUser;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
public class UserTemplate extends AbstractSpotifyOperations implements MeOperations {

	public UserTemplate(RestTemplate restTemplate, boolean isUserAuthorized) {
		super(restTemplate, isUserAuthorized);
	}

	@Override
	public SpotifyUser getProfile() {
		return restTemplate.getForObject(buildUri("me"), SpotifyUser.class);
	}

	@Override
	public CursoredSpotifyList getFollowing() {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
		parameters.set("type", "artist");
		CursoredSpotifyList following = restTemplate.getForObject(buildUri("me/following", parameters),
				CursoredSpotifyList.class);
		return following;
	}
}
