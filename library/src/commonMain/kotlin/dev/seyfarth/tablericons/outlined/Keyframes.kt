package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Keyframes: ImageVector
    get() {
        if (_Keyframes != null) {
            return _Keyframes!!
        }
        _Keyframes = ImageVector.Builder(
            name = "Filled.Keyframes",
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
                moveTo(9.225f, 18.412f)
                arcToRelative(1.595f, 1.595f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.225f, 0.588f)
                curveToRelative(-0.468f, 0f, -0.914f, -0.214f, -1.225f, -0.588f)
                lineToRelative(-4.361f, -5.248f)
                arcToRelative(1.844f, 1.844f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.328f)
                lineToRelative(4.361f, -5.248f)
                arcToRelative(1.595f, 1.595f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.225f, -0.588f)
                curveToRelative(0.468f, 0f, 0.914f, 0.214f, 1.225f, 0.588f)
                lineToRelative(4.361f, 5.248f)
                arcToRelative(1.844f, 1.844f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.328f)
                lineToRelative(-4.361f, 5.248f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 5f)
                lineToRelative(4.586f, 5.836f)
                arcToRelative(1.844f, 1.844f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.328f)
                lineToRelative(-4.586f, 5.836f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 5f)
                lineToRelative(4.586f, 5.836f)
                arcToRelative(1.844f, 1.844f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.328f)
                lineToRelative(-4.586f, 5.836f)
            }
        }.build()

        return _Keyframes!!
    }

@Suppress("ObjectPropertyName")
private var _Keyframes: ImageVector? = null
