package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean getIsApplyEnable() {
        return isApplyEnable;
    }
    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }// реализуйте get и set методы для обоих полей
    public void setIsApplyEnable(final boolean isApplyEnable) {
        this.isApplyEnable = isApplyEnable;
    }
    public void setNewSelectedSortType(final String newSelectedSortType){
    this.newSelectedSortType = newSelectedSortType;
    }
}
