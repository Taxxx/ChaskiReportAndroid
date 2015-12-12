package hakatonperiodismo.periodismo.com.periodismo.shared_preferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by debbie on 23-07-15.
 */
public class SharedPreferencesP {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    String id_visitador;
    public void Guardar_Shared(Context context,String id_visitador)
    {

        prefs=context.getSharedPreferences("visitador", Context.MODE_PRIVATE);
        editor= prefs.edit();
        editor.putString("id_visitador", id_visitador);
        editor.commit();

    }




    public String   Consultar_si_hay_registro(Context context)
    {
        prefs =context.getSharedPreferences("visitador", Context.MODE_PRIVATE);
        editor = prefs.edit();
        id_visitador = prefs.getString("id_visitador",null);
        if(id_visitador != null) {
            return id_visitador;
        }
        else
        {
            return "";
        }

    }


    public void  Borrar(Context context)
    {
        prefs =context.getSharedPreferences("visitador", Context.MODE_PRIVATE);
        editor = prefs.edit();
        editor.clear();
        editor.commit();

    }



}
