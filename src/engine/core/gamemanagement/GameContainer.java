package src.engine.core.gamemanagement;


import src.scenes.ExampleScene;

import java.io.IOException;
import java.util.HashMap;

public class GameContainer {

    public static void main(String[] args) throws IOException, InterruptedException {
        new GameContainer();
    }

    EntityManager manager;
    GameSystems.Renderer rasterizer;
    GameSystems.Velocity velocity;
    GameSystems.CameraController cameraController;

    HashMap<String, Scene> scenes;
    static String currentSceneName = "";


    GameContainer() throws IOException, InterruptedException {
        scenes = new HashMap<>();
        manager = new EntityManager(2000);

        rasterizer = new GameSystems.Renderer();
        velocity = new GameSystems.Velocity();
        cameraController = new GameSystems.CameraController();



       Scene example = new ExampleScene(1000, "example");
       scenes.put(example.getName(), example);

        currentSceneName = "example";

        startGameLoop();
    }

    void startGameLoop() throws InterruptedException, IOException {

        String activeSceneName = "";

        long lastTime = System.nanoTime() / 1000000;


        while(true) {
            float deltaTime = ((float) System.nanoTime() / 1000000 - lastTime) / 1000.0f;
            lastTime = System.nanoTime() / 1000000;

            if(!currentSceneName.equals(activeSceneName)){
                Scene activeScene = scenes.get(currentSceneName);

                activeScene.createScene();
                manager = activeScene.getEntityManager();

                activeSceneName = currentSceneName;
            }

            rasterizer.update(manager, deltaTime);
            velocity.update(manager, deltaTime);
            cameraController.update(manager, deltaTime);


        }

        //System.out.println(System.nanoTime()/1000000 - lastTime);
    }

}