package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.DeviceIpadHorizontalHeart: ImageVector
    get() {
        if (_DeviceIpadHorizontalHeart != null) {
            return _DeviceIpadHorizontalHeart!!
        }
        _DeviceIpadHorizontalHeart = ImageVector.Builder(
            name = "Filled.DeviceIpadHorizontalHeart",
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
                moveTo(10.5f, 20f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 22f)
                lineToRelative(3.35f, -3.284f)
                arcToRelative(2.143f, 2.143f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.005f, -3.071f)
                arcToRelative(2.242f, 2.242f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.242f, 2.242f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.006f, 3.071f)
                lineToRelative(3.355f, 3.296f)
                close()
            }
        }.build()

        return _DeviceIpadHorizontalHeart!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceIpadHorizontalHeart: ImageVector? = null
