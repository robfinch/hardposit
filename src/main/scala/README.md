## Overview
This set of classes and objects allows manipulation of posit numbers in a mannner similar to floating-point.

## History

These Chisel source files beginning in April 2020 are part of a pre-release version of the HardPosit Arithmetic Package
by Robert Finch which is an adpatation of the HardFloat package, by John R. Hauser

## Posit
A Posit referes the binary representation of a posit number. It could also be called a composed or encoded posit number.
In many cases the binary representation is not manipulated, but the RawPosit representation is used instead.

## RawPosit
RawPosit is a class that has the various components making up a posit number broken down into separate fields for
easier manipulation. There are also a set of posit classification fields present in the class.

## Classes and Objects

### decompose
This object decomposes a posit number represented as a string of bits into a raw posit format.

### PositToPosit
Copies one posit to another allowing the structure of the posit to be altered. For example an posit<8,3> to a posit <16,2>
If the target posit is smaller than the source posit, then the target is rounded.

