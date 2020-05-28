/*
Recuperación unidade 4
Parte obrigatoria
Debese realizar unha aplicación que cumpra os seguintes requisitos para acadar 5 puntos utilizando Hibernate e MySQL:

Os datos de conexión da base de datos e otros datos de configuración de Hibernate terá que obterse do ficherio config.json.

A partir do arquivo “coronavirus.xml” procesa a información para obter os datos por pais e continente do número de casos e número de falecementos para cada día.
Gardará a información anterior na base de datos na base de datos MySQL utilizando Hibernate.
Un menú permitiranos realizar as seguintes consultas:
Obter aqueles paises con un número determinado de casos totais maior ao número proporcionado.
Obter para cada pais o maior número de mortes nun día. Ademais deberase indicar cal foi ese día.
NOTAS: Débese utilizar SAX para parsear o arquivo XML.

 */
package com.ronpier.recud4;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ron Pier
 */
public class MainHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           //Vamos comezar declarando o ficheiro
        File arquivo = new File("config.json");

        try {

            //Creamos un fluxo de entrada para o arquivo
            FileReader fluxoDatos;
            fluxoDatos = new FileReader(arquivo);

            //Creamos o bufer de entrada
            BufferedReader buferEntrada = new BufferedReader(fluxoDatos);

            //Imos lendo linea a linea
            StringBuilder jsonBuilder = new StringBuilder();
            String linea;
            while ((linea=buferEntrada.readLine()) != null) {
                jsonBuilder.append(linea).append("\n");
            }

            //Temos que cerrar sempre o ficheiro
            buferEntrada.close();

            //Construimos o String con todalas lineas lidas
            String json = jsonBuilder.toString();
            System.out.println(json);
            //Pasamos o json a clase ca cal se corresponde
            Gson gson = new Gson();
            DbConnection conexion = gson.fromJson(json, DbConnection.class);
            Hibernate hibernate=gson.fromJson(json, Hibernate.class);
            //Comprobamos que se leron ben os datos
            System.out.println(conexion.getAddress());
            System.out.println(hibernate.getDialect());
        } catch (FileNotFoundException e) {
            System.out.println("Non se encontra o arquivo");
        } catch (IOException e) {
            System.out.println("Erro de entrada saída");
        }
    }

}
