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
	List<String> resourceWorlds = Arrays.asList("farm_world", "forest_world");
	@EventHandler
	public void onResourceWorlds(BlockBreakEvent e) {

		if (e.getPlayer().getGameMode() == GameMode.CREATIVE) return; // creative mode bypass

		checkBlockReplace( // IRON ORE EXAMPLE
				e, // block break event passed through
				Material.IRON_PICKAXE, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.IRON_ORE, // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				Material.BEDROCK, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AMETHYST_BLOCK_BREAK, // sound to play on block break
				5, // delay before replacing block, in seconds
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
				Sound.BLOCK_AMETHYST_BLOCK_BREAK, // sound to play on block break
				5, // delay before replacing block, in seconds
				Material.EMERALD_ORE, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				null, // extra block data for the final replacement block
				null // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);

		checkBlockReplace( // WHEAT EXAMPLE
				e, // block break event passed through
				Material.AIR, // tool/item required to break block with, can be list of materials or air if you want them to be able to use anything
				e.getBlock().getType() == Material.WHEAT && resourceWorlds.contains(e.getBlock().getWorld().getName()), // requirement for event to happen, in this case: block = iron ore
				true, // requirements for replacing block, checked when it's time to replace
				null, // block to replace with temporarily, null = no temporary replacement
				Sound.BLOCK_AMETHYST_BLOCK_BREAK, // sound to play on block break
				2, // delay before replacing block, in seconds
				Material.WHEAT, // block to replace with when time is up. If this isn't a block then it'll be replaced with air
				e.getBlock().getBlockData(), // extra block data for the final replacement block
				Arrays.asList(Material.AIR, Material.WHEAT) // block/list of blocks the block has to be when it's time to replace. If this is null or empty list then it has to be the temporary replacement block
		);

		/*checkBlockReplace( // ALL LOGS
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
		);*/
	}
}
