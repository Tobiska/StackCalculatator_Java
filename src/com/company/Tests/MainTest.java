package com.company.Tests;

import com.company.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void SQRTtest() {

        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\intest.txt",""};


        double ex = 4;

        double r= Main.main(in);

        Assert.assertEquals(ex,r,0);

    }


    @Test
    public void PLUStest(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testPLUS",""};

        double ex = 13;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0);

    }

    @Test
    public void DIVIDEtest(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testDIVIDE",""};

        double ex = 0.125;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0);//ex

    }

    @Test
    public void MULTtest(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testMULT",""};

        double ex = 8;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0.2);

    }

    @Test
    public void MINUStest(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testMINUS",""};

        double ex = -1;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0);

    }

    @Test
    public void PRINTtest(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testPRINT",""};

        double ex = 1;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0);

    }

    @Test
    public void COMPLEXtest_1(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testCOMPLEX_1",""};

        double ex = 2.5;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0);

    }

    @Test
    public void COMPLEXtest_2(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testCOMPLEX_2",""};

        double ex = 20032.1;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0);

    }

    @Test
    public void TEST_FROM_TZ(){
        String[] in = {"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Tests\\testFROMTZ",""};

        double ex = 2.0;

        double r=Main.main(in);

        Assert.assertEquals(ex,r,0);

    }



}