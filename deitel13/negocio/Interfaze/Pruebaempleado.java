package deitel13.negocio.Interfaze;

import deitel13.negocio.Empleado;

import javax.swing.*;
import java.util.Scanner;

public class Pruebaempleado {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Prnombre, Apellido;
        double Salario, aumento;
        Empleado e1;
        Empleado e2;
        Prnombre= JOptionPane.showInputDialog("Ingrese su nombre ");
        Apellido= JOptionPane.showInputDialog("Ingrese su apellido ");
        Salario=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        e1=new Empleado(Prnombre,Apellido,Salario);
        Prnombre= JOptionPane.showInputDialog("Ingrese el nombre: ");
        Apellido= JOptionPane.showInputDialog("Ingrese su apellido ");
        Salario=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        e2=new Empleado(Prnombre,Apellido,Salario);
        System.out.println("El salario anual del empleado es: "+e1.getSalario()*12);
        aumento=e1.getSalario()*1.1;
        e1.setSalario(aumento);
        e2.setSalario(e2.getSalario()*1.1);
    }
}

