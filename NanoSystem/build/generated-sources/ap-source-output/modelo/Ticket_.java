package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Empleado;
import modelo.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-30T02:00:47")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Integer> idTicket;
    public static volatile SingularAttribute<Ticket, Date> fecha;
    public static volatile SingularAttribute<Ticket, Venta> folioVenta;
    public static volatile SingularAttribute<Ticket, Empleado> idEmpleado;

}