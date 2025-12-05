package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.DeviceGamepad2: ImageVector
    get() {
        if (_DeviceGamepad2 != null) {
            return _DeviceGamepad2!!
        }
        _DeviceGamepad2 = ImageVector.Builder(
            name = "Filled.DeviceGamepad2",
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
                moveTo(12f, 5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 10f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-4.015f, 4.227f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.923f, -2.035f)
                lineToRelative(1.634f, -8.173f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.904f, -4.019f)
                horizontalLineToRelative(3.4f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 15f)
                lineToRelative(4.07f, 4.284f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.925f, -2.023f)
                lineToRelative(-1.6f, -8.232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 9f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                horizontalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                horizontalLineToRelative(2f)
            }
        }.build()

        return _DeviceGamepad2!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceGamepad2: ImageVector? = null
