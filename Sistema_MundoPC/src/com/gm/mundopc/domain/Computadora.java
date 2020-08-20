package com.gm.mundopc.domain;

public class Computadora
{
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;

    private Computadora()
    {
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton)
    {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora()
    {
        return this.idComputadora;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Monitor getMonitor()
    {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public Teclado getTeclado()
    {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado)
    {
        this.teclado = teclado;
    }

    public Raton getRaton()
    {
        return this.raton;
    }

    public void setRaton(Raton raton)
    {
        this.raton = raton;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append("idComputadora = ").append(idComputadora);
        sb.append("\nnombre = '").append(nombre).append('\'');
        sb.append("\nmonitor = ").append(monitor);
        sb.append("\nteclado = ").append(teclado);
        sb.append("\nraton = ").append(raton);
        sb.append('}');
        return sb.toString();
    }
}
