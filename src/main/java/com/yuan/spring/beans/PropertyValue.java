package com.yuan.spring.beans;

/**
 * @author Ykj
 * @date 18:06
 * @apiNote Bean信息
 */


public class PropertyValue {
   
   private final String name;
   
   private final Object value;
   
   public PropertyValue(String name, Object value) {
      this.name = name;
      this.value = value;
   }
   
   public String getName() {
      return name;
   }
   
   public Object getValue() {
      return value;
   }
}
