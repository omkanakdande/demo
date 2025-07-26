import React, { useEffect, useState } from "react";
import { fetchCrimes } from "../services/api";

function CrimeList() {
  const [crimes, setCrimes] = useState([]);

  useEffect(() => {
    const loadCrimes = async () => {
      const data = await fetchCrimes();
      setCrimes(data);
    };
    loadCrimes();
  }, []);

  return (
    <div className="crime-list">
      <h2>All Crime Reports</h2>
      {crimes.map((crime) => (
        <div key={crime.id} className="crime-card">
          <h3>
            {crime.title} ({crime.type})
          </h3>
          <p>{crime.description}</p>
          <small>Status: {crime.status}</small>
          <br />
          <small>
            Location: ({crime.locationLat}, {crime.locationLng})
          </small>
        </div>
      ))}
    </div>
  );
}

export default CrimeList;
