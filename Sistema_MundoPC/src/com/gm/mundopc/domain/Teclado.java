package com.gm.mundopc.domain;

public class Teclado extends DispositivoEntrada
{
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca)
    {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado()
    {
        return idTeclado;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
