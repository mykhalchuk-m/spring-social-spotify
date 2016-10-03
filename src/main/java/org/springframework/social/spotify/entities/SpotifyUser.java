package org.springframework.social.spotify.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
@Data
@NoArgsConstructor
public class SpotifyUser extends SpotifyObject {

	private String id;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("external_urls")
	private SpotifyExternalURL spotifyExternalURL;
	private SpotifyFollower spotifyFollower;
	private String href;
	private SpotifyImage spotifyImage;
	private String type;

}
