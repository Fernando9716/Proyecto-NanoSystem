package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.DetalleDevolucion;
import modelo.Empleado;
import modelo.Factura;
import modelo.Ticket;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-30T02:00:47")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Factura> folioF;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Integer> folioVenta;
    public static volatile ListAttribute<Venta, Ticket> ticketList;
    public static volatile SingularAttribute<Venta, Empleado> idEmpleado;
    public static volatile ListAttribute<Venta, DetalleDevolucion> detalleDevolucionList;

}