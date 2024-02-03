// Example React component to integrate with Weavy's APIs

import React, { useState, useEffect } from 'react';
import axios from "axios";

const Api = () => {
  // State to hold users data
  const [users, setUsers] = useState([]);

  // Fetch users data from Weavy API on component mount
  useEffect(() => {
    axios.get('"GET /api/users/{id}')
      .then(response => {
        setUsers(response.data);
      })
      .catch(error => {
        console.error('Error fetching users:', error);
      });
  }, []);

  return (
    <div>
      <h1>Weavy Users</h1>
      {/*<ul>*/}
      {/*  {users.map(user => (*/}
      {/*    <li key={user.id}>{user.name}</li>*/}
      {/*  ))}*/}
      {/*</ul>*/}
    </div>
  );
};

export default Api;
