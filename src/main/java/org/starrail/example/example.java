package org.starrail.example;

import com.fasterxml.jackson.databind.JsonNode;
import org.starrail.MihomoAPI;

public class example {
    public static void main(String[] args) throws Exception {
        MihomoAPI mihomoAPI = new MihomoAPI(org.starrail.Language.valueOf("jp"));
        String obj = mihomoAPI.fetch("801671759");
        JsonNode obj_2 = mihomoAPI.convert(obj);
        System.out.println(mihomoAPI.D_parse(obj_2, "player", "uid"));
    }
}
