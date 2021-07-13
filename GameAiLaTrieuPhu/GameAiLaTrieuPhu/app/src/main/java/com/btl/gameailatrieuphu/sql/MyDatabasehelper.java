package com.btl.gameailatrieuphu.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabasehelper extends SQLiteOpenHelper {
    public static final String DATA_NAME="data.sqlite";
    public static final int DATA_VERSION =1;
    String createTableCauHoi="CREATE TABLE "+"Cauhoi"
            +"("
            +"id "+"INTEGER "+"PRIMARY KEY" +" autoincrement,"
            +"capdo "+" INTEGER,"
            +"noidung "+" TEXT,"
            +"dapan "+" TEXT,"
            +"dapasai "+" TEXT"
            +")";

    public MyDatabasehelper(@Nullable Context context) {
        super(context, DATA_NAME, null, DATA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTableCauHoi);
        fakedata(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    private void fakedata(SQLiteDatabase d) {
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,1,\""+"Điền từ còn thiếu vào câu ca dao 'Gần Mực thì đen gần Đèn thì...' ?"+"\",\""+"Sáng"+"\",\""+"Tối&Lóa&Rạng"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,1,\""+"Từ nào sau đây khác nghĩa với 3 từ còn lại?"+"\",\""+"Sinh Viên"+"\",\""+"Sinh Nở&Sinh Sôi&Sinh Trưởng"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,1,\""+"Mưa ngâu là vào khoảng tháng mấy trong năm?"+"\",\""+"Tháng 7 Âm Lịch"+"\",\""+"Tháng 9 Âm Lịch&Tháng 6 Âm Lịch&Tháng 8 Âm Lịch"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,2,\""+"Điền từ còn thiếu vào câu sau 'Mạnh vì..., bạo vì tiền'."+"\",\""+"Gạo"+"\",\""+"Thóc&Lúa&Cơm"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,2,\""+"Ngôi chùa được đúc hoàn toàn bằng đồng tại Việt Nam?"+"\",\""+"Chùa Đồng"+"\",\""+"Chùa Bái Đính&Chùa Tam Chúc&Chùa Ba Vàng"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,2,\""+"Điền từ còn thiếu vào câu sau 'Cây ngay không sợ...'."+"\",\""+"dapan1"+"\",\""+"Chết Đứng&Chết Ngồi&Chết Nằm"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,3,\""+"Người Việt Nam đầu tiên bay vào vũ trụ là ai?"+"\",\""+"Phạm Tuân"+"\",\""+"Nguyễn Tuân&Nguyễn Bính&Nguyễn Tuấn"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,3,\""+"Chùa Đồng lớn nhất Việt Nam ở đâu?"+"\",\""+"Núi Yên Tử"+"\",\""+"Núi Yên Tĩnh&Núi Đá&Núi Trầm"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,3,\""+"Điền từ còn thiếu vào câu sau 'Không ăn... bỏ cho người'."+"\",\""+"dapan1"+"\",\""+"dapansai1&dapansai2&dapansai1"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,4,\""+"Đâu là tên một loại bánh nổi tiếng ở Huế?"+"\",\""+"Khoái"+"\",\""+"Cười&Sướng&Vui"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,4,\""+"Nhạc sĩ nào là người sáng tác ca khúc 'Cây đàn sinh viên?'"+"\",\""+"Quốc An"+"\",\""+"Quốc Bảo&Quốc Chấn&Trần Tiến"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,5,\""+"Bộ phim 'Chị Dậu' được chuyển thể từ tác phẩm văn học nào?"+"\",\""+"Tắt Đèn"+"\",\""+"Vợ Chồng A Phủ&Góa Phụ Đen&Tuổi Thơ"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,5,\""+"Đâu là tên một bãi biển ở Quảng Bình?"+"\",\""+"Đá Nhảy"+"\",\""+"Đá Lăn&Đá Chạy&Đá Bò"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,6,\""+"Đâu là tên một loại chợ?"+"\",\""+"Cóc"+"\",\""+"Ếch&Nhái&Thằn Lằn"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,6,\""+"Vua nào đặt nhiều niên hiệu nhất lịch sử nước ta?"+"\",\""+"Lý Nhân Tông"+"\",\""+"Trần Nhân Tông&Lý Anh Tông&Lý Thánh Tông"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,7,\""+"Biển có nồng độ muối lớn nhất thế giới?"+"\",\""+"Biển Chết"+"\",\""+"Biển Đỏ&Biển Đen&Biển Sống"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,7,\""+"Huyện Võ Nhai thuộc tỉnh nào nước ta?"+"\",\""+"Thái Nguyên"+"\",\""+"Nam Định&Nghệ An&Ninh Bình"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,8,\""+"Nhạc sĩ Sô Panh gắn liền với nhạc cụ nào?"+"\",\""+"Piano"+"\",\""+"Violin&Guitar&Hacmonica"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,8,\""+"Công thức hóa học của đá vôi là?"+"\",\""+"CaCo3"+"\",\""+"Ca2Co3&CaCo4&CaCo"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,9,\""+"Ngày bầu cử quốc hội khóa 12?"+"\",\""+"20-05-2007"+"\",\""+"20-05-2008&20-05-2009&20-05-2006"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,9,\""+"Câu nói: 'Đầu tôi chưa rơi xuống đất, xin bệ hạ đừng lo' là của ai?"+"\",\""+"Trần Thủ Độ"+"\",\""+"Trần Quang Khải&Phạm Ngữ Lão&Trần Khánh Dư"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,10,\""+"Kinh thành trà kiệu thuộc tỉnh nào?"+"\",\""+"Quảng Nam"+"\",\""+"Quảng Bình&Huế&Ninh Bình"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,10,\""+"Lần đầu tiên nước ta dùng bộc phá 1000 kg thuốc nổ đánh giặc là ở đâu?"+"\",\""+"Điện Biên Phủ"+"\",\""+"Trận Thành Gia Định&Chiến Dịch Biên Giới&Đèo Hải Vân"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,11,\""+"Ho gà theo Đông Y gọi là gì?"+"\",\""+"Đốn Khái"+"\",\""+"Khái Huyết&Khái Lộ&Chỉ Khái"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,11,\""+"'Tấm ván phóng dao', '100 đô la âm phủ' là những tập truyện của tác giả nào?\n"+"\",\""+"Mạc Can"+"\",\""+"Nguyễn Ngọc Tứ&Hoàng Diệu&Vũ Bão"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,12,\""+"Cây cao su có nguồn gốc từ đâu?"+"\",\""+"Brazil"+"\",\""+"Chile&Mexico&Argentina"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,12,\""+"William Shakespeare, tác giả vở kịch nổi tiếng 'Romeo và Juliet' là người nước nào?"+"\",\""+"Anh"+"\",\""+"Áo&Mỹ&Pháp"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,13,\""+"Trong xây dựng, gạch block là loại gạch gì?"+"\",\""+"Gạch không nung"+"\",\""+"Gạch Men&Gạch tàu&Gạch đỏ"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,13,\""+"Trong trang điểm, concealer là gì?"+"\",\""+"Che khuyết điểm"+"\",\""+"Phấn phủ&Son&Kem nền"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,14,\""+"Phương pháp chẩn bệnh nào không nằm trong “tứ chẩn” của y học cổ truyền?"+"\",\""+"Xét nghiệm máu"+"\",\""+"Bắt mạch&Hỏi bệnh nhân&Nghe tim phổi"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,14,\""+"“Làm không đụng xác, vác không đụng...” gì?"+"\",\""+"Vai"+"\",\""+"Chân&Tay&Lưng"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,15,\""+"Đèo Cả là địa phận giáp ranh giữa tỉnh Phú Yên và tỉnh nào sau đây?"+"\",\""+"Khánh Hòa"+"\",\""+"Quảng Bình&Cao Bằng&Hà Tĩnh"+"\");");
        d.execSQL("INSERT INTO Cauhoi (id,capdo ,noidung,dapan,dapasai) VALUES( null,15,\""+"An Dương Vương đặt quốc hiệu nước ta là gì?"+"\",\""+"Âu Lạc"+"\",\""+"Vạn Xuân&Đại Cồ Việt&Đại Việt"+"\");");


    }
}
