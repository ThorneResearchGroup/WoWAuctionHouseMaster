package tech.tresearchgroup.wowauctionhousemaster;

import tech.tresearchgroup.wowauctionhousemaster.classic.controller.BlizzardAPI;

import java.io.IOException;

public class Main {
    private static String accessToken = null;

    public static void main(String[] args) throws IOException, InterruptedException {
        OAuthHandler oAuthHandler = new OAuthHandler(BlizzardAPI.instance());
        accessToken = oAuthHandler.getAuthCode();
    }
}
