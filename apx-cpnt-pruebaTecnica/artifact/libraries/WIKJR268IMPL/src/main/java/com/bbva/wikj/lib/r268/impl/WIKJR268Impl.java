package com.bbva.wikj.lib.r268.impl;
import com.bbva.wikj.dto.id.DtoIn;
import com.bbva.wikj.dto.id.DtoOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;

public class WIKJR268Impl extends WIKJR268Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR268Impl.class);

	@Override
	public DtoOut execute(DtoIn dtoIn) {
		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();

		// Asignamos los valores del DTO de entrada al Map
		args.put("id", dtoIn.getId());
		args.put("nuip", dtoIn.getNuip());
		args.put("full_name", dtoIn.getFull_name());
		args.put("phone", dtoIn.getPhone());
		args.put("address", dtoIn.getAddress());

		// Ejecutamos la inserción en la base de datos
		int result = this.wikjR269.executeInsert(args);

		// Si la inserción fue exitosa (result == 1), realizamos la consulta
		if (result == 1) {
			Map<String, Object> response = this.wikjR269.executeSelect(dtoIn.getId());

			// Validamos que la respuesta no sea null antes de acceder a los valores
			if (response != null && !response.isEmpty()) {
				dtoOut.setId(response.get("id").toString());
				dtoOut.setNuip(response.get("nuip").toString());
				dtoOut.setFull_name(response.get("full_name").toString());
				dtoOut.setPhone(response.get("phone").toString());
				dtoOut.setAddress(response.get("address").toString());
			}
		}

		return dtoOut;
	}
}