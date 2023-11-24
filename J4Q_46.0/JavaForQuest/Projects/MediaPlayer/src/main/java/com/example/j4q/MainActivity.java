package com.example.j4q;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.opengl.GLES30;
import android.os.Bundle;
import android.view.Surface;

import edu.ufl.digitalworlds.j4q.activities.QuestActivity;
import edu.ufl.digitalworlds.j4q.models.LeftController;
import edu.ufl.digitalworlds.j4q.models.Model;
import edu.ufl.digitalworlds.j4q.models.RightController;
import edu.ufl.digitalworlds.j4q.shaders.Texture;
import edu.ufl.digitalworlds.j4q.models.Background360;

public class MainActivity extends QuestActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    RightController rc;
    LeftController lc;

    Model my_level;
    Background360 background;
    MediaPlayer player = null;
    Texture tex = null;

    public void Start(){
        // Create scene component
        scene.background(153/255f,	204/255f,	255/255f);
        scene.setLightDir(-0.5f,0.5f,-0.5f);

        // The current load scene root object
        my_level=new Model();
        scene.appendChild(my_level);

        // The render sphere
        background=new Background360();
        // Just loading this and mapping to the background
        tex = new Texture(this,"textures/eso0932a.jpg");
        background.setTexture(tex);
        my_level.prependChild(background);

        player = new MediaPlayer();
    }

    int frame=0;

    public  void Update(){
        // For media player update frame
    }
}
