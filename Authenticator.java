/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author COMPUTER CORNER
 */
package SpecsAndContracts;


public class Authenticator {

    // Cached copy of the last-issued ID, kept internally.
    private char[] cachedMitId;

    /**
     * INSECURE: returns a direct reference to the internal char[].
     * Any change the client makes to the returned array corrupts
     * the cached copy stored inside this object.
     */
    public char[] getMitId(String username) {
        if (cachedMitId == null) {
            cachedMitId = "123456789".toCharArray();
        }
        return cachedMitId;
    }

    /**
     * SECURE: returns an immutable String, so the client can
     * never corrupt internal state through the returned value.
     */
    public String getMitIdSecure(String username) {
        return "123456789";
    }
}
