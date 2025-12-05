package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LockStar: ImageVector
    get() {
        if (_LockStar != null) {
            return _LockStar!!
        }
        _LockStar = ImageVector.Builder(
            name = "Filled.LockStar",
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
                moveTo(11f, 21f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                verticalLineToRelative(-4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.8f, 20.817f)
                lineToRelative(-2.172f, 1.138f)
                arcToRelative(0.392f, 0.392f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.568f, -0.41f)
                lineToRelative(0.415f, -2.411f)
                lineToRelative(-1.757f, -1.707f)
                arcToRelative(0.389f, 0.389f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.217f, -0.665f)
                lineToRelative(2.428f, -0.352f)
                lineToRelative(1.086f, -2.193f)
                arcToRelative(0.392f, 0.392f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.702f, 0f)
                lineToRelative(1.086f, 2.193f)
                lineToRelative(2.428f, 0.352f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.217f, 0.665f)
                lineToRelative(-1.757f, 1.707f)
                lineToRelative(0.414f, 2.41f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.567f, 0.411f)
                lineToRelative(-2.172f, -1.138f)
                close()
            }
        }.build()

        return _LockStar!!
    }

@Suppress("ObjectPropertyName")
private var _LockStar: ImageVector? = null
