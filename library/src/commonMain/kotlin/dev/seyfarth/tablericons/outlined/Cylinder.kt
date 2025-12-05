package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Cylinder: ImageVector
    get() {
        if (_Cylinder != null) {
            return _Cylinder!!
        }
        _Cylinder = ImageVector.Builder(
            name = "Filled.Cylinder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                moveToRelative(-7f, 0f)
                arcToRelative(7f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
                arcToRelative(7f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.657f, 3.134f, 3f, 7f, 3f)
                reflectiveCurveToRelative(7f, -1.343f, 7f, -3f)
                verticalLineToRelative(-12f)
            }
        }.build()

        return _Cylinder!!
    }

@Suppress("ObjectPropertyName")
private var _Cylinder: ImageVector? = null
