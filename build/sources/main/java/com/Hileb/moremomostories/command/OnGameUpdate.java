package com.Hileb.moremomostories.command;

public class OnGameUpdate {
//    public OnGameUpdate(){
//        MinecraftForge.EVENT_BUS.register(this);
//    }
//
//    @SubscribeEvent
//    public void onPlayerKeyDown(LivingEvent.LivingUpdateEvent event){
//        IdlFramework.Log("1");
//        World world=event.getEntity().world;
//        if(world.isRemote){
//            IdlFramework.Log("2");
//            if(event.getEntityLiving() instanceof EntityPlayer){
//                EntityPlayer player=(EntityPlayer)event.getEntityLiving();
//                UUID uuid=player.getUniqueID();
//                if(Keyboard.isKeyDown(Keyboard.KEY_0)){
//                    PlayerKeyDownEvent playerKeyDownEvent=new PlayerKeyDownEvent(uuid,Keyboard.KEY_0,player.world);
//                    MinecraftForge.EVENT_BUS.post(event);
//                    IdlFramework.Log("the world isRemote!");
//                    return;
//                }
//                PlayerKeyDownEvent playerKeyDownEvent=new PlayerKeyDownEvent(uuid,0,world);
//                IdlFramework.Log("the world isRemote2!");
//            }
//        }
//    }
//
//    @SubscribeEvent
//    public void onPlayerKeyDown_key_0(PlayerKeyDownEvent event){
//        World world=event.getWorld();
//        if(!world.isRemote){
//            IdlFramework.Log("the world is successfully turn into noRemote!");
//        }
//    }
//    @SideOnly(Side.CLIENT)
//    private int anykeydown(){
//        for(int i=1;i<Keyboard.getKeyCount();i++){
//            if (Keyboard.isKeyDown(i))return i;
//        }
//    }
}
