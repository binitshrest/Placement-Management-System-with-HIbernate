package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;

public interface ICertificateRepository {
	//interfaces
			public Certificate addCertificate(Certificate certificate);
			public Certificate updateCertificate(Certificate certificate);
			public Certificate searchCertificate(int certificate_id);
			public Certificate deleteCertificate(int certificate_id);
			public abstract void beginTransaction();
			public abstract void commitTrasaction();
}
