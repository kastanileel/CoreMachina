package src.scenes;

import src.engine.core.gamemanagement.GameComponents;
import src.engine.core.gamemanagement.Scene;
import src.engine.core.matutils.Mesh;
import src.engine.core.matutils.Quaternion;
import src.engine.core.matutils.Vector3;

import java.awt.*;
import java.io.IOException;

public class ExampleScene extends Scene {
    public ExampleScene(int size, String name) {
        super(size, name);
    }

    @Override
    public void createScene() {
        // for loop to create floor*/

        try {
            /*for (int width = 0; width < 30; width++) {
                for (int length = 0; length < 30; length++) {
                    int id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER | GameComponents.COLLIDER);
                    if (id > -1) {
                        manager.rendering[id].mesh = new Mesh("./src/objects/rock/plane.obj", Color.blue);
                        manager.rendering[id].renderType = GameComponents.Rendering.RenderType.CustomArena;
                        manager.rendering[id].mesh.updateRenderType(GameComponents.Rendering.RenderType.CustomArena);
                        manager.transform[id].pos = new Vector3(-15.0f + width, -1.0f, -15.0f + length);
                        manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                        manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                        manager.collider[id].colliderType = GameComponents.Collider.ColliderType.BOX;
                        manager.collider[id].colliderSize = new Vector3(0.9f, 0.9f, 0.9f);
                        manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                        manager.collider[id].center = manager.transform[id].pos;
                        manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.GROUND;

                    }
                }
            }*/

            int id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER | GameComponents.COLLIDER);
            if (id > -1) {
                //manager.rendering[id].mesh = new Mesh("./src/objects/GameRoom.obj", Color.blue);
                manager.rendering[id].mesh = new Mesh("./src/objects/gameRoomFixed.obj", Color.blue);
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.CustomArena;
                manager.rendering[id].mesh.updateRenderType(GameComponents.Rendering.RenderType.CustomArena);
                manager.transform[id].pos = new Vector3(0, -1.0f, 0);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.BOX;
                manager.collider[id].colliderSize = new Vector3(32.0f, 0.9f, 32.0f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.GROUND;

            }

            float size = 3.7f;
            ///// first block
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(-10.3f, 1.0f, -0.95f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(-10.3f, 1.0f, 2.75f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            //// next block
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(-8.48f, 1.0f, -8.45f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //// next block
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(-8.48f, 1.0f, 8.45f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //// next block
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(4.7f, 1.0f, 8.45f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(6.59f, 1.0f, 2.74f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(6.59f, 1.0f, -4.67f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(-2.85f, 1.0f, -8.45f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(-2.85f, 1.0f, 2.7f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(0.93f, 1.0f, -8.45f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            // next
            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(8.45f, 1.0f, 10.36f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(10.25f, 1.0f, 10.36f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(10.25f, 1.0f, 12.14f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            //// säule
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(8.45f, 1.0f, 12.14f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }

            //next
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(10.35f, 1.0f, -10.35f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(8.45f, 1.0f, -10.35f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(6.55f, 1.0f, -10.35f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(6.55f, 1.0f, -12.16f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(8.45f, 1.0f, -12.16f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
            }
            id = manager.createEntity(GameComponents.TRANSFORM  | GameComponents.COLLIDER);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(10.35f, 1.0f, -12.16f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(size, 3f, 3f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
            }

           /* id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER | GameComponents.PICKUPWEAPON | GameComponents.COLLIDER);

            if (id > -1) {
                manager.rendering[id].mesh = new Mesh("src/objects/guns/knife/combatKnife.obj", "src/objects/guns/knife/combatKnife128.png");//"./src/objects/rock/rock64.png");
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.Textured;
                manager.transform[id].pos = new Vector3(-0.5f, - 0.1f, 10.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.1f, .1f, .1f);


                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(3.0f, 3.0f, 3.0f);
                manager.collider[id].colliderRotation = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.OBSTACLE;
            }*/

         /*id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER | GameComponents.PHYSICSBODY | GameComponents.COLLIDER | GameComponents.DAMAGEABLE | GameComponents.AIBEHAVIOR);
            if (id > -1) {
                manager.rendering[id].mesh = new Mesh("./src/objects/enemies/gunTurret/gunnerTurret.obj", Color.GREEN);
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.OneColor; // Or other render types

                manager.transform[id].pos = new Vector3(0.0f, 0.0f, 5.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 3.1415f);
                manager.transform[id].scale = new Vector3(.2f, .2f, .2f);

                manager.rendering[id].modelRotation = new Vector3(0.0f, 3.1415f, 0.0f);
                manager.aiBehavior[id].enemyType = GameComponents.EnemyType.GUNTURRED;
            }*/

           /* id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER | GameComponents.PHYSICSBODY | GameComponents.COLLIDER | GameComponents.DAMAGEABLE | GameComponents.AIBEHAVIOR);
            if (id > -1) {
                // Set up the transformation component
                manager.rendering[id].mesh = new Mesh("./src/objects/enemies/groundEnemy/groundEnemy.obj", Color.GRAY);
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.OneColor; // Or other render types

                manager.transform[id].pos = new Vector3(0f, -0.9f, 10.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.2f, .2f, .2f);

                manager.aiBehavior[id].enemyType = GameComponents.EnemyType.GROUNDENEMY;
            }

            id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER | GameComponents.PHYSICSBODY | GameComponents.COLLIDER | GameComponents.DAMAGEABLE | GameComponents.AIBEHAVIOR);
            if (id > -1) {
                // Set up the transformation component
                manager.rendering[id].mesh = new Mesh("./src/objects/sightseeker/sightseeker.obj", "./src/objects/sightseeker/texture.png");
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.Textured; // Or other render types

                manager.transform[id].pos = new Vector3(5f, 0f, 15.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.2f, .2f, .2f);

                manager.aiBehavior[id].enemyType = GameComponents.EnemyType.SIGHTSEEKER;
            }*/



            /*id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.PLAYERMOVEMENT
                    | GameComponents.PHYSICSBODY | GameComponents.RENDER | GameComponents.COLLIDER);
            if (id > -1){
                manager.transform[id].pos = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.2f, 0.2f, 0.2f);
                manager.playerMovement[id].mouseSpeed = 0.35f;
                manager.playerMovement[id].moveSpeed = 6.0f;
                manager.playerMovement[id].cameraOffset = new Vector3(0, 0, 0);
                manager.physicsBody[id].speed = 3.0f;
                manager.physicsBody[id].velocity = new Vector3(0, 0, 0);

                manager.playerMovement[id].weaponType = GameComponents.PlayerMovement.WeaponType.PISTOL;

                manager.rendering[id].mesh = new Mesh("./src/objects/guns/pistol/startPistol.obj", Color.GRAY);
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.OneColor;
                manager.rendering[id].modelTranslation = new Vector3(-0.5f, -0.7f, 3.0f);
                manager.rendering[id].modelRotation = new Vector3(0.0f, 3.0f, 0.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(1.0f, 1.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.PLAYER;
            }*/

            id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.PLAYERMOVEMENT
                    | GameComponents.PHYSICSBODY | GameComponents.RENDER | GameComponents.COLLIDER | GameComponents.DAMAGEABLE);
            if (id > -1) {
                manager.transform[id].pos = new Vector3(0.0f, 2.0f, 0.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.05f, 0.05f, 0.05f);
                manager.playerMovement[id].mouseSpeed = 0.08f;
                manager.playerMovement[id].moveSpeed = 4.50f;
                manager.playerMovement[id].cameraOffset = new Vector3(0, 0, 0);
                manager.physicsBody[id].speed = 3.0f;
                manager.physicsBody[id].velocity = new Vector3(0, 0, 0);

                manager.playerMovement[id].weaponType = GameComponents.PlayerMovement.WeaponType.PISTOL;

                manager.transform[id].scale = new Vector3(.2f, 0.2f, 0.2f);
                manager.rendering[id].mesh = new Mesh("./src/objects/guns/pistol/startPistol.obj", "./src/objects/guns/pistol/startPistol128.png");
                manager.rendering[id].mesh.updateRenderType(GameComponents.Rendering.RenderType.Textured);
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.Textured;
                manager.rendering[id].modelTranslation = new Vector3(-0.5f, -0.7f, 1.5f);
                manager.rendering[id].modelRotation = new Vector3(0.0f, 3.0f, 0.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(1.0f, 1.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.PLAYER;


            }

            manager.createEntity(GameComponents.GAMELOGIC);

          /*id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.PLAYERMOVEMENT
                    | GameComponents.PHYSICSBODY | GameComponents.RENDER |q GameComponents.COLLIDER);
            if (id > -1){
                manager.transform[id].pos = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.05f, 0.05f, 0.05f);
                manager.playerMovement[id].mouseSpeed = 0.35f;
                manager.playerMovement[id].moveSpeed = 6.0f;
                manager.playerMovement[id].cameraOffset = new Vector3(0, 0, 0);
                manager.physicsBody[id].speed = 3.0f;
                manager.physicsBody[id].velocity = new Vector3(0, 0, 0);

                manager.playerMovement[id].weaponType = GameComponents.PlayerMovement.WeaponType.SHOTGUN;

                manager.rendering[id].mesh = new Mesh("./src/objects/guns/shotgun/superShotgun.obj", Color.GRAY);
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.OneColor;
                manager.rendering[id].modelTranslation = new Vector3(-0.5f, -0.7f, 3.0f);
                manager.rendering[id].modelRotation = new Vector3(0.0f, 0.0f, 0.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(1.0f, 1.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.PLAYER;
            }*/

           /*id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.PLAYERMOVEMENT
                    | GameComponents.PHYSICSBODY | GameComponents.RENDER | GameComponents.COLLIDER| GameComponents.DAMAGEABLE);
            if (id > -1){
                manager.transform[id].pos = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.04f, 0.04f, 0.04f);
                manager.playerMovement[id].mouseSpeed = 0.05f;
                manager.playerMovement[id].moveSpeed = 4.5f;
                manager.playerMovement[id].cameraOffset = new Vector3(0, 0, 0);
                manager.physicsBody[id].speed = 4.5f;
                manager.physicsBody[id].velocity = new Vector3(0, 0, 0);

                manager.playerMovement[id].weaponType = GameComponents.PlayerMovement.WeaponType.SNIPER;

                manager.rendering[id].mesh = new Mesh("./src/objects/guns/sniper/AWP.obj", "./src/objects/guns/sniper/Sniper128.png");
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.Textured;
                manager.rendering[id].modelTranslation = new Vector3(-0.5f, -0.7f, 4.2f);
                manager.rendering[id].modelRotation = new Vector3(0.0f, 0.0f, 0.0f);

                manager.collider[id].colliderType = GameComponents.Collider.ColliderType.SPHERE;
                manager.collider[id].colliderSize = new Vector3(1.0f, 1.0f, 1.0f);
                manager.collider[id].center = manager.transform[id].pos;
                manager.collider[id].colliderTag = GameComponents.Collider.ColliderTag.PLAYER;
            }*/

         /*   id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.PLAYERMOVEMENT
                    | GameComponents.PHYSICSBODY | GameComponents.RENDER);
            if (id > -1){
                manager.transform[id].pos = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
                manager.transform[id].scale = new Vector3(.05f, .05f, .05f);
                manager.playerMovement[id].mouseSpeed = 0.05f;
                manager.playerMovement[id].moveSpeed = 6.0f;
                manager.playerMovement[id].cameraOffset = new Vector3(0, 0, 0);
                manager.physicsBody[id].speed = 3.0f;
                manager.physicsBody[id].velocity = new Vector3(0, 0, 0);
                manager.playerMovement[id].weaponType = GameComponents.PlayerMovement.WeaponType.PISTOL;

                manager.rendering[id].mesh = new Mesh("./src/objects/guns/knife/combatKnife.obj", Color.RED);
                manager.rendering[id].renderType = GameComponents.Rendering.RenderType.OneColor;
                manager.rendering[id].modelTranslation = new Vector3(0.5f, -0.7f, 3.0f);
                manager.rendering[id].modelRotation = new Vector3(0.0f, -3.8415f/2.0f , 0.0f);
            } */


       /* int id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER);

        if(id > -1){
            manager.rendering[id].mesh = new Mesh("./src/objects/rock/fn49.obj", Color.red);
            manager.transform[id].pos = new Vector3(0.0f, 0.0f, 0);
            manager.transform[id].rot = new Vector3(0.0f, 90.0f, 9.0f);
            manager.transform[id].scale = new Vector3(.1f,.1f,.1f);

        }

        id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER);
        if(id > -1){
            manager.rendering[id].mesh = new Mesh("./src/objects/sightseeker/sightseeker.obj", "./src/objects/sightseeker/texture.png");
            manager.transform[id].pos = new Vector3(5.0f, 0.0f, 0);
            manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
            manager.transform[id].scale = new Vector3(1.f,1.f,1.f);

        }

    for(int width = 0; width < 2; width ++){
                for(int length = 0; length < 30; length ++){
                    int id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER);
                    if(id > -1){
                        manager.rendering[id].mesh = new Mesh("./src/objects/rock/planeTex.obj", "./src/objects/rock/rock8.png");
                        manager.rendering[id].renderType = GameComponents.Rendering.RenderType.Textured;
                        manager.transform[id].pos = new Vector3(15.0f, 0.0f + width, -15.0f + length);
                        manager.transform[id].rot = new Vector3(3.1415f/2.0f, 0.0f, 3.1415f/2.0f);
                        manager.transform[id].scale = new Vector3(0.25f, 0.25f, 0.25f);

                    }
                }
            }


        // create wall


        id = manager.createEntity(GameComponents.TRANSFORM | GameComponents.RENDER);
        if(id > -1){
            manager.rendering[id].mesh = new Mesh("./src/objects/rock/rock.obj", "./src/objects/rock/rock8.png", true);
            manager.transform[id].pos = new Vector3(0.0f, -0.5f, 9.0f);
            manager.transform[id].rot = new Vector3(0.0f, 0.0f, 0.0f);
            manager.transform[id].scale = new Vector3(1.0f, 1.0f, 1.0f);

        }*/

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
