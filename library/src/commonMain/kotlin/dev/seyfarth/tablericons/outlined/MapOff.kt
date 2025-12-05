package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MapOff: ImageVector
    get() {
        if (_MapOff != null) {
            return _MapOff!!
        }
        _MapOff = ImageVector.Builder(
            name = "Filled.MapOff",
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
                moveTo(8.32f, 4.34f)
                lineToRelative(0.68f, -0.34f)
                lineToRelative(6f, 3f)
                lineToRelative(6f, -3f)
                verticalLineToRelative(13f)
                moveToRelative(-2.67f, 1.335f)
                lineToRelative(-3.33f, 1.665f)
                lineToRelative(-6f, -3f)
                lineToRelative(-6f, 3f)
                verticalLineToRelative(-13f)
                lineToRelative(2.665f, -1.333f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 4f)
                verticalLineToRelative(1f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(5f)
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

        return _MapOff!!
    }

@Suppress("ObjectPropertyName")
private var _MapOff: ImageVector? = null
