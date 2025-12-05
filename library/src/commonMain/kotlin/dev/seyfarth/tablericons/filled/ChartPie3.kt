package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ChartPie3: ImageVector
    get() {
        if (_ChartPie3 != null) {
            return _ChartPie3!!
        }
        _ChartPie3 = ImageVector.Builder(
            name = "Filled.ChartPie3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 20.66f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.328f, -0.917f)
                lineToRelative(6.742f, -6.743f)
                horizontalLineToRelative(9.536f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.95f, 7.66f)
                moveToRelative(-6f, -18.61f)
                verticalLineToRelative(9.534f)
                lineToRelative(-6.743f, 6.744f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.257f, -6.328f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.995f, -9.626f)
                moveToRelative(6f, 1.29f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 7.66f)
                horizontalLineToRelative(-8.95f)
                verticalLineToRelative(-8.95f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 1.29f)
            }
        }.build()

        return _ChartPie3!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPie3: ImageVector? = null
