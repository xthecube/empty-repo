# Give Me My Fucking Debug Info!!!

#### This mod was built for Minecraft 26.1.2 running on FabricLoader. 

## What this mod does

Some Multiplayer servers have reducedDebugInfo enabled as a gamerule.
This gamerule tells connected clients to not render the following when the debug menu is open:
- biome name (minecraft:biome)
- chunk generation stats
- day count (How many days have passed in the current world)
- entity_spawn_counts (How many active mobs are contributing to the [mob cap](https://minecraft.wiki/w/Mob_cap))
- heightmap 
- client-sided light levels (block, sky)
- [local_difficulty](https://minecraft.wiki/w/Difficulty#Regional_difficulty)
- looking_at entity, block, and fluid states/tags
- particle_render_stats 
- player_position (player coordinates)
- [the Mood value](https://minecraft.wiki/w/Ambience#Mood_algorithm)
#### The gamerule also disables the following Debug Modifiers:
- F3+B (Entity hitboxes)
- F3+C (Chunk borders/boundaries)
- F3+G (Copy Coordinates to Clipboard)
- F3+I (Copy block/entity NBT data to clipboard)
#### This mod forces the Client to ignore the gamerule check, allowing you to use these commands.



Some values aren't sent to the client when the gamerule is on. This cannot be circumvented.
## License

This mod is available under the CC0 license. You're free to rip off this work and do whatever you want with it.