package com.ups.planetasra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class PlanetasActivity extends AppCompatActivity {

    String sol="El Sol es una estrella, pero no es la estrella más grande. Solo es la más cercana a nosotros y por eso parece que brilla más y que es más grande que las otras.\n" +
            "\n" +
            "El Sol nos da luz y calor, y gracias a él los animales y las plantas crecen. El Sol es mucho más grande la Tierra y que nosotros, pero en realidad es pequeño comparado con las estrellas del Universo.";
    String mer="Mercurio es el planeta más pequeño de nuestro sistema solar. Simplemente, es un poco más grande que la Luna de la Tierra. Es el planeta más cercano al Sol, pero no es realmente el más cálido. Venus es el más cálido.";
    String ven="Aunque Venus no es el planeta más cercano al Sol, es el más caliente. Tiene una atmósfera densa, llena de dióxido de carbono, que provoca el efecto invernadero, y de nubes compuestas de ácido sulfúrico. Los gases atrapan el calor y mantienen a Venus bien calentito. De hecho, hace tanto calor en Venus que metales como el plomo serían charcos de metal fundido.";
    String tie="Nuestro hogar, el planeta Tierra, es un planeta terrestre y rocoso. Tiene una superficie sólida y activa, con montañas, valles, cañones, llanuras y mucho más. La Tierra es especial porque es un planeta océano, ya que el agua cubre el 70% de su superficie.\n" +
            "\n";
    String mar="Marte es un planeta desértico y frío. Es la mitad del tamaño de la Tierra, y también recibe el nombre de \"planeta rojo\". Es rojo por el hierro oxidado que tiene en el suelo.\n" +
            "\n";
    String jup="Júpiter es el planeta más grande de nuestro sistema solar. Es parecido a una estrella, pero nunca llegó a ser lo suficientemente grande como para empezar a arder. Está cubierto de rayas de nubes arremolinadas. Tiene fuertes tormentas como la Gran Mancha Roja, que hace cientos de años que dura. Júpiter es un gigante hecho de gas, y no tiene una superficie sólida, pero puede tener un núcleo interno sólido de aproximadamente el tamaño de la Tierra. Júpiter también tiene anillos, pero son demasiado tenues para verlos muy bien.\n" +
            "\n";
    String sat="Saturno no es el único planeta que tiene anillos, pero definitivamente tiene los más bellos. Los anillos que vemos están compuestos por grupos de pequeños aros que rodean a Saturno. Están hechos de pedazos de hielo y roca. Como Júpiter, Saturno es una pelota de hidrógeno y helio, en gran parte.\n" +
            "\n";
    String ura="Urano está compuesto de agua, metano y amoniaco sobre un pequeño centro rocoso. Su atmósfera está hecha de hidrógeno y helio, como Júpiter y Saturno, pero además contiene metano. El metano es lo que le da a Urano el color azul.\n" +
            "\n";
    String nep="Neptuno es oscuro, frío y muy ventoso. Es el último de los planetas de nuestro sistema solar. Está más de 30 veces más lejos del Sol que la Tierra. Neptuno es muy parecido a Urano. Está compuesto de una espesa mezcla de agua, amoniaco y metano sobre un centro sólido del tamaño de la Tierra. Su atmósfera se compone de hidrógeno, helio y metano. El metano le da a Neptuno el mismo color azul de Urano. Neptuno tiene seis anillos que no se ven fácilmente.\n" +
            "\n";


    ListView listView;
    String mTitle[] = {"El Sol","Mercurio","Venus","Tierra","Marte","Júpiter","Saturno","Urano","Neptuno"};
    String mDesciption[] = {"Sol Descripción","Mercurio Descripción","Venus Descripción","Tierra Descripción","Marte Descripción","Júpiter Descripción","Saturno Descripción","Urano Descripción","Neptuno Descripción"};
    String mDesciptionGeneral[] = {sol,mer,ven,tie,mar,jup,sat,ura,nep};
    int images [] = {R.drawable.sol,R.drawable.mercurio,R.drawable.venus,R.drawable.tierra,R.drawable.marte,R.drawable.jupiter,R.drawable.saturno,R.drawable.urano,R.drawable.neptuno};
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetas);
        int ans;

        listView=findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDesciption, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            //Es la selección de los objetos en la lista
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[0]);
                    intent.putExtra("description",mDesciptionGeneral[0]);
                    intent.putExtra("position", ""+0);
                    startActivity(intent);

                }
                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[1]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[1]);
                    intent.putExtra("description",mDesciptionGeneral[1]);
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[2]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[2]);
                    intent.putExtra("description",mDesciptionGeneral[2]);
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[3]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[3]);
                    intent.putExtra("description",mDesciptionGeneral[3]);
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[4]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[4]);
                    intent.putExtra("description",mDesciptionGeneral[4]);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if(position == 5){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[5]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[5]);
                    intent.putExtra("description",mDesciptionGeneral[5]);
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if(position == 6){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[6]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[6]);
                    intent.putExtra("description",mDesciptionGeneral[6]);
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if(position == 7){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[7]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[7]);
                    intent.putExtra("description",mDesciptionGeneral[7]);
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
                if(position == 8){
                    Intent intent = new Intent(getApplicationContext(),SolActivity.class);
                    //Pone la imagen en el index 0 en otra activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[8]);
                    intent.putExtras(bundle);
                    //Pone el titulo y descripcion en otra activity
                    intent.putExtra("title",mTitle[8]);
                    intent.putExtra("description",mDesciptionGeneral[8]);
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                }
            }
        });



    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText((rDescription[position]));


            return row;
        }
    }

}