package net.w00tc0d3.AELiquids;

import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod.Instance;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class blockMELiquidsInterface extends Block {
	public blockMELiquidsInterface(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(1.5F);
	}
	
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("minecraft:meliquidsinterface");
	}
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		if(par1World.isRemote) {
			return true;
		} else {
			openGUI();
			return true;
		}
	}
	
	public void openGUI() {
		System.out.print("This is the openGUI() function of AELiquids.\n"); 
	}
}
