function printEmployees(employees) {
    for (var _i = 0, employees_1 = employees; _i < employees_1.length; _i++) {
        var emp = employees_1[_i];
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    }
    return employees.length;
}
var empList = [
    { empId: 101, empName: "John Doe", salary: 50000 },
    { empId: 102, empName: "Jane Smith", salary: 60000 },
    { empId: 103, empName: "Mike Johnson", salary: 55000 }
];
var count = printEmployees(empList);
console.log("Total Employees: ".concat(count));
