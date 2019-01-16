package com.example.mostaf170.co_dublish.home.voc;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mostaf170.co_dublish.R;

import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create and setup the {@link AudioManager} to request audio focus
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Adolescente", "مراهق"));
        words.add(new word("Abuela", "جدة"));
        words.add(new word("Abuelita", "جدة"));
        words.add(new word("Abuelito", "جد"));
        words.add(new word("Abuelo", "جد"));
        words.add(new word("Abuelos", "اجداد"));
        words.add(new word("Adoptado", "متبنى"));
        words.add(new word("Amigo/a", "صديق/ ة"));
        words.add(new word("Amistad", "صداقة"));
        words.add(new word("Amor fraternal", "حب أخوي"));
        words.add(new word("Antepasados", " الاجداد القدامى"));
        words.add(new word("Bisabuela", "الجدة الكبرى"));
        words.add(new word("Bisabuelo", "الجد الأكبر"));
        words.add(new word("Compromiso ; Noviazgo", "خطوبة"));
        words.add(new word("Conocido/a", "معروف/ة"));
        words.add(new word("Cuñada", "أخت الزوج أو اخت الزوجة"));
        words.add(new word("Cuñado", "أخ الزوج أو اخ الزوجة"));
        words.add(new word("De humilde cuna", "من اصول متواضعة"));
        words.add(new word("De noble alcurnia", "من اصول نبيلة"));
        words.add(new word("Descendientes", "أحفاد"));
        words.add(new word("Dinastía", "سلالة"));
        words.add(new word("El benjamín/la benjamina", "طفل العائلة"));
        words.add(new word("Familia", "عائلة"));
        words.add(new word("Fraternidad", "أخوية"));
        words.add(new word("Gemelos", "توأمان"));
        words.add(new word("Generación", "جيل"));
        words.add(new word("Heredero", "وريث"));
        words.add(new word("Hermana", "اخت"));
        words.add(new word("Hermano", "اخ"));
        words.add(new word("Hermano de leche", "شقيق في الرضاعة"));
        words.add(new word("Hermano de madre", "شقيق"));
        words.add(new word("Hija", "ابنة"));
        words.add(new word("Hijastra", "بنت الزوج أو الزوجة - ربيبة"));
        words.add(new word("Hijastro", "إبن الزوج أو الزوجة - ربيب"));
        words.add(new word("Hijo", "ابن"));
        words.add(new word("Hijo ilegítimo", "ابن غير شرعي"));
        words.add(new word("Hijo legítimo", "ابن شرعي"));
        words.add(new word("Hijo mayor", "الابن الاكبر"));
        words.add(new word("Hijo/a único/a", "اخ-اخت/وحيد/ة"));
        words.add(new word("Huérfano/a", "يتيم"));
        words.add(new word("Linaje", "نسل"));
        words.add(new word("Madrastra", "زوجة الاب"));
        words.add(new word("Madre", "أم"));
        words.add(new word("Madrina", "العرابة/ام بالعماد/أم فاضله"));
        words.add(new word("Mamá", "أم"));
        words.add(new word("Marido ; Esposo", "زوج"));
        words.add(new word("Media naranja", "النصف الاخر/ زوجة/زوج"));
        words.add(new word("Mujer ; Esposa", "زوجة"));
        words.add(new word("Nieto/a", "حفيد/ة"));
        words.add(new word("Novia", "صديقة"));
        words.add(new word("Novio", "رفيق"));
        words.add(new word("Nuera", "زوجة الإبن"));
        words.add(new word("Padrastro", "زوج الأم"));
        words.add(new word("Padre", "أب"));
        words.add(new word("Padre/madre soltero/a", "الوالد الوحيد"));
        words.add(new word("Padres", "والدين"));
        words.add(new word("Padrino", "عراب/أب بالعماد/ أب فاضل"));
        words.add(new word("Padrino de boda", "شاهد العريس"));
        words.add(new word("Papá", "أب"));
        words.add(new word("Pariente ; Familiar", "قريب/نسيب"));
        words.add(new word("Parientes consanguíneos", "أقرباء بالدم"));
        words.add(new word("Primogénito", "بكر"));
        words.add(new word("Prometido", "مخطوب"));
        words.add(new word("Sobrina", "ابنة الاخ"));
        words.add(new word("Sobrino", "ابن أخ"));
        words.add(new word("Sucesión", "تركة"));
        words.add(new word("Suegra", "حماة أم الزوج أو أم الزوجة"));
        words.add(new word("Suegro", "الحمو أبو الزوجة أو الزوج"));
        words.add(new word("Tía", "خالة"));
        words.add(new word("Tío", "خال"));
        words.add(new word("Vida familiar", "حياة عائلية"));
        words.add(new word("Yerno", "صهر /نسيب"));
        words.add(new word("Primo /a", "إبن العم أو الخال"));

        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
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
