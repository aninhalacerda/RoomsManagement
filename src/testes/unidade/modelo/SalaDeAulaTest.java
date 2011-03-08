/*   SalaDeAulaTest.java
 *
 *   Copyright 2011 Tiago Almeida Reul.
 *   All rights reserved.
 *
 *   This file is part of RoomsManagement
 *
 *   RoomsManagement is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   RoomsManagement is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with RoomsManagement.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Contributors:
 *      Tiago Almeida Reul
 *
 */

package testes.unidade.modelo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import modelo.excecoes.ParametroInvalidoException;
import modelo.SalaDeAula;

/**
 * Testes para a classe {@link SalaDeAula}
 */
public final class SalaDeAulaTest {

    @Before
    public final void setUp() {
       this.sala01 = new SalaDeAula("SA-01", 30, "Normal");
       this.sala02 = new SalaDeAula("SA-02", 10, "Normal", "salinha");
       this.sala04 = new SalaDeAula("SA-04", 15, "Inteligente");
       this.sala05 = new SalaDeAula("SA-05", 15, "Inteligente", "Masmorra");
       this.sala07 = new SalaDeAula("SA-07", 20, "Videoconferencia");
       this.sala08 = new SalaDeAula("SA-08", 20, "Videoconferencia",
               "Sala de videoconferencia");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula#SalaDeAula(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test
    public final void testSalaDeAulaNormal() {
        Assert.assertEquals("id errado", "SA-02", this.sala02.getId());
        Assert.assertEquals("capacidade errada", 10,
                this.sala02.getCapacidade());
        Assert.assertEquals("tipo errado", "Normal" , this.sala02.getTipo());
        Assert.assertEquals("apelido errado", "salinha",
                this.sala02.getApelido());

        Assert.assertEquals("id errado", "SA-05", this.sala05.getId());
        Assert.assertEquals("capacidade errada", 15,
                this.sala05.getCapacidade());
        Assert.assertEquals("tipo errado", "Inteligente",
                this.sala05.getTipo());
        Assert.assertEquals("apelido errado", "Masmorra",
                this.sala05.getApelido());

        Assert.assertEquals("id errado", "SA-08", this.sala08.getId());
        Assert.assertEquals("capacidade errada", 20,
                this.sala08.getCapacidade());
        Assert.assertEquals("tipo errado", "Videoconferencia",
                this.sala08.getTipo());
        Assert.assertEquals("apelido errado", "Sala de videoconferencia",
                this.sala08.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaIdNull() {
        new SalaDeAula(null, 10, "Normal", "salinha");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaIdVazio() {
        new SalaDeAula("", 10, "Normal", "salinha");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaCapacidadeZero() {
        new SalaDeAula("SA-01", 0, "Normal", "salinha");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaCapacidadeNegativo() {
        new SalaDeAula("SA-01", -10, "Normal", "salinha");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaTipoNull() {
        new SalaDeAula("SA-01", 10, null, "salinha");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaTipoVazio() {
        new SalaDeAula("SA-01", 10, "", "salinha");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaTipoInvalido() {
        new SalaDeAula("SA-01", 10, "Anormal", "salinha");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaApelidoNull() {
        new SalaDeAula("SA-01", 10, "Normal", null);
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula#SalaDeAula(java.lang.String, int,
     * java.lang.String, java.lang.String)}.
     */
    @Test
    public final void testSalaDeAulaSemApelido() {
        Assert.assertEquals("id errado", "SA-01", this.sala01.getId());
        Assert.assertEquals("capacidade errada", 30,
                this.sala01.getCapacidade());
        Assert.assertEquals("tipo errado", "Normal", this.sala01.getTipo());
        Assert.assertEquals("apelido errado", "", this.sala01.getApelido());

        Assert.assertEquals("id errado", "SA-04", this.sala04.getId());
        Assert.assertEquals("capacidade errada", 15,
                this.sala04.getCapacidade());
        Assert.assertEquals("tipo errado", "Inteligente",
                this.sala04.getTipo());
        Assert.assertEquals("apelido errado", "", this.sala04.getApelido());

        Assert.assertEquals("id errado", "SA-07", this.sala07.getId());
        Assert.assertEquals("capacidade errada", 20,
                this.sala07.getCapacidade());
        Assert.assertEquals("tipo errado", "Videoconferencia",
                this.sala07.getTipo());
        Assert.assertEquals("apelido errado", "", this.sala07.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaIdNullSemApelido() {
        new SalaDeAula(null, 10, "Normal");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaIdVazioSemApelido() {
        new SalaDeAula("", 10, "Normal");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaCapacidadeZeroSemApelido() {
        new SalaDeAula("SA-01", 0, "Normal");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaCapacidadeNegativoSemApelido() {
        new SalaDeAula("SA-01", -10, "Normal");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaTipoNullSemApelido() {
        new SalaDeAula("SA-01", 10, null);
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaTipoVazioSemApelido() {
        new SalaDeAula("SA-01", 10, "");
    }

    /**
     * Metodo de teste para
     * {@link modelo.SalaDeAula.SalaDeAula#(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testSalaDeAulaTipoInvalidoSemApelido() {
        new SalaDeAula("SA-01", 10, "Anormal");
    }

    private SalaDeAula sala01;
    private SalaDeAula sala02;
    private SalaDeAula sala04;
    private SalaDeAula sala05;
    private SalaDeAula sala07;
    private SalaDeAula sala08;
}

