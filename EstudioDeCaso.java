package caso.de.estudio;
import javax.swing.JOptionPane;

public class EstudioDeCaso {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        int tpendiente = 0;
        int tpago = 0;
        int menu = 0;
        String leer = JOptionPane.showInputDialog("1cliente 2factura 3informacion");
        menu = Integer.parseInt(leer);
        while (menu == 1) {
            cliente.setnombre();
            cliente.setCedula();
            JOptionPane.showMessageDialog(null, "cliente" + cliente.getnombre() + "Cédula" + cliente.getCedula(), "Cliente", 0);
            leer = JOptionPane.showInputDialog("1cliente 2factura 3cliente y facturas");
            menu = Integer.parseInt(leer);
        }
        while (menu == 2) {
            cliente.generarnfactura();
            cliente.setmfactura();
            cliente.setmfactura();
            cliente.setmfactura();
            cliente.setestado();
            if (cliente.getestado() == 1) {
                tpendiente += cliente.getmofactura();
            } else {
                tpago += cliente.getmofactura();
            }
            JOptionPane.showMessageDialog(null, "Número" + cliente.getnfactura() + "Monto " + cliente.getmofactura() + "fecha" + cliente.getmofactura() + "/" + cliente.getano() + "estado " + cliente.getestado(), "Datos", 0);

            leer = JOptionPane.showInputDialog("1cliente 2factura 3cliente y facturas");
            menu = Integer.parseInt(leer);
        }
        JOptionPane.showMessageDialog(null, "cliente" + cliente.getnombre() + "cédula " + cliente.getCedula() + "total" + tpago, null, 0);
        double impuesto = tpendiente * 0.05;
        double plan = impuesto + tpendiente;
        double planPago = plan / 6;
        JOptionPane.showMessageDialog(null, "debe: " + tpendiente + "debe" + planPago + "debe" + planPago + "debe" + planPago + "debe" + planPago + "debe " + planPago + "debe " + planPago, null, 0);
    }
}