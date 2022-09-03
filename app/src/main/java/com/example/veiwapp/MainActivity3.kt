package com.example.veiwapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.github.barteksc.pdfviewer.PDFView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val pdf :PDFView = findViewById(R.id.pdfView)

        val forward = findViewById<Button>(R.id.forward)
        val previous = findViewById<Button>(R.id.previous)

        val chapter_number:Int = intent.getIntExtra("name",0)

        if (chapter_number==0){
            pdf.fromAsset("chap_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==1){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==2){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==3){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==4){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==5){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==6){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==7){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==8){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==9){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==10){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==11){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==12){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==13){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }
        else if (chapter_number==14){
            pdf.fromAsset("sample_1.pdf").enableSwipe(true).swipeHorizontal(true).load()
        }

        forward.setOnClickListener{
            Toast.makeText(this,"forward", Toast.LENGTH_SHORT).show()
        }
        previous.setOnClickListener{
            Toast.makeText(this,"previous", Toast.LENGTH_SHORT).show()
        }

    }
}