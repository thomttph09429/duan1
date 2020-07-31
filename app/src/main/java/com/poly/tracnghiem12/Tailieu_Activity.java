package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Tailieu_Activity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tailieu_);
        setTitle("Đề thi thử");

        pdfView = findViewById(R.id.pdfview);
        Intent intent = getIntent();
        String links = intent.getStringExtra("linkURL");
        pdfView.fromAsset(links).load();
    }
}