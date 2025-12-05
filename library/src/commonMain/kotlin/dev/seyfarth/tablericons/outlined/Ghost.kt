package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Ghost: ImageVector
    get() {
        if (_Ghost != null) {
            return _Ghost!!
        }
        _Ghost = ImageVector.Builder(
            name = "Filled.Ghost",
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
                lineToRelative(0.01f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                lineToRelative(0.01f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            }
        }.build()

        return _Ghost!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost: ImageVector? = null
