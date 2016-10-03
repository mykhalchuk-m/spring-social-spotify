package org.springframework.social.spotify.api.impl;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by Marian_Mykhalchuk on 9/8/2016.
 */
public abstract class AbstractSpotifyOperations {

	private static final String SPOTIFY = "spotify";
	private static final String API_URL_BASE = "https://api.spotify.com/v1/";

	protected final RestTemplate restTemplate;
	protected final boolean isUserAuthorized;

	public AbstractSpotifyOperations(RestTemplate restTemplate, boolean isUserAuthorized) {
		this.restTemplate = restTemplate;
		this.isUserAuthorized = isUserAuthorized;
	}

	protected void requireUserAuthorization() {
		if (!isUserAuthorized) {
			throw new MissingAuthorizationException(SPOTIFY);
		}
	}

	protected URI buildUri(String path) {
		return buildUri(path, EMPTY_PARAMETERS);
	}

	protected URI buildUri(String path, String parameterName, String parameterValue) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
		parameters.set(parameterName, parameterValue);
		return buildUri(path, parameters);
	}

	protected URI buildUri(String path, MultiValueMap<String, String> parameters) {
		return URIBuilder.fromUri(API_URL_BASE + path).queryParams(parameters).build();
	}

	private static final LinkedMultiValueMap<String, String> EMPTY_PARAMETERS = new LinkedMultiValueMap<>();

}
