package com.sapient.shopping.sse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.sapient.shopping.repository.IProductCatalogRepo;

/**
 * This call will help in handling server side event
 * @author b.singh
 *
 */
@Service
public class SseService {

	final List<SseEmitter> emitters = new CopyOnWriteArrayList<>();

	@Autowired
	IProductCatalogRepo iProductCatalogRepo;

	public void addEmitter(final SseEmitter emitter) {
		emitters.add(emitter);
	}

	public void removeEmitter(final SseEmitter emitter) {
		emitters.remove(emitter);
	}

	/**
	 * Send the  event to connected user, about data modification
	 */
	@Async
	public void changeNofiy(Integer productSku) throws IOException {
		List<SseEmitter> deadEmitters = new ArrayList<>();
		emitters.forEach(emitter -> {
			try {
				emitter.send(SseEmitter.event().data(iProductCatalogRepo.getByProductSku(productSku)));
			} catch (Exception e) {
				deadEmitters.add(emitter);
			}
		});
		emitters.removeAll(deadEmitters);
	}

}