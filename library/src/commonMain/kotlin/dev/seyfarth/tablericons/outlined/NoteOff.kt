package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.NoteOff: ImageVector
    get() {
        if (_NoteOff != null) {
            return _NoteOff!!
        }
        _NoteOff = ImageVector.Builder(
            name = "Filled.NoteOff",
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
                moveTo(13f, 20f)
                lineToRelative(3.505f, -3.505f)
                moveToRelative(2f, -2f)
                lineToRelative(1.501f, -1.501f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-10f)
                moveToRelative(-3.427f, 0.6f)
                curveToRelative(-0.355f, 0.36f, -0.573f, 0.853f, -0.573f, 1.4f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.272f, 0.109f, -0.519f, 0.285f, -0.699f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _NoteOff!!
    }

@Suppress("ObjectPropertyName")
private var _NoteOff: ImageVector? = null
