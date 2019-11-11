package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.DetalleDevolucion;
import modelo.Empleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-30T02:00:47")
@StaticMetamodel(Devolucion.class)
public class Devolucion_ { 

    public static volatile SingularAttribute<Devolucion, Date> fecha;
    public static volatile SingularAttribute<Devolucion, Empleado> idEmpleado;
    public static volatile SingularAttribute<Devolucion, Integer> idDev;
    public static volatile ListAttribute<Devolucion, DetalleDevolucion> detalleDevolucionList;

}