package com.example.mostaf170.co_dublish.home.voc;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mostaf170.co_dublish.R;

import java.util.ArrayList;

public class SaludActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Alergia", "شريان"));
        words.add(new word("Asma", "مفصل"));
        words.add(new word("Ataque al corazón ; Infarto", "ذقن"));
        words.add(new word("Bien de salud", "فم"));
        words.add(new word("Bronquitis", "ذراع"));
        words.add(new word("Cáncer", "سرطان"));
        words.add(new word("Catarro ; Resfriado", "زكام/ برد"));
        words.add(new word("Chichón", "ورم"));
        words.add(new word("Cicatriz", "خياطة جراحية (ندب)"));
        words.add(new word("Ciego", "أعمى"));
        words.add(new word("Cirujano", "جراح"));
        words.add(new word("Contagio ; Infección", "عدوى"));
        words.add(new word("Contagioso ; Infeccioso", "معدي"));
        words.add(new word("Dentista ; Odontólogo", "طبيب الأسنان"));
        words.add(new word("Depresión", "الإكتئاب"));
        words.add(new word("Derrame cerebral", "السكتة الدماغية"));
        words.add(new word("Desmayarse", "يفقدالوعي"));
        words.add(new word("Disminuido/a psíquico/a", "حالة نفسية سيئة"));
        words.add(new word("Dolor", "ألم"));
        words.add(new word("Dolor de cabeza", "صداع"));
        words.add(new word("Dolor de estómago", "ألم المعدة"));
        words.add(new word("Dolor de garganta", "ألم الحنجرة"));
        words.add(new word("Doloroso", "مؤلم"));
        words.add(new word("Enfermedad", "مرض"));
        words.add(new word("Enfermera", "ممرضة"));
        words.add(new word("Enfermizo/a", "مريض (صفه)"));
        words.add(new word("Enfermo", "مريض"));
        words.add(new word("Erupción ; Sarpullido", "طفح جلدي"));
        words.add(new word("Esguince ; Torcedura", "إلتواء"));
        words.add(new word("Estar mareado", "يشعر بالاغماء"));
        words.add(new word("Faringitis", "التهاب الحلق"));
        words.add(new word("Fiebre", "حمى"));
        words.add(new word("Gripe", "أنفلونزا"));
        words.add(new word("Herida", "جرح"));
        words.add(new word("Higiene", "النظافة الشخصية"));
        words.add(new word("Hospital", "مستشفى"));
        words.add(new word("Indispuesto ; Mal", "متوعك / بصحى سيئة "));
        words.add(new word("Lesión", "إصابة"));
        words.add(new word("Médico de cabecera", "ممارس عام"));
        words.add(new word("Minusvalía ; Discapacidad", "إعاقة"));
        words.add(new word("Oftalmólogo ; Oculista", "طبيب العيون"));
        words.add(new word("Paciente", "مريض"));
        words.add(new word("Padecer ; sufrir", "يعاني/يتألم"));
        words.add(new word("Pediatra", "طبيب أطفال"));
        words.add(new word("Salud", "صحة"));
        words.add(new word("Sano", "صحي"));
        words.add(new word("Sordo", "أصم"));
        words.add(new word("Tos", "سعال"));
        words.add(new word("Vacunarse", "الحصول على اللقاح"));
        words.add(new word("Vomitar", "تقيأ"));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
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