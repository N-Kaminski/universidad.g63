package universidad.g63;

import java.awt.Dimension;
import java.time.*;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import universidad.vistas.*;

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

} // llave final
