package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandShazam: ImageVector
    get() {
        if (_BrandShazam != null) {
            return _BrandShazam!!
        }
        _BrandShazam = ImageVector.Builder(
            name = "Filled.BrandShazam",
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
                lineToRelative(2f, -2f)
                arcToRelative(2.828f, 2.828f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcToRelative(2.828f, 2.828f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4f)
                lineToRelative(-3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                lineToRelative(-2f, 2f)
                arcToRelative(2.828f, 2.828f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, -4f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -18f, 0f)
            }
        }.build()

        return _BrandShazam!!
    }

@Suppress("ObjectPropertyName")
private var _BrandShazam: ImageVector? = null
