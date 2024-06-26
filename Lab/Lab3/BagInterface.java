package Lab.Lab3;

/**
 * An interface that describes the operations of a bag of objects.
 */
public interface BagInterface<T> {
    /**
     * Gets the current number of entries in this bag.
     * 
     * @return the integer number of entries currently in the bag
     */
    public int getCurrentSize();

    /**
     * Sees whether this bag is full.
     * 
     * @return true if the bag is full, or false if not
     */
    public boolean isFull();

    /**
     * Sees whether this bag is empty.
     * 
     * @return true if the bag is empty, or false if not
     */
    public boolean isEmpty();

    /**
     * Adds a new entry to this bag.
     * 
     * @param newEntry the object to be added as a new entry
     * @return true if the addition is successful, or false if not
     */
    public boolean add(T newEntry);

    /**
     * Removes one unspecified entry from this bag, if possible.
     * 
     * @return either the removed entry, if the removal was successful,
     *         or null
     */
    public T remove();

    /**
     * Removes one occurrence of a given entry from this bag.
     * 
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false if not
     */
    public boolean remove(T anEntry);

    /** Removes all entries from this bag. */
    public void clear();

    /**
     * Counts the number of times a given entry appears in this bag.
     * 
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears in the bag
     */
    public int getFrequencyOf(T anEntry);

    /**
     * Tests whether this bag contains a given entry.
     * 
     * @param anEntry the entry to locate
     * @return true if this bag contains anEntry, or false otherwise
     */
    public boolean contains(T anEntry);

    /**
     * Retrieves all entries that are in this bag.
     * 
     * @return a newly allocated array of all the entries in the bag
     */
    public T[] toArray();

        /**
     * Return the combination of both bags.
     * @param bag the bag to union with
     * @return the union of the current bag and the parameter bag
     */
    public BagInterface<T> union(BagInterface<? extends T> bag);

    /**
     * Return the intersection of both bags.
     * @param bag the bag to intersect with
     * @return the intersect of the current bag and the parameter bag
     */
    public BagInterface<T> intersection(BagInterface<? extends T> bag);

    /**
     * Return the current bag - parameter bag
     * @param bag the bag to be subtracted
     * @return the subtraction of the current bag and the parameter bag
     */
    public BagInterface<T> difference(BagInterface<? extends T> bag);
} // end BagInterface
