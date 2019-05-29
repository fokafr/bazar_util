package com.bazar.fondation;

public class HasHash {
public int x;

public HasHash(int xVal) {
 x = xVal;
}

public boolean equals(Object o) {
HasHash h = (HasHash) o; // Don't try at home without // instanceof test
if (h.x == this.x) {
    return true;
} 
else {
   return false;
}
	
 }

public int hashCode() { return (x * 17); }

}
