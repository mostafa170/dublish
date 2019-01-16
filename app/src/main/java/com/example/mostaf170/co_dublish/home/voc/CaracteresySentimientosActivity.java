package com.example.mostaf170.co_dublish.home.voc;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.example.mostaf170.co_dublish.R;

import java.util.ArrayList;

public class CaracteresySentimientosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Aburrido", "يشعر بالملل"));
        words.add(new word("Afable", "أنيس"));
        words.add(new word("Agradecido", "ممنون"));
        words.add(new word("Alegre", "مبتهج"));
        words.add(new word("Alegría", "فرح"));
        words.add(new word("Ambicioso", "طموح"));
        words.add(new word("Amor", "حب"));
        words.add(new word("Angustioso", "محزن"));
        words.add(new word("Anormal", "غير طبيعى"));
        words.add(new word("Ansioso ; Inquieto", "قلق"));
        words.add(new word("Apasionado", "عاطفي جدا"));
        words.add(new word("Apático", "لا مبالي"));
        words.add(new word("Asombrado ; Atónito", "منبهر"));
        words.add(new word("Asombrado ; Sorprendido", "مندهش/مذهول/متفاجئ"));
        words.add(new word("Astuto", "فطن"));
        words.add(new word("Aterrorizado", "مذعور"));
        words.add(new word("Autoritario", "استبدادي"));
        words.add(new word("Avergonzado", "خجلان"));
        words.add(new word("Avergonzado ; En un apuro", "محرج /في مأزق"));
        words.add(new word("Bueno", "حسن"));
        words.add(new word("Celoso", "غيور"));
        words.add(new word("Conformista", "ملتزم"));
        words.add(new word("Contento", "سعيد"));
        words.add(new word("Deprimido", "مكتئب"));
        words.add(new word("Desdichado", "تعيس"));
        words.add(new word("Desilusionado , Decepcionado", "خيب الامل"));
        words.add(new word("Disgustado ; Afectado", "منزعج منضطراب"));
        words.add(new word("Egoísta", "أناني"));
        words.add(new word("Embaucador", "مخادع"));
        words.add(new word("Emotivo", "عاطفي"));
        words.add(new word("Encantado", "مسرور جدا"));
        words.add(new word("Enérgico", "نشيط"));
        words.add(new word("Enfadado", "غاضب"));
        words.add(new word("Entusiasmado ; Emocionado ; Nervioso", "منفعل/متشوق"));
        words.add(new word("Envidioso", "حسود"));
        words.add(new word("Esperanza", "أمل"));
        words.add(new word("Felicidad", "سعادة"));
        words.add(new word("Feliz ; Contento", "سعيد"));
        words.add(new word("Furioso", "غاضب"));
        words.add(new word("Grito", "صرخة"));
        words.add(new word("Hipócrita", "منافق"));
        words.add(new word("Humor", "مزاج"));
        words.add(new word("Impaciente ; Ansioso , Ilusionado", "غير صبور/ متحمس"));
        words.add(new word("Impresión", "صدمة"));
        words.add(new word("Individualista", "مستقل"));
        words.add(new word("Infeliz", "تعيس/حزين"));
        words.add(new word("Inteligente", "ذكي"));
        words.add(new word("Ira", "غضب"));
        words.add(new word("Irritable", "سريع الغضب	"));
        words.add(new word("Lástima", "شفقة"));
        words.add(new word("Llorar", "يبكي"));
        words.add(new word("Malvado", "شرير"));
        words.add(new word("Melancólico", "كئيب"));
        words.add(new word("Miedo", "خوف"));
        words.add(new word("Molesto ; Enfadado", "منزعج"));
        words.add(new word("Necesidad", "حاجة"));
        words.add(new word("Nervioso", "عصبي/متوتر"));
        words.add(new word("Odio", "كره"));
        words.add(new word("Optimista", "متفائل"));
        words.add(new word("Orgullo", "كبرياء"));
        words.add(new word("Orgulloso", "فخور/متكبر"));
        words.add(new word("Pesimista", "متشائم"));
        words.add(new word("Placer", "سرور/متعة"));
        words.add(new word("Preocupación", "قلق"));
        words.add(new word("Rabia ; Ira", "غضب"));
        words.add(new word("Rebelde", "متمرد"));
        words.add(new word("Rencoroso", "حقود"));
        words.add(new word("Risa", "ضحكة"));
        words.add(new word("Satisfecho", "راض/قنوع"));
        words.add(new word("Satisfecho ; Contento", "مسرور"));
        words.add(new word("Sentimiento", "شعور"));
        words.add(new word("Sonrisa", "ابتسامه"));
        words.add(new word("Sorprendido", "متفاجئ"));
        words.add(new word("Sorpresa", "مفاجأه"));
        words.add(new word("Suspiro", "تنهد"));
        words.add(new word("Terror", "ذعر"));
        words.add(new word("Ruborizarse", "استحى"));
        words.add(new word("Sonreír", "يبتسم"));
        words.add(new word("Triste", "حزين"));
        words.add(new word("Tristeza", "الحزن"));
        words.add(new word("Valiente", "شجاع"));
        words.add(new word("Vergüenza", "الخجل/العار"));
        words.add(new word("Violento", "عنيف"));
        words.add(new word("Voluntarioso", "طوعي"));


        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_CaracteresySentimientos);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                word word = words.get(position);
            }
        });
    }
}
