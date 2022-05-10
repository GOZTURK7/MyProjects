import React from "react";
import { Link } from "react-router-dom";
import Template from "./template";

const Dashboard = () => {
  return (
    <Template>
        <div>Dashboard</div>
        <Link to="/users">Users Sayfasına Git</Link>
    </Template>
    );
};

export default Dashboard;
