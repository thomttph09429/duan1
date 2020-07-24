package com.poly.tracnghiem12.DAO;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.poly.tracnghiem12.Model.NguoiDung;

import java.sql.SQLData;
import java.util.ArrayList;
import java.util.List;

public class NguoiDungDAO extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "nguoidung";
    public static final String COLUMN_TENDANGNHAP = "tendangnhap";
    public static final String COLUMN_MATKHAU = "matkhau";
    public static final String COLUMN_HOTEN = "hoten";
    public static final String COLUMN_TRUONGDANGHOC = "truongdanghoc";
    public static final String COLUMN_QUEQUAN = "quequan";

    public NguoiDungDAO(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_table = "create table " + TABLE_NAME + " (" + COLUMN_TENDANGNHAP + " text primary key , " + COLUMN_MATKHAU + " text, "+COLUMN_HOTEN+" text , "+COLUMN_TRUONGDANGHOC+" text ,"+COLUMN_QUEQUAN+" text )";

        db.execSQL(create_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long inertnguoidung(NguoiDung nguoiDung) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TENDANGNHAP, nguoiDung.getTendangnhap());
        contentValues.put(COLUMN_MATKHAU, nguoiDung.getMatkhau());
        contentValues.put(COLUMN_HOTEN, nguoiDung.getHoten());
        contentValues.put(COLUMN_TRUONGDANGHOC, nguoiDung.getTruongdanghoc());
        contentValues.put(COLUMN_QUEQUAN, nguoiDung.getQuequan());
        long kq = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        return kq;
    }

//    public boolean kiemtranguoidung() {
//        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
//        String SELECT = "SELECT * FROM " + TABLE_NAME;
//        Cursor cursor = sqLiteDatabase.rawQuery(SELECT, null);
//        if (cursor.getCount() != 0) {
//            return true;
//
//        } else {
//            return false;
//        }
//    }

    public boolean kiemtralogin(String tendangnhap, String matkhau) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String truyvan = "SELECT * FROM  " + TABLE_NAME + " WHERE  " + COLUMN_TENDANGNHAP + " = '" + tendangnhap  + "' AND " + COLUMN_MATKHAU + "= '" + matkhau + "'";
        Cursor cursor = sqLiteDatabase.rawQuery(truyvan, null);
        if (cursor.getCount() != 0) {
            return true;

        } else {
            return false;
        }
    }

}
