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

public class DatosPersonalesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("¿Cómo se llama / te llamas?", "ما هو عمرك ؟  "));
        words.add(new word("¿Cuántos años tiene / tienes?", "ما هو عمرك ؟"));
        words.add(new word("Apellido", "لقب العائلة"));
                words.add(new word("Casado", "متزوج"));
        words.add(new word("Código postal", "الرمز البريدي"));
        words.add(new word("Cumpleaños", "عيد ميلاد"));
        words.add(new word("De sexo femenino ; Hembra ; Mujer", " أنثى/امرأة"));
        words.add(new word("De sexo masculino ; Varón ; hombre", "ذكر/ رجل"));
        words.add(new word("Dirección", "عنوان"));
        words.add(new word("Divorciado", "مطلق"));
        words.add(new word("Edad", "عمر"));
        words.add(new word("Estado civil", "الحالة الاجتماعية"));
        words.add(new word("Fecha de nacimiento", "تاريخ الميلاد"));
        words.add(new word("Iniciales", "اصول"));
        words.add(new word("Lugar de nacimiento", "مسقط الرأس"));
        words.add(new word("Me llamo…", "اسمي ..."));
        words.add(new word("Nací en…; Soy de…", "لقد ولدت في ... أنا من…"));
        words.add(new word("Nacionalidad", "جنسية"));
        words.add(new word("Nombre", "اسم"));
        words.add(new word("Nombre de pila", "الاسم الأول"));
        words.add(new word("Número de telefono", "رقم الهاتف"));
        words.add(new word("Señorita", "السيدة"));
        words.add(new word("Señorita o Señora", "الآنسة أو السيدة"));
        words.add(new word("Separado", "منفصل"));
        words.add(new word("Sexo", "جنس"));
        words.add(new word("Soltero", "وحيد"));
        words.add(new word("Sr (señor)", "سيد"));
        words.add(new word("Sra (Señora)", "سيدة"));
        words.add(new word("Tengo…años", "عندي ... سنين"));
        words.add(new word("Viuda", "أرملة"));
        words.add(new word("Viudo", "أرمل"));
        words.add(new word("Vivir", "يعيش"));




        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_DatosPersonales);
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
