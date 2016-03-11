package org.netbeans.jpa.modeler.spec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jpa.modeler.spec.extend.JavaClass;

//created by gaurav gupta
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "class", propOrder = {
    "embeddable",
    "description",
    "attributes"
})
public class DefaultClass extends JavaClass {

    private boolean embeddable;
    private String description;
    @XmlElement(name = "attribute")
    private List<DefaultAttribute> attributes;
    @XmlAttribute(name = "class", required = true)
    private String clazz;

    public DefaultClass() {
        System.out.println("");
    }

    public DefaultClass(String clazz) {
        this.clazz = clazz;
    }

    /**
     * @return the attributes
     */
    public List<DefaultAttribute> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(List<DefaultAttribute> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(DefaultAttribute attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<DefaultAttribute>();
        }
        this.attributes.add(attributes);
        attributes.setJavaClass(this);
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the clazz
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * @param clazz the clazz to set
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * @return the embeddable
     */
    public boolean isEmbeddable() {
        return embeddable;
    }

    /**
     * @param embeddable the embeddable to set
     */
    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    @Override
    public String getName() {
        return clazz;
    }

    @Override
    public void setName(String name) {
        this.clazz = clazz;
    }
}
