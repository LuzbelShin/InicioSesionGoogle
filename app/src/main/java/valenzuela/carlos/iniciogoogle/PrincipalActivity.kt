package valenzuela.carlos.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import androidx.annotation.NonNull
import com.google.android.gms.tasks.OnCompleteListener

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var bundle: Bundle? = intent.extras

        var name: String? = bundle!!.getString("full_name")
        var email: String? = bundle!!.getString("email")

        val textViewName: TextView = findViewById(R.id.tv_nombre)
        val textViewEmail = findViewById<TextView>(R.id.tv_email)

        if(name !=null && email != null){
            textViewName.text = name
            textViewEmail.text = email
        }

        val buttonClose = findViewById<Button>(R.id.btn_cerrar)

        buttonClose.setOnClickListener {
            signOut();
        }
    }
    private fun signOut() {
        //mGoogleSignInClient.signOut().addOnCompleteListener(this, OnCompleteListener<Void?> { // ... })
    }
}