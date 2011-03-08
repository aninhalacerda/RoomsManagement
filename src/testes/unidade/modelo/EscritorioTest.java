/*
 *   EscritorioTest.java
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
import modelo.Escritorio;
import modelo.Sala;

/**
 * Testes para a classe {@link Escritorio}
 */
public final class EscritorioTest {

    @Before
    public final void setUp() {
        this.e01 = new Escritorio("E-01", 3, "Escritorio 1");
        this.e02 = new Escritorio("E-02", 2);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test
    public final void testEscritorioComApelido() {
        Assert.assertEquals("id errado", "E-01",  this.e01.getId());
        Assert.assertEquals("capacidade errada",  3,  this.e01.getCapacidade());
        Assert.assertEquals("tipo errado", "", this.e01.getTipo());
        Assert.assertEquals("finalidade errada", "Escritorio",
                this.e01.getFinalidade());
        Assert.assertEquals("apelido errado", "Escritorio 1",
                this.e01.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int)}.
     */
    @Test
    public final void testEscritorioSemApelido() {
        Assert.assertEquals("id errado", "E-02",  this.e02.getId());
        Assert.assertEquals("capacidade errada",  2,  this.e02.getCapacidade());
        Assert.assertEquals("tipo errado", "", this.e02.getTipo());
        Assert.assertEquals("apelido errado", "", this.e02.getApelido());
        Assert.assertEquals("finalidade errada", "Escritorio",
                this.e02.getFinalidade());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioIdNull() {
        new Escritorio(null, 10, "Escritorio");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioIdNullSemApelido() {
        new Escritorio(null, 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioIdVazio() {
        new Escritorio("", 10, "Escritorio");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioIdVazioSemApelido() {
        new Escritorio("", 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioCapacidadeZero() {
        new Escritorio("E10", 0, "Escritorio");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioCapacidadeZeroSemApelido() {
        new Escritorio("E10", 0);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioCapacidadeNegativa() {
        new Escritorio("E10", -1, "Escritorio");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioCapacidadeNegativaSemApelido() {
        new Escritorio("E10", -1);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Escritorio#Escritorio(java.lang.String, int,
     * java.lang.String,)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testEscritorioApelidoNull() {
        new Escritorio("E10", 1, null);
    }

    private Escritorio e01;
    private Escritorio e02;
}

