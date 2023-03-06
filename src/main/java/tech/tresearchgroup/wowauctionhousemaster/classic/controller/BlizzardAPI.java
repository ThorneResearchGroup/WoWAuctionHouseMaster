package tech.tresearchgroup.wowauctionhousemaster.classic.controller;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.oauth2.clientauthentication.ClientAuthentication;
import com.github.scribejava.core.oauth2.clientauthentication.RequestBodyAuthenticationScheme;

public class BlizzardAPI extends DefaultApi20 {
    protected BlizzardAPI() {
    }

    public static BlizzardAPI instance() {
        return BlizzardAPI.InstanceHolder.INSTANCE;
    }

    public String getAccessTokenEndpoint() {
        return " https://oauth.battle.net/oauth/token";
    }

    protected String getAuthorizationBaseUrl() {
        return " https://oauth.battle.net/oauth/authorize";
    }

    public ClientAuthentication getClientAuthentication() {
        return RequestBodyAuthenticationScheme.instance();
    }

    private static class InstanceHolder {
        private static final BlizzardAPI INSTANCE = new BlizzardAPI();

        private InstanceHolder() {
        }
    }
}
