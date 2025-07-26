import axios from "axios";

const API_BASE = "http://localhost:8080/api";

export const fetchCrimes = async () => {
  const res = await axios.get(`${API_BASE}/crimes/all`);
  return res.data;
};

export const reportCrime = async (crime) => {
  const res = await axios.post(`${API_BASE}/crimes/report`, crime);
  return res.data;
};
