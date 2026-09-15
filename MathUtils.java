/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package SpecsAndContracts;

public class MathUtils {

    private static final double G = 9.81; // gravitational acceleration, m/s^2

    /**
     * @param altitude altitude in meters relative to sea level. Requires altitude >= 0.
     * @return the gravitational potential energy per kg of mass
     * @throws IllegalArgumentException if altitude < 0
     */
    public static double calculateGravitationalPotentialEnergy(double altitude) {
        if (altitude < 0) {
            throw new IllegalArgumentException(
                "Precondition violated: altitude must be >= 0.");
        }
        return G * altitude;
    }

}
