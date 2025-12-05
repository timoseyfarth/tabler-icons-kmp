package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.EyeBitcoin: ImageVector
    get() {
        if (_EyeBitcoin != null) {
            return _EyeBitcoin!!
        }
        _EyeBitcoin = ImageVector.Builder(
            name = "Filled.EyeBitcoin",
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
                moveTo(10f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.193f, 17.924f)
                quadToRelative(-0.585f, 0.075f, -1.193f, 0.076f)
                quadToRelative(-5.4f, 0f, -9f, -6f)
                quadToRelative(3.6f, -6f, 9f, -6f)
                quadToRelative(4.508f, 0f, 7.761f, 4.181f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 21f)
                verticalLineToRelative(-6f)
                moveToRelative(2f, 0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, 9f)
                verticalLineToRelative(-1.5f)
                moveToRelative(-2f, -3f)
                horizontalLineToRelative(3f)
                moveToRelative(-1f, 0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(3f, -3f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                horizontalLineToRelative(-3.5f)
            }
        }.build()

        return _EyeBitcoin!!
    }

@Suppress("ObjectPropertyName")
private var _EyeBitcoin: ImageVector? = null
