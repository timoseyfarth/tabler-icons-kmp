package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PlaneArrival: ImageVector
    get() {
        if (_PlaneArrival != null) {
            return _PlaneArrival!!
        }
        _PlaneArrival = ImageVector.Builder(
            name = "Filled.PlaneArrival",
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
                moveTo(15.157f, 11.81f)
                lineToRelative(4.83f, 1.295f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.036f, 3.863f)
                lineToRelative(-14.489f, -3.882f)
                lineToRelative(-1.345f, -6.572f)
                lineToRelative(2.898f, 0.776f)
                lineToRelative(1.414f, 2.45f)
                lineToRelative(2.898f, 0.776f)
                lineToRelative(-0.12f, -7.279f)
                lineToRelative(2.898f, 0.777f)
                lineToRelative(2.052f, 7.797f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
            }
        }.build()

        return _PlaneArrival!!
    }

@Suppress("ObjectPropertyName")
private var _PlaneArrival: ImageVector? = null
