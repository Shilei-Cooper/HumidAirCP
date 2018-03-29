/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class DoubleVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DoubleVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DoubleVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CoolPropJNI.delete_DoubleVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoubleVector() {
    this(CoolPropJNI.new_DoubleVector__SWIG_0(), true);
  }

  public DoubleVector(long n) {
    this(CoolPropJNI.new_DoubleVector__SWIG_1(n), true);
  }

  public long size() {
    return CoolPropJNI.DoubleVector_size(swigCPtr, this);
  }

  public long capacity() {
    return CoolPropJNI.DoubleVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    CoolPropJNI.DoubleVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return CoolPropJNI.DoubleVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    CoolPropJNI.DoubleVector_clear(swigCPtr, this);
  }

  public void add(double x) {
    CoolPropJNI.DoubleVector_add(swigCPtr, this, x);
  }

  public double get(int i) {
    return CoolPropJNI.DoubleVector_get(swigCPtr, this, i);
  }

  public void set(int i, double val) {
    CoolPropJNI.DoubleVector_set(swigCPtr, this, i, val);
  }

}
