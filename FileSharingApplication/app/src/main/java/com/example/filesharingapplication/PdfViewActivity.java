package com.example.filesharingapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {

    PDFView pdfView;
    TextView tv_filename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        Intent intent = getIntent();
        String fileUri = intent.getStringExtra("uri");
        String fileName = intent.getStringExtra("name");

        pdfView = findViewById(R.id.pdfView);
        tv_filename = findViewById(R.id.tv_fileName);

        tv_filename.setText(fileName);
        pdfView.fromUri(Uri.parse(fileUri)).load();

    }
}