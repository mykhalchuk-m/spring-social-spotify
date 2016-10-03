package org.springframework.social.spotify.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
@Data
@NoArgsConstructor
public abstract class SpotifyObject implements Serializable {
	private String uri;
}
