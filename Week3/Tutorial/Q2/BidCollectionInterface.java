package Week3.Tutorial.Q2;

interface BidCollectionInterface {

    /**
     * Add a bid to this collection
     * @param add a bid to collection
     */
    public void addBid(BidInterface bid);

    /**
     * Get the bid in this collection with the best yearly cost
     * @return the bid in this collection with the best yearly cost
     */
    public BidInterface BestYearlyBid();

    /**
     * Returns the bid in this collection with the best initial cost. The initial cost will be defined as the unit cost plus the installation cost.
     *
     * @return the bid in this collection with the best initial cost.
     */
    public BidInterface getBestInitialCostBid();

    /**
     * Clears all of the bids from this collection.
     */
    public void clearBids();

    /**
     * Gets the number of bids in this collection.
     *
     * @return the number of bids in this collection.
     */
    public int getNumberOfBids();

    /**
     * check whether this collection is empty
     * @return true if this collection is empty, false otherwise
     */
    public boolean isEmpty();
}
