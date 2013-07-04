package net.w00tc0d3.AELiquids;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = AELiquids.modid, name = "AE Liquids", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class AELiquids {
	@Instance
	public static AELiquids instance;
	@SidedProxy(clientSide = "net.w00tc0d3.AELiquids.ClientProxy", serverSide = "net.w00tc0d3.AELiquids.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String modid = "AELiquids";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Block meLiquidsInterface = new blockMELiquidsInterface(510, Material.rock).setUnlocalizedName("meliquidsInterface");
		GameRegistry.registerBlock(meLiquidsInterface, modid + meLiquidsInterface.getUnlocalizedName());
		LanguageRegistry.addName(meLiquidsInterface, "ME Liquids Interface");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
