package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.DatabaseLeak: ImageVector
    get() {
        if (_DatabaseLeak != null) {
            return _DatabaseLeak!!
        }
        _DatabaseLeak = ImageVector.Builder(
            name = "Filled.DatabaseLeak",
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
                moveTo(4f, 6f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                reflectiveCurveToRelative(8f, -1.343f, 8f, -3f)
                reflectiveCurveToRelative(-3.582f, -3f, -8f, -3f)
                reflectiveCurveToRelative(-8f, 1.343f, -8f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                reflectiveCurveToRelative(8f, -1.343f, 8f, -3f)
                verticalLineToRelative(-12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 15f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1f)
            }
        }.build()

        return _DatabaseLeak!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseLeak: ImageVector? = null
