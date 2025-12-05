package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ChartPie2: ImageVector
    get() {
        if (_ChartPie2 != null) {
            return _ChartPie2!!
        }
        _ChartPie2 = ImageVector.Builder(
            name = "Filled.ChartPie2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2.05f)
                verticalLineToRelative(9.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(9.95f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.95f, -1f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.995f, -9.626f)
                moveToRelative(6f, 1.29f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 7.66f)
                horizontalLineToRelative(-8.95f)
                verticalLineToRelative(-8.95f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 1.29f)
            }
        }.build()

        return _ChartPie2!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPie2: ImageVector? = null
