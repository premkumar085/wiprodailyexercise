let listEmployees = [
    { name: "Prem Kumar", role: "Manager", empId: 101, salary: 100000 },
    { name: "Hari", role: "Developer", empId: 102, salary: 50000 },
    { name: "Afroj", role: "Manager", empId: 103, salary: 100000 },
    { name: "Phushpa Raj", role: "QA", empId: 104, salary: 45000 },
    { name: "Vijay", role: "Manager", empId: 105, salary: 120000 }
];

var totalManagerSalary = listEmployees.filter(emp => emp.role === "Manager").reduce((acc, emp) => acc + emp.salary, 0); 

console.log(totalManagerSalary);