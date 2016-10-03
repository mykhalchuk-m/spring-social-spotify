package org.springframework.social.spotify.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Marian_Mykhalchuk on 9/12/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoredSpotifyArtistList {

	private List<SpotifyArtist> items;
	private String href;
	private Integer limit;
	private String next;
	private String previous;
	private Integer offset;
	private Integer total;

}
