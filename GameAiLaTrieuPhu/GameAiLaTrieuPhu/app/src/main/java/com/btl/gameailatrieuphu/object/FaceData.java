package com.btl.gameailatrieuphu.object;

import android.content.Context;

import com.btl.gameailatrieuphu.sql.DBManager;

import java.util.ArrayList;
import java.util.Random;

public class FaceData {
    public FaceData(Context ct) {
        layCauHoiSQLite(ct);
        //taoCauHoi1();
    }
    public void layCauHoiSQLite(Context ct) {
        DBManager d = new DBManager(ct);
        d.open();
        arrCauHoi = new ArrayList<>(d.getcauhoi());
        d.close();
    }
    public CauHoi taoCauHoi(int capDo){
        Random r = new Random();
        ArrayList<CauHoi> arr = arrCauHoi.get(capDo-1);
        return arr.get(r.nextInt(arr.size()));
    }
    ArrayList<ArrayList<CauHoi>> arrCauHoi = new ArrayList<>();
    public void taoCauHoi1(){
        ArrayList<CauHoi> arrCauSo1 = new ArrayList<>();
        arrCauSo1.add(taoCauHoi("Điền từ còn thiếu vào câu thành ngữ sau: \"Vắng chủ nhà, gà...\"","Vọc Niêu Tôm","ăn trộm tôm&mổ chết tôm&mọc đuôi tôm"));
        arrCauSo1.add(taoCauHoi("Loại củ nào giúp vết thương mau lành, không để lại sẹo?","Nghệ","Gừng&Giềng&Hành"));
        arrCauSo1.add(taoCauHoi("Bộ phim \"Chị Dậu\" được chuyển thể từ tác phẩm văn học nào?","Tắt Đèn","Người Mẹ Cầm Súng&Vợ Chồng A Phủ&Tuổi Thơ Dữ Dội"));
        arrCauHoi.add(arrCauSo1);
        //cap so 2

        ArrayList<CauHoi> arrCauSo2 = new ArrayList<>();
        arrCauSo2.add(taoCauHoi("World Cup 2022 sẽ được tổ chức ở quốc gia nào?","Qatar","Brazil&Uruguay&Argentina"));
        arrCauSo2.add(taoCauHoi("Đâu là một loại hình chợ tạm tự phát thường xuất hiện trong các khu dân cư?","Cóc","Nhái&Thằn Lằn&Ếch"));
        arrCauSo2.add(taoCauHoi("Đâu là tên một loại bánh nổi tiếng ở Huế?","Khoái","Sướng&Vui&Thích"));
        arrCauHoi.add(arrCauSo2);
    }
    private  CauHoi taoCauHoi(String s1,String s2,String s3){
        CauHoi c1 = new CauHoi();
        c1.setNoiDung(s1);
        c1.setDapAnDung(s2);
        c1.setArrDapAnSai(s3);
        return  c1;
    }

}
