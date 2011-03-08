/*   LaboratorioTest.java
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
import modelo.Laboratorio;

/**
 * Testes para a classe {@link Laboratorio}
 */
public final class LaboratorioTest {

    @Before
    public final void setUp() {
        this.lab01 = Laboratorio.laboratorioDeBiologia("Lab-01", 10,
                "Laboratorio de Biologia Molecular");
        this.lab02 = Laboratorio.laboratorioDeBiologia("Lab-02", 15);
        this.lab03 = Laboratorio.laboratorioDeComputacao("Lab-03", 8,
                "Laboratorio de Visao Computacional");
        this.lab04 = Laboratorio.laboratorioDeComputacao("Lab-04", 30);
        this.lab05 = Laboratorio.laboratorioDeFisica("Lab-05", 5,
                "Laboratorio de Optica");
        this.lab06 = Laboratorio.laboratorioDeFisica("Lab-06", 12);
        this.lab07 = Laboratorio.laboratorioDeQuimica("Lab-07", 25,
                "Laboratorio de Quimica Organica");
        this.lab08 = Laboratorio.laboratorioDeQuimica("Lab-08", 30);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test
    public final void testLaboratorioDeBiologia() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab01.getFinalidade());
        Assert.assertEquals("tipo errado", "Biologia", this.lab01.getTipo());
        Assert.assertEquals("id errado", "Lab-01", this.lab01.getId());
        Assert.assertEquals("capacidade errada",10 ,
                this.lab01.getCapacidade());
        Assert.assertEquals("apelido errado",
                "Laboratorio de Biologia Molecular", this.lab01.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaIdNull() {
        Laboratorio.laboratorioDeBiologia(null, 10, "Laboratorio 01");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaIdVazio() {
        Laboratorio.laboratorioDeBiologia("", 10, "Laboratorio 01");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaCapacidadeZero() {
        Laboratorio.laboratorioDeBiologia("Lab-01", 0, "Laboratorio 01");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaCapacidadeNegativa() {
        Laboratorio.laboratorioDeBiologia("Lab-01", -5, "Laboratorio 01");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaApelidoNull() {
        Laboratorio.laboratorioDeBiologia("Lab-01", 10, null);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int)}.
     */
    @Test
    public final void testLaboratorioDeBiologiaSemApelido() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab02.getFinalidade());
        Assert.assertEquals("tipo errado", "Biologia", this.lab02.getTipo());
        Assert.assertEquals("id errado", "Lab-02", this.lab02.getId());
        Assert.assertEquals("capacidade errada", 15,
                this.lab02.getCapacidade());
        Assert.assertEquals("apelido errado", "" , this.lab02.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaSemApelidoIdNull() {
        Laboratorio.laboratorioDeBiologia(null, 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaSemApelidoIdVazio() {
        Laboratorio.laboratorioDeBiologia("", 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaSemApelidoCapacidadeZero() {
        Laboratorio.laboratorioDeBiologia("Lab-02", 0);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeBiologia(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeBiologiaSemApelidoCapacidadeNegativa() {
        Laboratorio.laboratorioDeBiologia("Lab-02", -1);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test
    public final void testLaboratorioDeComputacao() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab03.getFinalidade());
        Assert.assertEquals("tipo errado", "Computacao", this.lab03.getTipo());
        Assert.assertEquals("id errado", "Lab-03" , this.lab03.getId());
        Assert.assertEquals("capacidade errada", 8, this.lab03.getCapacidade());
        Assert.assertEquals("apelido errado",
                "Laboratorio de Visao Computacional", this.lab03.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoIdNull() {
        Laboratorio.laboratorioDeComputacao(null, 10, "Laboratorio 03");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoIdVazio() {
        Laboratorio.laboratorioDeComputacao("", 10, "Laboratorio 03");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoCapacidadeZero() {
        Laboratorio.laboratorioDeComputacao("Lab-03", 0, "Laboratorio 03");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoCapacidadeNegativa() {
        Laboratorio.laboratorioDeComputacao("Lab-03", -2, "Laboratorio 03");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoApelidoNull() {
        Laboratorio.laboratorioDeComputacao("Lab-03", 20, null);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String,
     * int)}.
     */
    @Test
    public final void testLaboratorioDeComputacaoSemApelido() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab04.getFinalidade());
        Assert.assertEquals("tipo errado", "Computacao", this.lab04.getTipo());
        Assert.assertEquals("id errado", "Lab-04", this.lab04.getId());
        Assert.assertEquals("capacidade errada", 30,
                this.lab04.getCapacidade());
        Assert.assertEquals("apelido errado", "", this.lab04.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String,
     * int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoSemApelidoIdNull() {
        Laboratorio.laboratorioDeComputacao(null, 20);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String,
     * int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoSemApelidoIdVazio() {
        Laboratorio.laboratorioDeComputacao("", 20);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String,
     * int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeComputacaoSemApelidoCapacidadeZero() {
        Laboratorio.laboratorioDeComputacao("Lab-04", 0);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeComputacao(java.lang.String,
     * int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void
    testLaboratorioDeComputacaoSemApelidoCapacidadeNegativa() {
        Laboratorio.laboratorioDeComputacao("Lab-04", -4);
    }


    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test
    public final void testLaboratorioDeFisica() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab05.getFinalidade());
        Assert.assertEquals("tipo errado", "Fisica", this.lab05.getTipo());
        Assert.assertEquals("id errado", "Lab-05", this.lab05.getId());
        Assert.assertEquals("capacidade errada", 5, this.lab05.getCapacidade());
        Assert.assertEquals("apelido errado", "Laboratorio de Optica",
                this.lab05.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaIdNull() {
        Laboratorio.laboratorioDeFisica(null, 10, "Laboratorio 05");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaIdVazio() {
        Laboratorio.laboratorioDeFisica("", 10, "Laboratorio 05");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaCapacidadeZero() {
        Laboratorio.laboratorioDeFisica("Lab-05", 0, "Laboratorio 05");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaCapacidadeNegativa() {
        Laboratorio.laboratorioDeFisica("Lab-05", -10, "Laboratorio 05");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaApelidoNull() {
        Laboratorio.laboratorioDeFisica("Lab-05", 10, null);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int)}.
     */
    @Test
    public final void testLaboratorioDeFisicaSemApelido() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab06.getFinalidade());
        Assert.assertEquals("tipo errado", "Fisica", this.lab06.getTipo());
        Assert.assertEquals("id errado", "Lab-06", this.lab06.getId());
        Assert.assertEquals("capacidade errada", 12,
                this.lab06.getCapacidade());
        Assert.assertEquals("apelido errado", "", this.lab06.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaSemApelidoIdNull() {
        Laboratorio.laboratorioDeFisica(null, 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaSemApelidoIdVazio() {
        Laboratorio.laboratorioDeFisica("", 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaSemApelidoCapacidadeZero() {
        Laboratorio.laboratorioDeFisica("Lab-06", 0);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeFisica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeFisicaSemApelidoCapacidadeNegativa() {
        Laboratorio.laboratorioDeFisica("Lab-06", -5);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test
    public final void testLaboratorioDeQuimica() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab07.getFinalidade());
        Assert.assertEquals("tipo errado", "Quimica", this.lab07.getTipo());
        Assert.assertEquals("id errado", "Lab-07", this.lab07.getId());
        Assert.assertEquals("capacidade errada", 25,
                this.lab07.getCapacidade());
        Assert.assertEquals("apelido errado",
                "Laboratorio de Quimica Organica", this.lab07.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaIdNull() {
        Laboratorio.laboratorioDeQuimica(null, -5, "Laboratorio 07");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaIdVazio() {
        Laboratorio.laboratorioDeQuimica("", -5, "Laboratorio 07");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaCapacidadeZero() {
        Laboratorio.laboratorioDeQuimica("Lab-07", 0, "Laboratorio 07");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int,
     * java.lang.String)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaCapacidadeNegativa() {
        Laboratorio.laboratorioDeQuimica("Lab-07", -10, "Laboratorio 07");
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaApelidoNull() {
        Laboratorio.laboratorioDeQuimica("Lab-07", 10, null);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int)}.
     */
    @Test
    public final void testLaboratorioDeQuimicaSemApelido() {
        Assert.assertEquals("finalidade errada", "Laboratorio",
                this.lab08.getFinalidade());
        Assert.assertEquals("tipo errado", "Quimica", this.lab08.getTipo());
        Assert.assertEquals("id errado", "Lab-08", this.lab08.getId());
        Assert.assertEquals("capacidade errada", 30,
                this.lab08.getCapacidade());
        Assert.assertEquals("apelido errado", "", this.lab08.getApelido());
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaSemApelidoIdNull() {
        Laboratorio.laboratorioDeQuimica(null, 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaSemApelidoIdVazio() {
        Laboratorio.laboratorioDeQuimica("", 10);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaSemApelidoCapacidadeZero() {
        Laboratorio.laboratorioDeQuimica("Lab-08", 0);
    }

    /**
     * Metodo de teste para
     * {@link modelo.Laboratorio#laboratorioDeQuimica(java.lang.String, int)}.
     */
    @Test (expected=ParametroInvalidoException.class)
    public final void testLaboratorioDeQuimicaSemApelidoCapacidadeNegativa() {
        Laboratorio.laboratorioDeQuimica("Lab-08", -5);
    }

    private Laboratorio lab01;
    private Laboratorio lab02;
    private Laboratorio lab03;
    private Laboratorio lab04;
    private Laboratorio lab05;
    private Laboratorio lab06;
    private Laboratorio lab07;
    private Laboratorio lab08;
}

