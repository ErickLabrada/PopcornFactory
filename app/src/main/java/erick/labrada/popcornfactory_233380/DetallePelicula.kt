package erick.labrada.popcornfactory_233380

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle=intent.extras


        if (bundle!=null){
            findViewById<ImageView>(R.id.iv_pelicula_imagen).setImageResource(bundle.getInt("header"))
            findViewById<TextView>(R.id.iv_nombre_pelicula).setText(bundle.getString("nombre"))
            findViewById<TextView>(R.id.iv_pelicula_desc).setText(bundle.getString("sinopsis"))


        }

    }
}