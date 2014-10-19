package net.nebur.basewebapp.storage;

import java.io.File;

/**
 * LocalAppStorageManager interface
 */
public interface LocalAppStorageManager {
    /**
     * @return Whether the local app storage is valid or not.
     */
    public boolean isValid();

    /**
     * Reset current local app storage to default.
     */
    public void reset();

    /**
     * Empty current local app storage.
     */
    public void format();

    /**
     * Get root path to local app storage.
     * @return Root path to local app storage as a string.
     */
    public File getPath();

    /**
     * Check if storage is updated to last version.
     * @return Whether last version matches the local one.
     */
    public boolean isUpdated();

    /**
     * Update local storage contents with the last version from remote.
     */
    public void updateFromRemote();
}
