
package com.robsterthelobster.robinbmt.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Photos {

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("groups")
    @Expose
    private List<PhotoGroup> groups = new ArrayList<PhotoGroup>();

    /**
     * 
     * @return
     *     The count
     */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The groups
     */
    public List<PhotoGroup> getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    public void setGroups(List<PhotoGroup> groups) {
        this.groups = groups;
    }

}
