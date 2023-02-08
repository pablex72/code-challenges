package exercises.demogeneric;

import java.util.ArrayList;
import java.util.List;

public class DemogGeneric<TIPO> {

        private final TIPO tipoObjeto;

        public DemogGeneric(TIPO tipoObjeto){
            this.tipoObjeto = tipoObjeto;
        }

        public void mostrar(){
            System.out.println("Esta es la clase del generico: " + tipoObjeto.getClass().getName());

        }

}
