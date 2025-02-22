/**
 * Copyright (C) 2010 Olafur Gauti Gudmundsson
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */


package dev.morphia.annotations;


import dev.morphia.mapping.Mapper;

import java.lang.annotation.*;


/**
 * Optional annotation for specifying persistence behavior
 *
 * @author Olafur Gauti Gudmundsson
 * @author Scott Hernandez
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Property {

    /**
     * @return the concrete class to instantiate.
     */
    Class<?> concreteClass() default Object.class;

    /**
     * @return the field name to use in the document.  Defaults to the java field name.
     */
    String value() default Mapper.IGNORED_FIELDNAME;
}
