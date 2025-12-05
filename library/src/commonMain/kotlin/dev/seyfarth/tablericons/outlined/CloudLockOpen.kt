package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CloudLockOpen: ImageVector
    get() {
        if (_CloudLockOpen != null) {
            return _CloudLockOpen!!
        }
        _CloudLockOpen = ImageVector.Builder(
            name = "Filled.CloudLockOpen",
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
                moveTo(19f, 18f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7f)
                horizontalLineToRelative(-1f)
                curveToRelative(0.397f, -1.768f, -0.285f, -3.593f, -1.788f, -4.787f)
                curveToRelative(-1.503f, -1.193f, -3.6f, -1.575f, -5.5f, -1f)
                reflectiveCurveToRelative(-3.315f, 2.019f, -3.712f, 3.787f)
                curveToRelative(-2.199f, -0.088f, -4.155f, 1.326f, -4.666f, 3.373f)
                curveToRelative(-0.512f, 2.047f, 0.564f, 4.154f, 2.566f, 5.027f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                moveToRelative(0f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.736f, -1f)
            }
        }.build()

        return _CloudLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLockOpen: ImageVector? = null
