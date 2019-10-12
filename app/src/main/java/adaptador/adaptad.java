package adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.guia5ejercicio.R;

import java.util.List;
import  objeto.persona;

public class adaptad extends BaseAdapter {


    private List<persona> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;

    public List<persona> GetData(){
        return this.datasource;
    }

    public adaptad(Context context, int IdPlantilla, List<persona> sources){
        //Inicializamos las variables
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }

    @Override
    public int getCount() {
        return this.datasource.size();
    }

    @Override
    public Object getItem(int position) {
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Validamos que no exista un formato
        if(convertView == null){
            //Creamos el Administrador de Layout
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            //Le damos vida al archivo xml ahora es un Layout
            convertView = inflater.inflate(this.IdLayoutPlantilla,null);

            //Buscamos los controles de nuestra plantilla
            TextView lblnombre = convertView.findViewById(R.id.lblnombre);
            TextView lblmensaje = convertView.findViewById(R.id.lblapellido);


            //Obtenemos el dato a mostrar
            lblnombre.setText(this.datasource.get(position).getNombre());
            lblmensaje.setText(this.datasource.get(position).getConversacion());
        }
        return convertView;
    }
}
