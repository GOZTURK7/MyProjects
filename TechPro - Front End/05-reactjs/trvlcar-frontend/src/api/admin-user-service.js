import axios from "axios";
import authHeader from "./auth-header";

const API_URL = process.env.REACT_APP_API_URL;

const getUsers = () => {
  return axios.get(`${API_URL}/user/auth/all`, { headers: authHeader() });
};

const downloadUsers = () => {
  return axios.get(`${API_URL}/exel/download/users`, { headers: authHeader() });
};

export { getUsers, downloadUsers }
