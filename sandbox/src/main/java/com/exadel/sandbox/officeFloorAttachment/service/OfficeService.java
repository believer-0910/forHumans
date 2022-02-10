package com.exadel.sandbox.officeFloorAttachment.service;

import com.exadel.sandbox.officeFloorAttachment.dto.officeDto.OfficeDto;

import java.util.List;

public interface OfficeService {
    List<OfficeDto> getOffices();

    OfficeDto getById(Long id);

    OfficeDto create(OfficeDto officeDto);

    void deleteById(Long id);

    OfficeDto update(Long id, OfficeDto officeDto);

    OfficeDto getOfficeByAddressId(Long id);
}
