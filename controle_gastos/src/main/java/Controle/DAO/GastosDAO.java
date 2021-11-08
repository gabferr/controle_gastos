/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.DAO;

import Prinicipal.Conecta;
import controle_gastos.classes.Control_gastos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabri
 */
public class GastosDAO {
 public void cadastar(Control_gastos e) {
        Connection conn = Conecta.conectaBanco();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.prepareStatement("INSERT INTO autores (Id,Produto,Local_compra,valor,Data_compra) VALUES(?,?,?,?,?)");
            stmt.setInt(1, e.getId());
            stmt.setString(2, e.getProduto());
            stmt.setString(3, e.getLocal_compra());
            stmt.setInt(4, e.getvalor());
            stmt.setInt(5, e.getData_compra());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastro Realizado");

        } catch (SQLException ex) {
        }

 }
}

  
