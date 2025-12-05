package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BeerOff: ImageVector
    get() {
        if (_BeerOff != null) {
            return _BeerOff!!
        }
        _BeerOff = ImageVector.Builder(
            name = "Filled.BeerOff",
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
                moveTo(7f, 7f)
                verticalLineToRelative(1.111f)
                curveToRelative(0f, 1.242f, 0.29f, 2.467f, 0.845f, 3.578f)
                lineToRelative(0.31f, 0.622f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.845f, 3.578f)
                verticalLineToRelative(4.111f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4.111f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.045f, -0.85f)
                moveToRelative(0.953f, -3.035f)
                lineToRelative(0.157f, -0.315f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.845f, -3.578f)
                verticalLineToRelative(-4.111f)
                horizontalLineToRelative(-9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 8f)
                horizontalLineToRelative(1f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(5f)
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

        return _BeerOff!!
    }

@Suppress("ObjectPropertyName")
private var _BeerOff: ImageVector? = null
