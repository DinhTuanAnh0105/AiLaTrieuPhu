package com.btl.gameailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.btl.gameailatrieuphu.adapter.TienThuongAdapter;
import com.btl.gameailatrieuphu.object.CauHoi;
import com.btl.gameailatrieuphu.object.FaceData;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    ListView lsvTienThuong;
    TienThuongAdapter tienThuongAdapter;
    ArrayList<String> arrTienThuong;
    CauHoi cauHoi;
    int viTriCauHoi = 1;
    TextView txvCauHoi,txvCauTL1,txvCauTL2,txvCauTL3,txvCauTL4,txvThuaGame;
    ArrayList<TextView> arrTxvCauTraLoi;
    String cauTraLoi;
    FaceData faceData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        anhxa();
        setup();
        setclick();
    }
    public void init(){
        arrTienThuong = new ArrayList<>();
        arrTienThuong.add("1.000.000");
        arrTienThuong.add("500.000");
        arrTienThuong.add("250.000");
        arrTienThuong.add("150.000");
        arrTienThuong.add("64.000");
        arrTienThuong.add("32.000");
        arrTienThuong.add("16.000");
        arrTienThuong.add("8.000");
        arrTienThuong.add("4.000");
        arrTienThuong.add("2.000");
        arrTienThuong.add("1.000");
        arrTienThuong.add("500");
        arrTienThuong.add("300");
        arrTienThuong.add("200");
        arrTienThuong.add("100");
        tienThuongAdapter = new TienThuongAdapter(this,0, arrTienThuong);
        cauHoi = new CauHoi();

        arrTxvCauTraLoi = new ArrayList<>();
        faceData = new FaceData(this);

    }
    public void anhxa(){
        lsvTienThuong = findViewById(R.id.lsvTienThuong);
        txvCauHoi = findViewById(R.id.txvCauHoi);
        txvCauTL1 = findViewById(R.id.txvCauTL1);
        txvCauTL2 = findViewById(R.id.txvCauTL2);
        txvCauTL3 = findViewById(R.id.txvCauTL3);
        txvCauTL4 = findViewById(R.id.txvCauTL4);
        txvThuaGame = findViewById(R.id.txvThuaGame);

        arrTxvCauTraLoi.add(txvCauTL1);
        arrTxvCauTraLoi.add(txvCauTL2);
        arrTxvCauTraLoi.add(txvCauTL3);
        arrTxvCauTraLoi.add(txvCauTL4);
    }
    public void setup(){
        txvThuaGame.setVisibility(View.GONE);
        lsvTienThuong.setAdapter(tienThuongAdapter);
        hienCauHoi();
    }
    public void setclick(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              checkCauTraLoi(((TextView)view));
            }
        };
        for(TextView t:arrTxvCauTraLoi){
            t.setOnClickListener(listener);
        }
    }

    public void  checkCauTraLoi(TextView txv){
         cauTraLoi =txv.getText().toString();
        txv.setBackgroundResource(R.drawable.khung_chu_cau_chon);
        new CountDownTimer(2000, 100) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

                for (TextView t : arrTxvCauTraLoi){
                    String s = t.getText().toString();
                    if (s.equals(cauHoi.getDapAnDung())){
                        t.setBackgroundResource(R.drawable.khung_chu_cau_dung);
                        break;
                    }
                }
                new CountDownTimer(2000,100){

                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        if(cauTraLoi.equals(cauHoi.getDapAnDung())){
                            viTriCauHoi++;
                            if(viTriCauHoi>15){
                                viTriCauHoi = 15;
                                int vitriTienThuong = (viTriCauHoi/5)*5;
                                txvThuaGame.setText("Chúc Mừng Bạn Đã Trở Thành Triệu Phú"+arrTienThuong.get(0)+"USD");

                            }
                            hienCauHoi();
                        }else {
                            txvThuaGame.setVisibility(View.VISIBLE);
                            int vitriTienThuong = (viTriCauHoi/5)*5;
                            txvThuaGame.setText("Bạn Sẽ Ra Về Với Tiền Thưởng Là \n"+arrTienThuong.get(14-vitriTienThuong)+"USD");
                        }
                    }
                }.start();
            }
        }.start();

    }

    public void setCauHoi(){
        cauHoi = faceData.taoCauHoi(viTriCauHoi);
    }
    public void hienCauHoi(){
        setCauHoi();
        txvCauHoi.setText(cauHoi.getNoiDung());
        ArrayList<String> arrCauTraLoi = new ArrayList<>(cauHoi.getArrDapAnSai());
        arrCauTraLoi.add(cauHoi.getDapAnDung());

        Random r = new Random();
        for(int i=0;i<5;i++){
            int vt1 = r.nextInt(arrCauTraLoi.size());
            int vt2 = r.nextInt(arrCauTraLoi.size());
            String a = arrCauTraLoi.get(vt1);
            arrCauTraLoi.set(vt1,arrCauTraLoi.get(vt2));
            arrCauTraLoi.set(vt2,a);

        }
        for(int i=0;i<arrTxvCauTraLoi.size();i++){
            arrTxvCauTraLoi.get(i).setVisibility(View.VISIBLE);
            arrTxvCauTraLoi.get(i).setBackgroundResource(R.drawable.khung_chu);
            arrTxvCauTraLoi.get(i).setText(arrCauTraLoi.get(i));
        }
        tienThuongAdapter.setViTriCauHoi(viTriCauHoi);
    }
    boolean troGiup5050 = true;
    public void trogiup5050(View view) {
        if(troGiup5050 == false){
            return;
        }
        Random r= new Random();
        int sodanAnAnDi =2;
        do{
            int vitriDanAnAn = r.nextInt(4);// 1
            TextView t = arrTxvCauTraLoi.get(vitriDanAnAn);

            if(t.getVisibility() == View.VISIBLE && t.getText().toString().equals(cauHoi.getDapAnDung())==false){
                t.setVisibility(View.INVISIBLE);
                t.setOnClickListener(null);
                sodanAnAnDi --;
            }
        }while (sodanAnAnDi>0);
        troGiup5050 = false;
    }
    boolean troGiupKhanGia = true;
    public void troGiupKhanGia(View view) {
        if (troGiupKhanGia == false){
            return;
        }
        for (int i=0;i<arrTxvCauTraLoi.size();i++){
            TextView t = arrTxvCauTraLoi.get(i);
            if (t.getText().toString().equals(cauHoi.getDapAnDung())){
                new DialogKhanGiaTraLoi(this,i+1).show();
                break;
            }
        }
        troGiupKhanGia =false;
    }
    boolean doiCauHoi = true;
    public void doiCauHoi(View view) {
        if(doiCauHoi == false){
            return;
        }
        hienCauHoi();
        doiCauHoi=false;
    }
}