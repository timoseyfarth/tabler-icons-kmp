package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Ghost3: ImageVector
    get() {
        if (_Ghost3 != null) {
            return _Ghost3!!
        }
        _Ghost3 = ImageVector.Builder(
            name = "Filled.Ghost3",
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
                moveTo(5f, 11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.1f, 1.4f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, 0f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.1f, -1.4f)
                verticalLineToRelative(-7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                horizontalLineToRelative(0.01f)
            }
        }.build()

        return _Ghost3!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost3: ImageVector? = null
