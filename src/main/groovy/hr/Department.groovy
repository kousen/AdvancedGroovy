/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */
package hr;

class Department {
    int id
    String name
    Map<Integer, Employee> empMap = [:]
        
    void hire(Employee e) {
        empMap[e.id] = e
    }
    
    void layOff(Employee e) {
        empMap.remove(e.id)
    }
    
    Collection<Employee> getEmployees() {
        empMap.values()
    }
    
    Department plus(Employee e) {
        hire(e)
        this
    }
    
    Department minus(Employee e) {
        layOff(e)
        this
    }
    
    Department leftShift(Employee e) {
        hire(e)
        this
    }
}
