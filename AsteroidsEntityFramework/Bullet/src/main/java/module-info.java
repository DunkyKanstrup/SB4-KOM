module Bullet {
    requires Common;
    requires CommonBullet;
    provides IGamePluginService with dk.sdu.mmmi.cbse.bulletsystem.BulletPlugin;
    provides RunTimeInstantiatorService with dk.sdu.mmmi.cbse.bulletsystem.BulletControlSystem;
    provides IEntityProcessingService with dk.sdu.mmmi.cbse.bulletsystem.BulletControlSystem;
}