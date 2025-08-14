interface Employee {
    empId: number;
    empName: string;
    salary: number;
}

function printEmployees(employees: Employee[]): number {
    for (let emp of employees) {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    }
    return employees.length;
}

const empList: Employee[] = [
    { empId: 101, empName: "John Doe", salary: 50000 },
    { empId: 102, empName: "Jane Smith", salary: 60000 },
    { empId: 103, empName: "Mike Johnson", salary: 55000 }
];

const count = printEmployees(empList);
console.log(`Total Employees: ${count}`);
