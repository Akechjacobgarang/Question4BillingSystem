/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.telecombillingsystem;

/**
 *
 * @author user
 */
public class TelecomBillingSystem {
    public static void main(String[] args) {
        // Initial airtime load in UGX
        double initialAirtime = 10000;

        double chargePercentage = 0.10;

        int callDurationInSeconds = 5 * 60; // 5 minutes

        int callChargePerSecond = 200;

        // Calculate charge for airtime load
        double airtimeCharge = initialAirtime * chargePercentage;

        // Calculate call charge
        double callCharge = callDurationInSeconds * callChargePerSecond;

        // Calculate total charge
        double totalCharge = airtimeCharge + callCharge;

        double balance = initialAirtime - totalCharge;

        System.out.println("Initial Airtime: UGX " + initialAirtime);
        System.out.println("Airtime Charge: UGX " + airtimeCharge);
        System.out.println("Call Charge: UGX " + callCharge);
        System.out.println("Total Charge: UGX " + totalCharge);
        System.out.println("Balance: UGX " + balance);
    }
}


