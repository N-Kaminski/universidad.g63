package universidad.g63;

import java.awt.Dimension;
import java.time.*;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import universidad.vistas.*;
import static universidad.vistas.Escritorio.escritorio;

public class Utileria {

    public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void centrarInternalFrame(JDesktopPane escritorio, JInternalFrame ventana) {
        Dimension dts = escritorio.getSize();
        Dimension fs = ventana.getSize();
        ventana.setLocation((dts.width - fs.width) / 2, (dts.height - fs.height) / 2);
        ventana.show();
    }

    public static LocalDate convertirLocalDate(Date d) {
        LocalDate fn = null;
        if (d != null) {
            Instant instant = d.toInstant();
            ZoneId zonaHoraria = ZoneId.systemDefault();
            fn = instant.atZone(zonaHoraria).toLocalDate();
        }
        return fn;
    }

    public static Date convertirDate(LocalDate ld) {
        Date date = null;
        if (ld != null) {
            return java.sql.Date.valueOf(ld);
        } else {
            return date;
        }
    }
    
 public static void fondo(JDesktopPane escritorio, JInternalFrame ventana, ImageIcon icono) {
        escritorio.removeAll();
        escritorio.repaint();
        ventana.setVisible(true);
        JLabel fondo = new JLabel(icono);
        fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
        escritorio.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        escritorio.add(ventana);
        escritorio.moveToFront(ventana);
        Utileria.centrarInternalFrame(escritorio, ventana);
    }
} // llave final
