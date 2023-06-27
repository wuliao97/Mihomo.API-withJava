package org.starrail;

import java.util.List;

public class MappingData {
    public static Player player;

    private static class Player {
        public String uid;
        public String nickname;
        public Integer level;
        public Integer world_level;
        public Integer friend_count;


        public Avatar avatar;

        public static class Avatar {
            public String id;
            public String name;
            public String icon;
        }


        public String signatrue;
        public boolean is_display;


        public Space_info space_info;

        public static class Space_info {
            public Challenge_data challenge_data;

            public static class Challenge_data {
                public String maze_group_id;
                public String maze_group_index;
                public String pre_maze_group_index;
            }


            public String pass_area_progress;
            public String light_cone_count;
            public String avatar_count;
            public String achievement_count;
        }

    }

    public static class characters {

    }
}
