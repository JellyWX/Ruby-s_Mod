package com.ruby.rubymod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraftforge.common.util.EnumHelper;

import com.ruby.blocks.oreRuby;
import com.ruby.items.gemRuby;
import com.ruby.tileEntity.chest.copper.TileEntityCopper;
import com.ruby.tileEntity.chest.iron.TileEntityIron;
import com.ruby.tools.emerald.axeEmerald;
import com.ruby.tools.emerald.hoeEmerald;
import com.ruby.tools.emerald.pickaxeEmerald;
import com.ruby.tools.emerald.shovelEmerald;
import com.ruby.tools.emerald.swordEmerald;
import com.ruby.tools.obsidian.axeObsidian;
import com.ruby.tools.obsidian.hoeObsidian;
import com.ruby.tools.obsidian.pickaxeObsidian;
import com.ruby.tools.obsidian.shovelObsidian;
import com.ruby.tools.obsidian.swordObsidian;
import com.ruby.world.biomeGen.BiomeGenWasteland;
import com.ruby.world.biomeGen.BiomeScrub;
import com.ruby.world.oreGen.OreGen;
import com.ruby.world.structGen.struct;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = RubyMod.MODID, name = RubyMod.name, version = RubyMod.VERSION)
public class RubyMod
{
	@SidedProxy(clientSide = "com.ruby.rubymod.ClientProxy", serverSide = "com.ruby.rubymod.ServerProxy")
	public static ServerProxy proxy;
	
	
    public static final String MODID = "rubymod";
    public static final String name = "Ruby's Mod";
    public static final String VERSION = "3.0";
    
    
    public static ToolMaterial Emerald = EnumHelper.addToolMaterial("Emerald", 3, 360, 10.0f, 6.0f, 10);
    public static ToolMaterial Steel = EnumHelper.addToolMaterial("Steel", 2, 600, 6.0f, 2.0f, 14);
    public static ToolMaterial Flint = EnumHelper.addToolMaterial("Flint", 1, 150, 6.0F, 2.0F, 5);
    //public static ToolMaterial name = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
    public static ToolMaterial Obsidian = EnumHelper.addToolMaterial("Obsidian", 2, 1254, 5.0f, 1.0f, 7);
    public static ToolMaterial Quartz = EnumHelper.addToolMaterial("Quartz", 1, 140, 4.0f, 2.0f, 14);
    public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 4, 890, 7.0f, 3.0f, 26);
    public static ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", 2, 180, 6.0f, 2.0f, 12);
    public static ToolMaterial Bronze = EnumHelper.addToolMaterial("Bronze", 2, 280, 6.0f, 2.0f, 14);
    
    
    /*
    WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    EMERALD(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22);
    */

    
    @Instance(MODID)
    public static RubyMod instance;
    
    public static Item swordEmerald;
    
    int swordEmeraldID = 13000;
    
    public static Item pickaxeEmerald;
    
    int pickaxeEmeraldID = 13001;
    
    public static Item axeEmerald;
    
    int axeEmeraldID = 13002;
    
    public static Item shovelEmerald;
    
    int shovelEmeraldID = 13003;
    
    public static Item hoeEmerald;
    
    int hoeEmeraldID = 13004;
   
    public static Item hoeObsidian;
    
    int hoeObsidianID = 13005;
    
    public static Item swordObsidian;
    
    int swordObsidianID = 13006;
       
    public static Item axeObsidian;
    
    int axeObsidianID = 13007;
    
    public static Item pickaxeObsidian;
    
    int pickaxeObsidianID = 13008;
    
    public static Item shovelObsidian;
    
    int shovelObsidianID = 13009;
    
    public static Item mixSteel;
    
    int mixSteelID = 13010;
    
    public static Item pickaxeSteel;
    
    int pickaxeSteelID = 13011;
    
    public static Item swordSteel;
    
    int swordSteelID = 13012;
    
    public static Item axeSteel;
    
    int axeSteelID = 13013;
    
    public static Item hoeSteel;
    
    int hoeSteelID = 13014;
    
    public static Item shovelSteel;
    
    int shovelSteelID = 13015;
    
    public static Item mixSilicon;
    
    int mixSiliconID = 13016;
    
    public static Item Silicon;
    
    int SiliconID = 13017;
    
    public static Item pickaxeFlint;
    
    int pickaxeFlintID = 13018;
    
    public static Item swordFlint;
    
    int swordFlintID = 13019;
    
    public static Item axeFlint;
    
    int axeFlintID = 13020;
    
    public static Item pigIron;
    
    int pigIronID = 13023;
    
    public static Block oreRuby;
    
    int oreRubyID = 13024;
    
    public static Block oreCopper;
    
    int oreCopperID = 13025;
    
    public static Block oreTin;
    
    int oreTinID = 13026;
    
    public static Item gemRuby;
    
    int gemRubyID = 13027;
    
    public static Item ingotTin;
    
    int ingotTinID = 13028;
    
    public static Item ingotCopper;
    
    int ingotCopperID = 13029; 
    
    public static Item ingotSteel;
    
    int ingotSteelID = 13030;
    
    public static Block blockTin;
    
    int blockTinID = 13031;
    
    public static Block blockCopper;
    
    int blockCopperID = 13032;    
    
    public static Block blockRuby;
    
    int blockRubyID = 13033;
    
    public static Block blockSteel;
    
    int blockSteelID = 13034;
    
    public static Block blockEnder;
    
    int blockEnderID = 13035;
    
    public static Item ingotBronze;
    
    int ingotBronzeID = 13036;
    
    public static Item mixBronze;
    
    int mixBronzeID = 13037;
    
    public static Block oreAluminium;
    
    int oreAluminiumID = 13038;
    
    public static Item ingotAluminium;
    
    int ingotAluminiumID = 13039;
    
    public static Item hoeBronze;
    
    int hoeBronzeID = 13040;
    
    public static Item swordBronze;
    
    int swordBronzeID = 13041;
       
    public static Item axeBronze;
    
    int axeBronzeID = 13042;
    
    public static Item pickaxeBronze;
    
    int pickaxeBronzeID = 13043;
    
    public static Item shovelBronze;
    
    int shovelBronzeID = 13044;
    
    public static Item flax;
    
    int flaxID = 13045;
    
    public static Block plantFlax;
    
    int plantFlaxID = 13046;
    
    public static Item DaggerRuby;
    
    int DaggerRubyID = 13047;
    
    public static BiomeGenBase biomeWasteland;
    
    public static Item chestplateLinen;
    
    int cLinenID = 13048;
    
    public static Item legsLinen;
    
    int lLinenID = 13049;
    
    public static Item helmLinen;
    
    int hLinenID = 13050;
    
    public static Item bootsLinen;
    
    int bLinenID = 13051;
    
    public static Block logCharred;
    
    int logCharredID = 13052;
    
    
    //public static Block AlloyBench;
    //public static final int guiIDAlloyBench = 1;
    
    public static Block CopperChest;
    
    public static Block IronChest;
    
    public static BiomeGenBase biomeScrub;
    
    protected static final BiomeGenBase.Height height_Wasteland = new BiomeGenBase.Height(0.05F, 0.1F);
    protected static final BiomeGenBase.Height height_Scrub = new BiomeGenBase.Height(0.05F, 0.06F);
    
    public static CreativeTabs rubyTab = new CreativeTabs("ruby"){
    	public Item getTabIconItem(){
    		return gemRuby;
    	}
	
    };
    
    public static CreativeTabs toolTab = new CreativeTabs("tool"){
    	public Item getTabIconItem(){
    		return pickaxeEmerald;
    	}
    };
    
    
    @Metadata
    public static ModMetadata meta;
    
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	
       
       
       TileEntityCopper.RubyMod();
       TileEntityIron.RubyMod();
       
       
       proxy.registerRenderThings();
       
       //Blocks
       CopperChest = new com.ruby.tileEntity.chest.copper.CopperChest(0).setBlockName("CopperChest").setCreativeTab(RubyMod.rubyTab);
       IronChest = new com.ruby.tileEntity.chest.iron.IronChest(0).setBlockName("IronChest").setCreativeTab(RubyMod.rubyTab);
       
       //AlloyBench = new com.ruby.container.AlloyBench().setBlockName("AlloyBench").setCreativeTab(RubyMod.rubyTab).setHardness(3.6f).setResistance(1.6f);

       oreRuby = new oreRuby(oreRubyID, Material.rock).setHardness(2.5f).setBlockName("oreRuby").setCreativeTab(RubyMod.rubyTab);
       oreTin = new com.ruby.blocks.oreTin(oreTinID, Material.rock).setHardness(1.8F).setBlockName("oreTin").setCreativeTab(RubyMod.rubyTab);
       oreCopper = new com.ruby.blocks.oreCopper(oreCopperID, Material.rock).setHardness(1.8F).setBlockName("oreCopper").setCreativeTab(RubyMod.rubyTab);
       oreAluminium = new com.ruby.blocks.oreAluminium(oreAluminiumID, Material.rock).setHardness(1.8f).setBlockName("oreAluminium").setCreativeTab(RubyMod.rubyTab);

       blockCopper = new com.ruby.blocks.blockCopper(blockCopperID, Material.rock).setHardness(1.5f).setBlockName("blockCopper").setCreativeTab(RubyMod.rubyTab);
       blockSteel = new com.ruby.blocks.blockSteel(blockSteelID, Material.rock).setHardness(10.0f).setBlockName("blockSteel").setCreativeTab(RubyMod.rubyTab);
       blockTin = new com.ruby.blocks.blockTin(blockTinID, Material.rock).setHardness(1.5f).setBlockName("blockTin").setCreativeTab(RubyMod.rubyTab);
       blockRuby = new com.ruby.blocks.blockRuby(blockRubyID, Material.rock).setHardness(1.5f).setBlockName("blockRuby").setCreativeTab(RubyMod.rubyTab);
       blockEnder = new com.ruby.blocks.blockEnder(blockEnderID, Material.rock).setHardness(6.0f).setBlockName("blockEnder").setCreativeTab(RubyMod.rubyTab);
       
       logCharred = new com.ruby.blocks.logCharred(logCharredID, Material.rock).setHardness(1.5f).setBlockName("logCharred").setCreativeTab(RubyMod.rubyTab);

       plantFlax = new com.ruby.blocks.plantFlax(plantFlaxID, Material.wood).setHardness(0.0f).setBlockName("plantFlax").setCreativeTab(RubyMod.rubyTab);
       
       //Items
       gemRuby = new gemRuby(gemRubyID).setUnlocalizedName("gemRuby").setCreativeTab(RubyMod.rubyTab);  
       ingotSteel = new com.ruby.items.ingotSteel(ingotSteelID).setUnlocalizedName("ingotSteel").setCreativeTab(RubyMod.rubyTab);
       ingotTin = new com.ruby.items.ingotTin(ingotTinID).setUnlocalizedName("ingotTin").setCreativeTab(RubyMod.rubyTab);
       ingotCopper = new com.ruby.items.ingotCopper(ingotCopperID).setUnlocalizedName("ingotCopper").setCreativeTab(RubyMod.rubyTab);
       ingotBronze = new com.ruby.items.ingotBronze(ingotBronzeID).setUnlocalizedName("ingotBronze").setCreativeTab(RubyMod.rubyTab);
       ingotAluminium = new com.ruby.items.ingotAluminium(ingotAluminiumID).setUnlocalizedName("ingotAluminium").setCreativeTab(RubyMod.rubyTab);
       flax = new com.ruby.items.flax(flaxID).setUnlocalizedName("flax").setCreativeTab(RubyMod.rubyTab);  

       
       mixSteel = new com.ruby.items.mixSteel(mixSteelID).setUnlocalizedName("mixSteel").setCreativeTab(RubyMod.rubyTab);
       mixSilicon = new com.ruby.items.mixSilicon(mixSiliconID).setUnlocalizedName("mixSilicon").setCreativeTab(RubyMod.rubyTab);
       mixBronze = new com.ruby.items.mixBronze(mixBronzeID).setUnlocalizedName("mixBronze").setCreativeTab(RubyMod.rubyTab);
       Silicon = new com.ruby.items.Silicon(SiliconID).setUnlocalizedName("Silicon").setCreativeTab(RubyMod.rubyTab);
       pigIron = new com.ruby.items.pigIron(pigIronID).setUnlocalizedName("pigIron").setCreativeTab(RubyMod.rubyTab);
       
       //Tools
       swordEmerald = new swordEmerald(swordEmeraldID, Emerald).setUnlocalizedName("swordEmerald").setCreativeTab(RubyMod.toolTab);
       axeEmerald = new axeEmerald(axeEmeraldID, Emerald).setUnlocalizedName("axeEmerald").setCreativeTab(RubyMod.toolTab);
       pickaxeEmerald = new pickaxeEmerald(pickaxeEmeraldID, Emerald).setUnlocalizedName("pickaxeEmerald").setCreativeTab(RubyMod.toolTab);
       shovelEmerald = new shovelEmerald(shovelEmeraldID, Emerald).setUnlocalizedName("shovelEmerald").setCreativeTab(RubyMod.toolTab);
       hoeEmerald = new hoeEmerald(hoeEmeraldID, Emerald).setUnlocalizedName("hoeEmerald").setCreativeTab(RubyMod.toolTab);
       
       swordObsidian = new swordObsidian(swordObsidianID, Obsidian).setUnlocalizedName("swordObsidian").setCreativeTab(RubyMod.toolTab);
       axeObsidian = new axeObsidian(axeObsidianID, Obsidian).setUnlocalizedName("axeObsidian").setCreativeTab(RubyMod.toolTab);
       pickaxeObsidian = new pickaxeObsidian(pickaxeObsidianID, Obsidian).setUnlocalizedName("pickaxeObsidian").setCreativeTab(RubyMod.toolTab);
       shovelObsidian = new shovelObsidian(shovelObsidianID, Obsidian).setUnlocalizedName("shovelObsidian").setCreativeTab(RubyMod.toolTab);
       hoeObsidian = new hoeObsidian(hoeObsidianID, Obsidian).setUnlocalizedName("hoeObsidian").setCreativeTab(RubyMod.toolTab);
       
       swordSteel = new com.ruby.tools.steel.swordSteel(swordSteelID, Steel).setUnlocalizedName("swordSteel").setCreativeTab(RubyMod.toolTab);
       axeSteel = new com.ruby.tools.steel.axeSteel(axeSteelID, Steel).setUnlocalizedName("axeSteel").setCreativeTab(RubyMod.toolTab);
       pickaxeSteel = new com.ruby.tools.steel.pickaxeSteel(pickaxeSteelID, Steel).setUnlocalizedName("pickaxeSteel").setCreativeTab(RubyMod.toolTab);
       shovelSteel = new com.ruby.tools.steel.shovelSteel(shovelSteelID, Steel).setUnlocalizedName("shovelSteel").setCreativeTab(RubyMod.toolTab);
       hoeSteel = new com.ruby.tools.steel.hoeSteel(hoeSteelID, Steel).setUnlocalizedName("hoeSteel").setCreativeTab(RubyMod.toolTab);
       
       swordFlint = new com.ruby.tools.flint.swordFlint(swordFlintID, Flint).setUnlocalizedName("swordFlint").setCreativeTab(RubyMod.toolTab);
       axeFlint = new com.ruby.tools.flint.axeFlint(axeFlintID, Flint).setUnlocalizedName("axeFlint").setCreativeTab(RubyMod.toolTab);
       pickaxeFlint = new com.ruby.tools.flint.pickaxeFlint(pickaxeFlintID, Flint).setUnlocalizedName("pickaxeFlint").setCreativeTab(RubyMod.toolTab);     
       
       swordBronze = new com.ruby.tools.bronze.swordBronze(swordBronzeID, Bronze).setUnlocalizedName("swordBronze").setCreativeTab(RubyMod.toolTab);
       axeBronze = new com.ruby.tools.bronze.axeBronze(axeBronzeID, Bronze).setUnlocalizedName("axeBronze").setCreativeTab(RubyMod.toolTab);
       pickaxeBronze = new com.ruby.tools.bronze.pickaxeBronze(pickaxeBronzeID, Bronze).setUnlocalizedName("pickaxeBronze").setCreativeTab(RubyMod.toolTab);
       shovelBronze = new com.ruby.tools.bronze.shovelBronze(shovelBronzeID, Bronze).setUnlocalizedName("shovelBronze").setCreativeTab(RubyMod.toolTab);
       hoeBronze = new com.ruby.tools.bronze.hoeBronze(hoeBronzeID, Bronze).setUnlocalizedName("hoeBronze").setCreativeTab(RubyMod.toolTab);

       //DaggerRuby = new com.ruby.tools.ruby.DaggerRuby(DaggerRubyID, Ruby).setUnlocalizedName("DaggerRuby").setCreativeTab(RubyMod.toolTab);

       biomeWasteland = new BiomeGenWasteland(132).setBiomeName("Wasteland").setHeight(RubyMod.height_Wasteland).setTemperatureRainfall(1.05F, 0.25F);
       biomeScrub = new BiomeScrub(133).setBiomeName("Scrub").setHeight(RubyMod.height_Scrub).setColor(16421912).setTemperatureRainfall(2.0F, 0.0F);

       
       helmLinen = new com.ruby.tools.linen.armorLinen(ArmorMaterial.CLOTH, 5, 0).setUnlocalizedName("helmetLinen").setCreativeTab(RubyMod.toolTab);
   	   chestplateLinen = new com.ruby.tools.linen.armorLinen(ArmorMaterial.CLOTH, 5, 1).setUnlocalizedName("chestplateLinen").setCreativeTab(RubyMod.toolTab);
   	   legsLinen = new com.ruby.tools.linen.armorLinen(ArmorMaterial.CLOTH, 5, 2).setUnlocalizedName("legsLinen").setCreativeTab(RubyMod.toolTab);
   	   bootsLinen = new com.ruby.tools.linen.armorLinen(ArmorMaterial.CLOTH, 5, 3).setUnlocalizedName("bootsLinen").setCreativeTab(RubyMod.toolTab);
   	
       
       RegistryManager.MainClass();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    
    {

        OreGen.RubyMod();
        struct.RubyMod();

        			
		CraftingManager.MainClass();

    
    }
    
    
}
