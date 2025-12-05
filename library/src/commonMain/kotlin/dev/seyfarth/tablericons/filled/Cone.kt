package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Cone: ImageVector
    get() {
        if (_Cone != null) {
            return _Cone!!
        }
        _Cone = ImageVector.Builder(
            name = "Filled.Cone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.001f)
                curveToRelative(0.72f, 0f, 1.385f, 0.387f, 1.749f, 1.03f)
                lineToRelative(8.13f, 14.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.121f, 0.477f)
                verticalLineToRelative(0.498f)
                curveToRelative(0f, 2.46f, -4.306f, 3.945f, -9.677f, 4.002f)
                lineToRelative(-0.323f, 0.002f)
                curveToRelative(-5.52f, 0f, -10f, -1.495f, -10f, -4.003f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.121f, -0.477f)
                lineToRelative(8.139f, -15.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.74f, -1.015f)
            }
        }.build()

        return _Cone!!
    }

@Suppress("ObjectPropertyName")
private var _Cone: ImageVector? = null
