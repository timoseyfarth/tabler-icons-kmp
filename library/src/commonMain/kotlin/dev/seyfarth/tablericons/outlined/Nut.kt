package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Nut: ImageVector
    get() {
        if (_Nut != null) {
            return _Nut!!
        }
        _Nut = ImageVector.Builder(
            name = "Filled.Nut",
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
                moveTo(19f, 6.84f)
                arcToRelative(2.007f, 2.007f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1.754f)
                verticalLineToRelative(6.555f)
                curveToRelative(0f, 0.728f, -0.394f, 1.4f, -1.03f, 1.753f)
                lineToRelative(-6f, 3.844f)
                arcToRelative(1.995f, 1.995f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.94f, 0f)
                lineToRelative(-6f, -3.844f)
                arcToRelative(2.006f, 2.006f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.03f, -1.752f)
                verticalLineToRelative(-6.557f)
                curveToRelative(0f, -0.728f, 0.394f, -1.399f, 1.03f, -1.753f)
                lineToRelative(6f, -3.582f)
                arcToRelative(2.049f, 2.049f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineToRelative(6f, 3.582f)
                horizontalLineToRelative(-0.03f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
            }
        }.build()

        return _Nut!!
    }

@Suppress("ObjectPropertyName")
private var _Nut: ImageVector? = null
