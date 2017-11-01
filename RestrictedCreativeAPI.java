package me.prunt.restrictedcreative;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;

public class RestrictedCreativeAPI {
    public RestrictedCreativeAPI() {}

    // Returns the total count of creative placed blocks and entities
    public static int getTotal() {}
    
    // Returns whether the block was placed in creative or not
    public static boolean isCreative(Block b) {}

    // Returns whether the entity was created in creative or not
    public static boolean isCreative(Entity en) {}

    // Returns whether the item frame contains creative items or not
    public static boolean isCreativeItemFrame(ItemFrame itf) {}

    // Adds given block to creative blocks list
    public static void add(Block b) {}

    // Removes given block from creative blocks list
    public static void remove(Block b) {}

    // Adds given entity to creative entities list
    public static void add(Entity en) {}

    // Removes given entity from creative entities list
    public static void remove(Entity en) {}
}
