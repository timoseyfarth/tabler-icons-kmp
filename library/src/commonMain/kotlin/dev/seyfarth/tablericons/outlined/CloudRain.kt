package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CloudRain: ImageVector
    get() {
        if (_CloudRain != null) {
            return _CloudRain!!
        }
        _CloudRain = ImageVector.Builder(
            name = "Filled.CloudRain",
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
                moveTo(7f, 18f)
                arcToRelative(4.6f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9f)
                arcToRelative(5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 13f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(2f)
                moveToRelative(4f, -5f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(2f)
            }
        }.build()

        return _CloudRain!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRain: ImageVector? = null
