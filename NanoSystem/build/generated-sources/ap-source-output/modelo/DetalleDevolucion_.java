package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Devolucion;
import modelo.Producto;
import modelo.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-30T02:00:47")
@StaticMetamodel(DetalleDevolucion.class)
public class DetalleDevolucion_ { 

    public static volatile SingularAttribute<DetalleDevolucion, String> motivo;
    public static volatile SingularAttribute<DetalleDevolucion, Venta> folioVenta;
    public static volatile SingularAttribute<DetalleDevolucion, Integer> cantidad;
    public static volatile SingularAttribute<DetalleDevolucion, Devolucion> idDev;
    public static volatile SingularAttribute<DetalleDevolucion, Producto> codigoProducto;
    public static volatile SingularAttribute<DetalleDevolucion, Integer> folioDevolucion;

}