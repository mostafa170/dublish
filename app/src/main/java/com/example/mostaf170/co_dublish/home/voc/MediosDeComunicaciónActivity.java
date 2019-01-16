package com.example.mostaf170.co_dublish.home.voc;

import android.app.Activity;
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

public class MediosDeComunicaciónActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create and setup the {@link AudioManager} to request audio focus
        final ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Antena", "جهاز ارسال هوائي"));
        words.add(new word("Anuncio en un diario", "إعلان في صحيفة"));
        words.add(new word("Auricular de teléfono", "سماعة الهاتف"));
        words.add(new word("Boletín informativo", "النشرة الإخبارية"));
        words.add(new word("Buzón en la calle", "صندوق البريد في الشارع"));
        words.add(new word("Buzón en la puerta", "صندوق البريد على الباب"));
        words.add(new word("Cabina telefónica", "كشك الهاتف"));
        words.add(new word("Cadena ; Canal", "قناة"));
        words.add(new word("Calculadora", "آلة حاسبة"));
        words.add(new word("Carta", "عاجل"));
        words.add(new word("Carta urgente", "خطاب عاجل"));
        words.add(new word("Cartero", "ساعي البريد"));
        words.add(new word("Centralita", "لوحة مفاتيح"));
        words.add(new word("Columna de un periódico", "عمود الصحيفة"));
        words.add(new word("Correo aéreo", "البريد الجوي"));
        words.add(new word("Correos y telégrafos", "البريد والبرقيات"));
        words.add(new word("Emisora", "محطة البث"));
        words.add(new word("Entrevista", "مقاب"));
        words.add(new word("Fax", "الفاكس"));
        words.add(new word("Franqueo", "طوابع البريد"));
        words.add(new word("Giro postal", "حوالة مالية"));
        words.add(new word("Guión", "سيناريو"));
        words.add(new word("Imagen", "صورة"));
        words.add(new word("Impresora", "طابعة"));
        words.add(new word("Impresora láser", "طابعة ليزر"));
        words.add(new word("Magnetófono", "جهاز تسجيل"));
        words.add(new word("Mensajero", "رسول"));
        words.add(new word("Micrófono", "ميكروفون"));
        words.add(new word("Módem", "مودم"));
        words.add(new word("Noticias", "أخبار"));
        words.add(new word("Oficina de correos", "مكتب بريد"));
        words.add(new word("Ordenador", "كمبيوتر"));
        words.add(new word("Ordenador portátil", "كمبيوتر محمول"));
        words.add(new word("Paquete postal", "حزمة البريد"));
        words.add(new word("PC (ordenador personal)", "كمبيوتر الشخصي"));
        words.add(new word("Periódico, diario", "صحيفة"));
        words.add(new word("Prensa", "صحافة"));
        words.add(new word("Radio", "راديو"));
        words.add(new word("Radiodifusión (por radio) ; Retransmisión (por televisión)", "الإذاعة (بالراديو) ؛ إعادة الإرسال (عن طريق التلفاز)"));
        words.add(new word("Repartidor de Telégrafos", "مرسل التلغراف"));
        words.add(new word("Reportaje", "لتقارير الصحفية"));
        words.add(new word("Satélite de telecomunicación", "القمر الصناعي للاتصالات"));
        words.add(new word("Sellos para franqueo", "طوابع البريد"));
        words.add(new word("Teléfono", "هاتف"));
        words.add(new word("Teléfono móvil", "هاتف المحمول"));
        words.add(new word("Teléfono público", "الهاتف عام"));
        words.add(new word("Telegrama","برقية"));
        words.add(new word("Televidente, telespectador", "مشاهد"));
        words.add(new word("Televisión", "تلفاز"));
        words.add(new word("Télex", "تلكس"));
        words.add(new word("Video", "فيديو"));
        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
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
