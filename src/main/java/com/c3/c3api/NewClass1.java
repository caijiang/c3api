/*
 * The MIT License
 *
 * Copyright 2014 蒋才.
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
 * 
 * Contact luffy.ja At gmail.com 蒋才
 */

package com.c3.c3api;

import com.c3.c3api.project.Property;
import com.c3.c3api.project.PropertyAggregation;
import com.c3.c3api.project.PropertyScope;
import com.c3.c3api.project.PropertyType;

/**
 *
 * @author 蒋才 Jiang Cai <luffy.ja at gmail.com>
 */
public abstract class NewClass1 implements Property{
    
    private PropertyType type;
    private Object initialValue;
    //multiplicity  0 0..1 0..* 1 1..* *
    //final?
    //标注
    private boolean ordered,unique;
    private PropertyScope scope;
    private PropertyAggregation aggregation;
    private boolean persistable;
    private boolean lazy;

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public Object getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Object initialValue) {
        this.initialValue = initialValue;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public PropertyScope getScope() {
        return scope;
    }

    public void setScope(PropertyScope scope) {
        this.scope = scope;
    }

    public PropertyAggregation getAggregation() {
        return aggregation;
    }

    public void setAggregation(PropertyAggregation aggregation) {
        this.aggregation = aggregation;
    }

    public boolean isPersistable() {
        return persistable;
    }

    public void setPersistable(boolean persistable) {
        this.persistable = persistable;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }
    
    
    
}
