from __future__ import division
from re import sub
from numpy import subtract
import pytest
import math
## Adding
def test_sum():
    num1 = 10
    num2 =20
    sum = num1 + num2
    assert sum == 30
##Subtract
def test_subtract():
    num1 = 10
    num2 = 5
    subtract = num1 -num2
    assert subtract == 5
##Multiply
def test_multiply():
    num1 = 10
    num2 =10
    multiply = num1*num2
    assert multiply ==100
##Division
def test_division():
    num1 = 100
    num2 = 2
    division = num1/num2
    assert division == 50             
