/*   FabricaDeSalaTest.java
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

import org.junit.Assert;

import modelo.FabricaDeSala;
import modelo.Sala;
import modelo.SalaDeAula;
import modelo.SalaDeConferencia;
import modelo.Escritorio;
import modelo.Laboratorio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Testes para a classe {@link FabricaDeSala}
 */
public class FabricaDeSalaTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() {
        this.sa01 = FabricaDeSala.getSala("SA-01", 30, "Sala de Aula", "Normal");
        this.sa02 = FabricaDeSala.getSala("SA-02", 10, "Sala de Aula", "Normal", "salinha");
        this.sa04 = FabricaDeSala.getSala("SA-04", 15, "Sala de Aula", "Inteligente");
        this.sa05 = FabricaDeSala.getSala("SA-05", 15, "Sala de Aula", "Inteligente", "Masmorra");
        this.sa07 = FabricaDeSala.getSala("SA-07", 20, "Sala de Aula", "Videoconferencia");
    }

    /**
     * Test method for
     * {@link modelo.FabricaDeSala#getSala(java.lang.String, int,
     * java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testGetSalaAulaNormal1() {
        Assert.assertEquals("id errado.", "SA-01", this.sa01.getId());
        Assert.assertEquals("capacidade errada", 30, this.sa01.getCapacidade());
        Assert.assertEquals("finalidade errada", "Sala de Aula", this.sa01.getFinalidade());
        Assert.assertTrue("tipo errado", ( this.sa01 instanceof SalaDeAula));
        Assert.assertEquals("tipo errado", "Normal", this.sa01.getTipo());
        Assert.assertEquals("apelido errado", "", this.sa01.getApelido());
    }

    /**
     * Test method for
     * {@link modelo.FabricaDeSala#getSala(java.lang.String, int,
     * java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testGetSalaAulaNormal2() {
        Assert.assertEquals("id errado.", "SA-02", this.sa02.getId());
        Assert.assertEquals("capacidade errada", 10, this.sa02.getCapacidade());
        Assert.assertEquals("finalidade errada", "Sala de Aula", this.sa02.getFinalidade());
        Assert.assertEquals("tipo errado", "Normal", this.sa02.getTipo());
        Assert.assertEquals("apelido errado", "salinha", this.sa02.getApelido());
    }

    /**
     * Test method for
     * {@link modelo.FabricaDeSala#getSala(java.lang.String, int,
     * java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testGetSalaAulaInteligente1() {
        Assert.assertEquals("id errado.", "SA-04", this.sa04.getId());
        Assert.assertEquals("capacidade errada", 15, this.sa04.getCapacidade());
        Assert.assertEquals("finalidade errada", "Sala de Aula", this.sa04.getFinalidade());
        Assert.assertTrue("tipo errado", (this.sa04 instanceof SalaDeAula));
        Assert.assertEquals("tipo errado", "Inteligente", this.sa04.getTipo());
        Assert.assertEquals("apelido errado", "", this.sa04.getApelido());
    }

    /**
     * Test method for
     * {@link modelo.FabricaDeSala#getSala(java.lang.String, int,
     * java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testGetSalaAulaInteligente2() {
        Assert.assertEquals("id errado.", "SA-05", this.sa05.getId());
        Assert.assertEquals("capacidade errada", 15, this.sa05.getCapacidade());
        Assert.assertEquals("finalidade errada", "Sala de Aula", this.sa05.getFinalidade());
        Assert.assertTrue("tipo errado", (this.sa05 instanceof SalaDeAula));
        Assert.assertEquals("tipo errado", "Inteligente", this.sa05.getTipo());
        Assert.assertEquals("apelido errado", "masmorra", this.sa05.getApelido());
    }

    /**
     * Test method for
     * {@link modelo.FabricaDeSala#getSala(java.lang.String, int,
     * java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testGetSalaAulaVideoconferencia1() {
        Assert.assertEquals("id errado.", "SA-07", this.sa07.getId());
        Assert.assertEquals("capacidade errada", 20, this.sa07.getCapacidade());
        Assert.assertEquals("finalidade errada", "Sala de Aula", this.sa07.getFinalidade());
        Assert.assertTrue("tipo errado", ( this.sa07 instanceof SalaDeAula));
        Assert.assertEquals("tipo errado", "VideoConferencia", this.sa07.getTipo());
        Assert.assertEquals("apelido errado", "", this.sa07.getApelido());
    }

    /**
     * Test method for
     * {@link modelo.FabricaDeSala#getSala(java.lang.String, int,
     * java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testGetSalaStringIntStringString() {
        Assert.fail("Not yet implemented"); // TODO
    }

    private Sala sa01;
    private Sala sa02;
    private Sala sa03;
    private Sala sa04;
    private Sala sa05;
    private Sala sa06;
    private Sala sa07;
}

