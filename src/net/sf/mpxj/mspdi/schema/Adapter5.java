//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.09.11 at 10:06:46 PM BST 
//


package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("all")
public class Adapter5
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (net.sf.mpxj.mspdi.DatatypeConverter.parseString(value));
    }

    public String marshal(String value) {
        return (net.sf.mpxj.mspdi.DatatypeConverter.printString(value));
    }

}