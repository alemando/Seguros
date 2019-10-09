package utils

import java.io.InputStream
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.database._
import com.google.auth.oauth2.GoogleCredentials
import java.io.FileInputStream

case class FirebaseException(s: String) extends Exception(s)

object Conexion{
    private val url = System.getProperty("user.dir")+"\\app\\utils\\firebaseCredentials.json"
    private val credentials : InputStream = new FileInputStream(url);
    private val options = new FirebaseOptions.Builder()
        .setDatabaseUrl("https://seguros-34461.firebaseio.com")
        .setCredentials(GoogleCredentials.fromStream(credentials))
        .build();

    FirebaseApp.initializeApp(options)
    private val database = FirebaseDatabase.getInstance()
    def ref(path: String): DatabaseReference = database.getReference(path)
}