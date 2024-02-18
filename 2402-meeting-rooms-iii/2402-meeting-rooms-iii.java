import java.util.*;

class Solution {
    public int mostBooked(int N_rooms, int[][] meetings_array) {
        Arrays.sort(meetings_array, (a, b) -> Integer.compare(a[0], b[0]));

        long[] available_timing_of_rooms_array = new long[N_rooms];
        int[] rooms_meeting_frequency = new int[N_rooms];

        for (var meeting_duration : meetings_array) {
            int starting_time = meeting_duration[0];
            int ending_time = meeting_duration[1];
            
            long room_available_in_minimum_time = Long.MAX_VALUE;
            int room_with_minimum_time = 0;
            boolean free_room_not_found_flag = true;

            for (int room_number = 0; room_number < N_rooms; room_number++) {
                if (starting_time >= available_timing_of_rooms_array[room_number]) {
                    free_room_not_found_flag = false;
                    rooms_meeting_frequency[room_number]++;
                    available_timing_of_rooms_array[room_number] = ending_time;
                    break;
                }

                if (room_available_in_minimum_time > available_timing_of_rooms_array[room_number]) {
                    room_available_in_minimum_time = available_timing_of_rooms_array[room_number];
                    room_with_minimum_time = room_number;
                }
            }

            if (free_room_not_found_flag) {
                available_timing_of_rooms_array[room_with_minimum_time] += (ending_time - starting_time);
                rooms_meeting_frequency[room_with_minimum_time]++;
            }
        }

        int most_meetings_held = 0;
        int room_with_most_meetings_held = 0;

        for (int room_number = 0; room_number < N_rooms; room_number++) {
            if (most_meetings_held < rooms_meeting_frequency[room_number]) {
                most_meetings_held = rooms_meeting_frequency[room_number];
                room_with_most_meetings_held = room_number;
            }
        }

        return room_with_most_meetings_held;
    }
}
