package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MoodWrrr: ImageVector
    get() {
        if (_MoodWrrr != null) {
            return _MoodWrrr!!
        }
        _MoodWrrr = ImageVector.Builder(
            name = "Filled.MoodWrrr",
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
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -18f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                lineToRelative(1f, -1f)
                lineToRelative(1.5f, 1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(1.5f, 1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(1f, 1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 11.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-1.5f, -1.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 11.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
            }
        }.build()

        return _MoodWrrr!!
    }

@Suppress("ObjectPropertyName")
private var _MoodWrrr: ImageVector? = null
