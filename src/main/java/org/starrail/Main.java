
import com.fasterxml.jackson.databind.JsonNode;
import org.starrail.Language;
import org.starrail.MihomoAPI;

public class Main {
    public static void main(String[] args) throws Exception {
        MihomoAPI mihomoAPI = new MihomoAPI(Language.valueOf("jp"));
        JsonNode src = mihomoAPI.getDefault("801671759");
        System.out.println(src.get("player"));

    }
}
