package com.design.pattern.exercises.strategy.solution;



public class ImageManagerStrategy {

	private Renderer renderer;
	
	public void setRenderer(Renderer renderer){
		this.renderer = renderer;
	}
	
	public void show() {
		this.renderer.showImage();
	}
	
	public static void main(String[] args) {
		ImageManagerStrategy imageManagerStrategy = new ImageManagerStrategy();
		imageManagerStrategy.setRenderer(new TVRenderer());
		imageManagerStrategy.show();
		imageManagerStrategy.setRenderer(new SmartphoneRenderer());
		imageManagerStrategy.show();
		imageManagerStrategy.setRenderer(new LaptopRenderer());
		imageManagerStrategy.show();
	}
}
