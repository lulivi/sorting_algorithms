return function(tab)
    if type(tab) ~= 'table' then
        return false
    end
    local active = true
    local temp = 0
    while active do
        active = false
        for i = 1, #tab - 1 do
            if tab[i + 1] < tab[i] then
                temp = tab[i]
                tab[i] = tab[i + 1]
                tab[i + 1] = temp
                active = true
            end
        end
    end
    return tab
end
