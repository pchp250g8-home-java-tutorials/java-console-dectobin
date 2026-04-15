/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.dectobin;

/**
 *
 * @author PC
 */
public class DecToBin 
{

    public static void main(String[] args) throws Exception
    {
        final long MAX_INT = 2L * Integer.MAX_VALUE + 1L;
        var console = System.console();
        var bIsNumber = false;
        var uNumber = 0L;
        var strLine = "";
        System.out.println("input an unsigned integer number");
        try
        {
            strLine = console.readLine();
            uNumber = Long.parseUnsignedLong(strLine);
            bIsNumber = uNumber <= MAX_INT;
        }
        catch(Exception e)
        {
            bIsNumber = false;
        }
        if(!bIsNumber)
        {
            System.out.println("Invalid decimal number format.");
            System.exit(0);
            return;
        }
        var uTempVal = uNumber;
        strLine = "";
        while(uTempVal > 0)
        {
            var nBinDigit = uTempVal % 2;
            char chBinDigit = (char)(nBinDigit + '0');
            strLine = chBinDigit + strLine;
            uTempVal /= 2;
        }
        if(strLine.length() == 0)
            strLine = "0";
        System.out.format
        (
           "The binary equivalent of the decimal number %d is: %s\r\n", 
           uNumber, strLine
        );
    }
}
