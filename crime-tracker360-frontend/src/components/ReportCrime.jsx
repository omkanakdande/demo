import React, { useState } from "react";
import { reportCrime } from "../services/api";
import { useNavigate } from "react-router-dom";

function ReportCrime() {
  const [crime, setCrime] = useState({
    title: "",
    type: "",
    description: "",
    locationLat: "",
    locationLng: "",
  });
  const navigate = useNavigate();

  const handleChange = (e) =>
    setCrime({ ...crime, [e.target.name]: e.target.value });

  const handleSubmit = async (e) => {
    e.preventDefault();
    await reportCrime(crime);
    alert("Crime reported!");
    navigate("/");
  };

  return (
    <div className="report-form">
      <h2>Report a Crime</h2>
      <form onSubmit={handleSubmit}>
        <input
          name="title"
          placeholder="Title"
          onChange={handleChange}
          required
        />
        <input
          name="type"
          placeholder="Type (e.g., Theft)"
          onChange={handleChange}
          required
        />
        <textarea
          name="description"
          placeholder="Description"
          onChange={handleChange}
          required
        />
        <input
          name="locationLat"
          placeholder="Latitude"
          type="number"
          step="any"
          onChange={handleChange}
          required
        />
        <input
          name="locationLng"
          placeholder="Longitude"
          type="number"
          step="any"
          onChange={handleChange}
          required
        />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default ReportCrime;
