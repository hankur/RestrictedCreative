package me.prunt.restrictedcreative;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;

public class RestrictedCreativeAPI {
    public RestrictedCreativeAPI() {}

    // Returns whether the block was placed in creative or not
    public static boolean isCreative(Block b) {}

    // Returns whether the entity was created in creative or not
    public static boolean isCreative(Entity en) {}

    // Returns whether the item frame contains creative items or not
    public static boolean isCreativeItemFrame(ItemFrame itf) {}

    // Adds given block to creative blocks list
    public static void add(Block b) {}

    // Adds given block to creative blocks list
    public static void remove(Block b) {}

    // Adds given block to creative blocks list
    public static void add(Entity en) {}

    // Adds given block to creative blocks list
    public static void remove(Entity en) {}
}
