package com.metaxcrew.actiskyblockcore.BlockReplaceListeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Arrays;
import java.util.List;

import static com.metaxcrew.actiskyblockcore.BlockReplaceListeners.BlockReplacementEngine.checkBlockReplace;

public class BlockBreakListener implements Listener {
	List<String> resourceWorlds = Arrays.asList("farm_world", "forest_world", "mountain_world", "desert_world", "island_world", "skyblock_world","world");
	@EventHandler
	public void onResourceWorlds(BlockBreakEvent e) {

		if (e.getPlayer().getGameMode() == GameMode.CREATIVE) return; // creative mode bypass

		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.IRON_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()), // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.IRON_ORE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.EMERALD_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.EMERALD_ORE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.GOLD_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.GOLD_ORE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.LAPIS_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.LAPIS_ORE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.DIAMOND_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.DIAMOND_ORE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.NETHER_QUARTZ_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.NETHER_QUARTZ_ORE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.STONE && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.STONE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.STONE_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.STONE && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.COBBLESTONE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.OAK_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.OAK_LOG, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.OAK_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.OAK_WOOD, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.DARK_OAK_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.DARK_OAK_LOG, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.DARK_OAK_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.DARK_OAK_WOOD, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.BIRCH_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.BIRCH_LOG, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.BIRCH_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.BIRCH_WOOD, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.JUNGLE_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.JUNGLE_LOG, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.JUNGLE_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.JUNGLE_WOOD, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.SPRUCE_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.SPRUCE_LOG, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.SPRUCE_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.UI_LOOM_TAKE_RESULT, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.SPRUCE_WOOD, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.STONE_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.MUSHROOM_STEM && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AZALEA_FALL, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.MUSHROOM_STEM, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.STONE_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.MUSHROOM_STEW && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.AIR, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AZALEA_FALL, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.MUSHROOM_STEW, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.STONE_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.BROWN_MUSHROOM_BLOCK && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.AIR, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AZALEA_FALL, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.BROWN_MUSHROOM_BLOCK, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.STONE_AXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.RED_MUSHROOM_BLOCK && resourceWorlds.contains(e.getBlock().getWorld().getName()),  // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.AIR, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AZALEA_FALL, // sound to play on block break
				300, // delay before replacing block, in seconds
				Material.RED_MUSHROOM_BLOCK, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);

		//Food
		checkBlockReplace( // WHEAT EXAMPLE
				e, // block break event passed through
				Material.AIR, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.WHEAT && resourceWorlds.contains(e.getBlock().getWorld().getName()), // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				null, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AMETHYST_BLOCK_BREAK, // sound to play on block break
				120, // delay before replacing block, in seconds
				Material.WHEAT, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				e.getBlock().getBlockData(), // extra block data for the final replacement block
				Arrays.asList(Material.AIR, Material.WHEAT) // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // WHEAT EXAMPLE
				e, // block break event passed through
				Material.AIR, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.POTATOES && resourceWorlds.contains(e.getBlock().getWorld().getName()), // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				null, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AMETHYST_BLOCK_BREAK, // sound to play on block break
				120, // delay before replacing block, in seconds
				Material.AIR, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				e.getBlock().getBlockData(), // extra block data for the final replacement block
				Arrays.asList(Material.AIR, Material.POTATOES) // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // WHEAT EXAMPLE
				e, // block break event passed through
				Material.AIR, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.BEETROOTS && resourceWorlds.contains(e.getBlock().getWorld().getName()), // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				null, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AMETHYST_BLOCK_BREAK, // sound to play on block break
				120, // delay before replacing block, in seconds
				Material.AIR, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				e.getBlock().getBlockData(), // extra block data for the final replacement block
				Arrays.asList(Material.AIR, Material.BEETROOTS) // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);
		checkBlockReplace( // WHEAT EXAMPLE
				e, // block break event passed through
				Material.AIR, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.CARROTS && resourceWorlds.contains(e.getBlock().getWorld().getName()), // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				null, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AMETHYST_BLOCK_BREAK, // sound to play on block break
				120, // delay before replacing block, in seconds
				Material.AIR, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				e.getBlock().getBlockData(), // extra block data for the final replacement block
				Arrays.asList(Material.AIR, Material.CARROTS) // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);

checkBlockReplace( // ALL LOGS
				e, // block break event passed through
				Material.AIR, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				true, // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.ENTITY_ENDER_DRAGON_GROWL, // sound to play on block break
				2, // delay before replacing block, in seconds
				e.getBlock().getType(), // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				e.getBlock().getBlockData(), // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);

	}
}
