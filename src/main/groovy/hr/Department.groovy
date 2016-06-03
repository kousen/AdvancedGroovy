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
