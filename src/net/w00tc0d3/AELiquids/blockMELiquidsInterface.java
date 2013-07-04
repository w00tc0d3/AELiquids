package net.w00tc0d3.AELiquids;

import cpw.mods.fml.common.Mod.Instance;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class blockMELiquidsInterface extends Block {
	public blockMELiquidsInterface(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("aeliquids:meliquidsinterface");
	}
}
