package com.siyehua.wechathotfix;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void patch(View view) {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/360/patch_signed_7zip.apk";
        File file = new File(path);
        if (file.exists()){
            Toast.makeText(this,"exits", Toast.LENGTH_SHORT).show();
            TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(),path);
        }else{
            Toast.makeText(this,"no exits", Toast.LENGTH_SHORT).show();
        }
    }
}
