# respect with [Mihomo.API](https://github.com/KT-Yeh/mihomo/tree/main)


# Usage
```java
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
```
## Output
```json
{"uid":"801671759","nickname":"Ennui","level":65,"world_level":6,"friend_count":31,"avatar":{"id":"201102","name":"ゼーレ","icon":"icon/avatar/1102.png"},"signature":"seele love | DC: https://discord.gg/UUdbVHau4Y","is_display":true,"space_info":{"challenge_data":{"maze_group_id":0,"maze_group_index":15,"pre_maze_group_index":0},"pass_area_progress":6,"light_cone_count":72,"avatar_count":23,"achievement_count":201}}

```