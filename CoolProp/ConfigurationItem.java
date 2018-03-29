/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ConfigurationItem {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ConfigurationItem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConfigurationItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CoolPropJNI.delete_ConfigurationItem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ConfigurationItem(configuration_keys key, boolean val) {
    this(CoolPropJNI.new_ConfigurationItem__SWIG_0(key.swigValue(), val), true);
  }

  public ConfigurationItem(configuration_keys key, int val) {
    this(CoolPropJNI.new_ConfigurationItem__SWIG_1(key.swigValue(), val), true);
  }

  public ConfigurationItem(configuration_keys key, double val) {
    this(CoolPropJNI.new_ConfigurationItem__SWIG_2(key.swigValue(), val), true);
  }

  public ConfigurationItem(configuration_keys key, String val) {
    this(CoolPropJNI.new_ConfigurationItem__SWIG_3(key.swigValue(), val), true);
  }

  public void set_bool(boolean val) {
    CoolPropJNI.ConfigurationItem_set_bool(swigCPtr, this, val);
  }

  public void set_integer(int val) {
    CoolPropJNI.ConfigurationItem_set_integer(swigCPtr, this, val);
  }

  public void set_double(double val) {
    CoolPropJNI.ConfigurationItem_set_double(swigCPtr, this, val);
  }

  public void set_string(String val) {
    CoolPropJNI.ConfigurationItem_set_string(swigCPtr, this, val);
  }

  public configuration_keys get_key() {
    return configuration_keys.swigToEnum(CoolPropJNI.ConfigurationItem_get_key(swigCPtr, this));
  }

}
