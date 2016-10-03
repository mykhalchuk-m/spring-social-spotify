package org.springframework.social.spotify.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
@Data
@NoArgsConstructor
public class SpotifyFollower {
	private String href;
	private int total;

}
