import React, {Component} from 'react';
import {Table} from 'bootstrap';


const ListEmployees = ({ employees })=>  {
    return (
        <div>
            <center><h1>Employee List</h1></center>
            {employees.map((employee) => (
                <div className="card">
                    <div className="card-body">
                        <h5 className="card-title">ID: {employee.id}</h5>
                        <h5 className="card-title">Name: {employee.firstName} {employee.lastName}</h5>

                        <h6 className="card-subtitle mb-2 text-muted">Email Address: {employee.email}</h6>
                        <p className="card-text">Salary: {employee.salary}</p>
                    </div>
                </div>
            ))}


        </div>



    )
}
export default ListEmployees;