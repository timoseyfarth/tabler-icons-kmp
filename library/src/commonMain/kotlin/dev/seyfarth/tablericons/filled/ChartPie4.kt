package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ChartPie4: ImageVector
    get() {
        if (_ChartPie4 != null) {
            return _ChartPie4!!
        }
        _ChartPie4 = ImageVector.Builder(
            name = "Filled.ChartPie4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.844f, 13.57f)
                lineToRelative(4.843f, 7.264f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.015f, -1.09f)
                close()
                moveTo(18.351f, 19.724f)
                lineToRelative(-4.481f, -6.724f)
                horizontalLineToRelative(8.081f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.348f, 6.511f)
                close()
                moveTo(11.001f, 2.05f)
                verticalLineToRelative(9.534f)
                lineToRelative(-6.744f, 6.744f)
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

        return _ChartPie4!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPie4: ImageVector? = null
