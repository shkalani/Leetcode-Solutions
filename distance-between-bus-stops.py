class Solution:
    def distanceBetweenBusStops(self, distance: List[int], start: int, destination: int) -> int:
        start,destination = min(start,destination),max(start,destination)
        sumf = sum(distance[start:destination])
        sumr = sum(distance[destination:])+sum(distance[:start])
        return min(sumf,sumr)