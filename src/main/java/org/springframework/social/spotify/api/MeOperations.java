package org.springframework.social.spotify.api;

import org.springframework.social.spotify.entities.CursoredSpotifyList;
import org.springframework.social.spotify.entities.SpotifyUser;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
public interface MeOperations {
	SpotifyUser getProfile();

	CursoredSpotifyList getFollowing();
}
