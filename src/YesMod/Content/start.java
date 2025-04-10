package YesMod.Content;

import mindustry.type.SectorPreset;
public class start{
    public static SectorPreset Beginning;

    public static void load(){

        Beginning = new SectorPreset("Beginning", gleo.Ice, 15){{
            captureWave = 10;
            difficulty = 1;

            alwaysUnlocked = true;

            rules = r -> {
                r.winWave = captureWave;
            };
        }};
    }
}