import React, { useEffect, useState } from "react";
import { getUsers } from "../../../api/admin-user-service";
import DataTable from 'react-data-table-component';
import { Button, ButtonGroup } from "react-bootstrap";

const AdminUsers = () => {
  const [users, setUsers] = useState([]);
  const [loadingUsers, setLoadingUsers] = useState(true);
  const loadData = async () => {
    try {
      const resp = await getUsers();
      setUsers(resp.data);
    } catch (err) {
      console.log(err);
    } finally {
      setLoadingUsers(false);
    }
  };
  useEffect(() => {
    loadData();
  }, []);

  const columns = [
    {
        name: 'First Name',
        selector: (row) => row.firstName,
        sortable: true,
    },
    {
        name: 'Last Name',
        selector: (row) => row.lastName,
        sortable: true,

    },
    {
      name: 'Email',
      selector: (row) => row.email,
      sortable: true,

  },
  {
    name: 'Roles',
    selector: (row) => row.roles,
    sortable: true,

},
];

const customStyles = {
  rows: {
    style: {
      minHeight: "72px", // override the row height
    },
  },
  headCells: {
    style: {
      paddingLeft: "8px", // override the cell padding for head cells
      paddingRight: "8px",
      backgroundColor: "gray",
      color:"white"
    },
  },
  cells: {
    style: {
      paddingLeft: "8px", // override the cell padding for data cells
      paddingRight: "8px",
    },
  },
};

const handlleDownload = () => { 
    
 }
  
  return (
  
  <div>
    <ButtonGroup aria-label="Basic example">
      <Button variant="primary">New User</Button>
      <Button variant="secondary" onClick={handlleDownload}>Download List</Button>
    </ButtonGroup>

    <DataTable
            title="Users"
            columns={columns}
            data={users}
            pagination
            customStyles={customStyles}
        />
  </div>
  
  );
};
export default AdminUsers;