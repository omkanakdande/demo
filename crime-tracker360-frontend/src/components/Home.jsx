import React from "react";
import { Link } from "react-router-dom";

function Home() {
  return (
    <div className="home">
      <h2>Welcome to CrimeTracker360</h2>
      <p>Track, report, and monitor crime activities around you.</p>
      <Link to="/report">Report a Crime</Link> |{" "}
      <Link to="/crimes">View All Crimes</Link>
    </div>
  );
}

export default Home;
