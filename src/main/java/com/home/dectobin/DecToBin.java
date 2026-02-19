/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.dectobin;
import java.util.regex.*;

/**
 *
 * @author PC
 */
public class DecToBin 
{

    public static void main(String[] args) throws Exception
    {
        var console = System.console();
        var oRegExpr = Pattern.compile("^[0-9]+$");
        System.out.println("input an unsigned integer number");
        var strLine = console.readLine();
        var oMatcher = oRegExpr.matcher(strLine);
        var bIsNumber = oMatcher.matches();
        if(!bIsNumber)
        {
            System.out.println("Invalid decimal number format.");
            return;
        }
        var uNumber = Integer.parseUnsignedInt(strLine);
        var uTempVal = uNumber;
        strLine = "";
        while(uTempVal > 0)
        {
            strLine = (uTempVal % 2) + strLine;
            uTempVal /= 2;
        }
        if(strLine.length() == 0)
            strLine = "0";
        System.out.format
        (
           "The binary equavalent of the decimal number %d is: %s\r\n", 
           uNumber, strLine
        );
    }
}
