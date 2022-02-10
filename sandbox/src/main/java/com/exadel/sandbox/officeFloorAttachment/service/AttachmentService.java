package com.exadel.sandbox.officeFloorAttachment.service;

import com.exadel.sandbox.officeFloorAttachment.dto.attachmentDto.AttachmentDto;

import java.util.List;

public interface AttachmentService {
    List<AttachmentDto> getAttachments();

    AttachmentDto getById(Long id);

    AttachmentDto create(AttachmentDto attachment);

    void deleteById(Long id);

    AttachmentDto update(Long id, AttachmentDto attachmentDto);

    AttachmentDto getAttachmentByMessageId(Long id);
}
