package org.starrail;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;


public class MihomoAPI {
    private final Language Language;
    //private List<String> params = new ArrayList<String>();
    private String result;
    private final String BASE_URL = "https://api.mihomo.me/sr_info_parsed";
    private final String ASSET_URL = "https://raw.githubusercontent.com/Mar-7th/StarRailRes/master";


    public MihomoAPI(final Language Language) {
        this.Language = Language;
    }


    public final String requests(final String material_url) throws Exception {
        final URL url = new URI(material_url).toURL();
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setInstanceFollowRedirects(false);
        connection.setDoOutput(true);
        connection.connect();

        if (connection.getResponseCode() == HttpsURLConnection.HTTP_OK) {
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            return bufferedReader.readLine();
        }
        throw new Exception();
    }


    public String fetch(final String UID) throws Exception {
        return requests(this.BASE_URL + "/" + UID + "?lang=" + this.Language);

    }

    public JsonNode convert(final String src) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readTree(src);
    }


    public JsonNode D_parse(final JsonNode obj, String... keys){
        JsonNode result = obj;
        for (final String key : keys){
            result = result.get(key);
        }
        return result;
    }
}
