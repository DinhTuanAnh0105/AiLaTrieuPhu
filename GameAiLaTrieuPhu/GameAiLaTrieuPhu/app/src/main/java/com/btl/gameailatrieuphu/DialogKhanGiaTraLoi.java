package com.btl.gameailatrieuphu;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.Random;

public class DialogKhanGiaTraLoi extends Dialog {
    public DialogKhanGiaTraLoi(@NonNull Context context,int vtD) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dilog_tro_giup_khan_gia);
        TextView txvChonA,txvChonB,txvChonC,txvChonD;
        txvChonA = findViewById(R.id.txvChonA);
        txvChonB = findViewById(R.id.txvChonB);
        txvChonC = findViewById(R.id.txvChonC);
        txvChonD = findViewById(R.id.txvChonD);
        int arrdrom[] = new int[]{0,0,0,0};
        int can = 25;
        for(int i=0;i<arrdrom.length;i++){
            arrdrom[i]=arrdrom[i]+can;
            if(i==vtD-1){
                arrdrom[i]=arrdrom[i]+25;
                can = can+25;
            }
            can = can+25;
        }
        int tong = 125;
        int arrPhanTramTL[] = new int[]{0,0,0,0};
        int soKhanGia = 200;
        Random r = new Random();
        for(int i=0;i<soKhanGia;i++){
            int chon = r.nextInt(tong);
            if (chon>=0 && chon<arrdrom[0]){
                arrPhanTramTL[0]++;
            }else if(chon>= arrdrom[0] && chon<arrdrom[1]){
                arrPhanTramTL[1]++;
            }
            else if(chon>= arrdrom[1] && chon<arrdrom[2]){
                arrPhanTramTL[2]++;
            }
            else {
                arrPhanTramTL[3]++;
            }
        }
        txvChonA.setText("A:  "+(arrPhanTramTL[0]*100.0f/soKhanGia)+" %");
        txvChonB.setText("B:  "+(arrPhanTramTL[1]*100.0f/soKhanGia)+" %");
        txvChonC.setText("C:  "+(arrPhanTramTL[2]*100.0F/soKhanGia)+" %");
        txvChonD.setText("D:  "+(arrPhanTramTL[3]*100.0f/soKhanGia)+" %");

    }
}
