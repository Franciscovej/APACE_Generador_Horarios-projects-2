//de aqui se heredaran las clases guardar profesosr y guardar asignaturas, ya que ambas tienen que crear archivos
//pero mietras que guardar profesor usa una matriz de 11x5 guardar asignatura usa una matriz de 2xalgo
package Archivos;

import javax.swing.JTable;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Guardar {

    private final JTable tabla;

    public Guardar(JTable tabla) {
        this.tabla = tabla;
    }

    public void Guardartabla() {

        //String ruta = "C:\\Users\\Usuario\\Desktop\\excel.xlsx"; //M-PC
        String ruta = "C:\\Users\\alegf\\Desktop\\excel.xlsx";      //A-PC
        
        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja = libro.createSheet("datos");

        
        for (int row = 0; row < this.tabla.getRowCount(); row++) {
            hoja.createRow(row);
            for (int column = 0; column < this.tabla.getColumnCount(); column++) {
                hoja.getRow(row).createCell(column);
                hoja.getRow(row).getCell(column).setCellValue(this.tabla.getModel().getValueAt(row, column).toString());
            }
        }
        
        try {
            FileOutputStream outputStream = new FileOutputStream(ruta);
            libro.write(outputStream);
            libro.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
