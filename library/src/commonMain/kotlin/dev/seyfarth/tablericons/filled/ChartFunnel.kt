package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ChartFunnel: ImageVector
    get() {
        if (_ChartFunnel != null) {
            return _ChartFunnel!!
        }
        _ChartFunnel = ImageVector.Builder(
            name = "Filled.ChartFunnel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.72f, 16f)
                lineToRelative(-1.315f, 3.948f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.847f, 2.052f)
                horizontalLineToRelative(-3.116f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.847f, -2.052f)
                lineToRelative(-1.315f, -3.948f)
                close()
                moveTo(19.72f, 10f)
                lineToRelative(-1.333f, 4f)
                horizontalLineToRelative(-12.774f)
                lineToRelative(-1.333f, -4f)
                close()
                moveTo(19.614f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.896f, 2.632f)
                lineToRelative(-1.123f, 3.368f)
                horizontalLineToRelative(-16.774f)
                lineToRelative(-1.123f, -3.368f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, -2.624f)
                lineToRelative(0.177f, -0.008f)
                close()
            }
        }.build()

        return _ChartFunnel!!
    }

@Suppress("ObjectPropertyName")
private var _ChartFunnel: ImageVector? = null
