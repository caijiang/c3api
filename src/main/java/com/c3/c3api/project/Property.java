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

package com.c3.c3api.project;

import com.c3.c3api.project.basic.Documented;
import com.c3.c3api.project.basic.ProjectManagement;

/**
 *
 * @author 蒋才 Jiang Cai <luffy.ja at gmail.com>
 */
public interface Property extends ProjectManagement,Documented{
    
    //multiplicity  0 0..1 0..* 1 1..* *
    //final?
    //标注
    //list?

    PropertyAggregation getAggregation();

    Object getInitialValue();

    PropertyScope getScope();

    PropertyType getType();

    boolean isLazy();

    boolean isOrdered();

    boolean isPersistable();

    boolean isUnique();

    void setAggregation(PropertyAggregation aggregation);

    void setInitialValue(Object initialValue);

    void setLazy(boolean lazy);

    void setOrdered(boolean ordered);

    void setPersistable(boolean persistable);

    void setScope(PropertyScope scope);

    void setType(PropertyType type);

    void setUnique(boolean unique);
    
//    ModelDataType getType();
    
    
    
}
