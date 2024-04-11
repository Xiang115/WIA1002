package Week3.Tutorial3.Q2;

interface BidInterface {
    /**
     * Get the name of the company making this bid
     * @return the String name of the company
     */
    public String getName();

    /**
     * Get the description of the air conditioner
     * @return the description of the air conditioner that this is bid for
     */
    public String getDescription();

    /**
     * Get the capacity in tons
     * @return the capacity of this bid's AC in tons
     */
    public double getCapacity();


    /**
     * Get the seasonal efficiency of this bid's AC (SEER)
     * @return the seasonal efficiency of this bid's AC (SEER)
     */
    public double getEfficiency();


    /**
     * Get the cost of this bid's AC
     * @return the cost of this bid's AC
     */
    public double getCost();

    /**
     * Get the cost of installing this bid's AC
     * @return the installation cost
     */
    public double getInstallationCost();

    /**
     * Get the yearly cost of operating this bid's AC
     * @return the operation cost oif AC in year
     */
    public double getYearlyCost();
}
