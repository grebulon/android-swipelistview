package com.fortysevendeg.swipelistview;

public class BaseSwipeListViewListener implements SwipeListViewListener {
    @Override
    public void onOpened(int position, boolean toRight) {
    }

    @Override
    public void onClosed(int position, boolean fromRight) {
    }

    @Override
    public void onListChanged() {
    }

    @Override
    public void onMove(int position, float x) {
    }

    @Override
    public void onStartOpen(int position, int action, boolean right) {
    }

    @Override
    public void onStartClose(int position, boolean right) {
    }

    @Override
    public void onClickFrontView(int position) {
    }

    @Override
    public void onClickBackView(int position) {
    }

    @Override
    public void onLongClickFrontView(int position) {
    }

    @Override
    public void onLongClickBackView(int position) {
    }
    
    @Override
    public void onScroll(boolean isScrollEnd, int firstVisibleItem, int visibleItemCount, int totalItemCount,
    					 boolean isFirstItem, boolean isLastItem, int scrollOffset) {
    }

    @Override
    public void onTouchDown(float x, float y, int position) {
    }
    
    @Override
    public void onTouchUp(float x, float y, int position) {
    }
    
    @Override
    public void onTouchMove(float x, float y, int position) {
    }

    @Override
    public void onDismiss(int[] reverseSortedPositions) {
    }

    @Override
    public int onChangeSwipeMode(int position) {
        return SwipeListView.SWIPE_MODE_DEFAULT;
    }

    @Override
    public void onChoiceChanged(int position, boolean selected) {
    }

    @Override
    public void onChoiceStarted() {
    }

    @Override
    public void onChoiceEnded() {
    }

    @Override
    public void onFirstListItem() {
    }

    @Override
    public void onLastListItem() {
    }
}
