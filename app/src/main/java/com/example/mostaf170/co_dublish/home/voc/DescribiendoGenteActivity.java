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

public class DescribiendoGenteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Adolescente", "مراهق"));
        words.add(new word("Adulto/a", "بالغ"));
        words.add(new word("Adulto; Mayor", "كبير/راشد"));
        words.add(new word("Alegre", "مرح"));
        words.add(new word("Alto", "طويل"));
        words.add(new word("Amable", "ودود"));
        words.add(new word("Amable; Dulce", "لطيف"));
        words.add(new word("Ambicioso", "طموح"));
        words.add(new word("Anciano; Mayor ", "كبير السن"));
        words.add(new word("Apuesto/Guapo", "وسيم"));
        words.add(new word("Arrogante", "متكبر/متعجرف"));
        words.add(new word("Arruga", "مجعد"));
        words.add(new word("Aspecto", "مظهر خارجي"));
        words.add(new word("Atractivo", "جذاب"));
        words.add(new word("Bajo", "قصير"));
        words.add(new word("Barba", "دقن"));
        words.add(new word("Bebé", "طفل"));
        words.add(new word("Bigote", "شارب"));
        words.add(new word("Bonachón; Afable ", "طيب"));
        words.add(new word("Bueno; Obediente", "مطيع"));
        words.add(new word("Calvo", "اصلع"));
        words.add(new word("Carácter", "شخصية"));
        words.add(new word("Chico/Niño", "طفل"));
        words.add(new word("Chico; Niña", "طفله"));
        words.add(new word("Comportarse/Portarse", "تصرف"));
        words.add(new word("Cruel", "قاسي"));
        words.add(new word("De mal carácter/genio", "شخصية سيئة"));
        words.add(new word("De mediana edad", "متوسط العمر"));
        words.add(new word("Decidido ", "حازم"));
        words.add(new word("Delgado", "رفيع"));
        words.add(new word("Distraído", "شارد الذهن"));
        words.add(new word("Divertido", "مسل"));
        words.add(new word("Educado", "مؤدب"));
        words.add(new word("Encantador", "ساحر"));
        words.add(new word("Engreído; Vanidoso", "مغرور"));
        words.add(new word("Entusiasta", "متحمس"));
        words.add(new word("Esbelto; Delgado", "نحيف"));
        words.add(new word("Estúpido", "غبي"));
        words.add(new word("Feo", "قبيح"));
        words.add(new word("Flaco", "نحيل"));
        words.add(new word("Generoso", "كريم - سخي"));
        words.add(new word("Gente", "ناس"));
        words.add(new word("Gordo", "سمين"));
        words.add(new word("Gracioso", "مرح"));
        words.add(new word("Grosero; Maleducado", "غير مهذب/وقح"));
        words.add(new word("Guapa/o", "جميل/ة"));
        words.add(new word("Guapo", "جميل المظهر"));
        words.add(new word("Guapo (chicas, bebés); Bonito", "جميل"));
        words.add(new word("Hombre", "رجل"));
        words.add(new word("Inteligente", "ذكي"));
        words.add(new word("Joven", "شاب"));
        words.add(new word("Listo", "مستعد/بارع"));
        words.add(new word("Loco", "مجنون"));
        words.add(new word("Malo", "سئ"));
        words.add(new word("Malo", "بذيء"));
        words.add(new word("Malo; Malvado", "شرير"));
        words.add(new word("Modesto", "متواضع"));
        words.add(new word("Moreno/Oscuro", "داكن/اسمر"));
        words.add(new word("Mujer", "امرأه"));
        words.add(new word("Nervioso", "متوتر"));
        words.add(new word("Niño/a; Pequeño/a", "طفل/ة / صغير/ة"));
        words.add(new word("Niño/Niña", "طفل/ة"));
        words.add(new word("Optimista", "متفائل"));
        words.add(new word("Pecas", "نمش"));
        words.add(new word("Pelo", "شعر"));
        words.add(new word("Perezoso", "كسول"));
        words.add(new word("Persona", "شخص"));
        words.add(new word("Pesimista", "متشائم"));
        words.add(new word("Preocupado; Inquieto", "قلق"));
        words.add(new word("Rubio", "أشقر"));
        words.add(new word("Señor; Caballero", "رجل نبيل"));
        words.add(new word("Señora", "سيدة"));
        words.add(new word("Sensato; Razonable; Mayor", "عاقل"));
        words.add(new word("Sensible", "حساس"));
        words.add(new word("Serio", "جاد"));
        words.add(new word("Simpático", "لطيف"));
        words.add(new word("Tacaño", "بخيل"));
        words.add(new word("Tez/Cutis", "لون البشرة"));
        words.add(new word("Tierno; dulce", "لطيف"));
        words.add(new word("Tímido", "خجول"));
        words.add(new word("Tonto", "احمق"));
        words.add(new word("Tranquilo", "هادئ"));
        words.add(new word("Travieso ", "شقي"));
        words.add(new word("Valiente", "شجاع"));
        words.add(new word("Viejo", "عجوز"));

        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
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
