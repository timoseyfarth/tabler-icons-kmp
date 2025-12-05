package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LocationOff: ImageVector
    get() {
        if (_LocationOff != null) {
            return _LocationOff!!
        }
        _LocationOff = ImageVector.Builder(
            name = "Filled.LocationOff",
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
                moveTo(10.72f, 6.712f)
                lineToRelative(10.28f, -3.712f)
                lineToRelative(-3.724f, 10.313f)
                moveToRelative(-1.056f, 2.925f)
                lineToRelative(-1.72f, 4.762f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0f)
                lineToRelative(-3.5f, -7f)
                lineToRelative(-7f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1f)
                lineToRelative(4.775f, -1.724f)
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

        return _LocationOff!!
    }

@Suppress("ObjectPropertyName")
private var _LocationOff: ImageVector? = null
