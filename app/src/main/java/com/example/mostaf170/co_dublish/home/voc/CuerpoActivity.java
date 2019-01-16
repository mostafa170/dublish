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

public class CuerpoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Arteria", "شريان"));
        words.add(new word("Articulación", "مفصل"));
        words.add(new word("Barbilla ; Mentón", "ذقن"));
        words.add(new word("Boca", "فم"));
        words.add(new word("Brazo", "ذراع"));
        words.add(new word("Cabeza", "رأس"));
        words.add(new word("Cadera", "فخذ"));
        words.add(new word("Cara", "وجه"));
        words.add(new word("Ceja", "حاجب العين"));
        words.add(new word("Cerebro", "مخ"));
        words.add(new word("Cintura", "خصر"));
        words.add(new word("Codo", "كوع"));
        words.add(new word("Corazón", "قلب"));
        words.add(new word("Costado", " عظمة الجانب"));
        words.add(new word("Costilla", "ضلع"));
        words.add(new word("Cráneo", "جمجمة"));
        words.add(new word("Cuello", "عنق"));
        words.add(new word("Dedo de la mano", "اصبع اليد"));
        words.add(new word("Dedo del pie", "اصبع القدم"));
        words.add(new word("Diente/dientes", "اسنان/سن"));
        words.add(new word("Encías", "لثة"));
        words.add(new word("Espalda", "ظهر"));
        words.add(new word("Espina dorsal ; Columna vertebral", "عمود الفقري"));
        words.add(new word("Estómago", "معدة"));
        words.add(new word("Frente", "جبهة"));
        words.add(new word("Genitales", "أعضاء التناسلية"));
        words.add(new word("Hígado", "كبد"));
        words.add(new word("Hombro", "كتف"));
        words.add(new word("Hueso", "عظم"));
        words.add(new word("Labio", "شفة"));
        words.add(new word("Mandíbula", "فك"));
        words.add(new word("Mano", "يد"));
        words.add(new word("Mejilla", "خد"));
        words.add(new word("Miembro ; Extremidad", "عضو /طرف"));
        words.add(new word("Muñeca", "معصم"));
        words.add(new word("Músculo", "عضلة"));
        words.add(new word("Muslo", "فخذ"));
        words.add(new word("Nariz", "أنف"));
        words.add(new word("Nervio", "عصب"));
        words.add(new word("Nudillo", "مفصل الاصبع"));
        words.add(new word("Ojo", "عين"));
        words.add(new word("Ombligo", "سرة البطن"));
        words.add(new word("Oreja", "جدة"));
        words.add(new word("Pantorrilla", "ربلة الساق"));
        words.add(new word("Párpado", "جفن"));
        words.add(new word("Pecho", "صدر"));
        words.add(new word("Pelo", "شعر"));
        words.add(new word("Pestaña", "رمش"));
        words.add(new word("Pie", "قدم"));
        words.add(new word("Piel", "جلد"));
        words.add(new word("Pierna", "ساق"));
        words.add(new word("Pulmón", "رئة"));
        words.add(new word("Puño", "قبضة"));
        words.add(new word("Riñones", "الكليتين"));
        words.add(new word("Rodilla", "ركبة"));
        words.add(new word("Sangre", "دم"));
        words.add(new word("Talón", "كعب"));
        words.add(new word("Tobillo", "كاحل"));
        words.add(new word("Trasero", "ردف"));
        words.add(new word("Uña", "ظفر"));
        words.add(new word("Vena", "وريد"));



        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_Cuerpo);
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
