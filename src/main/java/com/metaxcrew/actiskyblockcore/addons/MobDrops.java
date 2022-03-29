package com.metaxcrew.actiskyblockcore.addons;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class MobDrops implements Listener {

@EventHandler

public void ZombieDeath(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.ZOMBIE) {
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(org.bukkit.Material.ROTTEN_FLESH, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.COPPER_INGOT, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
        }
}

@EventHandler
public void SkeletonDeath(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.SKELETON) {
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(org.bukkit.Material.BONE, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.AMETHYST_SHARD, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
        }

}

@EventHandler
public void CreeperDeath(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.CREEPER) {

            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.GUNPOWDER, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.EMERALD, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
        }

}

@EventHandler
public void SpiderDeath(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.SPIDER) {

            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.STRING, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.COBWEB, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
        }
}

@EventHandler
public void CowDeath(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.COW) {
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.LEATHER, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.COOKED_BEEF, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);

        }
    }

@EventHandler
public void ZombiePigmanDeath(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.PIGLIN) {
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.GOLD_INGOT, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.GOLD_NUGGET, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
        }
    }

@EventHandler
public void Endermite(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.ENDERMITE) {
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.ENDER_PEARL, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.NETHERITE_INGOT, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
        }
}

@EventHandler
public void ZombiefiedPiglin(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.ZOMBIFIED_PIGLIN) {
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.GOLD_NUGGET, 1));
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.GOLD_INGOT, 1));
        e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
    }
}
@EventHandler
public void SilverFishDeath(EntityDeathEvent e) {
    if (e.getEntity().getType() == EntityType.SILVERFISH) {
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.DIAMOND, 1));
            e.getEntity().getWorld().spawnParticle(Particle.HEART, e.getEntity().getLocation(), 5, 0, 0.8, 0, 0.1);
    }
}

}