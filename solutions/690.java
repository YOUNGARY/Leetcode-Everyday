class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.id == id) {
                sum += employee.importance;
                for (Employee e : employees) {
                    if (employee.subordinates.contains(e.id)) {
                        sum += getImportance(employees, e.id);
                    }
                }
                break;
            }
        }
        return sum;
    }
}