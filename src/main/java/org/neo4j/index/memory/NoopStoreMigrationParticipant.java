package org.neo4j.index.memory;

import org.neo4j.kernel.impl.storemigration.StoreMigrationParticipant;
import org.neo4j.kernel.impl.storemigration.monitoring.MigrationProgressMonitor;

import java.io.File;
import java.io.IOException;

/**
 * @author mh
 * @since 20.02.16
 */
class NoopStoreMigrationParticipant implements StoreMigrationParticipant {

    @Override
    public void migrate(File storeDir, File migrationDir, MigrationProgressMonitor.Section progress, String versionToMigrateFrom, String versionToMigrateTo) throws IOException {

    }

    @Override
    public void moveMigratedFiles(File migrationDir, File storeDir, String versionToMigrateFrom, String versionToMigrateTo) throws IOException {

    }

    @Override
    public void rebuildCounts(File storeDir, String versionToMigrateFrom, String versionToMigrateTo) throws IOException {

    }

    @Override
    public void cleanup(File migrationDir) throws IOException {

    }

    @Override
    public String getName() {
        return null;
    }
}
