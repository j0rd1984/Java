/*
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Jordi López.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package edu.upc.dsa.ejemplo3;

        import java.io.BufferedReader;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.IOException;

public class AverageFileCalculator {
    public final static double average(String file) throws FileParsingException, BigNumberException {
        double counter = 0d;
        double sum = 0d;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    if (number > 1000)
                        throw new BigNumberException("Number greater than 1000 at line " + (int) (++counter));
                    sum += number;
                    counter++;
                } catch (NumberFormatException e) {
                    throw new FileParsingException(e.getMessage());
                }
            }
        } catch (java.io.IOException e) {
            throw new FileParsingException(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("warning: can not close file.");
            }
        }

        return sum / counter;
    }
}