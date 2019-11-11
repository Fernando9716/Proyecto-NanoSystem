package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-30T02:00:47")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Integer> folioF;
    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, String> servicio;
    public static volatile SingularAttribute<Factura, Integer> numero;
    public static volatile SingularAttribute<Factura, String> ciudad;
    public static volatile ListAttribute<Factura, Venta> ventaList;
    public static volatile SingularAttribute<Factura, String> calle;
    public static volatile SingularAttribute<Factura, String> nombre;
    public static volatile SingularAttribute<Factura, String> rfc;
    public static volatile SingularAttribute<Factura, String> email;
    public static volatile SingularAttribute<Factura, String> colonia;
    public static volatile SingularAttribute<Factura, Integer> numeroint;

}