package org.springframework.social.spotify.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Marian_Mykhalchuk on 9/12/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpotifyArtist extends SpotifyObject {

	@JsonProperty("external_urls")
	private SpotifyExternalURL spotifyExternalURL;
	@JsonProperty("followers")
	private SpotifyFollower spotifyFollower;
	private String[] genres;
	private String href;
	private String id;
	private SpotifyImage[] images;
	private String name;
	private Integer popularity;
	private String type;
}
