package com.example.mostaf170.co_dublish.grammer.Gramática.ModeConficional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mostaf170.co_dublish.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class CondicionalCompuestoActivity extends AppCompatActivity

{
    PDFView p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicional_compuesto);

        p = (PDFView)findViewById(R.id.pdfView);
        p.fromAsset("condicionalcompuestodeindicativo.pdf")
                .pages(0, 2, 1, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .defaultPage(0)

                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();

    }
}