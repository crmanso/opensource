/*
 *  Copyright 2010 Olafur Gauti Gudmundsson.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */


package dev.morphia.annotations;


import java.lang.annotation.*;


/**
 * Specifies that this class is part of an inheritance structure. This implies that we have to store the full class name in the Mongo
 * object.
 *
 * @author Olafur Gauti Gudmundsson
 * @deprecated Currently unused
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Deprecated
public @interface Polymorphic {
}
