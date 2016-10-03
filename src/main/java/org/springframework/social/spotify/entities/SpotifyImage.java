package org.springframework.social.spotify.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpotifyImage implements Serializable {

	private int height;
	private int width;
	private String url;
}
